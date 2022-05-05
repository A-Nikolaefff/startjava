package com.startjava.lesson_2_3_4.bookshelf;

public class Bookshelf {
    private int amountOfBooks = 0;
    private Book[] books = new Book[10];

    public void add(String author, String title, int publishYear) {
        Book book = new Book(author, title, publishYear);
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("The book has been added.");
                amountOfBooks++;
                view();
                return;
            }
        }
        System.out.println("Adding a book is not possible because there is no free space on the bookshelf.");
    }

    public void delete(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title)) {
                    books[i] = null;
                    System.out.println("The book has been deleted.");
                    view();
                    return;
                }
            }
        }
        System.out.println("A book with that title is not on the bookshelf.");
    }

    public void find(String title) {
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                System.out.println("Author: " + b.getAuthor() + "\nTitle: " + b.getTitle() + "\nYear: " + b.getPublishYear());
                view();
                return;
            }
        }
        System.out.println("A book with that title is not on the bookshelf.");
    }

    public void getAmountOfBooks() {
        System.out.println("The amount of books: " + amountOfBooks);
        view();
    }

    public void getFreeSpace() {
        System.out.println("Free space: " + (books.length - amountOfBooks));
        view();
    }

    public void view() {
        for (Book b : books) {
            if (b != null) {
                System.out.println(b.getFullName());
            } else {
                System.out.println("<" + " ".repeat(findMaxBookNameLength() - 2) + ">");
            }
        }
    }

    private int findMaxBookNameLength() {
        // Значение длины пустого места по умолчанию при выводе в консоль
        int maxBookNameLength = 20;
        for (Book b : books) {
            if (b != null && b.getFullName().length() > maxBookNameLength) {
                maxBookNameLength = b.getFullName().length();
            }
        }
        return maxBookNameLength;
    }
}
