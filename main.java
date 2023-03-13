import java.util.ArrayList;
import java.util.List;

public class main {
    static String[] movies = {
        "Indiana Jones et le Royaume du Crâne de Cristal ",
        "Indiana Jones et la Dernière Croisade",
        "Indiana Jones et le Temple maudit"
    };
    static String[][] actorsMovie = new String[][]{
        {"Harrison Ford", "Shia LaBeouf", "Karen Allen"},
        {"Harrison Ford", "Sean Connery", "Denholm Elliott"},
        {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"}
    };
    

    static void writeMoviesDetails() {
        List<String> moviesInformation = new ArrayList<>();

        System.out.println("chargement des données");

        for (int i = 0; i < movies.length; i++) {
            moviesInformation.add("Dans le film" + movies[i] + ", les principaux acteurs sont :" + actorsMovie[i][0] + ", " + actorsMovie[i][1] + ", " + actorsMovie[i][2] + ".");
        }

        System.out.println("Enregistrement des données");
        PersonOutputStream fileOutput = new PersonOutputStream();
        if( fileOutput.writeInFile(moviesInformation)){
            System.out.println("les données ont été enregister");
        }

    }

    static void ReadMoviesDetails(){
        System.out.println("Lecture des données");
        PersonInputStream fileInput = new PersonInputStream();
        List<String> moviesDetails = new ArrayList<>();
        moviesDetails = fileInput.ReadInFile();

        for (String movieDetails : moviesDetails) {
            System.out.println(movieDetails);
        }

        System.out.println("lecture des données terminée");

    }

    public static void main(String[] args) {
       
        writeMoviesDetails();
        ReadMoviesDetails();
    
    }
}
