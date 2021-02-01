package misrc;


public class main5 {

    
    public static void main(String[] args) {
       int[] numero = {4,5,10,24,1,9,8};
       int[] copia = new int[numero.length];
       System.arraycopy(numero, 0, copia, 0, numero.length);
    for(int i=0; i<copia.length; i++){
            System.out.println(copia[i]);
        }

    }
}