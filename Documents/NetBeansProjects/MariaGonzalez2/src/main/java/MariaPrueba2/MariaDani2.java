
package MariaPrueba2;

import java.util.Scanner;


public class MariaDani2 {

    
    public static void main(String[] args) {
        // Filas = f
        // Columnas = c
        System.out.println("\t\tMatriz");
        System.out.println("Por favor introduzca lo indicado");
        Scanner entrada = new Scanner(System.in);

        //demanem els numeros a comparar.
        System.out.println("Cuantas fila desea: ");
        int filas = entrada.nextInt();
        System.out.println("Cuantas columnas desea: ");
        int columnas = entrada.nextInt();
        long[][] valores_matriz = new long[filas][columnas];
        for (int f = 0; f<filas; f++){
            for(int c = 0; c <columnas; c++){
                
                valores_matriz[f][c] = 23+(f*f*f*f)+20+(c*c*c)-3;
                //valores_matriz[f][c] = 23+(int)Math.pow(f, 4)+20+(int)Math.pow(c, 3)-3;
                System.out.print(valores_matriz[f][c]+"["+f+","+c+"]\t");
            }
            System.out.println("");
        }
    }
    
}

