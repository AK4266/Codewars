//steps to solve the problem
//1. find longest prefix
//i.e. a[i] < a[i+1]
//2.Find index just greater than the breakpoint number and swap the numbers
//3.Once you done that just reverse the remaining numbers because you know that they will be in increasing in order and you want the number wjich is just close to the current element to get the next permutation

class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
       int ind = -1;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums, n-1, 0);
        }else{
                for(int i=n-1; i>ind; i--){
                    if(nums[i] > nums[ind]){
                        swap(nums, i, ind);
                        break;
                    }
            }
        }
        reverse(nums, ind+1, n-1);
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverse(int[] arr, int i, int j){
        while(i<=j){
            swap(arr, i, j);
            i++;
            j--;
        }
            
    }      
}