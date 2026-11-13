

// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer, Integer> hmp = new HashMap<>();
//         for (int num : nums) {
//             hmp.put(num, hmp.getOrDefault(num, 0) + 1);
//         }
//            List<Integer>[] frequencyOrdered = new List[nums.length + 1];
//                 for(Map.Entry<Integer,Integer> entry:hmp.entrySet())
//                 {
//                     int num = entry.getKey();
//                     int freq = entry.getValue();
//                     frequencyOrdered[freq].add(num);
//                 }

//                 int [] resultArr = new int[k];
//                 int index = 0;
//                 for(int freq = resultArr.length;freq>=0&&index < k;
//                 freq--
//                 )
//                 for(int num : frequencyOrdered)
//                 {
//                     if(num<k)
//                     {
//                         resultArr[index++]=num; 
//                     }
//                 }
//                 return resultArr;
//             }
        
//     }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        for (int num : nums) {
            hmp.put(num, hmp.getOrDefault(num, 0) + 1);
        }
        
        List<Integer>[] frequencyOrdered = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            frequencyOrdered[i] = new ArrayList<>();
        }
        
        for (Map.Entry<Integer, Integer> entry : hmp.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            frequencyOrdered[freq].add(num);
        }

        int[] resultArr = new int[k];
        int index = 0;
        
        for (int freq = nums.length; freq >= 0 && index < k; freq--) {
            for (int num : frequencyOrdered[freq]) {
                if (index < k) {  
                    resultArr[index++] = num; 
                }
            }
        }
        return resultArr;
    }
}