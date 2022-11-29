package exercice2;

import java.util.*;

public class ScanUse1 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Give your age, name and base salary");
        String text = in1.nextLine();
        Scanner in2 = new Scanner(text);
        int age = in2.nextInt();
        String name = in2.next();
        double salary = in2.nextDouble();

        System.out.printf("Hello you are %d years old and , %s " + " so you %.3f $ per week\n", age, name, salary);
    }
}
