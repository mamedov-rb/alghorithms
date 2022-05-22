public class ArraysPart {

    /* 001. Return new length as it was removed all duplicates (sorted array) */
    public static int removeDuplicatesReturningNewLength(int[] array) {
        if (array == null) return 0;
        if (array.length <= 1) return array.length;

        int L = 1;
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (array[i++] != array[j++]) {
                L++;
            }
        }
        return L;
    }

    /* 002. Return new length as it was removed all instances of element (unsorted array) */
    public static int removeElementReturnNewLength(int[] array, int el) {
        if (array == null) return 0;
        if (array.length <= 1) return array.length;

        int L = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] != el) {
                L++;
            }
            i++;
        }
        return L;
    }

    public static int removeDuplicatesWithMaxTwoAllowedReturningNewLength(int[] array) {
        if (array == null) return 0;
        if (array.length <= 2) return array.length;

        int L = 2;
        int i = 1;
        int j = 2;
        while (j < array.length) {
            if (array[i - 1] != array[i] || array[i] != array[j]) {
                L++;
            }
            i++;
            j++;
        }
        return L;
    }

    public static int[] moveZerosToTailReturningNewArray(int[] array) {
        if (array == null) return new int[]{};
        if (array.length <= 1) return array;

        int i = 0;
        int k = 0;
        int[] newArr = new int[array.length];

        while (i < array.length) {
            if (array[i] != 0) {
                newArr[k] = array[i];
                k++;
            }
            i++;
        }
        return newArr;
    }
}