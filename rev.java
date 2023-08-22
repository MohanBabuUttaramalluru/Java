class rev {
public static void main(String args[]){
int num=123,digit,rev=0;
while(num!=0){
digit=num%10;
rev=rev*10+digit;
num=num/10;
}
System.out.print(rev);
}
}
