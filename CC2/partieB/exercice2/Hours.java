package partieB.exercice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hours {
    public static void main(String[] args) {
        File file = new File("C:\\ISI\\Java\\CC2\\partieB\\exercice2\\hours_out.txt");

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
                bw.write("123 Rose 12,5 8,2 7,6 4,0");
                bw.newLine();
                bw.write("456 Erika 4,2 11,6 6,3 2,5 12,0");
                bw.newLine();
                bw.write("789 Alex 16,0 12,0 8,0 20,0 7,5");
                bw.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
