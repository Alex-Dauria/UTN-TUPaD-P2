
package tpcoleccionesalexdauria.STOCK;

public class MainStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear 5 productos
        Producto p1 = new Producto("P001", "Arroz", 120.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Laptop", 2500.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 800.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sartén", 1500.0, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 90.0, 100, CategoriaProducto.ALIMENTOS);

        // Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar productos
        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        // 3. Buscar por ID
        System.out.println("=== BUSCAR POR ID P003 ===");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) encontrado.mostrarInfo();

        // 4. Filtrar por categoríap
        System.out.println("=== FILTRAR ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5. Eliminar producto
        System.out.println("=== ELIMINAR P004 ===");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("=== ACTUALIZAR STOCK P001 a 200 ===");
        inventario.actualizarStock("P001", 200);
        inventario.listarProductos();

        // 7. Total stock
        System.out.println("=== TOTAL STOCK: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9. Filtrar por precio
        System.out.println("=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías
        System.out.println("=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
