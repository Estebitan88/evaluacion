package com.clearminds.maquina;

import com.clearminds.componentes.Producto;
import com.clearminds.componentes.Celda;


public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	//Constructor 
    public void MaquinaDulces(Celda celda1, Celda celda2, Celda celda3, Celda celda4, double saldo) {
        this.celda1 = celda1;
        this.celda2 = celda2;
        this.celda3 = celda3;
        this.celda4 = celda4;
        this.saldo = saldo;
    }
	
    // Método configurar maquina
    public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
        // Crear instancias de Celda y asignarles los códigos
        celda1 = new Celda(codigoCelda1);
        celda2 = new Celda(codigoCelda2);
        celda3 = new Celda(codigoCelda3);
        celda4 = new Celda(codigoCelda4);
    }
    
    //Método mostrar configuracion
    public void mostrarConfiguracion() {
        System.out.println("CELDA 1: " + celda1.getCodigo());
        System.out.println("CELDA 2: " + celda2.getCodigo());
        System.out.println("CELDA 3: " + celda3.getCodigo());
        System.out.println("CELDA 4: " + celda4.getCodigo());
    }

    
    // Método buscar celda
    public Celda buscarCelda(String codigoCelda) {
        if (codigoCelda.equals(celda1.getCodigo())) {
            return celda1;
        } else if (codigoCelda.equals(celda2.getCodigo())) {
            return celda2;
        } else if (codigoCelda.equals(celda3.getCodigo())) {
            return celda3;
        } else if (codigoCelda.equals(celda4.getCodigo())) {
            return celda4;
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
    
    // Método auxiliar para mostrar información de una celda 
    private void mostrarInformacionCelda(String nombreCelda, Celda celda) {
        System.out.println(nombreCelda);
        System.out.println("Stock:" + celda.getStock());
        Producto producto = celda.getProducto();
        if (producto != null) {
            System.out.println("Nombre Producto:" + producto.getNombre());
            System.out.println("Precio Producto:" + producto.getPrecio());
            System.out.println("Código Producto:" + producto.getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
    }
    
    
    //Método mostrar producto 
    public void mostrarProductos() {
        mostrarInformacionCelda("**********CELDA A1", celda1);
        mostrarInformacionCelda("***********CELDA A2", celda2);
        mostrarInformacionCelda("**********CELDA B1", celda3);
        mostrarInformacionCelda("**********CELDA B2", celda4);
        System.out.println("Saldo: " + saldo);
    }


	
    //Método buscar producto en celda
    public Producto buscarProductoEnCelda(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda); // Invoca el método buscarCelda para obtener la celda correspondiente

        if (celda != null) {
            return celda.getProducto(); // Retorna el producto de la celda si se encuentra una celda válida
        } else {
            return null; // Retorna null si no se encuentra la celda
        }
    }
    
 // Método consultar precio
    public double consultarPrecio(String codigoCelda) {
        Celda celda = buscarCelda(codigoCelda); // Invoca el método buscarCelda para obtener la celda correspondiente

        if (celda != null && celda.getProducto() != null) {
            return celda.getProducto().getPrecio(); // Retorna el precio del producto en la celda si se encuentra
        } else {
            return -1; // Retorna -1 (o cualquier otro valor que indique un precio inválido) si la celda no existe o no contiene un producto
        }
    }

    // Método buscarCeldaProducto
    public Celda buscarCeldaProducto(String codigoProducto) {
        if (codigoProducto == null || codigoProducto.isEmpty()) {
            return null; // Retorna null si el código de producto es nulo o vacío
        }

        // Itera a través de las celdas para buscar el producto
        if (celda1 != null && celda1.getProducto() != null && codigoProducto.equals(celda1.getProducto().getCodigo())) {
            return celda1;
        } else if (celda2 != null && celda2.getProducto() != null && codigoProducto.equals(celda2.getProducto().getCodigo())) {
            return celda2;
        } else if (celda3 != null && celda3.getProducto() != null && codigoProducto.equals(celda3.getProducto().getCodigo())) {
            return celda3;
        } else if (celda4 != null && celda4.getProducto() != null && codigoProducto.equals(celda4.getProducto().getCodigo())) {
            return celda4;
        }

        return null; // Retorna null si el producto no se encuentra en ninguna celda
    }
    
    // Método incrementar producto
    public void incrementarProductos(String codigoDelProducto, int cantidadDeItems) {
        // Invoca el método buscarCeldaProducto usando el código del producto
        Celda celdaEncontrada = buscarCeldaProducto(codigoDelProducto);

        // Verifica si se encontró la celda con el producto
        if (celdaEncontrada != null) {
            // Verifica si el producto existe en la celda y si la cantidad a incrementar es mayor que 0
            if (celdaEncontrada.getProducto() != null && cantidadDeItems > 0) {
                // Ajusta el stock de la celda directamente
                celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadDeItems);
            } else {
                // Manejar el caso en el que el producto no existe o la cantidad es inválida
                System.out.println("El producto con código " + codigoDelProducto + " no se encuentra en ninguna celda o la cantidad es inválida.");
            }
        } else {
            // Manejar el caso en el que no se encontró la celda (puedes lanzar una excepción o realizar otra acción apropiada)
            System.out.println("El producto con código " + codigoDelProducto + " no se encuentra en ninguna celda.");
        }
    }
    
    //Método vender	
    public void vender(String codigoCelda) {
        // Paso 2: Busca la celda correspondiente al código
        Celda celda = buscarCelda(codigoCelda);

        // Paso 3: Verifica si se encontró la celda y si hay stock disponible
        if (celda != null && celda.getStock() > 0) {
            // Paso 4: Disminuye el stock de la celda en 1
            celda.setStock(celda.getStock() - 1);

            // Paso 5: Obtiene el precio del producto en la celda
            double precioProducto = celda.getProducto().getPrecio();

            // Paso 6: Suma el precio del producto al saldo actual de la máquina
            saldo += precioProducto;

            // Paso 7: Actualiza el saldo de la máquina
            mostrarProductos();
        } else {
            // Maneja el caso en el que no se encuentra la celda o no hay stock
            System.out.println("No se puede realizar la venta en la celda " + codigoCelda);
        }
    }
    
    public double venderConCambio(String codigoCelda, double valorIngresado) {
        // Paso 2: Busca la celda correspondiente al código
        Celda celda = buscarCelda(codigoCelda);

        // Paso 3: Verifica si se encontró la celda y si hay stock disponible
        if (celda != null && celda.getStock() > 0) {
            // Paso 4: Disminuye el stock de la celda en 1
            celda.setStock(celda.getStock() - 1);

            // Paso 5: Obtiene el precio del producto en la celda
            double precioProducto = celda.getProducto().getPrecio();

            // Paso 6: Calcula el cambio
            double cambio = valorIngresado - precioProducto;

            if (cambio >= 0) {
                // Paso 7: Suma el precio del producto al saldo actual de la máquina
                saldo += precioProducto;

                // Paso 8: Actualiza el saldo de la máquina
                mostrarProductos();
            } else {
                // Maneja el caso en el que el cliente no pagó lo suficiente
                System.out.println("El valor ingresado es insuficiente para comprar el producto en la celda " + codigoCelda);
            }

            // Retorna el cambio
            return cambio;
        } else {
            // Maneja el caso en el que no se encuentra la celda o no hay stock
            System.out.println("No se puede realizar la venta en la celda " + codigoCelda);
            return 0; // No hay cambio en este caso
        }
    }

    
	public Celda getCelda1() {
		return celda1;
	}


	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
