class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] numArr = new int [2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int secondNumber = target-nums[i];
            if(mp.containsKey(secondNumber))
            {
                
                numArr[0]=mp.get(secondNumber);
                numArr[1]=i;
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return numArr;
    }
}
