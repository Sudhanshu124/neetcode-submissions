class Solution {
    public boolean hasDuplicate(int[] nums) {
 HashMap <Integer,Integer> mp = new HashMap<>();
 for(int i=0;i<nums.length;i++)
 {
    if(mp.containsKey(nums[i]))
    {
        mp.put(nums[i],mp.get(nums[i])+1);
    }
    else{
        mp.put(nums[i],1);
        System.out.println(nums[i]);
    }
 }
 for (int value : mp.values()) {
    if (value > 1) {
      return true;
    }
  }
 return false;
    }
}
