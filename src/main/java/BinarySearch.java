public class BinarySearch {

    public static void main(String[] args) {

        int array [] = {23, 3, 44, 55, 90};
        int key = 23;
        int last = array.length-1;

        binarySearch(array,0, last, key);

    }


    public static void binarySearch (int array [], int first, int last, int key) {

        int l = array.length;
        int mid = l / 2;

        try {
            while (first <= last) {
                if (array[mid] < key) {
                    first = mid + 1;
                } else if (array[mid] == key) {
                    System.out.println("Element szukany to: " + key);
                    break;
                } else {
                    last = mid - 1;
                }
                mid = (first - last) / 2;
            }
        } catch (Exception e) {
            System.out.println("Elementu nie ma w zbiorze");
        }
    }
 }



