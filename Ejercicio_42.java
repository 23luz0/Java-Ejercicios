import java.util.Scanner;

public class Ejercicio_42 {
    /* Dado un rango de números enteros, obtener la cantidad de
     números enteros que contiene.*/
    public static void main(String[] args) {
        //variables
        int i,ni,nf,c=0;
        //entrada
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese el ni: ");
        ni= entrada.nextInt();
        System.out.print("ingrese el nf: ");
        nf= entrada.nextInt();
        //proceso
        i=ni+1;
        while (i<nf){
            c=c+1;//c+=1;
            i=i+1;//i++;
        }
        //salida
        System.out.println("la cantidad es: "+c);

    }
}
