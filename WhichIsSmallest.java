import java.io.*;

public class WhichIsSmallest {
    public static void main(String[] args) throws IOException {
    double numOne, numTwo, numThree;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Kérek egy számot: ");
        numOne = Double.parseDouble(br.readLine());
        System.out.print("Kérek egy másik számot: ");
        numTwo = Double.parseDouble(br.readLine());
        System.out.print("Kérek egy harmadik számot: ");
        numThree = Double.parseDouble(br.readLine());
        if(numOne < numTwo && numOne < numThree){
            System.out.println("Az első szám a legkisebb");
        }else if(numTwo < numOne && numTwo < numThree){
            System.out.println("A második szám a legkisebb");
        }else if(numThree < numOne && numThree < numTwo){
            System.out.println("A harmadik szám a legkisebb");
        }else{
            System.out.println("Van közöttük egyenlő");
        }

    }
}
