package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes; 

    public Curso() {
        estudiantes = new ArrayList<Estudiante>();
    }

    // Agregar un estudiante al curso
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para buscar un estudiante por su cédula
    public String buscarEstudiantePorCedula(String cedula) {
        for (Estudiante est : estudiantes) {
            if (est.getCedula().equals(cedula)) {
                // El estudiante está inscrito en el curso
                return "El estudiante con cédula " + cedula + " está inscrito en el curso.";
            }
        }
        // El estudiante no está inscrito en el curso
        return null;
    }
    
    //Método para matricular un estudiante si no está en el curso
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante matriculado con éxito.");
        } else {
            System.out.println("El estudiante ya está matriculado en el curso.");
        }
    }
    
    // Método para calcular el promedio del curso
    public double calcularPromedioCurso() {
        if (estudiantes.isEmpty()) {
            // Si no hay estudiantes en el curso, el promedio es 0
            return 0.0;
        }

        double sumaPromedios = 0.0;
        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedioNotasEstudiante();
        }

        // Calcular el promedio del curso dividiendo la suma de los promedios entre la cantidad de estudiantes
        double promedioCurso = sumaPromedios / estudiantes.size();

        return promedioCurso;
    }
    
 // Método para mostrar la información del curso
    public void mostrar() {
        System.out.println("Información del Curso:");
        
        // Iterar a través de los estudiantes y mostrar su información
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre del Estudiante: " + estudiante.getNombre());
            System.out.println("Apellido del Estudiante: " + estudiante.getApellido());
            System.out.println("Cédula del Estudiante: " + estudiante.getCedula());
            System.out.println("Notas del Estudiante:");

            // Iterar a través de las notas del estudiante y mostrarlas
            for (Nota nota : estudiante.getNotas()) {
                System.out.println("Materia: " + nota.getMateria().getNombre());
                System.out.println("Código de Materia: " + nota.getMateria().getCodigo());
                System.out.println("Calificación: " + nota.getCalificacion());
            }

            System.out.println(); // Separador entre estudiantes
        }
    }

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
    
    
}
