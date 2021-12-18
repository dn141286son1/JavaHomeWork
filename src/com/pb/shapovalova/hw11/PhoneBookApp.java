package com.company.pb.hw11;

import com.company.pb.hw11.model.Person;
import com.company.pb.hw11.services.impl.PhoneBookImp;
import com.company.pb.hw11.services.interfaces.PhoneBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class PhoneBookApp {

    private static final String NEW_LINE = "\n";
    private static final String INVALID_COMMAND_ENTERED = "Invalid command entered!";
    private static final String WRONG_FORMAT = "Wrong format!!! Please use number format";
    private static final PhoneBook phoneBook = new PhoneBookImp();

    public static void main(String[] args) throws IOException {
        int choice;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        printMenu();//печать меню программы
        do {
            System.out.print("Enter the command for Main menu (1 - repeat menu): ");
            choice = getValidChoice(reader);
            // Обработка комманд
            switch (choice) {
                case 1:
                    printMenu();
                    break;
                case 2:
                    addNewPerson(reader);
                    break;
                case 3:
                    findPerson(reader);
                    break;
                case 4:
                    editPerson(reader);
                    break;
                case 5:
                    deletePerson(reader);
                    break;
                case 6:
                    printPersonList(reader);
                    break;
                case 7:
                    writeToFile(reader);
                    break;
                case 8:
                    readFromFile(reader);
                    break;
                case 0:
                    System.exit(0);
                    System.out.print("The program is completed");
                    break;
                default:
                    System.out.println(INVALID_COMMAND_ENTERED);
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void readFromFile(BufferedReader reader) throws IOException {
        phoneBook.readFromFile(getFileName(reader));
    }

    private static void writeToFile(BufferedReader reader) throws IOException {
        phoneBook.writeToFile(getFileName(reader));
    }

    private static void printPersonList(BufferedReader reader) throws IOException {
        int choice;
        System.out.println();
        do {
            System.out.print("Would you like to sort phone list?: 1 - sort list, 2 - print without sorting, 0 - exit: ");
            choice = getValidChoice(reader);
            switch (choice){
                case 1:
                    sortPersonListAndPrint(reader);
                    break;
                case 2:
                    phoneBook.printPersonList();
                    break;
                case 0:
                    System.out.println("Exiting edit person menu");
                    break;
                default:
                    System.out.println(INVALID_COMMAND_ENTERED);
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void sortPersonListAndPrint(BufferedReader reader) throws IOException {
        int choice;
        do {
            System.out.print("Sorting by: 1 - fio, 2 - birthday, 3 - both, 0 - exit: ");
            choice = getValidChoice(reader);
            switch (choice){
                case 1:
                    phoneBook.sortedByFieldAndPrintPersonList(true, false);
                    break;
                case 2:
                    phoneBook.sortedByFieldAndPrintPersonList(false, true);
                    break;
                case 3:
                    phoneBook.sortedByFieldAndPrintPersonList(true, true);
                    break;
                case 0:
                    System.out.println("Exiting sorting menu");
                    break;
                default:
                    System.out.println(INVALID_COMMAND_ENTERED);
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void deletePerson(BufferedReader reader) throws IOException {
        int choice;
        System.out.println();
        do {
            System.out.print("Would you like delete user?: 1 - delete user, 0 - exit: ");
            choice = getValidChoice(reader);
            switch (choice){
                case 1:
                    System.out.print("Enter id user: ");
                    int id;
                    try {
                        id = Integer.parseInt(reader.readLine());
                    } catch (NumberFormatException nfe){
                        System.out.println(WRONG_FORMAT);
                        break;
                    }
                    Optional<Person> personOpt = phoneBook.getPersonById(id);
                    if(!personOpt.isPresent()){
                        System.out.println("Person ID: " + id + " not found");
                        break;
                    }
                    System.out.println(personOpt.get());
                    phoneBook.deletePerson(id);
                    break;
                case 0:
                    System.out.println("Exiting edit person menu");
                    break;
                default:
                    System.out.println(INVALID_COMMAND_ENTERED);
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void editPerson(BufferedReader reader) throws IOException {
        int choice;
        System.out.println();
        do {
            System.out.print("Would you like edit user?: 1 - edit user, 0 - exit: ");
            choice = getValidChoice(reader);
            switch (choice){
                case 1:
                    System.out.print("Enter id user: ");
                    int id;
                    try {
                        id = Integer.parseInt(reader.readLine());
                    } catch (NumberFormatException nfe){
                        System.out.println(WRONG_FORMAT);
                        break;
                    }
                    Optional<Person> personOpt = phoneBook.getPersonById(id);
                    if(!personOpt.isPresent()){
                        System.out.println("Person ID: " + id + " not found");
                        break;
                    }
                    System.out.println(personOpt.get());
                    String fio = getFio(reader);
                    Date birthDay = getBirthday(reader);
                    String address = getAddress(reader);
                    List<String> phones = getPhones(reader);
                    Person person = new Person(fio, birthDay, address, phones, new Date());
                    person.setId(id);
                    phoneBook.editPerson(person);
                    break;
                case 0:
                    System.out.println("Exiting edit person menu");
                    break;
                default:
                    System.out.println(INVALID_COMMAND_ENTERED);
            }
            System.out.println();
        } while (choice != 0);
    }

    private static void findPerson(BufferedReader reader) throws IOException {
        int choice = -1;
        System.out.println();
        do {
            System.out.print("You can find a user by: 1 - fio, 0 - exit: ");
            choice = getValidChoice(reader);
            switch (choice){
                case 1:
                    String fio = getFio(reader);
                    phoneBook.findPersons(fio);
                    break;
                case 0:
                    System.out.println("Exiting find person menu");
                    break;
                default:
                    System.out.println(INVALID_COMMAND_ENTERED);
            }
            System.out.println();
        } while (choice != 0);
    }

    private static int getValidChoice(BufferedReader reader) throws IOException {
        short choice = 1;
        try {
            choice = Short.parseShort(reader.readLine());
        }catch (NumberFormatException nfe){
            System.out.println(WRONG_FORMAT);
        }
        return choice;
    }

    // Метод вывода опций меню
    private static void printMenu() {
        StringBuilder sb = new StringBuilder("Phone book menu:");
        sb.append(NEW_LINE).append("1 Repeat menu")
          .append(NEW_LINE).append("2 Add a new person")
          .append(NEW_LINE).append("3 Find person")
          .append(NEW_LINE).append("4 Edit person")
          .append(NEW_LINE).append("5 Delete person")
          .append(NEW_LINE).append("6 Print person list")
          .append(NEW_LINE).append("7 Write to the file")
          .append(NEW_LINE).append("8 Read from file")
          .append(NEW_LINE).append("0 Exit program");
        System.out.println(sb);
    }

    private static void addNewPerson(BufferedReader reader) throws IOException {
        String fio = "", address = "";
        int choice = -1;
        System.out.println();
        do {
            System.out.print("Enter the command for menu: 1 - Add new person, 0 - exit: ");
            choice = Short.parseShort(reader.readLine());
            switch (choice){
                case 1:
                    fio = getFio(reader);
                    Date birthDay = getBirthday(reader);
                    address = getAddress(reader);
                    List<String> phones = getPhones(reader);
                    Person person = new Person(fio, birthDay, address, phones, new Date());
                    phoneBook.addNewPerson(person);
                    break;
                case 0:
                    System.out.println("Exiting Add new person menu");
                    break;
                default:
                    System.out.println(INVALID_COMMAND_ENTERED);
            }
            System.out.println();
        } while (choice != 0);
    }

    private static List<String> getPhones(BufferedReader reader) throws IOException {
        System.out.println("Write down the number via 'Еnter'.If you would like to break - write 0.");
        short choice = -1;
        String phoneNumber = "";
        List<String> phones = new ArrayList<>();
        do{
            phoneNumber = reader.readLine();
            if(phoneNumber.length() == 1) {
                choice = Short.parseShort(phoneNumber);
            } else {
                phones.add(phoneNumber);
            }
        } while (choice != 0);
        return phones;
    }

    private static String getAddress(BufferedReader reader) throws IOException {
        System.out.print("Enter address: ");
        return reader.readLine();
    }

    private static Date getBirthday(BufferedReader reader) throws IOException {
        System.out.print("Enter person birthday using format dd.MM.yyyy: ");
        String[] birthDateStrings = reader.readLine().split("\\.");
        final int day = Integer.parseInt(birthDateStrings[0]);
        final int month = Integer.parseInt(birthDateStrings[1]);
        final int year = Integer.parseInt(birthDateStrings[2]);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal.getTime();
    }

    private static String getFio(BufferedReader reader) throws IOException {
        System.out.print("Enter person fio: ");
        return reader.readLine();
    }

    private static String getFileName(BufferedReader reader) throws IOException {
        System.out.print("Enter filename (default output.txt): ");
        return reader.readLine();
    }
}
