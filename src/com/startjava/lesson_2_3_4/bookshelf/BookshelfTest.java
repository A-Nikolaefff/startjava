package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        System.out.println("Menu commands: \n1. add <author> <title> <publishYear>\n2. delete <title>\n3. find <title>\n4. amount\n5. space\n6. exit");
        bookshelf.view();
        Scanner scanner = new Scanner(System.in);
        boolean active = true;
        do {
            System.out.print("Enter command: ");
            String command = scanner.next();
            switch (command) {
                case "add" -> {
                    String[] bookInfo = scanner.nextLine().replaceAll("[\\<\\>]", "").split(" ");
                    bookshelf.add(bookInfo[1], bookInfo[2], Integer.parseInt(bookInfo[3]));
                }
                case "delete" -> bookshelf.delete(scanner.nextLine().trim().replaceAll("[\\<\\>]", ""));
                case "find" -> bookshelf.find(scanner.nextLine().trim().replaceAll("[\\<\\>]", ""));
                case "amount" -> bookshelf.getAmountOfBooks();
                case "space" -> bookshelf.getFreeSpace();
                case "exit" -> active = false;
                default -> System.out.println("The command is not recognized. Enter the correct command");
            }
        } while (active);
    }
}
