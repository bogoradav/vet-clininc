package main.java.com.magicvet;

import java.util.Scanner;

public class Main {
    static String PASSWORD = "default";
    static Scanner SCANNER;

    public Main() {
    }

    public static void main(String[] args) {
        run();
    }

    static void run() {
        boolean accepted = false;

        for(int i = 0; i < 3; ++i) {
            System.out.println("Password: ");
            String input = SCANNER.nextLine();
            if (PASSWORD.equals(input)) {
                accepted = true;
                break;
            }

            System.out.println("Access denied, please check your pasword");
        }

        System.out.println(accepted ? "Wellcome to the magic Vet!" : "Application has been blocked");
    }

    static {
        SCANNER = new Scanner(System.in);
    }
}