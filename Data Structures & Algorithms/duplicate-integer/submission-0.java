class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> nums_count = new HashMap<>();
        for(int i : nums){
            if(nums_count.containsKey(i) == false){
                nums_count.putIfAbsent(i,1);
                continue;
            }
            nums_count.put(i,nums_count.get(i)+1);
        }
        for(Map.Entry<Integer,Integer> entry : nums_count.entrySet()){
            if (entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}