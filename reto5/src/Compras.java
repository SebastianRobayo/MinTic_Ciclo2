import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Compras {
    public static void ingresarCompras() throws SQLException {
        String sqlCliente = "INSET INTO compras VALUES (?, ?, ?, ?)";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sqlCliente);
        System.out.print("ID: ");
        int id = Main.teclado.nextInt();
        sentencia.setInt(1, id);
        Main.teclado.nextLine();

        System.out.print("Alias: ");
        String alias = Main.teclado.nextLine();
        sentencia.setString(2, alias);

        System.out.print("Fabricante: ");
        String fabricante = Main.teclado.nextLine();
        sentencia.setString(3, fabricante);

        System.out.print("Fecha_hora: ");
        String f_hora = Main.teclado.nextLine();
        sentencia.setString(4, f_hora);

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) System.out.println("Almacenado con exito");
    }
}
