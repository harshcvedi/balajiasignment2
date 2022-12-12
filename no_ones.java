Scanner sc =new Scanner(System.in);
int n=sc.nextInt();
String s =sc.next();
int c=0,i=0,c1=0;
for(int k=0;k<=n-2;k++){
  if(s.charAt(k)!=s.charAt(k+1))
    c1++;
}
if(s.charAt(n-1)=='1')
  c1++;
System.out.print(c1+" ");
while(i<=n-2){
  if(s.charAt(i)!=s.charAt(i+1)){
    c++;
    System.out.print(i+1+" ");
  }
      i++;
}
if(s.charAt(n-1)=='1'){
  c++;
  System.out.println(n+" ");
}
}
    
