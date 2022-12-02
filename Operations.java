import java.io.*;

public class Operations {
    public static void main(String[] args) throws IOException {
    double numOne, numTwo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Kérek egy számot: ");
        numOne = Double.parseDouble(br.readLine());
        System.out.print("Kérek egy másik számot: ");
        numTwo = Double.parseDouble(br.readLine());
        System.out.println("A két szám összege: " + (numOne + numTwo));
        System.out.println("A két szám külömbsége: " + (numOne - numTwo));
        System.out.println("A két szám szorzata: " + (numOne * numTwo));
        if(numTwo == 0){
            System.out.println("Nullával való osztás nem értelmezhető!");
        }else{
            System.out.println("A két szám hányadosa: " + (numOne / numTwo));
        }

    }
}