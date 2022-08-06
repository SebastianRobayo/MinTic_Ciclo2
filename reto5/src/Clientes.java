import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Clientes {
    public static void ingresarClientes() throws SQLException {
        String sqlCliente = "INSET INTO clientes VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sqlCliente);
        System.out.print("Alias: ");
        String alias = Main.teclado.nextLine();
        sentencia.setString(1, alias);

        System.out.print("Nombre: ");
        String nombre = Main.teclado.nextLine();
        sentencia.setString(2, nombre);

        System.out.print("Apellido: ");
        String apellidos = Main.teclado.nextLine();
        sentencia.setString(3, apellidos);

        System.out.print("E-mail: ");
        String email = Main.teclado.nextLine();
        sentencia.setString(4, email);

        System.out.print("Celular: ");
        String celular = Main.teclado.nextLine();
        sentencia.setString(5, celular);

        System.out.print("Contraseña: ");
        int contrasena = Main.teclado.nextInt();
        sentencia.setInt(6, contrasena);
        Main.teclado.nextLine();

        System.out.print("Fechas de nacimiento: ");
        String fecha_nacimiento = Main.teclado.nextLine();
        sentencia.setString(7, fecha_nacimiento);

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) {
            System.out.println("Almacenado con exito");
        }
    }
}
