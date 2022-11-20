import java.util.Scanner;

public class Ejercicio_45 {
    /* Dado un número, determinar cunátos dígitos tiene*/
    public static void main(String[] args) {
        //variables
        int i, n, c=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el número: ");
        n= entrada.nextInt();
        //proceso
        while (n>0){
            n=n/10;
            c+=1;
        }
        //salida
        System.out.println("cantidad de digitos es: "+c);

    }
}
