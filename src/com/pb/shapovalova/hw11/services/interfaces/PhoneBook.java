package com.company.pb.hw11.services.interfaces;

import com.company.pb.hw11.model.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

public interface PhoneBook {

    void addNewPerson(Person person);

    void editPerson(Person person);

    void findPersons(String fio);

    Optional<Person> getPersonById(int id);

    void deletePerson(int personId);

    void sortedByFieldAndPrintPersonList(boolean isFio, boolean isBirthday);

    void writeToFile(String fileName) throws IOException;

    void readFromFile(String fileName);

    void printPersonList();
}
