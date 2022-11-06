public class HIndex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int l = citations[0];
        int r = citations[n-1];
        int mid = (r-l)/2;
        while(l<r){
            if(citations[mid]==n-l){
                return (n-l)+1;
            }
            if(citations[mid]<n-l){
                l = mid+1;
            } else {
                r = mid-1;
            }
            mid = (r-l)/2;
        }
        return (n-l)+1;
    }

    public void unitTest(){
        int[] citations = {1,3,4,2,6,8};
        System.out.println(hIndex(citations));
    }
}
