package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
    private ArrayList<Nota> notas;
    private String nombre;
    private String apellido;
    private String cedula;

    public Estudiante(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = new ArrayList<Nota>(); // Inicializar el ArrayList de notas en el constructor
    }

    public Estudiante() {
        notas = new ArrayList<Nota>(); // Cambio en la inicialización
    }
    
    //Método agregar nota
    public void agregarNota(Nota nuevaNota) { // Cambio en el parámetro
        // Verificar si la nota ya existe en el ArrayList
        if (!notas.contains(nuevaNota)) {
            // Agregar la nueva nota al ArrayList
            notas.add(nuevaNota);
            System.out.println("Nueva nota agregada: " + nuevaNota.getCalificacion());
        } else {
            System.out.println("La nota ya existe en la lista.");
        }
    }
    
    //Método modificar nota
    public void modificarNota(String codigoMateria, double nuevaNota) {
        // Buscar la nota correspondiente a la materia con el código especificado
        Nota notaEncontrada = null;

        // Recorrer la lista de notas y buscar la nota
        for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(codigoMateria)) {
                notaEncontrada = nota;
                break; // Salir del bucle cuando se encuentre la nota
            }
        }

        if (notaEncontrada != null) {
            // Validar la nueva calificación
            if (nuevaNota >= 0 && nuevaNota <= 10) {
                // Modificar la calificación de la nota encontrada
                notaEncontrada.setCalificacion(nuevaNota);
                System.out.println("Calificación modificada exitosamente para la materia con código " + codigoMateria);
            } else {
                System.out.println("La nueva calificación debe estar en el rango de 0 a 10.");
            }
        } else {
            System.out.println("No se encontró la materia con el código " + codigoMateria);
        }
    }
    
    //Método para calcular el promedio de las notas del estudiante
    public double calcularPromedioNotasEstudiante() {
        double totalNotas = 0;
        int totalMaterias = notas.size();

        // Sumar todas las notas del estudiante
        for (Nota nota : notas) {
            totalNotas += nota.getCalificacion();
        }

        // Calcular el promedio
        double promedio = totalNotas / totalMaterias;

        return promedio;
    }
    
    //Método para mostrar la información del estudiante
    public String mostrar() {
        String informacion = "Información del Estudiante:\n";
        informacion += "Nombre: " + nombre + "\n";
        informacion += "Apellido: " + apellido + "\n";
        informacion += "Cédula: " + cedula + "\n";
        informacion += "Notas:\n";

        // Iterar a través de las notas y agregarlas al resultado
        for (Nota nota : notas) {
            informacion += "Materia: " + nota.getMateria().getNombre() + "\n";
            informacion += "Código de Materia: " + nota.getMateria().getCodigo() + "\n";
            informacion += "Calificación: " + nota.getCalificacion() + "\n";
            informacion += "\n"; // Separador entre las notas
        }

        return informacion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    
}
