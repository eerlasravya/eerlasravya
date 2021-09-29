public class Main{
public static void main(String[] args){
int sum=2;
int n1=1;
int n2=2;
while (n1 < 4000000)
{
int n3= n1;
n1=n2;
n2=n1+n2;
if (n2%2 == 0) 
{
sum=sum+n2;
}
}
System.out.println(sum);
}
}
