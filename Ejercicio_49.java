import java.util.Scanner;

public class Ejercicio_49 {
    /*Dado un número, devuelva el inverso del número. */
    public static void main(String[] args) {
        //variables
        int d,n,i=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        n= entrada.nextInt();
        //procesos
        while (n>0){
            d = n % 10;
            n = n / 10;
            i = i * 10+ d;
        }
        //salida
        System.out.println("inverso del número es: "+i);

    }
}
