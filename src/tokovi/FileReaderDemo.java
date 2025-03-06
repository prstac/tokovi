package tokovi;

import com.sun.source.tree.NewArrayTree;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //File inputFile = new File("dat1.txt");
        //FileReader ulaz = new FileReader("dat1");

        //BufferedReader reader = new BufferedReader(ulaz);
        //reader.lines().forEach(l -> System.out.println(l));

        /*
        try {
            FileReader ulaz = new FileReader("dat1");
            int c;
            while ((c = ulaz.read()) != -1) {
                System.out.print((char)c);
            }
            ulaz.close(); // zatvaranje toka metodom close
        } catch (FileNotFoundException e) {
            System.err.println("Greska : " + e.getMessage());
        }*/

        // UCITAVANJE--v

        try (FileReader ulaz = new FileReader("dat1")) {
            int c;
            while ((c = ulaz.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Greska : " + e.getMessage());
        }

        File outputFile = new File("Kopija.txt");


        //KOPIRANJE--v

        // osiguravamo da se tok čitanja i pisanja zatvore po zavrsetku
        try (
                FileReader ulaz = new FileReader("dat1");
                FileWriter izlaz = new FileWriter(outputFile)
        ) {
            int c;
            while ((c = ulaz.read()) != -1) {
                izlaz.write(c);
            }
            // izlaz.flush
            // izlaz.close()
        } catch (FileNotFoundException e) {
            System.err.println("Greska : " + e.getMessage());
        }

        FileWriter izlaz = new FileWriter("test");
    }
}
