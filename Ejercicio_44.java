import java.util.Scanner;

public class Ejercicio_44 {
    /*Obtener la cantidad de los primeros N números múltiplos de 5. */
    public static void main(String[] args) {
        //variables
        int i, n,c=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el numero: ");
        n= entrada.nextInt();
        //proceso
        i=1;
        while (i<=n){
            if (i%5==0){
                c+=1; //c=c+1
            }
            i++; //i=i+1
        }
        //salida
        System.out.println("la cantidad es: "+c);

    }
}
