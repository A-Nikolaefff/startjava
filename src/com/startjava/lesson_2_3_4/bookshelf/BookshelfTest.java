package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        System.out.println("Menu commands: \n1. add <author> <title> <publishYear>\n2. delete <title>\n" +
                "3. find <title>\n4. amount\n5. space\n6. exit");
        bookshelf.viewShelf();
        Scanner scanner = new Scanner(System.in);
        boolean active = true;
        do {
            System.out.print("Enter command: ");
            String command = scanner.next();
            switch (command) {
                case "add" -> {
                    if (bookshelf.add(scanner.nextLine())) {
                        System.out.println("The book has been added.");
                    } else {
                        System.out.println("Adding a book is not possible because" +
                                "there is no free space on the bookshelf.");
                    }
                }
                case "delete" -> {
                    if (bookshelf.delete(scanner.nextLine())) {
                        System.out.println("The book has been deleted.");
                    } else {
                        System.out.println("A book with that title is not on the bookshelf.");
                    }
                }
                case "find" -> {
                    String bookInfo;
                    if ((bookInfo = bookshelf.find(scanner.nextLine())) != null) {
                        System.out.println(bookInfo);
                    } else {
                        System.out.println("A book with that title is not on the bookshelf.");
                    }
                }
                case "amount" -> System.out.println("The amount of books: " + bookshelf.getAmountBooks());
                case "space" -> System.out.println("Free space: " + bookshelf.getFreeSpace());
                case "exit" -> active = false;
                default -> System.out.println("The command is not recognized. Enter the correct command");
            }
            System.out.println(bookshelf.viewShelf());
        } while (active);
    }
}
