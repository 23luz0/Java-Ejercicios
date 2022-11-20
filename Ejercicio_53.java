import java.util.Scanner;

public class Ejercicio_53 {
    /*: Dado un número, determine si es un número primo. Recuerde que un número primo es
    aquel que solo es divisible por 1 y por sí mismo. */
    public static void main(String[] args) {
        //variables
        int n,i;
        boolean flag;
        String r="";

        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("numero: ");
        n= entrada.nextInt();
        //proceso
        flag=true;
        i=2;
        while (i<=n / 2){
            if (n % i == 0){
                flag = false;
                break;
            }
            i++;
        }
        if (flag){
            r="es primo";
        }else{
            r="no es primo";
        }
        //salida
        System.out.println("respuesta: "+r);

    }
}
