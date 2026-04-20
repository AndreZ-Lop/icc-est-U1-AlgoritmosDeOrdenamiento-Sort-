public class BubbleSort {
    // Constructor
    public BubbleSort(){
        System.out.println("Se creo la clase en el constructor");
    }

    public void sortAscendente (int [] numeros ){
        for (int i = 0; i < numeros.length; i++){
            for (int j = i + 1 ; j < numeros.length; j++){
                //comparcion 
                if (numeros[i] > numeros [j]){
                    //si cumple la condicion
                    int aux = numeros [i];
                    numeros [i] = numeros[j];
                    numeros [j] = aux;
                }
            }
        }
    }
    public void sortDescendente (int[] numeros){
        for (int i = 0; i < numeros.length; i++){
            for (int j = i + 1 ; j < numeros.length; j++){
                //comparcion 
                if (numeros[i] < numeros [j]){
                    //si cumple la condicion
                    int aux = numeros [i];
                    numeros [i] = numeros[j];
                    numeros [j] = aux;
                }
            }
        }
    }

    public  void printArreglo(int[] numeros) {
        for (int i : numeros){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    public void sort (int [] numeros, boolean asc){
        ////
        /// [asc] True ordenara ascendente 
        /// [asc] False ordenara descendente
        /// 
        if (asc == true){
            sortAscendente(numeros);
        }else{
            sortDescendente(numeros);
        }
    }
}


