package exercice1;

import java.util.*;

public class ScanUse2 {

    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Give your name, age and base salary");
        String name = in1.nextLine();
        int age = in1.nextInt();
        double salary = in1.nextDouble();

        if (age > 30)
            salary += 0.2 * salary;
        else
            salary += 0.3 * salary;
        System.out.printf("Hello %s, you are %d years old and " + " so you %.3f $ per week\n", name, age, salary);

    }
}
