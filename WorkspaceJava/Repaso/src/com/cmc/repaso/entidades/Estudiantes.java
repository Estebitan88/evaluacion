package com.cmc.repaso.entidades;

public class Estudiantes {
    private String nombre;
    private double nota;
    private String resultado;

    // Constructor que recibe el nombre
    public Estudiantes(String nombre) {
        this.nombre = nombre;
    }

    // Método para calificar al estudiante
    public void calificar(double nota) {
        this.nota = nota;
        if (nota < 8) {
            resultado = "F";
        } else {
            resultado = "A";
        }
    }

    // Getters y setters para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}

