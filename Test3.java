class Login{
private String username;
private String passward;
void setPassward(String passward){
if(passward.length()>=8){
this.passward=passward;
System.out.println("validation");
}
else{
System.out.println("invalidation");
}
}
void setUsername(String username){
this.username=username;
}
String getUsername(){
return username;
}
String getPassward(){
return passward;
}
}
class Test3{
public static void main(String []args){
Login l=new Login();
l.setPassward("1234yjhkkj5678");
System.out.println(l.getUsername());
System.out.println(l.getPassward());
}
}

