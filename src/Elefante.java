import java.util.Scanner;

public class Elefante {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        int p = leitor.nextInt();
        String i = "Incomoda ";

        for(int x = 0; x<p; x++){
            System.out.print(i);
        }
        System.out.println("muito mais.");
        
    }
}
