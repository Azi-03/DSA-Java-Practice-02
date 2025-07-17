class PairSum {

    // Count number of pairs with the given sum
    static int pairSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    // Count number of triplets with the given sum
    static int tripleSum(int[] arr, int target) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

class ArrayManipulation {

    // Find the unique number (non-duplicate)
    static int unique(int[] arr) {
        int[] copy = arr.clone();
        int ans = -1;

        for (int i = 0; i < copy.length; i++) {
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[i] == copy[j]) {
                    copy[i] = -1;
                    copy[j] = -1;
                }
            }
        }

        for (int value : copy) {
            if (value != -1) {
                ans = value;
            }
        }

        return ans;
    }

    // Find the second largest number
    static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        for (int value : arr) {
            if (value > secondMax) {
                secondMax = value;
            }
        }

        return secondMax;
    }
}

class RepeatingNumber {

    // Find the first repeating number in the array
    static int firstRepeatingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6, 3};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1};

        System.out.println("Pair Sum: " + PairSum.pairSum(arr1, 7));
        System.out.println("Triple Sum: " + PairSum.tripleSum(arr1, 12));
        System.out.println("Unique Element: " + ArrayManipulation.unique(arr2));
        System.out.println("Second Max: " + ArrayManipulation.secondMax(arr1));
        System.out.println("First Repeating Number: " + RepeatingNumber.firstRepeatingNumber(arr2));
    }
}
