public class Busqueda {

    public int buscarNumero(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    
    public persona buscarPersonaEdadImparMayor25(persona[] personas) {
        for (persona p : personas) {
            if (p.getEdad() > 25 && p.getEdad() % 2 != 0) {
                return p;
            }
        }
        return null;
    }

  
    public persona findpersonByValueName(persona[] personas, String nombre) {
        for (persona p : personas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }
}
