package misrc;
import java.util.Scanner;

public class main7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el largo");
        int largo = sc.nextInt();
        int[] edad = new int[largo];
        for(int i=0; i<largo; i++){
            System.out.println( "Elemento " + (i + 1) + " ?" );
            edad[i] = sc.nextInt();
        }
        for(int i=0; i<largo;i++){
            System.out.println( "Elemento " + (i + 1) + ":" + edad[i] );
        }
    }
    
}
