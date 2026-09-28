package gestioninventariotienda;

public class MainInventario {
    public static void main(String[] args) {
        Producto productoUno = new Producto();
        productoUno.codigo = "P-001";
        productoUno.nombre = "Teclado mecánico";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.codigo = "P-002";
        productoDos.nombre = "Mouse inalámbrico";
        productoDos.precio = 18000.0;
        productoDos.stock = 25;

        Producto productoTres = new Producto();
        productoTres.codigo = "P-003";
        productoTres.nombre = "Monitor 24 pulgadas";
        productoTres.precio = 210000.0;
        productoTres.stock = 5;

        // Ficha inicial de cada producto
        productoUno.mostrarFicha();
        productoDos.mostrarFicha();
        productoTres.mostrarFicha();

        // Ejercitamos métodos sobre productoUno
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50);
        productoUno.reponerStock(20);
        productoUno.actualizarPrecio(39900.0);

        // Verificamos que productoDos y productoTres no se vieron afectados
        System.out.println();
        System.out.println("Estado de productoDos tras operar sobre productoUno:");
        productoDos.mostrarFicha();
        System.out.println("Estado de productoTres tras operar sobre productoUno:");
        productoTres.mostrarFicha();

        // Aliasing: copia apunta al mismo objeto que productoUno
        Producto copia = productoUno;
        copia.stock = 29;
        System.out.println("Stock de productoUno tras modificar copia: "
                + productoUno.stock + " (mismo objeto en el Heap)");

        // Desafío de extensión: descuento
        productoDos.aplicarDescuento(15);

        // Desafío de extensión: arreglo de productos
        System.out.println();
        System.out.println("Recorrido del arreglo de productos:");
        Producto[] productos = { productoUno, productoDos, productoTres };
        for (Producto p : productos) {
            p.mostrarFicha();
        }
    }
}
