package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBBD;



public class ServiciosCategoria {
    private static final Logger LOGGER = LogManager.getLogger(ServiciosCategoria.class);
	
    public static void insertar(Categoria categoria) throws Exception {
        Connection con = null;
        PreparedStatement ps;
        try {
            con = ConexionBBD.conectar();

            ps = con.prepareStatement("insert into categorias (id,nombre) "
                    + " values(?,?)");

            ps.setString(1, categoria.getId());
            ps.setString(2, categoria.getNombre());

            ps.executeUpdate();

        } catch (Exception e) {
            LOGGER.error("Error al insertar", e);
            throw new KrakeException("Error al insertar");
        } finally {
            // Cerrar la conexión
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new KrakeException("Error con la base de datos");
            }
        }
    }
    
    public static void actualizar(Categoria categoria) throws Exception {
        Connection con = null;
        PreparedStatement ps;
        try {
            con = ConexionBBD.conectar();

            ps = con.prepareStatement("UPDATE categorias SET nombre=? WHERE id=?");

            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getId());
           

            ps.executeUpdate();

        } catch (Exception e) {
            LOGGER.error("Error al actualizar", e);
            throw new Exception("Error al actualizar");
        } finally {
            // Cerrar la conexión
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }
    }
    
    public static Categoria buscarPorId(String id) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Categoria categoria = null;

        try {
            con = ConexionBBD.conectar();
            ps = con.prepareStatement("SELECT * FROM categorias WHERE id = ?");
            ps.setString(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                // Crear una instancia de Persona y establecer sus propiedades
                categoria = new Categoria();
                categoria.setId(rs.getString("id"));
                categoria.setNombre(rs.getString("nombre"));

            }
        } catch (Exception e) {
            LOGGER.error("Error al buscar por id", e);
            throw new Exception("Error al buscar por id");
        } finally {
            // Cerrar la conexión
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }

        return categoria;
    }
    
 // metodo para obtener varios registros
    public static ArrayList<Categoria> obtenerVariosRegistros() throws Exception {
        ArrayList<Categoria> categorias = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = ConexionBBD.conectar();
            ps = con.prepareStatement("SELECT * FROM categorias");
            rs = ps.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getString("id"));
                categoria.setNombre(rs.getString("nombre"));
                // Establecer las demás propiedades aquí
                categorias.add(categoria);
            }
        } catch (Exception e) {
            LOGGER.error("Error al obtener todas las categorias", e);
            throw new Exception("Error al obtener todas las categorias");
        } finally {
            // Cerrar la conexión
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }

        return categorias;
    }
    
}
