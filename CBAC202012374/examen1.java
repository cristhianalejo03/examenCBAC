import java.io.PrintStream;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class examen1 {
    

    public static void main(String[] args) {
        //declarar variables
        float monto;
        float IGV;
        float ventafinal;
        float cantidad1;
        float cantidad2;
        String mensaje;
        //datos de entrada
        System.out.println("ingrese el monto de venta");
        monto=it.nextInt();
        //proceso
        if  (2000 <= ventafinal){
        cantidad1=((float)  (monto*0.18));
        cantidad2=((float) (monto*0.10));
        ventafinal=cantidad1+cantidad2;
            mensaje="ventafinal" +ventafinal;
    }

        if (ventafinal<2000 && ventafinal>=1000){
            cantidad1=((float)  (monto*0.18));
            cantidad2=((float) (monto*0.10));
            ventafinal=cantidad1+cantidad2;
            mensaje="ventafinal" +ventafinal;
         
       }

        if (ventafinal < 1000 && ventafinal>=500){
        cantidad1=((float)  (monto*0.18));
        cantidad2=((float) (monto*0.10));
        ventafinal=cantidad1 + cantidad2;
        mensaje="ventafinal" +ventafinal;
        }

       //datos de salida
       System.out.println("venta: ventafinal" );
    }

    
    }

