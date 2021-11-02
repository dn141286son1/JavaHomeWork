package com.pb.shapovalova.homework5;

public class Book {

    private String bookName;
    private String authorName;
    private String yearPublish;
    private int bookCount = 0;

    public Book(String bookName, String authorName,String yearPublish){
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearPublish = yearPublish;
        bookCount++;
    }

    public int getBookCount() {
        return bookCount;
    }

    String getInfoBook () {
        return "Книга: " + bookName + ", автор: " + authorName + ", год издания: " + yearPublish;
    }
}
