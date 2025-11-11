public class ShowConsole {

  
    public void showPersonResult(persona persona, String criterio) {
        if (persona != null) {
            System.out.println(" Persona encontrada con nombre '" + criterio + "': " + persona);
        } else {
            System.out.println(" No se encontró ninguna persona con nombre '" + criterio + "'.");
        }
    }

   
    public void showPersonResult(persona persona) {
        if (persona != null) {
            System.out.println("Persona encontrada con edad impar y mayor a 25: " + persona);
        } else {
            System.out.println(" No se encontró ninguna persona con edad impar y mayor a 25.");
        }
    }

    
    public void showPersonResult(persona persona, int valorNombre) {
        if (persona != null) {
            System.out.println(" Persona encontrada con valor de nombre " + valorNombre + ": " + persona);
        } else {
            System.out.println(" No se encontró ninguna persona con valor de nombre " + valorNombre + ".");
        }
    }
}
