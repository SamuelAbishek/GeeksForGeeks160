class Solution {
    void pushZerosToEnd(int[] a) {
        // code here
        int  len = a.length;
        int i,c=0;
        for(i=0;i<len;i++){
            if(a[i]!=0){
                int temp=a[c];
                a[c]=a[i];
                a[i]=temp;
                c++;
                
            }
        }
        
    }
}
