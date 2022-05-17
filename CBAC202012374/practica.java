package CBAC202012374;

import java.util.Scanner;

/**
 * practica
 */
public class practica {
    //comentario
    static Scanner leerTeclado=new Scanner(System.in);

    public static void pregunta1DMP() {
        //Definir Variables
        double n1, n2, n3, promedio;
        String estado;
        //Datos de entrada
        System.out.println("Ingrese Nota 1:");
        n1=leerTeclado.nextDouble();
        System.out.println("Ingrese Nota 2:");
        n2=leerTeclado.nextDouble();
        System.out.println("Ingrese Nota 3:");
        n3=leerTeclado.nextDouble();        
        //Proceso
        promedio=n1*0.20+n2*0.30+n3*0.50;
        /* >=18 y <=20 Aprobo con excelencia; <18 y >15 aprobo con mencion Regular
        <=15 y >=13 Aprobo con mencion Baja; <13 Desaprobo
        */
        if (promedio>=18 && promedio<=20) {
            estado="\n\nAprobo \n\tcon mension excelente";
        }else if(promedio<18 && promedio>15){
            estado="\n\nAprobo \n\tcon mension Regular";
        }else if(promedio<=15 && promedio>=13){
            estado="\n\nAprobo \n\tcon mension baja";
        }else{
            estado="\n\nDesaprobo";
        }
        // Datos de Salida 
        System.out.println(estado);
    }
    public static void main(String[] args) {
        pregunta1DMP();
        
    }
}
