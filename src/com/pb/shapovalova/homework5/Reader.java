package com.pb.shapovalova.homework5;

public class Reader {

    private String readerName;
    private int ticketNumber;
    private String faculty;
    private String birthdayDate;
    private String phoneNumber;

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String getInfoReader () {
        return "ФИО: " + readerName + ", номер билета: " + ticketNumber + ", факультет: "
                + faculty + ", дата рождения: " + birthdayDate + ", номер телефона: " + phoneNumber;
    }

    public void takeBook (int bookCount) {
        System.out.println(readerName + " взял " + bookCount + " книги");
    }

    public void takeBook (String... bookNames){
        System.out.print(readerName + " взял книги: ");
        for (String bookName: bookNames) {
            System.out.println(bookName);
        }
    }

    public void takeBook (Book... books) {
        System.out.print(readerName + " взял книги: ");
        for (Book book: books) {
            System.out.println(book.getInfoBook());
        }
    }

    public void returnBook (int bookCount) {
        System.out.println(readerName + " вернул " + bookCount + " книги");
    }

    public void returnBook (String... bookNames){
        System.out.print(readerName + " вернул книги: ");
        for (String bookName: bookNames) {
            System.out.println(bookName);
        }
    }

    public void returnBook (Book... books) {
        System.out.print(readerName + " вернул книги: ");
        for (Book book: books) {
            System.out.println(book.getInfoBook());
        }
    }
}
