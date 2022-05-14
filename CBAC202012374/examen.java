import java.util.Scanner;

public class examen{

    static Scanner it=new Scanner(System.in);
    private static int x;
    public static void main(String[] args) {
        //declarar variables
        float nivelavanzado=4;
        float nivelregular=3;
        float nivelbasico=2;
        float nivelbajo=1;
        String nivel;
        float notafinal=x;
        x=11;
        float nota;
        float nota1;
        float nota2;
        float nota3;
        float notacono;
        float notaentrepersonal;
        float notatespsicologico;
        String mensaje;
        //datos de entrada
        System.out.println("Ingrese la nota1:");
        nota1=it.nextInt();
        System.out.println("Ingrese la nota2:");
        nota2=it.nextInt();
        System.out.println("Ingrese la nota3:");
        nota3=it.nextInt();
        // datos de proceso
        if (17 <= notafinal ){
            notacono=((float) (nota1 * 0.4));
            notaentrepersonal=((float) (nota2*0.35));
            notatespsicologico=(float) (nota3*0.25);
            notafinal=(float) ((notacono+notaentrepersonal+notatespsicologico));
            mensaje="notafinal" +notafinal;
            float nivelavanzado2 = nivelavanzado;
           
        }
        if (notafinal <= 17 && notafinal > 14) {
            notacono=(float) (nota1*0.4);
            notaentrepersonal=(float) (nota2*0.35);
            notatespsicologico=(float) (nota3*0.25);
            notafinal=(float) (notacono+notaentrepersonal+notatespsicologico);
            mensaje="notafinal" +notafinal;
            float nivelregular2 = nivelregular;
        }
        else if (notafinal < 14 && notafinal >= 11);
            notacono=(float) (nota1*0.4);
            notaentrepersonal=(float) (nota2*0.35);
            notatespsicologico=(float) (nota3*0.25);
            notafinal=(float) (notacono+notaentrepersonal+notatespsicologico);
            mensaje="notafinal" +notafinal;
            float nivelbasico2 = nivelbasico;
    
        if (notafinal >= 11) {
            notacono=(float) (nota1*0.4);
            notaentrepersonal=(float) (nota2*0.35);
            notatespsicologico=(float) (nota3*0.25);
            notafinal=(float) (notacono+notaentrepersonal+notatespsicologico);
            mensaje="notafinal" +notafinal;
            float nivelbajo2 = nivelbajo;
        }

        //datos de salida
        System.out.println("nota final si engresa a la iniversidad: "+notafinal);
        System.out.println("nivelavanzado: ");
        
    }
}