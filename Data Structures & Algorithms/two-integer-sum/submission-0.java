class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            int complementary = target - nums[i];
            if(hashmap.containsKey(complementary)){
                return new int[] {hashmap.get(complementary), i};
            }
            hashmap.put(nums[i],i);
        }
        return new int[] {};
    }
}
