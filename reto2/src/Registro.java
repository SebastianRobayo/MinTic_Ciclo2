import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro {

    public static List<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args){
        procesarComandos();
    }

    public static void procesarComandos(){
        byte opcion =1;
        Scanner input = new Scanner(System.in);
        while(opcion == 1 || opcion == 2){
            String comandos = input.nextLine();
            opcion = Byte.parseByte(comandos.substring(0, 1));

            switch (opcion){
                case 1:
                    agregarEstudiante(comandos);
                    break;
                case 2:
                    listarEstudiantes();
                    break;
            }
        }
    }

    public static void agregarEstudiante(String comandos){
        String[] array = comandos.split("&");
        String nivel = array[1];
        String nombre = array[2];
        int edad = Integer.parseInt(array[3]);
        String programa = array[4];
        String etnia = array[5];

        if(nivel.equals("Pregrado")){
            int creditos = Integer.parseInt(array[6]);
            Pregrado nuevo = new Pregrado(nombre, programa, etnia, creditos);
            estudiantes.add(nuevo);
        } else {
            String modalidad = array[6];
            Posgrado nuevo = new Posgrado(nombre, programa, etnia, edad, modalidad);
            estudiantes.add(nuevo);
        }
    }

    public static void listarEstudiantes(){
        System.out.println("***Listado de estudiantes***");
        for(Estudiante i: estudiantes){
            System.out.print(i);
        }
        System.out.print("\n");
    }
}