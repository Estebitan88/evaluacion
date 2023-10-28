package com.clearminds.maquina;

import java.util.ArrayList;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private ArrayList<Celda> celdas;
    private double saldo;

    public MaquinaDulces() {
        celdas = new ArrayList<Celda>();
        saldo = 0.0;
    }

    public void agregarCelda(Celda celda) {
        celdas.add(celda);
    }

    // Método para configurar las celdas de la máquina
    public void configurarMaquina(String... codigosCeldas) {
        for (String codigo : codigosCeldas) {
            Celda celda = new Celda(codigo);
            agregarCelda(celda);
        }
    }

 // Método para mostrar la configuración de la máquina
    public void mostrarConfiguracion() {
        for (Celda celda : celdas) {
            System.out.print("CELDA: " + celda.getCodigo() + " Stock: " + celda.getStock() +
                    " Producto: ");
            
            Producto producto = celda.getProducto();
            if (producto != null) {
                System.out.println(producto.getNombre() + " Precio: " + producto.getPrecio());
            } else {
                System.out.println("Sin Producto asignado");
            }
        }
    }


    // Método buscar celda
    public Celda buscarCelda(String codigoCelda) {
        for (Celda celda : celdas) {
            if (codigoCelda.equals(celda.getCodigo())) {
                return celda; // Retorna la celda si se encuentra
            }
        }
        return null; // Si no se encontró la celda, retorna null
    }

    // Método cargar producto
    public void cargarProducto(Producto producto, String codigoCelda, int cantidadItems) {
        // Invoca el método buscarCelda para recuperar la celda correspondiente al código
        Celda celdaRecuperada = buscarCelda(codigoCelda);

        // Verifica si se encontró la celda
        if (celdaRecuperada != null) {
            // Utiliza el método ingresarProducto de la celda para agregar el producto y la cantidad de ítems
            celdaRecuperada.ingresarProducto(producto, cantidadItems);
        } else {
            // Manejar el caso en el que no se encontró la celda (puedes lanzar una excepción o realizar otra acción apropiada)
            System.out.println("La celda con código " + codigoCelda + " no existe.");
        }
    }
    
    //Método mostrar productos
    public void mostrarProductos() {
        for (Celda celda : celdas) {
            System.out.print("CELDA: " + celda.getCodigo() + " ");
            int stock = celda.getStock();
            Producto producto = celda.getProducto();

            if (producto != null) {
                System.out.print("Stock: " + stock + " ");
                System.out.print("Producto: " + producto.getNombre() + " ");
                System.out.println("Precio: " + producto.getPrecio());
            } else {
                System.out.println("Stock: " + stock + " Sin Producto asignado");
            }

            System.out.println("\n");
        }

    }
    
    //Método buscar producto en celda
    public Producto buscarProductoEnCelda(String codigoCelda) {
        // Invoca el método buscarCelda para recuperar la celda correspondiente al código
        Celda celdaRecuperada = buscarCelda(codigoCelda);

        // Verifica si se encontró la celda
        if (celdaRecuperada != null) {
            // Obtiene el producto de la celda
            Producto producto = celdaRecuperada.getProducto();
            
            if (producto != null) {
                return producto;
            } else {
                // Manejar el caso en el que la celda no tiene un producto asignado
                System.out.println("La celda " + codigoCelda + " no tiene un producto asignado.");
            }
        } else {
            // Manejar el caso en el que no se encontró la celda (puedes lanzar una excepción o realizar otra acción apropiada)
            System.out.println("La celda con código " + codigoCelda + " no existe.");
        }
        
        return null; // Si no se encontró el producto, retorna null
    }

    
    //Método para mostrar el producto en una celda específica
    public void mostrarProductoCelda(String codigoCelda) {
        System.out.println("Producto encontrado: " + (buscarCelda(codigoCelda) != null ?
            buscarCelda(codigoCelda).getProducto() != null ?
            buscarCelda(codigoCelda).getProducto().getNombre() : "null" : "null"));
    }
    
    //Método consultar precio
    public double consultarPrecio(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda);
        if (celda != null && celda.getProducto() != null) {
            return celda.getProducto().getPrecio();
        } else {
            // Manejar el caso en el que la celda no existe o no tiene un producto
            return -1.0; // Puedes elegir un valor especial para indicar que no se encontró el precio
        }
    }
    
    //Método buscar celda producto
    public Celda buscarCeldaProducto(String codigoProducto) {
        for (Celda celda : celdas) {
            Producto producto = celda.getProducto();
            if (producto != null && codigoProducto.equals(producto.getCodigo())) {
                return celda; // Retorna la celda si se encuentra el producto
            }
        }
        return null; // Si no se encontró el producto en ninguna celda, retorna null
    }
    
 // Método incrementar productos
    public void incrementarProductos(String codigoProducto, int cantidadItems) {
        // Invoca el método buscarCeldaProducto para recuperar la celda correspondiente al código del producto
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);

        // Verifica si se encontró la celda
        if (celdaEncontrada != null) {
            // Incrementa el stock actual de productos en la celda
            celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadItems);
        } else {
            // Manejar el caso en el que no se encontró la celda (puedes lanzar una excepción o realizar otra acción apropiada)
            System.out.println("No se encontró la celda para el producto con código " + codigoProducto);
        }
    }
    
 // Método vender
    public void vender(String codigoCelda) {
        // Invoca el método buscarCelda para recuperar la celda correspondiente al código de celda
        Celda celdaEncontrada = buscarCelda(codigoCelda);

        // Verifica si se encontró la celda y si hay stock disponible
        if (celdaEncontrada != null && celdaEncontrada.getStock() > 0) {
            // Disminuye el stock en 1
            celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);

            // Obtiene el precio del producto vendido
            double precioProducto = celdaEncontrada.getProducto().getPrecio();

            // Suma el precio al saldo de la máquina
            saldo += precioProducto;

            System.out.println("Venta realizada en la celda " + codigoCelda + ". Saldo actual: " + saldo);
        } else {
            // Manejar el caso en el que no se encontró la celda o no hay stock disponible (puedes lanzar una excepción o realizar otra acción apropiada)
            System.out.println("No se puede realizar la venta en la celda " + codigoCelda + ". Verifique el stock o la celda.");
        }
    }
    
 // Método venderConCambio
    public double venderConCambio(String codigoCelda, double montoIngresado) {
        // Invoca el método buscarCelda para recuperar la celda correspondiente al código de celda
        Celda celdaEncontrada = buscarCelda(codigoCelda);

        // Verifica si se encontró la celda y si hay stock disponible
        if (celdaEncontrada != null && celdaEncontrada.getStock() > 0) {
            // Obtiene el precio del producto vendido
            double precioProducto = celdaEncontrada.getProducto().getPrecio();

            // Verifica si el monto ingresado es suficiente para la compra
            if (montoIngresado >= precioProducto) {
                // Disminuye el stock en 1
                celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);

                // Calcula el cambio
                double cambio = montoIngresado - precioProducto;

                // Suma el precio al saldo de la máquina
                saldo += precioProducto;

                System.out.println("Venta realizada en la celda " + codigoCelda + ". Saldo actual: " + saldo);
                return cambio;
            } else {
                System.out.println("Monto insuficiente para realizar la compra en la celda " + codigoCelda);
                return -1.0; // Retorna un valor negativo para indicar que el monto es insuficiente
            }
        } else {
            // Manejar el caso en el que no se encontró la celda o no hay stock disponible (puedes lanzar una excepción o realizar otra acción apropiada)
            System.out.println("No se puede realizar la venta en la celda " + codigoCelda + ". Verifique el stock o la celda.");
            return -1.0; // Retorna un valor negativo para indicar que la venta no se pudo realizar
        }
    }
    
 // Método para buscar productos cuyo precio es menor o igual que el límite
    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosMenores = new ArrayList<Producto>();

        for (Celda celda : celdas) {
            Producto producto = celda.getProducto();
            if (producto != null && producto.getPrecio() <= limite) {
                productosMenores.add(producto);
            }
        }

        return productosMenores;
    }



    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}



