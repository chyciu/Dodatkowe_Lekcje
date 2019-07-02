public class BinarySearchByRecursion {


    public static int binarySearch(int array[], int first, int last, int key) {

         if (last >= first) {
                int mid = first + (last-first)/2;

                if (array[mid] == key) {
                    return key;
                }

                if (array[mid] > key) {
                     binarySearch(array, first, mid-1, key);
                 }

                else {
                     binarySearch(array, mid+1, last, key);
                 }
             }
        return -1;
    }

    public static void main(String[] args) {

        int array[] = {10,20,21,22,30,31,35,40,45,47,50};
        int key = 40;
        int last=array.length-1;
        int result = binarySearch(array,0,last,key);
        if (result == -1)
            System.out.println("Element nie jest znaleziony!");
        else
            System.out.println("Element szukany to: " + result);
    }
}


