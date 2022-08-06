import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Motocicletas {

    public static void ingresarMotocicletas() throws SQLException {
        String sql = "INSET INTO motocicletas VALUES (?, ?, ?, ?, ?)";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sql);
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

        System.out.print("Autonomia: ");
        int autonomia = Main.teclado.nextInt();
        sentencia.setInt(4, autonomia);
        Main.teclado.nextLine();

        System.out.print("Proveedor del motor: ");
        int proveedor_motor = Main.teclado.nextInt();
        sentencia.setInt(5, proveedor_motor);

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) System.out.println("Almacenado con exito");
    }
}
