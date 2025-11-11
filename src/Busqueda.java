public class Busqueda {

  
    public persona buscar(persona[] personas, String nombre) {
        for (persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    
    public persona buscar(persona[] personas) {
        for (persona p : personas) {
            if (p.getEdad() > 25 && p.getEdad() % 2 != 0) {
                return p;
            }
        }
        return null;
    }

    
    public persona buscar(persona[] personas, int valorNombre) {
        for (persona p : personas) {
            int valor = calcularValorNombre(p.getNombre());
            if (valor == valorNombre) {
                return p;
            }
        }
        return null;
    }

   
    private int calcularValorNombre(String nombre) {
        int suma = 0;
        for (int i = 0; i < nombre.length(); i++) {
            suma += (int) nombre.charAt(i);
        }
        return suma;
    }
}
