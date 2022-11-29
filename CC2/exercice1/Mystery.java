package exercice1;

import java.util.Scanner;

public class Mystery {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Entrer your age: ");
        String name = console.nextLine();
        int age = console.nextInt();
        System.out.println("Now enter your name: ");
        System.out.println(name + " is " + age + " years old.");
    }
}
