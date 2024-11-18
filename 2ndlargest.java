class Solution {
    public int getSecondLargest(int[] a) {
        if(a.length < 2){
            return -1;
        }
        int f=a[0];
        int s=Integer.MIN_VALUE;
        int i;
        for(i=0;i<a.length;i++){
            if(a[i]>f){
                s=f;
                f=a[i];
            }
            else if(a[i]>s && a[i]!=f){
                s=a[i];
            }
        }
        if(s==Integer.MIN_VALUE) return -1;
        return s;
}
}