import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Bicicletas {
    public static void ingresarBicicletas() throws SQLException {
        String sqlBici = "INSET INTO bicicletas VALUES (?, ?, ?, ?)";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sqlBici);
        System.out.print("ID: ");
        int id = Main.teclado.nextInt();
        sentencia.setInt(1, id);
        Main.teclado.nextLine();

        System.out.print("Fabricante: ");
        String nombre = Main.teclado.nextLine();
        sentencia.setString(2, nombre);

        System.out.print("Precio: ");
        int precio = Main.teclado.nextInt();
        sentencia.setInt(3, precio);
        Main.teclado.nextLine();

        System.out.print("Año: ");
        int anio = Main.teclado.nextInt();
        sentencia.setInt(4, anio);
        Main.teclado.nextLine();

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) System.out.println("Almacenado con exito");
    }
}
