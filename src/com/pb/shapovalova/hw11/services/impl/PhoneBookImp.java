package com.company.pb.hw11.services.impl;

import com.company.pb.hw11.model.Person;
import com.company.pb.hw11.services.interfaces.PhoneBook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PhoneBookImp implements PhoneBook {

    private final static String PATH = "src/resources/"; // путь, куда будут файлы сохраняться
    private final static String DEFAULT_FILENAME = "output.txt";
    private static List<Person> personList = new ArrayList<>();

    public PhoneBookImp() {
        //добавляем юзверей в тел. книгу
//        List<String> phones = Arrays.asList("+380999999888", "+380999999882", "+380999993888");
//        personList.add(new Person("Губка Боб", new Date(), "BikiniBottom", phones, new Date()));
//        personList.add(new Person("Арнольд", new Date(System.currentTimeMillis() + 100000), "California", phones, new Date()));
//        personList.add(new Person("Цукерберг", new Date(System.currentTimeMillis() + 100000000), "Silicon Valley", phones, new Date()));
    }

    @Override
    public void addNewPerson(Person person) {
        personList.add(person);
    }

    @Override
    public void editPerson(Person newPerson) {
        personList = personList.stream()
                               .map(person -> person.getId().equals(newPerson.getId()) ? newPerson : person)
                               .collect(Collectors.toList());
        String msg = String.format("Person id={%d} fio={%s} successfully edited", newPerson.getId(), newPerson.getFio());
        System.out.println(msg);
    }

    @Override
    public void findPersons(String fio) {
        if (fio == null){
            System.out.println("fio must be not null");
            return;
        }
        List<Person> persons = personList.stream()
                                         .filter(p -> p.getFio().equalsIgnoreCase(fio))
                                         .collect(Collectors.toList());
        if(persons.isEmpty()){
            System.out.println("Nothing found by fio " + fio);
            return;
        }
        persons.forEach(System.out::println);
    }

    @Override
    public Optional<Person> getPersonById(int id) {
        return personList.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    @Override
    public void deletePerson(int personId) {
        boolean result = personList.removeIf(person -> person.getId().equals(personId));
        if(result){
            System.out.println("Person id: " + personId + " removed successfully");
        } else {
            System.out.println("Person id: " + personId + " not found for remove");
        }
    }

    @Override
    public void sortedByFieldAndPrintPersonList(boolean isFio, boolean isBirthday) {
        List<Person> sortedPersonList;
        Comparator<Person> comparator;
        if(isFio && isBirthday){
            comparator = Comparator.comparing(Person::getFio)
                                   .thenComparing(Person::getBirthday);
            sortedPersonList = personList.stream()
                                         .sorted(comparator)
                                         .collect(Collectors.toList());
            sortedPersonList.forEach(System.out::println);
            return;
        }
        if(isFio){
            comparator = Comparator.comparing(Person::getFio);
            sortedPersonList = personList.stream()
                                         .sorted(comparator)
                                         .collect(Collectors.toList());
            sortedPersonList.forEach(System.out::println);
            return;
        }
        if(isBirthday){
            comparator = Comparator.comparing(Person::getBirthday);
            sortedPersonList = personList.stream()
                                         .sorted(comparator)
                                         .collect(Collectors.toList());
            sortedPersonList.forEach(System.out::println);
            return;
        }
        System.out.println("No sorting conditions");
    }

    @Override
    public void writeToFile(String fileName) {
        fileName = getFilePAth(fileName);
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personList);
            oos.close();
            System.out.println("The phone list has been successfully written to the file, path: " + fileName);
        }catch (IOException ioe){
            System.out.println("Error writing to file.");
            ioe.printStackTrace();
        }
    }

    private String getFilePAth(String fileName){
        return (fileName == null || fileName.equals("")) ? PATH + DEFAULT_FILENAME : PATH + fileName;
    }

    @Override
    public void readFromFile(String fileName) {
        fileName = getFilePAth(fileName);
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            personList = (List<Person>) ois.readObject();
            ois.close();
            System.out.println("The phone list was successfully read from the file, path: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }
    }

    @Override
    public void printPersonList(){
        if(personList == null || personList.isEmpty()){
            System.out.println("Person list is empty.");
            return;
        }
        personList.forEach(System.out::println);
    }
}
