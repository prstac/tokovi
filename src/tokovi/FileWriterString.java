package tokovi;

import java.io.*;

public class FileWriterString {
    public static void main(String[] args) throws IOException {
        Reader ulaz = new StringReader("Dolazi nam pauza.");
        try (Writer izlaz = new FileWriter("Pauza.txt")) {
            int znakovi;
            while ( (znakovi = ulaz.read()) != -1) {
                System.out.println(znakovi);
                izlaz.write(Character.toUpperCase((char) znakovi));
            }
        }
    }
}
