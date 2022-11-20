import java.util.Scanner;

public class Ejercicio_47 {
    /* Dado un número, devolver el dígito mayor*/
    public static void main(String[] args) {
        //variables
        int d, n, m=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el numero: ");
        n= entrada.nextInt();
        //proceso
        while (n>0){
            d=n%10;
            if (d>m){
                m=d;
            }
            n/=10;
        }
        //salida
        System.out.println("digito mayor es: "+m);

    }
}
