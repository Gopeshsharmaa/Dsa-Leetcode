class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }

        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                ArrayList<Integer> index=map.get(x);
                if(x!=nums[i]){
                    return(new int[]{i,index.get(0)});
                }
                if(x==nums[i] && index.size()>=2){
                    return(new int[]{index.get(0),index.get(1)});
                }
            }
        }
        return(new int[]{-1,-1});
    }
}