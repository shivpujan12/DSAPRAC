import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GoodPairs {

    public int approach2(int[] nums){
        Arrays.sort(nums);
        int i =0,j=0,goodPairs=0;
        while(i<nums.length){
            int count=0;
            while(j<nums.length && nums[i]==nums[j]){
                count++;
                j++;
            }
            goodPairs += count*(count-1) / 2;
            i=j;
        }
        return goodPairs;
    }


    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                Integer inc = map.get(num);
                map.put(num, ++inc);
            }
        }

        int goodPairs = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int v = e.getValue();
            int combination = v * (v - 1) / 2;
            goodPairs += combination;
        }

        return goodPairs;

    }

    public void unitTest() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(approach2(nums));
    }

}
