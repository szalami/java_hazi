import java.io.*;

public class QuadEqResult {
    public static void main(String[] args) throws IOException {
        double a, b, c, x1, x2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Az a együttható: ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Az b együttható: ");
        b = Double.parseDouble(br.readLine());
        System.out.print("Az c együttható: ");
        c = Double.parseDouble(br.readLine());
        if((b * b - 4 * a * c) >= 0){
            x1 = (((-1 * b) - Math.sqrt(b * b - 4 * a * c)) / 2 * a );
            x2 = (((-1 * b) + Math.sqrt(b * b - 4 * a * c)) / 2 * a );

            System.out.println("A két megoldás: " + x1 + " és " + x2);
        }else{
            System.out.println("Nincs megoldása a valós számok között.");
        }
    }
}
