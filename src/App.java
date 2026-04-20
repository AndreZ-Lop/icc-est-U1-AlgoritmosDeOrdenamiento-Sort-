public class App {
    public static void main(String[] args) throws Exception {
        // int [] numeros = {10, 0, -5, 5, 15, 2};
        runBubbleSort();
    }

    public  static void runBubbleSort(){
        int [] numeros = {-5 ,10, 2, 0, 7};
        System.out.println("Metodo Burbuja");
        // Instancia de la clase
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.printArreglo(numeros);

        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);

        bubbleSort.sort(numeros, true );
        bubbleSort.printArreglo(numeros);
        bubbleSort.sort(numeros, false );
        bubbleSort.printArreglo(numeros);


    }
}

