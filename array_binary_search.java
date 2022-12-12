 public static void main(String args[]) {
        Scanner w=new Scanner(System.in);
       int n=w.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=w.nextInt();
       }
       int t=w.nextInt();
       int s=0;
       int e=n-1;
       int mid;
       while(s<=e)
       {
            mid=s+(e-s)/2;
           if(a[mid]==t)
           {
               System.out.print(mid);break;
           }
           else if(a[mid]<t)
           {
               s=mid+1;
           }
           else{
               e=mid-1;
           }
       }
       if(s>e){
           System.out.print(-1);
       }

       
    }
}

