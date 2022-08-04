public class Estudiante {
    private String nombre, programa, tipo_etnia;
    private int edad;

    public Estudiante(String nombre, String programa, String tipo_etnia, int edad) {
        this.nombre = nombre;
        this.programa = programa;
        this.tipo_etnia = tipo_etnia;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\tNombre: " + nombre +
                "\n\tEdad: " + edad + " anios" +
                "\n\tPrograma: " + programa +
                "\n\tEtnia: " + tipo_etnia;
    }
}