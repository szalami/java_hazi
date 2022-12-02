import java.io.*;

public class QuadEq {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Az a együttható: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Az b együttható: ");
        b = Integer.parseInt(br.readLine()); 
        System.out.print("Az c együttható: ");
        c = Integer.parseInt(br.readLine()); 
        if((b * b - 4 * a * c) >= 0){
            System.out.println("Van megoldása a valós számok között.");
        }else{
            System.out.println("Nincs megoldása a valós számok között.");
        }
    }
}
