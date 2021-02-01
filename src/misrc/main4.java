package misrc;


public class main4 {

    public static void main(String[] args) {
        int[] numero = {4,5,10,24,1,9,8};
        int promedio = 0;
        for(int i=0;i<numero.length;i++){
            promedio = promedio + numero[i];
        }
        promedio = (promedio/numero.length);
        System.out.println("El promedio de los numeros es de: "+promedio);
    }
    
}
