package partieB.exercice4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HoursSearch {
    public static void main(String[] args) {
        File file = new File("C:\\ISI\\Java\\CC2\\partieB\\exercice4\\hours_search.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter writer = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("123 Alex 12,5 8,2 7,6 4,0");
                bw.newLine();
                bw.write("456 Alina 4,2 11,6 6,3 2,5 12,0");
                bw.newLine();
                bw.write("789 Ryan 16,0 12,0 8,0 20,0 7,5");
                bw.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {

                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String line = reader.readLine();
                String Alex = "123";
                String Alina = "456";
                String Ryan = "789";

                while (line != null) {
                    line = reader.readLine();

                    if (line.contains(Alex)) {
                        System.out.println(Alex);
                    } else if (line.contains(Alina)) {
                        System.out.println(Alina);
                    } else {
                        System.out.println(Ryan);
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
