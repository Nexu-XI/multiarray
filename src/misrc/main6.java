package misrc;

import java.util.Arrays;


public class main6 {


    public static void main(String[] args) {
        String[] cadena1 = {"a","b","c","d","e"};
        String[] cadena2 = {"1","2","3","4","5","6","7","8","9"};
        System.arraycopy(cadena2, 4, cadena1, 0, 5);
        System.out.println(Arrays.toString(cadena1));
        
    }
}
