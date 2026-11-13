class Solution {
    public int[] getConcatenation(int[] nums) {
        int newSize = 2*(nums.length);
        int[] numbers = new int[newSize];
        int count = 0;
        int newIndex = 0;
        while(count<2)
        {
            
            int i=0;
            for( i=0;i< nums.length;i++)
            {
                numbers[newIndex]=nums[i];
                newIndex++;
            }
            count++;
        }
        return numbers;
        
    }
}