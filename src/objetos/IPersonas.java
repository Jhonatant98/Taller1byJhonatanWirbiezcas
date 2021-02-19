package objetos;

import java.util.ArrayList;

public interface IPersonas {

    ArrayList<Persona> crearPersona();
    int calcularIMC(Persona persona);
    boolean esMayorDeEdad(Persona persona);
    void comprobarSexo(Persona persona);
    String toString(Persona persona);
    int generaDNI();

}
