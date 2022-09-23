package curp;


import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        /*String Cadena = "Hola Mundo";
        String SubCadena = Cadena.substring(5,10);
        System.out.println(SubCadena);
         */

        System.out.println("Ingresa su primer nombre");
        String nombre = input.next();
        String sub3 = nombre.substring(0,1);
        System.out.println(sub3);

        System.out.println("Ingresa su apellido paterno");
        String apellido_paterno = input.next();
        String sub1 = apellido_paterno.substring(0,2);
        System.out.println(sub1);

        System.out.println("Ingresa su apellido materno");
        String apellido_materno = input.next();
        String sub2 = apellido_materno.substring(0,1);
        System.out.println(sub2);

        System.out.println("Ingresa su sexo (H/M)");
        String sexo = input.next();

        System.out.println("Ingresa su estado de nacimiento");
        String estado = input.next();
        String sub4 = estado.substring(0,2);
        System.out.println(sub4);

        System.out.println("Ingresa su fecha de nacimiento (dd/mm/yyyy)");
        System.out.println("Ingresa el dia");
        String dia = input.next();

        System.out.println("Ingresa el mes");
        String mes = input.next();

        System.out.println("Ingresa el año (Solo los ultimos dos digitos)");
        String anio = input.next();



        int num_random1 = (int)(Math.random()*10+1);
        int num_random2 = (int)(Math.random()*10+1);

        System.out.println("El curp es: " + sub1.toUpperCase()+sub2+sub3+anio+mes+dia+sexo.toUpperCase()+sub4.toUpperCase()+num_random1+num_random2);

        /*No acabé :(*/

    }
}