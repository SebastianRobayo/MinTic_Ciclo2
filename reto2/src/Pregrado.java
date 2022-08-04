public class Pregrado extends Estudiante {
    private int cantidad_creditos;

    public Pregrado(String nombre, String programa, String tipo_etnia, int edad) {
        super(nombre, programa, tipo_etnia, edad);
        this.cantidad_creditos = cantidad_creditos;
    }

    public String toString(){
        return "\n\tEstudiante Pregrado\n" + super.toString() + "\n\tCreditos aprobados: " + cantidad_creditos;
    }
}
