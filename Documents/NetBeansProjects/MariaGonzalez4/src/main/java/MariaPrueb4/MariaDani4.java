
package MariaPrueb4;

import java.util.Scanner;


public class MariaDani4 {

   
    public static void main(String[] args) {
        // Filas = f
        // Columnas = c
        System.out.println("\t\tMatriz 4");
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
                System.out.print("Ingrese el valor en la posicion: ["+f+","+c+"]\t");
                valores_matriz[f][c] = (long)entrada.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("");
        for (int f = 0; f<filas; f++){
            for(int c = 0; c <columnas; c++){
                System.out.print(valores_matriz[f][c]+"["+f+","+c+"]\t");
            }
            System.out.println("");
        }
            
        if (validar_triangulo_superior(valores_matriz, filas, columnas)){
            System.out.println("La matriz es triangular superior: " + validar_triangulo_superior(valores_matriz, filas, columnas));
        } else {
            System.out.println("La matriz No es triangular superior: " + validar_triangulo_superior(valores_matriz, filas, columnas));
        }
        
    }
    
    public static boolean validar_triangulo_superior(long[][] matriz,int filas,int columnas){
        for (int f = 0; f<filas; f++){
            for(int c = 0; c < f; c++){
                if(matriz[f][c] != 0){
                    return false;
                }
            }
        }
        return true;
    }
}

