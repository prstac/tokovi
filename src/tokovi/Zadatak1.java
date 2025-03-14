package tokovi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) {
        List<String> imenaList = new ArrayList<>();

        try (FileReader reader = new FileReader("imena")) {
            BufferedReader bufferedReader = new BufferedReader(reader);

            //**************String[] imena = bufferedReader.lines().findFirst().get().split(";");
            int c;
            StringBuilder s = new StringBuilder();
            while ((c = bufferedReader.read()) != -1) {
                if ((char) c == ';') {
                    imenaList.add(s.toString());
                    s = new StringBuilder();
                    continue;
                }
                s.append((char) c);
            }
            imenaList.add(s.toString());
            String[] imena = imenaList.toArray(new String[]{});

            for (String string : imena) {
                System.out.println(string);
            }

        } catch (IOException e) {
        }
    }
}