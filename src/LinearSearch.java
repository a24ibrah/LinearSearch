public class LinearSearch {
    public static void main(String[] args) {

        // Get init time
        long Xmillis = System.currentTimeMillis();
        long Xseconds = Xmillis / 1000;

        // The array to search through
        int[] array = {1, 2, 3, 4, 5};

        // The value to search for
        int searchValue = 4;

        // Perform the linear search
        int index = linearSearch(array, searchValue);

        // Print the result
        if (index == -1) {
            System.out.println("Value not found in array");
        } else {
            System.out.println("Value found at index " + index);
        }

        // Get end time
        long Ymillis = System.currentTimeMillis();
        long Yseconds = Ymillis / 1000;
        System.out.println("Running Time: "+ (Ymillis-Xmillis)+ "ms!");

    }

    public static int linearSearch(int[] array, int searchValue) {
        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            // If the value is found, return the index
            if (array[i] == searchValue) {
                return i;
            }
        }

        // If the value is not found, return -1
        return -1;
    }
}
