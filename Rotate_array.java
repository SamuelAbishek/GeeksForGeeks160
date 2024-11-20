    static void rotateArr(int a[], int d) {
        int len=a.length;
        reversearray(a,0,d-1);
        reversearray(a,d,len-1);
        reversearray(a,0,len-1);}
        private static void reversearray(int a[],int s,int e){
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
        }
