    public static void main(String args[]) {
         Scanner sc =new Scanner(System.in);
    int T=sc.nextInt();
    while(T-->0){
        int N =sc.nextInt();
    int arr[]=new int[N];
    for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int m=sc.nextInt();
    int p1=0;
    int p2=0;
    int diff=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==m){
                if((arr[j]-arr[i])<diff){
                    diff=arr[j]-arr[i];
                    p1=arr[i];
                    p2=arr[j];
}
}
        }
    }System.out.println("Deepak should buy roses whose prices are "+p1+" "+"and"+" "+p2+".");
}
    }
    }
