import java.util.Scanner;

public class Ejercicio_46 {
    /* Dado un número, determinar la cantidad de dígitos
     pares que contiene.*/
    public static void main(String[] args) {
        //variables
        int i, d, n, c=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el numero: ");
        n= entrada.nextInt();
        //proceso
        while (n>0){
            d=n%10;
            if (d%2==0){
                c+=1;
            }
            n/=10;
        }
        //salida
        System.out.println("cantidad de digitos pares: "+c);

    }
}
