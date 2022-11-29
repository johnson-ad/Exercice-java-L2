package partieB.exercice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrintStream {

    private String file;
    private String txt;
    private String lol;

    // public PrintInFile(File files = new File(file)){
    // file = "C:\\ISI\\Java\\CC2\\partieB\\exercice1\\data.txt";
    // File files = new File(file);
    // }

    public PrintStream(String file) {
        this.file = file;
        file = "C:\\ISI\\Java\\CC2\\partieB\\exercice1\\data.txt";
        File files = new File(file);

        if (!files.exists()) {
            try {
                files.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter writer = new FileWriter(files);
                BufferedWriter bw = new BufferedWriter(writer);
                Scanner sc = new Scanner(files);
                sc.nextLine();
                bw.write("123");
                bw.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        // try {

        // BufferedReader reader = new BufferedReader(new InputStreamReader(new
        // FileInputStream(files), "UTF-8"));
        // String line = reader.readLine();

        // while (line != null) {
        // System.out.println(line);
        // line = reader.readLine();
        // }
        // reader.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
    }

    // public static write(String txt , File files){
    // try {

    // FileWriter writer = new FileWriter(files);
    // BufferedWriter bw = new BufferedWriter(writer);
    // Scanner sc = new Scanner(files);
    // sc.nextLine();
    // bw.write(txt);
    // bw.close();
    // writer.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // }

    // public static File file() {
    // File file = new File("C:\\ISI\\Java\\CC2\\partieB\\exercice1\\data.txt");

    // if (!file.exists()) {
    // try {
    // file.createNewFile();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }
    // } else {
    // try {
    // FileWriter writer = new FileWriter(file);
    // BufferedWriter bw = new BufferedWriter(writer);
    // Scanner sc = new Scanner(file);
    // sc.nextLine();
    // bw.write("");
    // bw.close();
    // writer.close();
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    // }
}
