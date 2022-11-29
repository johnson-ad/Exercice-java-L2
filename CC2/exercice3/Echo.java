package exercice3;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class Echo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\ISI\\Java\\CC2\\exercice3\\nomber.txt"));
        double sun = 0.0;
        while (input.hasNextLine()) {
            double next = input.nextDouble();
            System.out.println("Number = " + next);
            sun = sun + next;
        }
        System.out.printf("Sum = %.1f\n", sun);
    }
}
