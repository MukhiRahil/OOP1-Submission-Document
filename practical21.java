import java.util.*;
import java.io.*;
class practical21 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new File("C:\\Users\\lenovo\\Documents\\java_prac\\123.txt"));
            for (int i = 0; i < 150; i++) {
                pw.write((int) (Math.random() * 150) + " ");
            }
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
