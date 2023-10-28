package com.krakedev.conexionbbd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234567890");
            System.out.println("Conexion exitosa");

            // Crear una instancia de PreparedStatement y asignarla a la variable 'ps'
            ps = connection.prepareStatement("insert into personas (cedula, nombre, apellido, estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento) "
            		+ " values(?,?,?,?,?,?,?,?,?)");

            ps.setInt(1, 1713616123);
            ps.setString(2, "Rosalia");
            ps.setString(3, "Romero");
            ps.setString(4, "U");
            ps.setInt(5, 2);
            ps.setDouble(6, 1.56);
            ps.setBigDecimal(7, new BigDecimal(1200.45));
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    		String fechaStr = "2020/03/22 10:05:04";
    		try {
    			Date fecha = sdf.parse(fechaStr);
    			System.out.println(fecha);
    			long fechaMilis = fecha.getTime();
    			System.out.println(fechaMilis);
    			//crea un java.sqlDate, partiendo de un java.util.Date
    			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
    			System.out.println(fechaSQL);
    			
    			Time timeSQL = new Time(fechaMilis);
    			System.out.println(timeSQL);
    			
    			ps.setDate(8, fechaSQL);
    			ps.setTime(9, timeSQL);
    			
                ps.executeUpdate();
                System.out.println("Ejecuta insert");
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();

    		}
    		
    		//INSERTS TABLA COMPRAS
    		System.out.println("\n ----- COMPRAS -----");
    		ps = connection.prepareStatement("INSERT INTO compras (id_compra, cedula, monto,fecha_compra) "
    				+ "VALUES (?,?,?,?)");

            ps.setInt(1, 11);
            ps.setString(2, "1010101010");
            ps.setBigDecimal(3, new BigDecimal(3000));
            

            
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    		String fechaStr2 = "2020/03/22 10:05:04";
    		try {
    			Date fecha = sdf2.parse(fechaStr2);
    			System.out.println(fecha);
    			long fechaMilis = fecha.getTime();
    			System.out.println(fechaMilis);
    			//crea un java.sqlDate, partiendo de un java.util.Date
    			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
    			System.out.println(fechaSQL);
    			
    			Time timeSQL = new Time(fechaMilis);
    			System.out.println(timeSQL);
    			
    			ps.setDate(4, fechaSQL);
    			
                ps.executeUpdate();
                System.out.println("Ejecuta insert en la tabla COMPRAS");
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();

    		}
    		
    		//INSERTS TABLA TRANSACCIONES
    		System.out.println("\n ----- TRANSACCIONES -----");
    		ps = connection.prepareStatement("INSERT INTO transacciones (codigo, numero_cuenta, monto, tipo, bancos_codigo_banco, fecha, hora) "
    				+ "VALUES (?,?,?,?,?,?,?)");

            ps.setInt(1, 18);
            ps.setString(2, "20008");
            ps.setBigDecimal(3, new BigDecimal(3000));
            ps.setString(4, "C");
            ps.setInt(5, 9);
            

            
            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
    		String fechaStr3 = "2020/03/22 10:05:04";
    		try {
    			Date fecha = sdf3.parse(fechaStr3);
    			System.out.println(fecha);
    			long fechaMilis = fecha.getTime();
    			System.out.println(fechaMilis);
    			//crea un java.sqlDate, partiendo de un java.util.Date
    			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
    			System.out.println(fechaSQL);
    			
    			Time timeSQL = new Time(fechaMilis);
    			System.out.println(timeSQL);
    			
    			ps.setDate(6, fechaSQL);
    			ps.setTime(7, timeSQL);
    			
                ps.executeUpdate();
                System.out.println("Ejecuta insert en la tabla TRANSACCIONES");
    		} catch (ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();

    		}



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        
    }
}
