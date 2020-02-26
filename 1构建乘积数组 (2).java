class Solution {
    public int[] constructArr(int[] a) {
        if(a.length==0) return a;
        int[] left=new int [a.length];
        int[] right=new int [a.length];
        left[0]=a[0];
        right[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){
            left[i]=left[i-1]*a[i];
            right[a.length-i-1] = right[a.length-i]*a[a.length-i-1];
        }
        right[0] = right[1];
        for(int i=1;i<a.length-1;i++){
        	right[i] = left[i-1]*right[i+1];
        }
        right[a.length-1] = left[a.length-2];
        return right;
    }
}