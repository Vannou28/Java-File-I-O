import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// lecture des informations du fichier text

class PersonInputStream {
    public List<String> ReadInFile() {
        List<String> moviesDetails = new ArrayList<>();

        File f = new File("test.txt");

        FileReader fr;
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                moviesDetails.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return moviesDetails;
    }
}
