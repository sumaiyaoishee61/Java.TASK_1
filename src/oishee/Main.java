package oishee;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        String section;
        section = inp.nextLine();

        Info detail = new Info();
        Hobby hby = new Hobby();

        System.out.println("Section: " +section);
        System.out.println("Name: " +detail.name);
        System.out.println("ID: " +detail.id);
        System.out.println("Hobby: " +hby.hobbyName);

    }
}
