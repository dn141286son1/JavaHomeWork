package com.pb.shapovalova.homework5;

public class Library {

    public static void main(String[] args) {

        Reader reader = new Reader();

        Book book1 = new Book("Приключения","Иванов И.И","2000 г.");
        Book book2 = new Book("Словарь","Сидоров А.В.","1980 г.");
        Book book3 = new Book("Энциклопедия","Гусев К.В.","2010 г.");

        reader.setReaderName("Петров В.В.");
        reader.setTicketNumber(12345);
        reader.setFaculty("Факультет");
        reader.setBirthdayDate("01.01.1980г");
        reader.setPhoneNumber("+380991234567");

        System.out.println(reader.getInfoReader());
        System.out.println(book1.getInfoBook());
        System.out.println(book2.getInfoBook());
        System.out.println(book3.getInfoBook());

        reader.takeBook(3);
        reader.takeBook("Приключения,Словарь,Энциклопедия");
        reader.takeBook (book1,book2,book3);

        reader.returnBook(3);
        reader.returnBook("Приключения,Словарь,Энциклопедия");
        reader.returnBook (book1,book2,book3);
    }
}
