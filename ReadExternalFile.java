import java.io.*;

public class ReadExternalFile {

    public static void main(String[] args) {

        try {
            // Give full path of the file (change path as per your system)
            File file = new File("C:\\Users\\khot6\\OneDrive\\Desktop\\JPartical 7\\ReadExternalFile.java");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("File Content:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}