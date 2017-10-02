public class Factorial {
    public static void main(String [] args) {
        int factorial=1; // limite al que llegaremos
        int numero=5; // numero que vamos a multiplicar por sus anteriores

        while (numero!=1){
            factorial= factorial*numero;
            numero--;
        }
        System.out.println(factorial);
    }
    // OTRA FORMA DE RESOLVERLO
    // int fact = 5;
    // int resultado =;
    // for(int i = 1; i<=fact; i++) {
    //      resultado = resultado * i; }
    //      System.out.println("El factorial de " +fact+ " es " + resultado);
}
