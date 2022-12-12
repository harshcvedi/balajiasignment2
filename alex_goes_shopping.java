    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    int q=sc.nextInt();
    while(q-->0){
        int A=sc.nextInt();
        int k=sc.nextInt();
        if(ispossible(arr, A, k)==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
public static boolean ispossible(int arr[],int A ,int K){
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(A%arr[i]==0){
            count++;
        }
    }if(count>=K){
        return true;
    }else{
        return false;
    }
}
}


         


      
 


  




   




    
    
    
    
