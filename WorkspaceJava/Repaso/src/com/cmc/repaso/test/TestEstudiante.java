package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiantes;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un objeto Estudiantes
        Estudiantes estudiante1 = new Estudiantes("Juan");
        Estudiantes estudiante2 = new Estudiantes("Pepe");
        
        System.out.println("Nombre del estudiante: " + estudiante1.getNombre());
        System.out.println("Nota del estudiante: " + estudiante1.getNota());
        System.out.println("Resultado: " + estudiante1.getResultado());
        
        System.out.println("-------------------------------");
        
        System.out.println("Nombre del estudiante: " +estudiante2.getNombre());
        System.out.println("Nota del estudiante: " + estudiante2.getNota());
        System.out.println("Resultado: " + estudiante2.getResultado());
        
        System.out.println("-------------------------------");
        


        // Calificar al estudiante con una nota
        estudiante1.calificar(4.5);
        estudiante2.calificar(8);
        

        // Mostrar la información en la consola
        System.out.println("Nombre del estudiante: " + estudiante1.getNombre());
        System.out.println("Nota del estudiante: " + estudiante1.getNota());
        System.out.println("Resultado: " + estudiante1.getResultado());
        
        System.out.println("-------------------------------");
        
        System.out.println("Nombre del estudiante: " +estudiante2.getNombre());
        System.out.println("Nota del estudiante: " + estudiante2.getNota());
        System.out.println("Resultado: " + estudiante2.getResultado());
	}

}
