class Solution {
    public void reverseArray(int a[]) {
        int len=a.length;
        int s=0;
        int e=len-1;
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
        //for(int j=0;j<len;j++){
           // System.out.print(a[j]+" ");
        //}
        }
    }
