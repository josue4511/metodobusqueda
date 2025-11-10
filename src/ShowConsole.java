public class ShowConsole {

    public void mostrarArreglo(int[] arreglo) {
        System.out.print("Arreglo: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void showPersonResult(persona persona, String valor, boolean valorNombre) {
        if (persona != null) {
            if (valorNombre) {
                System.out.println(" Persona encontrada con nombre '" + valor + "': " + persona);
            } else {
                System.out.println(" Persona encontrada con " + valor + ": " + persona);
            }
        } else {
            if (valorNombre) {
                System.out.println(" No se encontró ninguna persona con nombre '" + valor + "'.");
            } else {
                System.out.println(" No se encontró ninguna persona con " + valor + ".");
            }
        }
    }
}
