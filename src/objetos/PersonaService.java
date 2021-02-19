package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaService implements IPersonas{
    @Override
    public ArrayList<Persona> crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre");
        String nombre= sc.nextLine();
        System.out.println("Ingresa la edad");
        int edad = sc.nextInt();
        System.out.println("Ingresa el sexo");
        String sexo = sc.nextLine();
        System.out.println("Ingresa el peso");
        Double peso = sc.nextDouble();
        System.out.println("Ingresa la estatura");
        Double altura = sc.nextDouble();
        int numeros = generaDNI();
        Persona p1 = new Persona(nombre,sexo,peso,altura,edad,numeros);
        Persona p2 = new Persona(nombre,edad,sexo);
        Persona p3 = new Persona(generaDNI());
        ArrayList<Persona> p = new ArrayList(){{add(p1);add(p2);add(p3);}};
        return p;
    }

    @Override
    public int calcularIMC(Persona persona) {
        int x;
        double result = persona.getPeso()/Math.pow(persona.getAltura(),2);
        if (result < 20){
            x=-1;
        }else if (result>25 && result<25){
            x=0;
        }else{
            x=1;
        }
        return x;
    }

    @Override
    public boolean esMayorDeEdad(Persona persona) {
        boolean edad = false;
        if (persona.getEdad()>18){
            edad = true;
        }
        return edad;
    }

    @Override
    public void comprobarSexo(Persona persona) {
        if (!persona.getSexo().equals("H")){
            persona.setSexo("H");
        }
    }

    @Override
    public String toString(Persona persona) {
        return persona.toString();
    }

    @Override
    public int generaDNI() {
        return (int)(100000000 * Math.random());
    }
}
