package partieC.exercice0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Top250 {
    public static void main(String[] args) {
        File file = new File("C:\\ISI\\Java\\CC2\\partieC\\exercice0\\top250.txt");

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
                bw.write("10 8,8 482970 The Dark Knight (2008)");
                bw.newLine();
                bw.write("11,5 12,0 Star Wars: Episode v - The Empire Strikes Back (1980)");
                bw.newLine();
                bw.write("12,0 7,5 The Lord of the Rings: The Return of the King (2003)");
                bw.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                /*
                 * BufferedReader : ns permet de lire le contenu de notre file
                 * FileInputStream : prend 2 param : le 1ere le file et le 2sd l'encodage UTF-8
                 */
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(reader);
                    line = reader.readLine();
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}