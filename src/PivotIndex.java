public class PivotIndex {

    public int approach2(int[] nums){
        int rightSum = sum(nums,0,nums.length-1);
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if(leftSum==rightSum){
                return i;
            } else {
                leftSum += nums[i];
            }
        }
        return -1;
    }


    public int pivotIndex(int[] nums) {
        int sum1 = 0,sum2 = 0;
        int i=0,j=nums.length-1;
        if(sum(nums,1,nums.length-1) == 0){
            return 0;
        }
        if(sum(nums,0,nums.length-2)==0){
            return 0;
        }
        while(i<j){
            while(i<j && sum1<sum2){
                System.out.println("j: "+j + " i: " + i);
                sum1 += nums[i];
                i++;
            }
            while(i<j && sum2<sum1){
                sum2 += nums[j];
                j--;
            }
            if(sum1 == sum2){
                if(i==j){
                    return i;
                }
                else {
                    sum1 += nums[i];
                    i++;
                }
            }
        }
        return -1;
    }

    private int sum(int[] nums, int from, int to) {
        int total = 0;
        for (int i = from; i <= to; i++) {
            total += nums[i];
        }
        return total;
    }

    public void unitTest(){
        int[] nums = {-1,-1,0,1,1,0};
        int[] nums2 = {2,1,-1};
        System.out.println(approach2(nums));
    }
}
