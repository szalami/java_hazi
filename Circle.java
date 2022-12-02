import java.io.*;

public class Circle {
    public static void main(String[] args) throws IOException {
        double d, r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("A kör átmérője: ");
        d = Double.parseDouble(br.readLine());
        r = d / 2;
        System.out.println("Kerület: " + 2 * r * Math.PI);
        System.out.println("Terület: " + r * r * Math.PI);

    }

}
