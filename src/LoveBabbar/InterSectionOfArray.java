package LoveBabbar;

import java.util.HashMap;

public class InterSectionOfArray {

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {

        // Your code here

        // Set<Integer> s1 = new HashSet<Integer>();
        // Set<Integer> s2 = new HashSet<Integer>();

        // for(int num: a){
        //     s1.add(num);
        // }
        // for(int num: b){
        //     s2.add(num);
        // }
        // s1.retainAll(s2);
        // return s1.size();

        //Approach2
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int j=0;j<m;j++){
            if(map.getOrDefault(b[j],0)+1>1){
                count++;
                map.remove(b[j]);
            }
        }
        return count;


    }
    public void unitTest(){
        int[] a = {1,2,2,3,4};
        int[] b = {4,1,1,2,6,6};
        System.out.println(NumberofElementsInIntersection(a,b,a.length,b.length));
    }
}
