package tokovi;

import java.io.*;
import java.util.Scanner;

public class ZadatakKopiranje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite putanju izvorisne datoteke");
        String path1 = scanner.nextLine();
        System.out.println("Unesite putanju kopirane datoteke");
        String path2 = scanner.nextLine();

        try (
              FileInputStream  inputStream = new FileInputStream(path1);
              FileOutputStream outputStream = new FileOutputStream(path2)
        ){
            //outputStream.write(inputStream.readAllBytes());
            int b;
            while ( (b = inputStream.read()) != -1) {
                outputStream.write(b);
            }
            System.out.println("Datoteka uspjesno kopirana");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Zelite li pobrisati kopiju? D/N ?");
        var dane = scanner.nextLine();
        if (dane.equals("D")) {
            var kopija = new File(path2);
            if (kopija.exists()) {
                if (kopija.delete()) {
                    System.out.println("Kopija uspješno pobrisana");
                } else {
                    System.out.println("Nije uspjelo brisanje kopije");
                }
            } else {
                System.out.println("Kopija ne postoji, nemam sto pobrisati");
            }
        }
    }
}
