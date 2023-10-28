package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Préstamo;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Préstamo> prestamos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    
    public Cliente buscarCliente(String cedula) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }

    public void registrarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCedula()) == null) {
            clientes.add(cliente);
        }
    }

    public void asignarPrestamo(String cedula, Préstamo préstamo) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente == null) {
            System.out.println("No es cliente del banco");
        } else {
            Préstamo nuevoPréstamo = new Préstamo(préstamo.getMonto(), préstamo.getInteres(), préstamo.getPlazo());
            nuevoPréstamo.setCliente(cliente);
            CalculadoraAmortizacion.generarTabla(nuevoPréstamo);
            prestamos.add(nuevoPréstamo);
        }
    }

    public ArrayList<Préstamo> buscarPrestamos(String cedula) {
        Cliente cliente = buscarCliente(cedula);
        ArrayList<Préstamo> prestamosCliente = new ArrayList<>();

        if (cliente != null) {
            for (Préstamo préstamo : prestamos) {
                // Verificar si el préstamo pertenece al cliente
                if (préstamo.getCliente() != null && ((Cliente) préstamo.getCliente()).getCedula().equals(cedula)) {
                    prestamosCliente.add(préstamo);
                }
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
        return prestamosCliente;
    }



}
