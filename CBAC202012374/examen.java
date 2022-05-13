import java.util.Scanner;

public class examen{

    static Scanner it=new Scanner(System.in);
    private static int x;
    public static void main(String[] args) {
        //declarar variables
        int nivelavanzado=4;
        int nivelregular=3;
        int nivelbasico=2;
        int nivel=1;
        int notafinal=x;
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
            notafinal=(int) (notacono+notaentrepersonal+notatespsicologico);
            mensaje="notafinal" +notafinal;
        }
        if (notafinal <= 17 && notafinal > 14) {
            notacono=(float) (nota1*0.4);
            notaentrepersonal=(float) (nota2*0.35);
            notatespsicologico=(float) (nota3*0.25);
            notafinal=(int) (notacono+notaentrepersonal+notatespsicologico);
            mensaje="notafinal" +notafinal;
        }
        else if (notafinal < 14 && notafinal >= 11);
            notacono=(float) (nota1*0.4);
            notaentrepersonal=(float) (nota2*0.35);
            notatespsicologico=(float) (nota3*0.25);
            notafinal=(int) (notacono+notaentrepersonal+notatespsicologico);
            mensaje="notafinal" +notafinal;
    
        if (notafinal >= 11) {
            notacono=(float) (nota1*0.4);
            notaentrepersonal=(float) (nota2*0.35);
            notatespsicologico=(float) (nota3*0.25);
            notafinal=(int) (notacono+notaentrepersonal+notatespsicologico);
            mensaje="notafinal" +notafinal;
        }

        //datos de salida
        System.out.println("nota final"+notafinal);
      

        
    }
}