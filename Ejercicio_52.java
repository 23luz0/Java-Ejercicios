import java.util.Scanner;

public class Ejercicio_52 {
    /*Determine si un número es capicúa o no. Se dice que un número capicúa es aquel que al
    invertir sus cifras da el mismo número; por ejemplo, 12321 invertido es 12321. Entonces es un número
    capicúa . */
    public static void main(String[] args) {
        //variables
        int n,i=0, d,t;
        String r="";
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        n= entrada.nextInt();
        //proceso
        t=n;
        while (t > 0){
            d=t%10;
            t=t/10;
            i=i*10+d;
        }
        if (n==i){
            r="ES CAPICUA";
        }else{
            r="NO ES CAPICUA";
        }
        //salida
        System.out.println("resultado: "+r);

    }
}
