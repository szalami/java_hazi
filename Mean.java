import java.io.*;

public class Mean {
    public static void main(String[] args) throws IOException {
        int numOne, numTwo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Kérek egy számot: ");
        numOne = Integer.parseInt(br.readLine());
        System.out.print("Kérek egy másik számot: ");
        numTwo = Integer.parseInt(br.readLine()); 
        System.out.println("A számtani közép: " + (numOne + numTwo) / 2);
        System.out.println("A mértani közép: " + Math.sqrt(numOne * numTwo));
    }
}
