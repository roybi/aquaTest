import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main( String[] args ) {
       /* for (int i=0; i<=3; i++)
        {
            System.out.println();
            System.out.println("Enter Some text");
            Scanner input = new Scanner(System.in);
            String enterText =input.nextLine();
            System.out.println(enterText);

        }*/
        try {
            File file = new File("MyFile.txt");
            Scanner input = null;

            input = new Scanner(file);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }
        //close the Scanner
        input.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
