package com.startjava.lesson_2_3_4.bookshelf;

public class Bookshelf {
    private int amountOfBooks = 0;
    private Book[] books = new Book[10];

    public boolean add(String bookInfo) {
        String[] partsBookInfo = bookInfo.replaceAll("[\\<\\>]", "").trim().split(" ");
        Book book = new Book(partsBookInfo[0], partsBookInfo[1], Integer.parseInt(partsBookInfo[2]));
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                amountOfBooks++;
                return true;
            }
        }
        return false;
    }

    public boolean delete(String title) {
        title = title.trim().replaceAll("[\\<\\>]", "");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getTitle().equals(title)) {
                    books[i] = null;
                    amountOfBooks--;
                    return true;
                }
            }
        }
        return false;
    }

    public String find(String title) {
        title = title.trim().replaceAll("[\\<\\>]", "");
        for (Book b : books) {
            if (b != null) {
                if (b.getTitle().equals(title)) {
                    return b.toString();
                }
            }
        }
        return null;
    }

    public int getAmountBooks() {
        return amountOfBooks;
    }

    public int getFreeSpace() {
        return books.length - amountOfBooks;
    }

    public String viewShelf() {
        int maxBookNameLength = findMaxBookNameLength();
        StringBuilder stringBuilder = new StringBuilder();
        for (Book b : books) {
            if (b != null) {
                stringBuilder.append("<").append(b).append(">\n");
            } else {
                stringBuilder.append("<").append(" ".repeat(maxBookNameLength)).append(">\n");
            }
        }
        return stringBuilder.toString();
    }

    private int findMaxBookNameLength() {
        // Значение длины пустого места по умолчанию при выводе в консоль
        int maxBookNameLength = 20;
        for (Book b : books) {
            if (b != null && b.toString().length() > maxBookNameLength) {
                maxBookNameLength = b.toString().length();
            }
        }
        return maxBookNameLength;
    }
}
