package com.krakedev.evaluacion.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import com.krakedev.evaluacion.utils.ConexionBBD;


public class TestConexionBBD {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        Connection connection = null;
        PreparedStatement ps = null;
        try {

			connection =ConexionBBD.conectar();
			System.out.println("Conexion exitosa");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Conexion fallida");
		}

	}

}
