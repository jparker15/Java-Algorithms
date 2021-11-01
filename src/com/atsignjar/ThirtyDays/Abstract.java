package com.atsignjar.ThirtyDays;

import java.util.Scanner;

public class Abstract {

    String title;
    String author;

    public Abstract(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void display(){

    }
}

class Book extends Abstract{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author");
        String author = scanner.nextLine();
        System.out.println("Enter price");
        int price = scanner.nextInt();
        scanner.close();

        Book book = new Book(title, author, price);
        book.display();
    }

    int price;
    public Book(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }


    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}

