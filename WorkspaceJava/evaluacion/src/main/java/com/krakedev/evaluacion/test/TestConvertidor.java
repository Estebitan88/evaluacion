package com.krakedev.evaluacion.test;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConvertidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String fechaStr = "22-01-2023 21:23:00";
		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechaMilis = fecha.getTime();
			System.out.println(fechaMilis);
			//crea un java.sqlDate, partiendo de un java.util.Date
			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
			System.out.println(fechaSQL);
			
			//comentario
			
			Time timeSQL = new Time(fechaMilis);
			System.out.println(fechaSQL+" "+timeSQL);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
