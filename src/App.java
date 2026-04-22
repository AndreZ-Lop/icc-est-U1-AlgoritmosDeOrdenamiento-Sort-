import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        int [] numeros = {10, 0, -5, 5, 15, 2};
        runBubbleSortAvz();
    }
    
    public static void runBubbleSortAvz(){
        Random random = new Random();
        // int tam = random.nextInt(600);
        // int[] array = new int[tam];
        // for (int i = 0; i < array.length;i++){
        //     array[i] = random.nextInt(60);
        // }
        // intstanciar 
        int[] array = new int[]{9,2,3,0,8,5,10,50,100};
        BubbleSortAvz bSortAvz = new BubbleSortAvz(array);
        bSortAvz.printArray();
        bSortAvz.sort(true);
        bSortAvz.printArray();
        // bSortAvz.sort(false);
        // bSortAvz.printArray();
        

    }
    // // public  static void runBubbleSort(){
    //     int [] numeros = {-5 ,10, 2, 0, 7};
    //     System.out.println("Metodo Burbuja");
    //     // Instancia de la clase
    //     BubbleSort bubbleSort = new BubbleSort();
    //     bubbleSort.printArreglo(numeros);

    //     // bubbleSort.sortAscendente(numeros);
    //     // bubbleSort.printArreglo(numeros);
    //     // bubbleSort.sortDescendente(numeros);
    //     // bubbleSort.printArreglo(numeros);

    //     bubbleSort.sort(numeros, true );
    //     bubbleSort.printArreglo(numeros);
    //     bubbleSort.sort(numeros, false );
    //     bubbleSort.printArreglo(numeros);

    // }

}

