package partieB.exercice3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Spammer
 */
public class Spammer {

    public static void main(String[] args) {

        File file = new File("C:\\ISI\\Java\\CC2\\partieB\\exercice3\\address_book.txt");

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
                bw.write("johnson.dev");
                bw.newLine();
                bw.write("isi.com");
                bw.newLine();
                bw.write("orange.sn");
                bw.newLine();
                bw.write("React.com");
                bw.newLine();
                bw.write("free.sn");
                bw.newLine();
                bw.write("fifa.fr");
                bw.newLine();
                bw.write("youtube.com");
                bw.newLine();
                bw.write("facebook.com");
                bw.newLine();
                bw.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {

                String domaineName, respons;
                System.out.println("Saisir un nom de domaine: ");
                Scanner sc = new Scanner(System.in);
                domaineName = sc.nextLine();

                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                String line = reader.readLine();

                while (line != null) {
                    line = reader.readLine();
                    String yes = "o";
                    if (line.matches(domaineName)) {
                        System.out.println("Domaine trouver: " + domaineName.toLowerCase());
                        System.out.println("Voulez-vous l'ajoute dans la liste de span ? o/n ");
                        Scanner qt = new Scanner(System.in);
                        respons = qt.nextLine();

                        if (respons == yes) {
                            System.out.println("Domaine trouver: " + domaineName);
                        } else {
                            System.out.println(
                                    "Le domaine : " + domaineName.toLowerCase() + " a ete ajoute dans le spam");
                        }

                    }

                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
