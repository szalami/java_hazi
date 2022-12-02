import java.io.*;

public class WhichIsBigger {
    public static void main(String[] args) throws IOException {
    double numOne, numTwo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Kérek egy számot: ");
        numOne = Double.parseDouble(br.readLine());
        System.out.print("Kérek egy másik számot: ");
        numTwo = Double.parseDouble(br.readLine());
        if(numOne > numTwo){
            System.out.println("Az első szám a nagyobb");
        }else if(numTwo > numOne){
            System.out.println("A második szám nagyobb");
        }else{
            System.out.println("A két szám egyenlő");
        }

    }
}