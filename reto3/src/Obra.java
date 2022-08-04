import java.util.ArrayList;

public class Obra {
    // Punto 1
    public static ArrayList<Integer> clases(ArrayList<Integer> input) {
        ArrayList<Integer> output = new ArrayList<>();
        for(Integer i:input) {
            if(!output.contains(i)) {
                output.add(i);
            }
        } return output;
    }
    // Punto 2
    public static ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obrasFalta, ArrayList<Integer> listaCate, int categoria) {
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> nueva = new ArrayList<>();
        for(int i=0;i<listaCate.size();i++) {
            if(categoria == listaCate.get(i)) {
                nueva.add(i);
            }
        }
        for(Integer i:obrasFalta) {
            if(nueva.contains(i)){
                output.add(i);
            }
        }
        return output;
    }
    // Punto 3
    public static ArrayList<Integer> noTengo(ArrayList<Integer> obrasA, ArrayList<Integer> obrasB){
        ArrayList<Integer> output = new ArrayList<>();
        for(Integer i:obrasA) {
            if(!obrasB.contains(i)){
                output.add(i);
            }
        }
        return output;
    }
    // Punto 4
    public static Integer puedoCambiar(ArrayList<Integer> dupliA, ArrayList<Integer> dupliB){
        int contador = 0;
        if(dupliA.size() > dupliB.size()){
            for(Integer i:dupliB) {
                if(!dupliA.contains(i)){
                    contador++;
                }
            }
        } else {
            for(Integer i:dupliA) {
                if(!dupliB.contains(i)){
                    contador++;
                }
            }
        }
        return contador;
    }
}