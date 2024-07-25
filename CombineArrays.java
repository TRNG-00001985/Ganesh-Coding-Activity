class CombineArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int length1 = array1.length;
        int length2 = array2.length;
        int[] combinedArray = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            combinedArray[i] = array1[i];
        }
        for (int i = 0; i < length2; i++) {
            combinedArray[length1 + i] = array2[i];
        }
        System.out.print("Combined Array: ");
        for (int i = 0; i < combinedArray.length; i++) {
            System.out.print(combinedArray[i] + " ");
        }
    }
}
