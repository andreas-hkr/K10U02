import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Läs in en textfil och skriv ut innehållet på skärmen,
        // men översätt alla aa, ae, oe till å, ä, och ö

        Scanner input = new Scanner(System.in);
        System.out.print("Ange filnamnet: ");
        String filename = input.nextLine();

        Scanner fileIn = new Scanner(new File(filename));
        while (fileIn.hasNextLine()) {
            String line = fileIn.nextLine();
            for (int i=0; i < line.length(); i++) {
                if (line.charAt(i) == 'a' && i+1 < line.length() && line.charAt(i+1) == 'a') {
                    System.out.print('å');
                    i++;
                } else if (line.charAt(i) == 'a' && i+1 < line.length() && line.charAt(i+1) == 'e') {
                    System.out.print("ä");
                    i++;
                } else if (line.charAt(i) == 'o' && i+1 < line.length() && line.charAt(i+1) == 'e') {
                    System.out.print("ö");
                    i++;
                } else {
                    System.out.print(line.charAt(i));
                }
            }
            System.out.println();
        }
    }
}