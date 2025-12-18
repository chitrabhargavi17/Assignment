import java.util.Scanner;
class ThreeDimentional{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int age[][][]=new int[2][3][5];
for(int i=0;i<2;i++){
for(int j=0;j<3;j++){
for(int k=0;k<5;k++)
{
System.out.println("enter the age of student "+k+"classroom"+ j+"branch"+i);
age[i][j][k]=s.nextInt();
}
}
}
System.out.println("-------the ages are-------");
for(int i=0;i<2;i++){
for(int j=0;j<3;j++){
for(int k=0;k<5;k++)
{
System.out.println(age[i][j][k]);
}
}
}
}
}