package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.entidades.Producto;
import com.krakedev.evaluacion.utils.ConexionBBD;

public class ConsultarProductos {
	private static final Logger LOGGER = LogManager.getLogger(ConsultarProductos.class);
	
	public static ArrayList<Producto>buscarPorCategoria(String id_categoria) throws Exception {
		ArrayList<Producto> productos = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = ConexionBBD.conectar();
            ps = con.prepareStatement("SELECT * FROM productos WHERE id_categoria = ?");
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId(rs.getString("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecioVenta(rs.getBigDecimal("precioVenta"));
                producto.setPrecioCompra(rs.getBigDecimal("precioCompra"));
                producto.setIdCategoria(rs.getString("id_categoria"));
                // Establecer las demás propiedades aquí
                productos.add(producto);
            }
        } catch (Exception e) {
            LOGGER.error("Error al obtener todos los datos por busqueda de id_categoria", e);
            throw new Exception("Error al obtener todos los datos por busqueda de id_categoria");
        } finally {
            // Cerrar la conexión
            try {
                con.close();
            } catch (SQLException e) {
                LOGGER.error("Error con la base de datos", e);
                throw new Exception("Error con la base de datos");
            }
        }

        return productos;
    }
}
