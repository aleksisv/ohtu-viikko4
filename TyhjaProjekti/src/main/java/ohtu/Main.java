package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan, ÄLÄ kuitenkaan laita githubiin omaa opiskelijanumeroasi
        String studentNr = "014292493";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String url2 = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();

        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );
        System.out.println("");

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        
        System.out.println("Kurssi: Ohjelmistotuotanto, kevät 2017");
        System.out.println("Opiskelijanumero 1234567");
        int yhteensaTeht = 0;
        int yhteensaH = 0;
        for (Submission submission : subs) {
            yhteensaTeht += submission.getThemPoints().size();
            yhteensaH += Integer.parseInt(submission.getHours());
            System.out.println("\t" + submission + "(maksimi " + submission.getMaxPoints() + ")");
        }
        System.out.println("\nyhteensä: " + yhteensaTeht + " tehtävää " + yhteensaH + " tuntia");

    }
}