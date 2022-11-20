import java.util.Scanner;

public class Ejercicio_55 {
    /* Dado un número entero en base 10, convertir el número a
    otra base menor que 10. */
    public static void main(String[] args) {
        //variables
        int n,b,d,i=0,r=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("numero en base 10: ");
        n= entrada.nextInt();
        System.out.print("convertir a base: ");
        b= entrada.nextInt();
        //proceso
        while (n > 0){
            d=n%b;
            n/=b;
            i=i*10+d;
        }
        while (i>0){
            d=i%10;
            i/=10;
            r=r*10+d;
        }
        //salida
        System.out.println("resultado: "+r);

    }
}
