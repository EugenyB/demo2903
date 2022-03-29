package main.ui;

import java.util.Scanner;

public class Menu {
    public void show() {
        System.out.println("1. Show All");
        System.out.println("2. Add Broadcast");
        System.out.println("3. Add Song");
        System.out.println("4. Add Advertising");
        System.out.println("5. Add Interview");
        System.out.println("0. Exit");
    }

    public int getSelection(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in).nextInt();
    }
}
