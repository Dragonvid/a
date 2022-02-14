package aa;

/**
 * @author davsan03
 */
public class Test1 {
        /**
     * Método multiplica que multiplica a por b
     * @param a La primera variable usada en multiplicación
     * @param b La segunda variable usada en la multiplicación
     * @return Devuelve el resultado de la operación
     */
    public int multiplica(int a, int b){
        return a*b;
    }
    /**
     * Método factorial que obtiene el factorial de un numero
     * @param numero Int del cual se tiene que sacar el factorial
     * @param i Int contador utilizado en el bucle para sacar el factorial
     * @param factorial guarda el resultado del factorial
     * @return Devuelve el resultado de la operación
     */
    public int factorial(int numero){
        int factorial=numero;
        for(int i=(numero-1);i>1;i--){
            factorial=factorial*i;
        }
        return factorial;
    }
        /**
     * Método main que no hace nada
     * @param args Parámetros de entrada de línea de comandos
     */
    public static void main(String[] args) {

    }
    
}
