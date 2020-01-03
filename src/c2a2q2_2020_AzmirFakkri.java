import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class c2a2q2_2020_AzmirFakkri {

    public static void main(String[] args) {

        // arrayList to store the strings line by line
        ArrayList<String> stringsListReversed = new ArrayList<>();

        // read the file
        File file = new File("input.txt");

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String sentence = sc.nextLine();
                // System.out.println(sentence);
                stringsListReversed.add(sentence);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("output.txt");
            // reverse the string
            for (int i = stringsListReversed.size() - 1; i >= 0; i--) {
                String reverseSentence = stringsListReversed.get(i);
                writer.write(reverseSentence);
                writer.write("\n");
                System.out.println(reverseSentence);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
