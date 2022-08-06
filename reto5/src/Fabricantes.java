import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Fabricantes {

    public static void ingresarFabricantes() throws SQLException {
        String sqlFabri = "INSET INTO fabricantes VALUES (?)";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sqlFabri);
        System.out.print("Nombre fabricante: ");
        String nombre = Main.teclado.nextLine();
        sentencia.setString(1, nombre);

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) System.out.println("Almacenado con exito");
    }
}
