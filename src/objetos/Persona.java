package objetos;

public class Persona {
    private String nombre,sexo;
    private double peso,altura;
    private int edad;
    private int DNI;

    public Persona(int DNI){
        this.nombre = "";
        this.sexo = "H";
        this.peso = 0;
        this.altura = 0;
        this.edad = 0;
        this.DNI = DNI;
    }

    public Persona (String nombre, int edad, String sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.DNI = 0;
    }

    public Persona(String nombre,String sexo,double peso, double altura, int edad, int DNI)
    {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                ", DNI=" + DNI +
                '}';
    }
}
