public class Posgrado extends Estudiante {
    private String modalidad;

    public Posgrado(String nombre, String programa, String tipo_etnia, int edad, String modalidad) {
        super(nombre, programa, tipo_etnia, edad);
        this.modalidad = modalidad;
    }

    public String toString(){
        return "\n\tEstudiante Posgrado\n" + super.toString() + "\n\tModalidad: " + modalidad;
    }
}
