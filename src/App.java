public class App {
    public static void main(String[] args) {

        ShowConsole consola = new ShowConsole();
        Busqueda buscador = new Busqueda();

        // Arreglo base de personas
        persona[] personas = new persona[] {
            new persona("Ana", 25),
            new persona("Luis", 30),
            new persona("Maria", 28),
            new persona("Carlos", 35),
            new persona("Sofia", 22),
            new persona("Jorge", 27),
            new persona("Lucia", 24),
        };

        System.out.println("=== BUSQUEDAS DE PERSONAS ===\n");

        
        persona resultado1 = buscador.buscar(personas, "Juan");
        consola.showPersonResult(resultado1, "Juan");

        
        persona resultado2 = buscador.buscar(personas);
        consola.showPersonResult(resultado2);

       
        int valorNombre = 498; 
        persona resultado3 = buscador.buscar(personas, valorNombre);
        consola.showPersonResult(resultado3, valorNombre);
    }
}