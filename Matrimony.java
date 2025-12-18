import java.util.Scanner;
class Matrimony{
public static void main(String []args){
String gender1="Male",gender2="Female";
Scanner s =new Scanner(System.in);
System.out.println("Enter the gender:");
String gender=s.next();
if(gender.equals(gender1))
{
System.out.println("enter the age");
int age=s.nextInt();
if(age>=21&&age<40){
System.out.println("eligible");
}
else
{
System.out.println(" no eligible");
}
}
else
{
System.out.println("enter the age");
int age=s.nextInt();
if(age>=18&&age<35){
System.out.println("eligible");
}
else
{
System.out.println(" no eligible");
}
}
}
}
