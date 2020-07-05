import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String sURL = "https://speller.yandex.net/services/spellservice/checkText?text=";
    static String lang = "?lang=en";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your words\n");
        String input = br.readLine();

        GetRequest request = new GetRequest();

        request.send(sURL, lang, input);
    }
}
