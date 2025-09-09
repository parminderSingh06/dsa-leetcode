package arrays.lc;

import java.util.Arrays;

public class SortArray {

    public int[] InsertionSortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                int key = nums[i];
                int j = i-1;
                while(j >= 0 && key < nums[j]){
                    nums[j+1] = nums[j];
                    j--;
                }
                nums[j+1] = key;
            }
        }
        return nums;
    }

    public int[] sortArray(int[] nums){
        if(nums.length==1) return nums;
        
        int mid = nums.length/2;

        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);

        return merge(sortArray(left), sortArray(right));
    }

    public int[] merge(int[] left, int[] right){
        int[] result = new int[left.length+right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
                k++;
            }
            else{
                result[k] = right[j];
                j++;
                k++;
            }
        }

        while(i<left.length){
            result[k] = left[i];
            i++;
            k++; 
        }
        while(j<right.length){
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }
}
