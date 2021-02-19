package principal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PuntosTaller {

    Scanner sc = new Scanner(System.in);

    public void punto1(){
        int num1=5,num2=6;
        if(num1>num2){
            System.out.println("El mayor es "+num1);
        }else {
            System.out.println("El mayor es "+num2);
        }
    }

    public void punto2(){

        System.out.println("Ingrese primer numero");
        int num1=sc.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("El mayor es "+num1);
        }else if (num1==num2){
            System.out.println("son iguales");
        }else {
            System.out.println("El mayor es "+num2);
        }
    }

    public void punto3(){
        System.out.println("Ingrese radio");
        double radio = sc.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("El area es "+area);
    }

    public void punto4(){
        System.out.println("Ingrese precio del producto");
        double precio = sc.nextDouble();
        double iva = precio*0.21;
        System.out.println("El precio final es "+iva);
    }

    public void punto5(){
        int x=1;
        while (x<=100){
            if (x%2 ==0 ){
                System.out.println("Numero Par:"+x);
            }else{
                System.out.println("Numero Impar:"+x);
            }
            x++;
        }
    }

    public void punto6(){
        for (int x = 1;x<=100;x++) {
            if (x % 2 == 0) {
                System.out.println("Numero Par:" + x);
            } else {
                System.out.println("Numero Impar:" + x);
            }
        }
    }

    public void punto7() {
        boolean x = true;
        do {
            System.out.println("Ingrese un numero");
            int num = sc.nextInt();
            if (num >= 0) {
                x = false;
            }
        } while (x);
    }

    public void punto8() {
        System.out.println("1.Lunes\n" +
                "2.Martes\n" +
                "3.Miercoles\n" +
                "4.Jueves\n" +
                "5.Viernes\n" +
                "6.Sabado\n" +
                "7.Domingo\n"+
                "Ingrese numero de la semana a consultar:");
        int rptas = sc.nextInt();
        switch (rptas){
            case 1:
                System.out.println("Día laboral");
                break;
            case 2:
                System.out.println("Día laboral");
                break;
            case 3:
                System.out.println("Día laboral");
                break;
            case 4:
                System.out.println("Día laboral");
                break;
            case 5:
                System.out.println("Día laboral");
                break;
            case 6:
                System.out.println("Día descanso");
                break;
            case 7:
                System.out.println("Día descanso");
                break;
            default:
                System.out.println("Opción no valida");
        }

    }

    public void punto9(){
        String frase = "La sonrisa serala mejor arma contra la tristeza";
        frase = frase.replace('a','e');
        System.out.println("La sonrisa serala mejor arma contra la tristeza");
        System.out.println(frase);
    }

    public void punto10(){
        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();
        frase = frase.replace(" ","");
        System.out.println(frase);
    }

    public void punto11() {
        int cont=0,contA=0,contE=0,contI=0,contO=0,contU=0;
        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();
        System.out.println("el tamaño en caracteres es: "+ frase.length());
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e'||frase.charAt(i) == 'i'
            || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                cont++;
            }
            if (frase.charAt(i) == 'a'){
                contA++;
            }
            if (frase.charAt(i) == 'e'){
                contE++;
            }
            if (frase.charAt(i) == 'i'){
                contI++;
            }
            if (frase.charAt(i) == 'o'){
                contO++;
            }
            if (frase.charAt(i) == 'u'){
                contU++;
            }
        }
        System.out.println("el total de vocales: "+ cont);
        System.out.println("el total a: "+ contA);
        System.out.println("el total e: "+ contE);
        System.out.println("el total i: "+ contI);
        System.out.println("el total o: "+ contO);
        System.out.println("el total u: "+ contU);
    }

    public void punto13(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        System.out.println("Hora y fecha: "+hourdateFormat.format(date));
    }

    public void punto14(){
        System.out.println("Ingrese un número");
        int num = sc.nextInt();
        while(num<=1000){
            System.out.println(num);
            num += 2;
        }
    }

    public void punto15() {
        boolean band = true;
        while (band) {
            menu();
            try {
                int rptas = sc.nextInt();
                switch (rptas) {
                    case 1:
                        System.out.println("Ingresaste opcion 1");
                        break;
                    case 2:
                        System.out.println("Ingresaste opcion 2");
                        break;
                    case 3:
                        System.out.println("Ingresaste opcion 3");
                        break;
                    case 4:
                        System.out.println("Ingresaste opcion 4");
                        break;
                    case 5:
                        System.out.println("Ingresaste opcion 5");
                        break;
                    case 6:
                        System.out.println("Ingresaste opcion 6");
                        break;
                    case 7:
                        System.out.println("Ingresaste opcion 7");
                        break;
                    case 8:
                        System.out.println("El programa finalizo");
                        band = false;
                        break;
                    default:
                        System.out.println("Solo opciones entre 1 y 8");
                }
            } catch (Exception e) {
                System.out.println("Solo se aceptan numeros");
                sc.next();
            }
        }
    }
    public void menu(){
        System.out.println("****** GESTION CINEMATOGRÁFICA ********\n"+
                "1.Nuevo actor\n" +
                "2.Buscar actor\n" +
                "3.Eliminar actor\n" +
                "4.Modificar actor\n" +
                "5.Ver todos los actores\n" +
                "6.Ver peliculas de los actores\n" +
                "7.Ver categoria de los actores\n"+
                "8.salir\n"+
                "Ingrese numero de la semana a consultar:");
    }
}

