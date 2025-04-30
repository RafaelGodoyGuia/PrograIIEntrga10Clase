import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main{
    public static void main(String[] args)
    {
        Persona juan = new Persona("Juan García Rodríguez", 13,
                2, 1980);
        Persona pepe = new Persona("José López Pérez", 4, 10,
                1950);
        Persona maria = new Persona("María Sánchez Martínez",
                5, 7, 2004);
        List<Persona> lista = Arrays.asList(juan, pepe, maria);
        Collections.sort(lista);
        System.out.println("Ordenación por nombres: " + lista);
        Collections.sort(lista, new ComparadorEdades());
        System.out.println("Ordenación por edades: " + lista);
    }
}
