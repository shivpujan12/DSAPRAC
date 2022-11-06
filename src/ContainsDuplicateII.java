public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0,j=1;
        while(i<nums.length){
            while(j<nums.length && (j-i)<=k){
                if(nums[i]==nums[j]){
                    return true;
                }
                j++;
            }
            i++;
            j=i+1;
        }
        return false;
    }

    public void unitTest(){
        int[] nums = {1,2,3,1,2,3};
        int k=0;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
