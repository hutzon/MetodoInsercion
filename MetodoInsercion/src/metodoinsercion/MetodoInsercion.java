package metodoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoInsercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], pos, aux, nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a elementos a ingresar:"));
        arreglo=new int[nElementos];
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print(i+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        
        
        //codigo para el metodo por insercion
        for (int i = 0; i < nElementos; i++) {
            pos=i;
            aux=arreglo[i];
            
            while(pos>0 && (arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        
        System.out.print("Mostrar los numeros en forma creciente: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Mostrar los numeros en forma decreciente: ");
        for (int i = (nElementos-1); i >=0; i--) {
            System.out.print(arreglo[i]+" ");
            
        }
    }
    
}
