package tokovi;

import java.io.*;

public class PrinterWriterDemo {
    public static void main(String[] args) throws IOException {
        try (
                Writer izlaz = new FileWriter("Print.txt");
        ) {
            PrintWriter ispis = new PrintWriter(izlaz);
            ispis.println("dobar dan");
            ispis.println(5);
            ispis.println(true);

            BufferedReader bufferedReader = new BufferedReader(new FileReader("dat1"));
            bufferedReader.lines().forEach(ispis::println);

            /*
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Print2.txt"));
            bufferedReader.lines().forEach(
                   l -> {
                       try {
                           bufferedWriter.write(l);
                       } catch (IOException e) {
                           throw new RuntimeException(e);
                       }
                   }
            );*/
        }


    }
}
