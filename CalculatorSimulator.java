import java.util.Scanner;
 class TaxNotEligibleException extends Exception{
}
class CountryNotValidException extends Exception{
}
class EmployeeNameInvalidException extends Exception{
}

class TaxCalculator{
String empName;
boolean isIndian=false;
double empSal;
Scanner s=new Scanner(System.in);
void isEmployee()throws CountryNotValidException
{
System.out.println("enter the country:");
String country=s.next();
if(country.equals("Indian")){
isIndian=true;
}
else{
 CountryNotValidException c=new  CountryNotValidException();
System.out.println("The employee should be a Indian citizen for calculating tax");
throw c;
}
}
void employee()throws EmployeeNameInvalidException
{
System.out.println("enter the employee name:");
empName=s.next();
if(empName.length()!=0){
System.out.println("employee name is not null");
}
else{
EmployeeNameInvalidException e=new EmployeeNameInvalidException();
System.out.println("The employee namecannot be empty:");
throw e;
}
}
void isEligible()throws TaxNotEligibleException
{
double taxAmount;
System.out.println("enter the salary:");
empSal=s.nextDouble();
switch((int)empSal){
case-1:if(empSal>100000 && isIndian){
             taxAmount=empSal*8/100;
        System.out.println("the tax amount:"+taxAmount);
        }
break;
case-2:if((empSal >= 100000 || empSal <= 50000) && isIndian){
             taxAmount=empSal*6/100;
        System.out.println("the tax amount:"+taxAmount);
        }
break;
case-3:if((empSal<=30000||empSal>=50000) && isIndian){
             taxAmount=empSal*5/100;
        System.out.println("the tax amount:"+taxAmount);
        }
break;
case-4:if((empSal<=10000||empSal>=30000)&& isIndian){
             taxAmount=empSal*4/100;
        System.out.println("the tax amount:"+taxAmount);
      }
break;
default:TaxNotEligibleException t=new TaxNotEligibleException();
       System.out.println("the employee doesn't need to pay tax");
      throw t;
}
}

void calculateTax(){
try{
isEmployee();
employee();
isEligible();
}
catch(Exception b){
b.printStackTrace();
}
}
}
class CalculatorSimulator{
public static void main(String []args){
TaxCalculator r=new TaxCalculator();
r.calculateTax();
}
}
