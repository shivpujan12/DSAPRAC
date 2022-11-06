public class SquareRoot {

    int binarySearch(int l, int r, int x)
    {
        int mid = 0;
        if (r >= l) {
            mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (mid*mid == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (mid*mid > x)
                return binarySearch(l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch( mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return mid;
    }

//    public int mySqrt(int x) {
//        int low = 2;
//        int high = x;
//        int mid = (high+low)/2;
//        int itr = 1;
//        while (true) {
//
//            mid = (high+low)/2;
//        }
//        return 0;
//    }

    public void unitTest() {
        System.out.println(binarySearch(2,89,90));
    }

}
