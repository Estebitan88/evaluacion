package com.krakedev.evaluacion.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.entidades.Producto;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBBD;

public class ServiciosProductos {
	private static Logger LOGGER = LogManager.getLogger(ServiciosProductos.class);

	public static void insertar(Producto producto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBBD.conectar();

			ps = con.prepareStatement("insert into productos (id,nombre,precio_venta,precio_compra,id_categoria) "
					+ " values(?,?,?,?,?)");

			ps.setString(1, producto.getId());
			ps.setString(2, producto.getNombre());
			ps.setBigDecimal(3, producto.getPrecioVenta());
			ps.setBigDecimal(4, producto.getPrecioCompra());
			ps.setString(5, producto.getIdCategoria());

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

	public static void actualizar(Producto producto) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBBD.conectar();

			ps = con.prepareStatement(
					"UPDATE productos SET nombre=? ,precio_venta,precio_compra,id_categoria WHERE id=?");

			ps.setString(1, producto.getNombre());
			ps.setBigDecimal(2, producto.getPrecioVenta());
			ps.setBigDecimal(3, producto.getPrecioCompra());
			ps.setString(4, producto.getIdCategoria());

			ps.setString(5, producto.getId());

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

}
