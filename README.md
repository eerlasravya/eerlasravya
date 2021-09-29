public class Main{
public static void main(String[] args){
int sum = 2;
int a = 1;
int b = 2;
//System.out.println(a + "\n" + b);

while (a < 4000000) {
int c = a;
a = b;
b = c + b;
if (b % 2 == 0) {
sum += b;
}
//System.out.println(b);
}

System.out.println(sum);

