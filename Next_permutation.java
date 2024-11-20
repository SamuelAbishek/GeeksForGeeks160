class Solution {
    static void reverse(int a[],int s,int e){
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
    }
    void nextPermutation(int[] a) {
        // code here
        int l=a.length;
        int pi=-1;
        for(int i=l-2;i>=0;i--){
            if(a[i]<a[i+1]){
                pi=i;
                break;
            }
        }
        if(pi==-1){
            reverse(a,0,l-1);
            return;
        }
        
        for(int i=l-1;i>=pi;i--){
            if(a[i]>a[pi]){
                int t=a[i];
                a[i]=a[pi];
                a[pi]=t;
                break;
            }
        }
        
        reverse(a,pi+1,l-1);
        
        
    }
}
