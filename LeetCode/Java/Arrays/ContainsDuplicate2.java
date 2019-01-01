class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(table.containsKey(nums[i]) && i - table.get(nums[i]) <= k){
                return true;
            }
            table.put(nums[i], i);
        }
        return false;
    }
}