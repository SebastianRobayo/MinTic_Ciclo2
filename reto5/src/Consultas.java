import java.sql.*;

public class Consultas {

    public static void crearTablas() {
        try {
            String[] sqls = {
                    "CREATE TABLE proveedor (prov_id int PRIMARY KEY, prov_nombre char(20), prov_direccion char(50), prov_telefono char(20))",
                    "CREATE TABLE clientes (alias char(20) PRIMARY KEY, nombre char(20), apellidos char(20), email varchar(45), celular char(20), contrasena int, f_nacimiento date)",
                    "CREATE TABLE fabricantes (fabricante char(20) PRIMARY KEY)",
                    "CREATE TABLE bicicletas (id int PRIMARY KEY, fabricante char(20), precio int, anio int, FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante))",
                    "CREATE TABLE motocicletas (id int PRIMARY KEY, fabricante char(20), precio int, autonomia int, id_prov int, FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante), FOREIGN KEY (id_prov) REFERENCES proveedor (prov_id))",
                    "CREATE TABLE compras (id int PRIMARY KEY, alias char(20), fabricante char(20), fecha_hora timestamp, FOREIGN KEY (alias) REFERENCES clientes (alias), FOREIGN KEY (fabricante) REFERENCES fabricantes (fabricante))"
            };
            for (String i:sqls) {
                PreparedStatement sentenciaCreate = Main.conectar().prepareStatement(i);
                sentenciaCreate.executeUpdate();
            }

        } catch (Exception e) {
            System.out.println("Tablas ya se encuentran creadas");
        }
    }

    public static void modificarAnio() throws SQLException {
        String sql = "UPDATE bicicletas SET anio=2017 WHERE fabricante=\"Cannondale\"";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sql);
        System.out.println("Por favor ingrese fabricante de la bicicleta y el año a modificar.");
        System.out.print("Fabricante: ");
        String nombre = Main.teclado.nextLine();
        // sentencia.setString(2, nombre);

        System.out.print("Año: ");
        int anio = Main.teclado.nextInt();
        //sentencia.setInt(1, anio);
        Main.teclado.nextLine();

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) System.out.println("Año actualizado correctamente");
    }

    public static void modificarTelCliente() throws SQLException {
        String sql = "UPDATE clientes SET celular=3115678432 WHERE alias=\"ninja\"";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sql);
        System.out.println("Por favor ingrese alias del cliente y el nuevo número de celular.");
        System.out.print("Alias: ");
        String alias = Main.teclado.nextLine();
        sentencia.setString(2, alias);

        System.out.print("Celular: ");
        String cel = Main.teclado.nextLine();
        sentencia.setString(1, cel);

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) System.out.println("Número de celular actualizado correctamente");
    }

    public static void borrarCompra() throws SQLException {
        String sql = "DELETE  FROM  compras WHERE alias=\"green\" AND fabricante=\"Trek\"";
        PreparedStatement sentencia = Main.conectar().prepareStatement(sql);
        System.out.println("Por favor ingrese alias del cliente y fabricante de la intención de compra.");
        System.out.print("Alias: ");
        String alias = Main.teclado.nextLine();
        sentencia.setString(1, alias);

        System.out.print("Fabricante: ");
        String fabricante = Main.teclado.nextLine();
        sentencia.setString(2, fabricante);

        int filasInsertadas = sentencia.executeUpdate();
        if(filasInsertadas > 0) System.out.println("Intención de compra eliminada correctamente");
    }

    public static void consultaFabricante() throws SQLException {
        String sql = "SELECT fabricante FROM fabricantes ORDER BY fabricante";
        Statement sentencia = Main.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while(consulta.next()) {
            String col1 = consulta.getNString(1);
            System.out.println(col1);
        }
    }

    public static void consultaInfoBici() throws SQLException {
        String sql = "SELECT fabricante, precio, anio FROM bicicletas WHERE anio >= 2019 ORDER BY fabricante";
        Statement sentencia = Main.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while(consulta.next()) {
            String col1 = consulta.getString(1);
            int col2 = consulta.getInt(2);
            String col3 = consulta.getString(3);
            System.out.println(col1 + " " + col2 + " " + col3);
        }
    }

    public static void consultaFabricaMoto() throws SQLException {
        String sql = "SELECT fabricante FROM motocicletas WHERE id_prov=?";
        Statement sentencia = Main.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while(consulta.next()) {
            String col1 = consulta.getString(1);
            System.out.println(col1);
        }
    }

    public static void consultaCompBiMo() throws SQLException {
        String sql = "SELECT fabricante FROM compras WHERE alias=? ORDER BY fabricante";
        Statement sentencia = Main.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while(consulta.next()) {
            String col1 = consulta.getString(1);
            System.out.println(col1);
        }
    }

    public static void consultaCompBici() throws SQLException {
        String sql = "SELECT c.alias, c.nombre, c.apellidos FROM clientes c, compras p WHERE p.alias=c.alias AND p.fabricante=? ORDER BY  nombre";
        Statement sentencia = Main.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while(consulta.next()) {
            String col1 = consulta.getString(1);
            String col2 = consulta.getString(2);
            String col3 = consulta.getString(3);
            System.out.println(col1 + " " + col2 + " " + col3);
        }
    }

    public static void consultaBiciFab() throws SQLException {
        System.out.println("Por favor ingrese año");
        System.out.println("Año: ");
        int anio = Main.teclado.nextInt();
        Main.teclado.nextLine();

        String sql = "SELECT COUNT(fabricante) FROM bicicletas WHERE anio >=" + anio;
        Statement sentencia = Main.conectar().createStatement();
        ResultSet consulta = sentencia.executeQuery(sql);

        while(consulta.next()) {
            int col1 = consulta.getInt(1);
            System.out.println(col1);
        }
    }
}
