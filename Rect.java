import java.io.*;

public class Rect {
    public static void main(String[] args) throws IOException {
        double a, b, c, s, v;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Első él: ");
        a = Double.parseDouble(br.readLine());
        System.out.print("Második él: ");
        b = Double.parseDouble(br.readLine());
        System.out.print("Harmadik él: ");
        c = Double.parseDouble(br.readLine());
        s = 2 * (a * b + a * c + b * c);
        v = a * b * c;
        System.out.println("Felszín: " + s + " cm2");
        System.out.println("Térfogat: " + v + " cm3");

    }
}
