import java.util.Scanner;

public class Ejercicio_54 {
    /*Dado un número y su base, determine si el número pertenece a la base ingresada. Recuerde
    que un número pertenece a una base si sus dígitos son menores a su base. */
    public static void main(String[] args) {
        //variables
        int n, d, b;
        boolean flag;
        String r = "";
        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.print("numero: ");
        n = entrada.nextInt();
        System.out.print("nbase: ");
        b= entrada.nextInt();
        //proceso
        flag = true;
        while (n > 0){
            d=n%10;
            n/=10;
            if (d>=b){
                flag=false;
                break;
            }
        }
        if (flag){
            r="base correcta";
        }else{
            r="base incorrecta";
        }
        //salida
        System.out.println("resultado: "+r);

    }
}
