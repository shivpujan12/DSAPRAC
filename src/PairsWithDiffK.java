import java.util.HashMap;

public class PairsWithDiffK {

    public int approach2(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(num - k)) {
                count += map.get(num - k);
            }
            if (map.containsKey(num + k)) {
                count += map.get(num + k);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }


    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        return count;
    }

    public void unitTest(){
        int[] nums = {1,2,2,1};
        System.out.println(approach2(nums,1));
    }
}
