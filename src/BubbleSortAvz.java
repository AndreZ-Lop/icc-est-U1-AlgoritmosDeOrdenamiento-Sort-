public class BubbleSortAvz {
    //variabl global todos lo que esten en esta clase la puede usar
    int [] array;
    public BubbleSortAvz(int [] arreglo){
        //1ra forma para darle valor directo
        // array = new int[]{10,5,0};
        //2da forma darle valor en base a un parametro
        this.array = arreglo;
    }
    public void sort(boolean asc){
        int tam = array.length;
        int contComparacion=0;
        boolean huboIntercambio;
        for (int i = 0; i<tam-1;i++){
            huboIntercambio = false;
            for (int j = 0;j<tam-1-i;j++){
                //conforme el algoritmo va avazando el mimso bloquea las posiciones que ya estan comparadas y posicionadas correctamente 
                // se le resta 1 al tam para que no marque error (Index out) por comparar con posiciones que no existen
                // se le resta i al tam para que no se compare los valores queya fueron comparados
                if (asc){
                    if (array [j] > array [j+1]){
                         int temp = array[j];
                         array[j] = array[j+1];
                         array[j+1] = temp;
                         huboIntercambio = true;
                    }
                }else{
                    if (array [j] < array [j+1]){
                         int temp = array[j];
                         array[j] = array[j+1];
                         array[j+1] = temp;
                         huboIntercambio = true;
                         
                    }
                }
                contComparacion++;
            }
            // Hubo intercambio no ayuda a detener las comparaciones en el momento que se detecte que el arreglo ya no presento ningun cambio
            if (!huboIntercambio){
                break;

            }
        }
        System.out.println("Hubo un total de " + contComparacion + " comparaciones");
    }
    public void printArray(){
        for (int i : array){

            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
