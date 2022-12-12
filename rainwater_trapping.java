 public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int T=sc.nextInt();
        while(T-->0){
        int N =sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
        }
 
        
       

        
        int left[]=new int[arr.length];//left product
        left[0]=arr[0];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1], arr[i]);
        }
        int right[]=new int[arr.length];//right product
        right[arr.length-1]=arr[arr.length-1];
        for(int i=right.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1], arr[i]);
        }


        
        int trappedwater=0;
        for(int i=0;i<arr.length ;i++){
           trappedwater= trappedwater+Math.min(right[i], left[i])-arr[i];
        }System.out.println(trappedwater);
        }
    }
}
