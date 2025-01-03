/*
 * This is my solution to the Leetcode problem of Duplicate Zeros. 
 *
 * Author: Nick Burkett
 * Date: 01/01/25
 *
 * Status - WIP
 */
public class DuplicateZeros{
        
        /*
         * Here is my insertZero function that will insert a zero into the array. 
         *
         * @param int[] nums - Array passed in to be modified.
         * @param int index - Where we need to stop in the loop.
         * @return void - Don't return anything.
         */
        public void insertZero(int[] nums, int index){
                
                //Need to iterate through the array backwards. 
                for(int i = (nums.length-1); i >= 0; i--){
                        
                        nums[i-1] = nums[i];    //Move everything over one to the left.
                }
                nums[index+1] = 0;
        }

        /*
         * Here is my Duplicate function that will actually run everything. 
         *
         * @param int[] nums - Array passe in. 
         * @return void - Don't return anything, just alter the array passed in.
         */
        public void duplicate(int[] nums){
                
                //Need to iterate over the original array.
        }

        public static void main(String[] args){}

}

