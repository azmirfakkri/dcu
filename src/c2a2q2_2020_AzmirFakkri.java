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

        // get the pathname and output name from cli
        String pathName = args[0];
        String outputName = args[1];

        // read the file
        File file = new File(pathName);

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String sentence = sc.nextLine();
                stringsListReversed.add(sentence);
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter(outputName);
            // reverse the string
            for (int i = stringsListReversed.size() - 1; i >= 0; i--) {
                String reverseSentence = stringsListReversed.get(i);
                writer.write(reverseSentence);
                writer.write("\n");
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
