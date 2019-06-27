public class SelectionSort {

    public static void main(String[] args) {

        int unsortedArray[] = {20, 33, 4, 55, 6, 7, 35, 9, 21};
        selectinSort(unsortedArray);

        for (int element : unsortedArray) {
            System.out.println(element);
        }
    }

    public static void selectinSort(int [] arrayToSort) {

        for (int i = 0; i < arrayToSort.length; i++) {
            int minimumIdx = i;

            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < arrayToSort[minimumIdx]) {
                    minimumIdx = j;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[minimumIdx];
            arrayToSort[minimumIdx] = temp;
        }
    }
}
