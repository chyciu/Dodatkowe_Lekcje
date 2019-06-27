
public class SumingArray {

    public static void main(String[] args) {
        int [] arraysOfInts = {2,3,44,5,66,7,76,54};

        System.out.println(sumArrayRecursive(arraysOfInts, 0));


    }

    public static int sumArrayRecursive (int [] array, int index) {
        if (index < array.length) {
            return array[index] + sumArrayRecursive(array, index + 1);
        } else {
            return 0;
        }
    }

  }


