class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> counted = new HashMap<>();
        for(int i = 0; i < nums.length; i++ ){
            int diff = target-nums[i];
            if(counted.containsKey(diff)){
                // returns current index and the index of the computed number
                return new int[]{counted.get(diff),i};
            }
            counted.put(nums[i],i);

        }
        return new int[]{};
    }
}
