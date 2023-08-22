class leap{
public static void main(String args[]){
int n=2023;
if (n%4==0 && n%400==0 && n%100==0)
{
 System.out.print("it is leap year");
}
else{
System.out.print(+n"it is not leap");
}
}
}