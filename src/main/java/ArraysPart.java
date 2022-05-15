public class ArraysPart {

    /* 001. Return new length as it was removed all instances of element (unsorted array) */
    public static int removeElementReturnNewLength(int[] array, int el) {
        if (array == null) return 0;

        int i = 0;
        int L = 0;
        while (i < array.length) {
            if (array[i++] != el) {
                L++;
            }
        }
        return L;
    }

    /* 002. Return new length as it was removed all duplicates (sorted array) */
    public static int removeDuplicatesReturningNewLength(int[] array) {
        if (array == null) return 0;
        if (array.length < 2) return array.length;

        int i = 0;
        int j = 1;
        int L = 0;
        while (j < array.length) {
            if (array[i++] != array[j++]) {
                L++;
            }
        }
        return L;
    }
}