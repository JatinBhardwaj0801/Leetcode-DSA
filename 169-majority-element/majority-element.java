class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap <>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxFrequency = 0;

        int answer = 0;
        for(Integer key : map.keySet()) {
            if(map.get(key) > maxFrequency) {
        maxFrequency = map.get(key);
        answer = key;
        }
        }

        return answer;
        
    }
}