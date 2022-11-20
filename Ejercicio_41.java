import java.util.Scanner;

public class Ejercicio_41 {
    /*Obtener la suma de los primeros N números naturales positivos.*/
    public static void main(String[] args) {
        //variables
        int i,n, s=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el numero: ");
        n= entrada.nextInt();

        //proceso
        i=1;
        while (i <= n){
            s=s+i;
            i=i+1;
        }
        //salida
        System.out.println("la suma es: "+s);

    }
}
