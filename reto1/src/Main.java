import java.util.Scanner;

public class Main {
    static String palabra;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la distancia a la casa de goku");
        int distancia = input.nextInt();
        int esfera = (distancia*2) + 4;
        int duracion = (distancia+esfera) / 5;

        if(duracion > 0 && duracion < 20) {
            palabra = "uno";
        } else if (duracion > 21 && duracion < 30) {
            palabra = "dos";
        } else if (duracion > 31 && duracion < 50) {
            palabra = "tres";
        } else {
            palabra = "cuatro";
        }

        System.out.println(distancia + " " + esfera + " " + duracion);
        System.out.println(palabra);
    }
}