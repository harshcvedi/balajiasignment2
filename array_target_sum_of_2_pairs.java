 public static void main(String args[]) {
    Scanner sc =new Scanner(System.in);
       int N=sc.nextInt();
       int arr[]=new int[N];
       for(int i=0;i<N;i++){
           arr[i]=sc.nextInt();
       }
       int target=sc.nextInt();
        for(int i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
            if(arr[i]+arr[j]==target){
                if(arr[j]>arr[i]){
                    System.out.println(arr[i]+" "+"and"+" "+arr[j]);
                }else{
                    System.out.println(arr[j]+" "+"and"+" "+arr[i]);
                }
               
                }
            }
        }
    }
}
