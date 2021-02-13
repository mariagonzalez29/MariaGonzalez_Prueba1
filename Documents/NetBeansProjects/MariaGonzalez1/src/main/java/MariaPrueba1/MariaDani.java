
package MariaPrueba1;

public class MariaDani {

   
    public static void main(String[] args) {
        
        System.out.println("Matrices");
        // Filas = f
        // Columnas = c
        int[][] valores_matriz = new int[3][3];
        int[][] valores_matriz1 = new int[3][3];
        int[][] valores_matriz2 = new int[3][3];
        int[][] valores_matriz3 = new int[3][3];
        int[][] valores_matriz4 = new int[3][3];
        
        System.out.println("Primera Matriz");
        for (int f = 0; f<3; f++){
            for(int c = 0; c <3; c++){
                valores_matriz[f][c] = (int) (Math.random()*10)+ 1;
                System.out.print(valores_matriz[f][c]+"["+f+","+c+"]\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Segunda Matriz");
        for (int f = 0; f<3; f++){
            for(int c = 0; c <3; c++){
                valores_matriz1[f][c] = (int) (Math.random()*10)+ 1;
                System.out.print(valores_matriz1[f][c]+"["+f+","+c+"]\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Tercera Matriz");
        System.out.println("Suma de las primeras dos");
        System.out.println("************************");
        for (int f = 0; f<3; f++){
            for(int c = 0; c <3; c++){
                valores_matriz2[f][c] = valores_matriz[f][c] + valores_matriz1[f][c];
                System.out.print(valores_matriz2[f][c]+"["+f+","+c+"]\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Cuarta Matriz");
        System.out.println("Matriz a multiplicar por el resultado");
        System.out.println("************************************");
        for (int f = 0; f<3; f++){
            for(int c = 0; c <3; c++){
                valores_matriz3[f][c] = (int) (Math.random()*10)+ 1;
                System.out.print(valores_matriz3[f][c]+"["+f+","+c+"]\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Quinta Matriz");
        System.out.println("Resultado ultimo de la multiplicacion");
        System.out.println("************************************");
        for (int f = 0; f<3; f++){
            for(int c = 0; c <3; c++){
                for (int k = 0; k < 3; k++) {
                    // aquí se multiplica la matriz
                    valores_matriz4[f][c] += valores_matriz2[f][k] * valores_matriz3[k][c];
                }
                
                /*valores_matriz4[f][c] = valores_matriz2[f][c] * valores_matriz3[c][f];*/
                System.out.print(valores_matriz4[f][c]+"["+f+","+c+"]\t");
            }
            System.out.println("");
        }
    }
    
}
