public class App {
    public static void main(String[] args) {

        ShowConsole consola = new ShowConsole();
        Busqueda mBusqueda = new Busqueda();

        // arreglo base
        int[] numeros = {10, 11, -2, 5, 6, 8, 15, 22, 4};

        consola.mostrarArreglo(numeros);

        // arreglo de personas
        persona[] personas = new persona[] {
            new persona("Ana", 25),
            new persona("Luis", 30),
            new persona("Maria", 28),
            new persona("Carlos", 35),
            new persona("Sofia", 22),
            new persona("Jorge", 27),
            new persona("Lucia", 24)
        };

        consola.mostrarMensaje("\n--- Lista de Personas ---");
        for (persona p : personas) {
            consola.mostrarMensaje(p.toString());
        }

        
        persona resultadoPer1 = mBusqueda.buscarPersonaEdadImparMayor25(personas);
        consola.mostrarMensaje("\n→ Búsqueda: persona con edad impar y > 25");
        consola.showPersonResult(resultadoPer1, "edad impar > 25", false);

        
        persona resultadoPer2 = mBusqueda.findpersonByValueName(personas, "Carlos");
        consola.mostrarMensaje("\n→ Búsqueda: persona por nombre 'Carlos'");
        consola.showPersonResult(resultadoPer2, "Carlos", true);
    }
}

