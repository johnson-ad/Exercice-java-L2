package exercice4;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Election {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\ISI\\Java\\CC2\\exercice4\\pools.txt");

        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
