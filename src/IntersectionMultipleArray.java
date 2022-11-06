import java.sql.SQLOutput;
import java.util.*;

public class IntersectionMultipleArray {

    public List<Integer> approach3(int[][] nums){
        List<Integer> solution = new ArrayList<>();
        int[] map = new int[10];
        for (int[] i : nums) {
            for (int j: i) {
                map[j] += 1;
                if(map[j]==nums.length){
                    solution.add(j);
                }
            }
        }
        return solution;
    }

    public List<Integer> approach2(int[][] nums){
        List<Integer> solution = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int[] i : nums) {
            for (int j: i) {
                map.put(j,map.getOrDefault(j,0) +1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue()==nums.length){
                solution.add(e.getKey());
            }
        }
        Collections.sort(solution);
        return solution;
    }


    public List<Integer> intersection(int[][] nums) {
        List<Integer> l = new ArrayList<Integer>();
        if(nums.length<=1){
            for(int[] i : nums){
                for(int j: nums[0]){
                    l.add(j);
                }
            }
            Collections.sort(l);
            return l;
        }
        for (int i = 0; i < nums[0].length; i++) {
            boolean flag = false;
            for (int j = 1; j < nums.length; j++) {
                if (!contains(nums[j], nums[0][i])) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag) {
                l.add(nums[0][i]);
            }
        }
        Collections.sort(l);
        return l;
    }

    public boolean contains(int[] num, int i) {
        for (int k : num) {
            if (k == i) {
                return true;
            }
        }
        return false;
    }

    public void unitTest(){
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> intersection = approach3(nums);
        for (int i = 0; i <intersection.size(); i++) {
            System.out.println(intersection.get(i));
        }
    }

}
