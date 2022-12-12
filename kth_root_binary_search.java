    public static void main(String args[]) {
        // Your Code Here
          Scanner sc =new Scanner(System.in);
    long t =sc.nextLong();
    while(t-->0){
    long n=sc.nextLong();
    long k=sc.nextLong();
    long start=1;
    long end=n;
    long ans=0;
    while(start<=end){
        long mid=start+(end-start)/2;
        if(Math.pow(mid, k)<=n){
            ans=mid;
            start=mid+1;
        }else{
            end=mid-1;
        }
    }System.out.println(ans);

 
}
    }
}
