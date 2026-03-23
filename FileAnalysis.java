import java.io.*;

public class FileAnalysis {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("sample.txt"));

            String line;
            int vowelCount = 0;
            int wordCount = 0;
            int aCount = 0;

            while ((line = br.readLine()) != null) {

                // Count words
                String words[] = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }

                // Count vowels and 'a'
                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i'
                            || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }

                    if (ch == 'a') {
                        aCount++;
                    }
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowelCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Number of 'a': " + aCount);

        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}