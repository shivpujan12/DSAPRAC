import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayOfOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i],nums[i]);
        }
        Object[] targetObj = targetList.toArray();
        int[] target = new int[targetObj.length];
        for (int i = 0; i < targetObj.length; i++) {
            target[i] = (Integer) targetObj[i];
        }
        return target;
    }

    public void unitTest(){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] targetArray = createTargetArray(nums, index);
        System.out.println(Arrays.toString(targetArray));
    }

}
