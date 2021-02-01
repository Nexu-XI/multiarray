package misrc;

public class main8 {

    public static void main(String[] args) {
        String[][] nombre = {{"Pepe","Jose"},{"Carlos","Ana"},{"Maria","Daniel"}};
        for(int i=0;i<nombre.length;i++){
            for(int j=0;j<nombre[0].length;j++){
                System.out.println(nombre[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
}
