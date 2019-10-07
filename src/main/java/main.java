import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

// Download JARs: http://commons.apache.org/proper/commons-lang/download_lang.cgi
// Manually Add with IntelliJ: File > Project Structure > Project Settings > Modules > + > Jars/Directorys (navigate to downloaded and extracted jars) > OK
// Import StringUtils (like above)

public class main {

    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter a String:");
        String input = sc.nextLine();

        System.out.println("You entered: " + input);
        System.out.println("Is " + input + " a number? " + StringUtils.isNumeric(input));
        System.out.println("Switch case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));



    }

}
