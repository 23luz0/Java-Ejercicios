import java.util.Scanner;

public class Ejercicio_43 {
    /*: Dado un rango de números enteros, obtener la cantidad
    de números pares que contiene.*/
    public static void main(String[] args) {
        //variables
        int i,ni,nf,cp=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el numero ni: ");
        ni= entrada.nextInt();
        System.out.print("ingrese el numero nf: ");
        nf= entrada.nextInt();
        //proceso
        i=ni+1;
        while (i<nf){
            if (i%2==0){
                cp+=1; //cp=cp+1
            }
            i++; //i=i+1
        }
        //salida
        System.out.println("cantidad de numeros pares es: "+cp);

    }
}
