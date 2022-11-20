import java.util.Scanner;

public class Ejercicio_48 {
    /* Dados dos números, diga si son amigos. Recuerde que dos números son amigos si la suma de
    los divisores de uno de ellos es igual al otro y viceversa; por ejemplo, 220 y 284 son amigos:
     Divisores de 220 son: */
    public static void main(String[] args) {
        //variables
        int i,n1,n2, s1=0 , s2=0;
        String r;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el n1: ");
        n1= entrada.nextInt();
        System.out.print("ingrese el n2: ");
        n2= entrada.nextInt();
        //proceso
        i=1;
        while (1 <= n1 / 2){
            if (n1 % i == 0){
                s1 += 1;
            }
            i++;
        }

        i=1;

        while (i <= n2 / 2){
            if (n2 % i == 0){
                s2 += i;
            }
            i++;
        }
        if (n1 ==s2 && n2== s1){
            r= "SON AMIGOS";
        }else {
            r="NO SON AMIGOS";
        }
        //salida
        System.out.println("son: "+r);

    }
}
