public class Main {
    public static void main(String[] args) {

        /*
        Selection sort
        * 1. Array with values to sort
        * 2. An inner loop that goes through the array, finds the lowest value,
        *    and moves it to the front of the array. This loop must loop through one less value each time it runs.
        * 3. An outer loop that controls how many times the inner loop must run.
        *    For an array with ( n ) values, this outer loop must run n − 1 times.
        * */


        int [] array = {4,6,2,8,7};
        int n = array.length;


        for (int i = 0; i < n - 1 ; i++){ //searching the rest of the array for the smallest element
            int min_Index = i ;
            for (int j = i+1; j < n ; j++){ //serach for the smallest element to the right
                if(array[j] < array[min_Index]){ //if we find the smallest smallest element
                    min_Index = j; //rememeber its index (place)
                }
            }


            int min_value = array[min_Index]; //remember the smallest element
            //moving the smallest element to the first position
            for (int k = min_Index ; k > i ; k--){
                array[k] = array[k-1];
            }

            array[i] = min_value; //place the smallest element to its place
        }

        System.out.println("Selection sort: "); // we print out our elements
        for(int i = 0 ; i < n ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        

    }
}