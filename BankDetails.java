class Methods{
double amount;
Methods(double amount){
this.amount=amount;
}
double withDraw(double x){
if(amount>=x)
{
amount=amount-x;
System.out.println("with draw successfull");
}
else{
System.out.println("insufficint balance");
}
return amount;
}
double deposit(double y){
amount =amount+y;
return amount;
}
}
class BankDetails{
public static void main(String [] args){
Methods m=new Methods(1000);
System.out.println("Total balance after withdraw:"+m.withDraw(300));
System.out.println("Total balance:"+m.deposit(300));
}
}
