class Solution {
    public int[] getConcatenation(int[] nums) {
       int n = nums.length;
        int[] numbers = new int[2 * n];
            for( int i=0;i<n;i++)
            {
                numbers[i]=nums[i];
                numbers[i+n] = nums[i];
            }
        return numbers;
        
    }
}