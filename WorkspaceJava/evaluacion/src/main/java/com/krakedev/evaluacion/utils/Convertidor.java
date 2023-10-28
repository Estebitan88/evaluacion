package com.krakedev.evaluacion.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.evaluacion.excepciones.KrakeException;

public class Convertidor {
	private static final Logger LOGGER = LogManager.getLogger(Convertidor.class);
	private static final String FORMATO_FECHA ="yyyy/MM/dd";
	private static final String FORMATO_HORA ="hh:mm";
	private static final String FORMATO_FECHA_COMPLETA ="dd-MM-yyyy hh:mm:ss";

	public static  Date convertirFecha(String fechaStr) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate = null;
		try {
			LOGGER.trace("Convirtiendo fecha "+fechaStr);
			fechaDate = sdf.parse(fechaStr);
			LOGGER.trace("Fecha convertida "+fechaDate);
		}catch (ParseException e) {
			LOGGER.error("La fecha no tiene el formato correcto "+fechaStr,e);
			throw new KrakeException("La fecha no tiene el formato correcto "+fechaStr);
		}
		return fechaDate;
	}
	
	public static  Date convertirHora(String horaStr) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
		Date horaDate = null;
		try {
			horaDate = sdf.parse(horaStr);
		}catch (ParseException e) {
			LOGGER.error("La hora no tiene el formato correcto "+horaStr,e);
			throw new KrakeException("La hora no tiene el formato correcto "+horaStr );
		}
		return horaDate;
	}
	//test
	
	public static  Date convertirFechaCompleta(String fechaStr) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA_COMPLETA);
		Date fechaDate = null;
		try {
			LOGGER.trace("Convirtiendo fecha "+fechaStr);
			fechaDate = sdf.parse(fechaStr);
			LOGGER.trace("Fecha completa convertida "+fechaDate);
		}catch (ParseException e) {
			LOGGER.error("La fecha no tiene el formato correcto "+fechaStr,e);
			throw new KrakeException("La fecha no tiene el formato correcto "+fechaStr);
		}
		return fechaDate;
	
}
}
