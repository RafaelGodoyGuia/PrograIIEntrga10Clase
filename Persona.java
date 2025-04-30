import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Persona implements Comparable<Persona>{
    private String nombre;
    private LocalDate fechaNacimiento;
    public String getNombre() {
        return nombre;
    }
    public int compareTo(Persona persona){
        return this.nombre.compareTo(persona.nombre);
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("dd/MM/yyyy");
        return "Persona{" +
                "nombre = " + getNombre() +
                "fecha nacimiento = " + fechaNacimiento.format(
                formatter);
    }
    public Persona(String nombre, int dia, int mes, int anno) {
        this.nombre = nombre;
        this.fechaNacimiento=LocalDate.of(anno,mes,dia);
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public int calcularEdad(){
        return Period.between(fechaNacimiento,LocalDate.now())
                .getYears();
    }
}