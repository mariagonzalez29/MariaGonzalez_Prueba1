
package MariaPrueba3;

import java.util.Scanner;


public class MariaDani3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        // Filas = f
        // Columnas = c
        System.out.println("\t\tMatriz");
        // System.out.println("Por favor introduzca lo indicado");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuantas fila desea: ");
        int filas = entrada.nextInt();
        System.out.print("Cuantas columnas desea: ");
        int columnas = entrada.nextInt();
        long[][] valores_matriz = new long[filas][columnas];
        
        for (int f = 0; f<filas; f++){
            for(int c = 0; c <columnas; c++){
                System.out.print("Ingrese el valor en la posicion: ["+f+","+c+"]\t");
                valores_matriz[f][c] = entrada.nextInt();
            }
            System.out.println("");
        }
        
        if(validar(valores_matriz, filas, columnas)){
            System.out.println("La matriz es una matriz identidad: "+validar(valores_matriz, filas, columnas));
        }else {
            System.out.println("La matriz no es una matriz identidad: "+validar(valores_matriz, filas, columnas));
        }
    }
 
    public static boolean validar(long[][] matriz, int fila, int columna){
        for(int f = 0; f < fila; f++){
            for(int c = 0; c < columna; c++){
                if(c == f){
                    if(matriz[c][f] != 1){
                        return false;
                    }
                } else {
                    if(matriz[c][f] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
