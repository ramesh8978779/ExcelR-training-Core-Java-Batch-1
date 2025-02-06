import java.util.Arrays;

public class Leetcode08 {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Last index of the actual elements in nums1
        int j = n - 1;  // Last index of nums2
        int k = m + n - 1;  // Last index of the merged array
        
        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
        // No need to do anything if there are remaining elements in nums1
        // because they are already in the correct position.
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);

        // Output the merged array
        System.out.println(Arrays.toString(nums1));
    }
}
