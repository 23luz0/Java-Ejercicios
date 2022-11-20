import java.util.Scanner;

public class Ejercicio_50 {
    /*Crear un algoritmo que indique si un número es cubo perfecto (anstrong) o no, se dice que
    un número es cubo perfecto si al sumar los cubos de sus dígitos dan el mismo número, por ejemplo 153,
    cubos de sus dígitos 13 + 53 + 33 = 153 el número 153 es cubo perfecto. */
    public static void main(String[] args) {
        //variables
        int t, d, s=0 , n;
        String r;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el numero: ");
        n= entrada.nextInt();
        //proceso
        t=n;
        while (t > 0){
            d= t % 10;
            t/=10;
            s=(int)(s+ Math.pow((double) d, 3.0));
        }
        if (n==s){
            r="CUBO PERFECTO";
        }else{
            r="NO ES CUBO PERFECTO";
        }
        //salida
        System.out.println("resultado: "+r);

    }
}
