package com.krakedev.evaluacion.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.excepciones.KrakeException;


public class ConexionBBD {
	private static final Logger LOGGER = LogManager.getLogger(ConexionBBD.class);
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USUARIO = "postgres";
	private static final String CLAVE = "postgres";
	
	public static Connection conectar() throws Exception{
		LOGGER.debug("Obteniendo conexion");
		Connection connection=null;
        try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USUARIO,CLAVE );
			LOGGER.debug("Conexion exitosa");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura",e);
			throw new KrakeException("Error en la infraestructura");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error al conectarse, revise usuario y clave",e);
			throw new KrakeException("Error al conectarse, revise usuario y clave");
		}
        return connection;
	}
}
