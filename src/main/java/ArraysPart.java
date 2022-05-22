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

    /* 003. Return new length as it was removed all duplicates with allowed two duplicates (sorted array) */
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

    /* 004. move zeros to tail returning new array (unsorted array) */
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

    /* 005. move zeros to tail returning changed array (unsorted array) */
    public static int[] moveZerosToTailReturningChangedArray(int[] array) {
        if (array == null) return new int[]{};
        if (array.length <= 1) return array;

        int i = 0;
        int j = 0;

        //1. [0, 1, 3, 7, 0, 0, 0, 4] i = 0; j = 0; -> i = 0; j = 1;
        //2. [1, 1, 3, 7, 0, 0, 0, 4] i = 0; j = 1; -> i = 1; j = 2;
        //3. [1, 3, 3, 7, 0, 0, 0, 4] i = 1; j = 2; -> i = 3; j = 4;
        //4. [1, 3, 7, 7, 0, 0, 0, 4] i = 3; j = 4; -> i = 3; j = 5;
        //4. [1, 3, 7, 7, 0, 0, 0, 4] i = 3; j = 5; -> i = 3; j = 6;
        //5. [1, 3, 7, 4, 0, 0, 0, 4] i = 3; j = 6; -> i = 4; j = 7;
        while (j < array.length) {
            if (array[j] != 0) {
                array[i] = array[j];
                i++;
            }
            j++;
        }

        //1. [1, 3, 7, 4, 0, 0, 0, 4] i = 4; -> i = 5;
        //2. [1, 3, 7, 4, 0, 0, 0, 4] i = 5; -> i = 6;
        //2. [1, 3, 7, 4, 0, 0, 0, 0] i = 6; -> i = 7;
        while (i < array.length) {
            array[i++] = 0;
        }
        return array;
    }
}