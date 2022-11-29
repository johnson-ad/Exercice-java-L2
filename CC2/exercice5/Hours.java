package exercice5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hours {
    public static void main(String[] args) {
        File file = new File("C:\\ISI\\Java\\CC2\\exercice5\\hours.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter writer = new FileWriter(file); // creer un file sii cetait un doc il faute juste remplacer
                                                          // file par doc
                BufferedWriter bw = new BufferedWriter(writer); // permet d'ecrire a l'interieur
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
                /*
                 * BufferedReader : ns permet de lire le contenu de notre file
                 * FileInputStream : prend 2 param : le 1ere le file et le 2sd l'encodage UTF-8
                 */
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String line = reader.readLine();

                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
                reader.close(); // il faut tjrs fermer le reader sinonla memoir compon continu a trouner
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
