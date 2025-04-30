import java.util.Comparator;
public class ComparadorEdades implements Comparator<Persona>{
    public int compare(Persona persona1,Persona persona2){
        return persona1.calcularEdad() - persona2.calcularEdad();
    }
}