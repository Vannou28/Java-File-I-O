import java.io.*;
import java.util.List;

// ecriture des informations du fichier text
class PersonOutputStream {
   
    public boolean writeInFile(List <String> moviesInformation){
        File f = new File("test.txt");
        
        FileWriter fw;
        try {
            fw = new FileWriter(f);
            for (String movieInformation : moviesInformation) {
                fw.write(movieInformation);
                fw.write("\r\n");
            }
            fw.close();
            return true;
        } catch (IOException e) {
   
            e.printStackTrace();
            return false;
        }
    }
}

