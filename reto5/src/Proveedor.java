import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Proveedor {
    public static void ingresarProveedor() throws SQLException {
        String sqlProve = "INSET INTO proveedor VALUES (?, ?, ?, ?)";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sqlProve);

        System.out.print("ID: ");
        int id = Main.teclado.nextInt();
        sentencia.setInt(1, id);
        Main.teclado.nextLine();

        System.out.print("Nombre: ");
        String nombre = Main.teclado.nextLine();
        sentencia.setString(2, nombre);

        System.out.print("Direccion: ");
        String direccion = Main.teclado.nextLine();
        sentencia.setString(3, direccion);

        System.out.print("Telefono: ");
        String telefono = Main.teclado.nextLine();
        sentencia.setString(4, telefono);

        int filasInser = sentencia.executeUpdate();
        if(filasInser > 0) {
            System.out.println("Almacenado con exito");
        }
    }
}

