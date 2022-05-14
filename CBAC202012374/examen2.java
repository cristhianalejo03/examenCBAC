
import java.util.Scanner;

public class examen2 {
    
    static Scanner it=new Scanner(System.in);
    private static int x;
    public static void main(String[] args) {
        //declarar variables
        float monto;
        double IGV;
        int y;
        float ventafinal;
        y=0;
        float cantidad1;;
        float cantidad2;
        String mensaje;
        double fin;
        //datos de entrada
        System.out.println("ingrese el monto de venta");
        monto=it.nextInt();
        //proceso
        if  (ventafinal >= 2000){
            IGV=monto*0.18;
            fin=IGV*0.10;
            mensaje="fin" +ventafinal;
        }

        else if (ventafinal<2000 && ventafinal>=1000){
            IGV=monto*0.18;
            fin=IGV*0.05;
            mensaje="fin" +ventafinal;
         
       }

        else if(ventafinal < 1000 && ventafinal>=500){
            IGV=monto*0.18;
            fin=IGV*0.02; 
            mensaje="fin" +ventafinal;
        }

       //datos de salida
       System.out.println(+ventafinal);
    }
    }
