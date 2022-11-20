import java.util.Scanner;

public class Ejercicio_51 {
    /*Obtenga el cociente y el residuo de una división mediante restas sucesivas; por ejemplo, si el
    dividendo es 3989 y el divisor es 1247, entonces:
    3989 - 1247 = 2742 R(l )
    2742 - 1247 = 1495 R(2)
    1495 - 1247 = 248 R(3)
    Ya no se puede seguir restando, pues 248 es menor a 1247, entonces el cociente es el número de veces
    restado (3) y el residuo es el último número obtenido (248). */
    public static void main(String[] args) {
        //variables
        int n,d,c=0,r;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("numerador: ");
        n= entrada.nextInt();
        System.out.print("denominador: ");
        d= entrada.nextInt();
        //proceso
        while (n >= d){
            n-=d;
            c++;
        }
        r=n;
        //salida
        System.out.println("el cociente es: "+c);
        System.out.println("el residuo es: "+r);

    }
}
