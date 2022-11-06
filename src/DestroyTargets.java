import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DestroyTargets {


    public int approach2(int[] nums, int space) {
        int i=0;
        int maxSeed = 0;
        int maxTargetHit = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        while(i<nums.length){
            int remainder = nums[i]%space;
            map.put(remainder,map.getOrDefault(remainder,0)+1);
            s.add(nums[i]);
            i++;
        }
        for (int seed : s) {
            int remainder = seed%space;
            int targetHit = map.get(remainder);
            if(targetHit>maxTargetHit){
                maxTargetHit = targetHit;
                maxSeed = seed;
            } else if(targetHit==maxTargetHit){
                maxSeed = Math.min(seed,maxSeed);
            }
        }
        return maxSeed;
    }


    public int destroyTargets(int[] nums, int space) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int targetHit = 0, maxTargets = 0,maxSeed = -1;

        int i=0;
        int seed = -1;
        while(i< nums.length){

            seed = nums[i];
            while(i< nums.length && seed==nums[i]){
                targetHit++;
                i++;
            }

            if(i >= nums.length){
                break;
            }

            int itr = seed;
            int j=i;
            while(j<nums.length){
                itr = itr+space;
                if(nums[j]==itr && nums[j]<itr){
                    targetHit++;
                    j++;
                } else if(nums[j]>itr){
                    continue;
                } else {
                    j++;
                }
            }

            if(maxTargets<targetHit){
                maxTargets = targetHit;
                maxSeed = seed;
            }
            targetHit = 0;

        }

        if(maxSeed==-1){
            return seed;
        }
        return maxSeed;
    }

    public void unitTest(){
        int[] nums = {
                625879766,
                235326233,
                250224393,
                501422042,
                683823101,
                948619719,
                680305710,
                733191937,
                182186779,
                353350082
        };
        int[] nums1 = {
                741,289,294,213,735
        };
        int space = 4;

        System.out.println(approach2(nums1,space));
    }


}
