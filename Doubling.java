import java.io.*;

public class Doubling {
      public static void main(String[] args) throws IOException {
        int number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Írj be egy számot: ");
        number = Integer.parseInt(br.readLine());
        System.out.println("A szám kétszerese: " + number * 2);

    }
}