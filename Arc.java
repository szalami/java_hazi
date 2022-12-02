import java.io.*;

public class Arc {
    public static void main(String[] args) throws IOException {
        double r, a, aOC, cF;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("A körcikk sugara: ");
        r = Double.parseDouble(br.readLine());
        System.out.print("Középponti szög: ");
        a = Double.parseDouble(br.readLine());

        aOC =  r * r * Math.PI;
        cF = 2 * r * Math.PI;
        System.out.println("A körív területe: " + aOC / (360 / a) + "cm2");
        System.out.println("Határoló ív hossza: " + cF / (360 / a) + "cm");

    }

}

