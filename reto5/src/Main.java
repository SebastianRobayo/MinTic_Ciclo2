import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static byte opcion;
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
       menu();
       // conectar();
    }

    public static void menu() {
        // do {
            try {
                System.out.println("******************\n" +
                        "*** CRUD JAVA ***\n" +
                        "******************\n" +
                        "1. Crear Tablas.\n" +
                        "-------------------------------------------------------------------------\n" +
                        "2. Ingresar datos Tabla proveedor.\n" +
                        "3. Ingresar datos Tabla clientes.\n" +
                        "4. Ingresar datos Tabla fabricantes.\n" +
                        "5. Ingresar datos Tabla bicicletas.\n" +
                        "6. Ingresar datos Tabla motocicletas.\n" +
                        "7. Ingresar datos Tabla compras.\n" +
                        "-------------------------------------------------------------------------\n" +
                        "8. Modificar año de la bicicleta.\n" +
                        "9. Modificar telefono del cliente.\n" +
                        "10. Borrar intención de compra.\n" +
                        "-------------------------------------------------------------------------\n" +
                        "11. Listado de fabricantes.\n" +
                        "12. Mostrar información fabricantes bicicletas estrenadas desde 2019.\n" +
                        "13. Mostrar fabricantes motocicletas con motor auteco.\n" +
                        "14. Mostrar fabricante intención de compra del cliente lucky.\n" +
                        "15. Mostrar clientes que que quieren comprar bicicleta yeti.\n" +
                        "16. Cantidad bicicletas fabricadas desde \"x\" año.\n" +
                        "-------------------------------------------------------------------------\n" +
                        "0. Salir.\n" +
                        "-------------------------------------------------------------------------\n"
                );
                System.out.print(">> ");
                opcion = teclado.nextByte();

                switch (opcion){
                    case 1:
                        Consultas.crearTablas();
                        break;
                    case 2:
                        Proveedor.ingresarProveedor();
                        break;
                    case 3:
                        Clientes.ingresarClientes();
                        break;
                    case 4:
                        Fabricantes.ingresarFabricantes();
                        break;
                    case 5:
                        Bicicletas.ingresarBicicletas();
                        break;
                    case 6:
                        Motocicletas.ingresarMotocicletas();
                        break;
                    case 7:
                        Compras.ingresarCompras();
                        break;
                    case 8:
                        Consultas.modificarAnio();
                        break;
                    case 9:
                        Consultas.modificarTelCliente();
                        break;
                    case 10:
                        Consultas.borrarCompra();
                        break;
                    case 11:
                        Consultas.consultaFabricante();
                        break;
                    case 12:
                        Consultas.consultaInfoBici();
                        break;
                    case 13:
                        Consultas.consultaFabricaMoto();
                        break;
                    case 14:
                        Consultas.consultaCompBiMo();
                        break;
                    case 15:
                        Consultas.consultaCompBici();
                        break;
                    case 16:
                        Consultas.consultaBiciFab();
                        break;
                    default:
                        // if(opcion == 0){
                        System.out.println("Hasta pronto.....");
                        // }
                }

            } catch (Exception e) {
                System.out.println("Hasta pronto.....");
            }
        // } while (opcion != 0);
    }

    public static Connection conectar() {
        String dbURL = "jdbc:mysql://127.0.0.1:3306/reto5";
        String user = "root";
        String password = "";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL, user, password);
            if(conn != null) {
                System.out.println("***Conectado***");
                System.out.println("---------------\n");
            }
        } catch (SQLException error) {
            System.out.println("Error: " + error.getErrorCode() + " " + error.getMessage());
        }
        return conn;
    }
}