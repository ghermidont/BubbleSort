public class BubbleSort {
    //time complexity of Bubble sort is O(nSquared) - squadratic
    public static void main(String[] args){
        int[] intArray = {10, 13, 1, 55, 22, 4, 6, 99, 1, -22};

        for (int lastaUnsortedIndex = intArray.length-1; lastaUnsortedIndex > 0; lastaUnsortedIndex--){
            for(int i = 0; i<lastaUnsortedIndex; i++){
                if(intArray[i]>intArray[i+1]){
                    swap(intArray, i, i+1);

                }
            }
        }
        for(int i = 0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
