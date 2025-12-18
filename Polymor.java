class Animal{
void makeSound(){
System.out.println("meaw meaw");
}
}
class Dog extends Animal{
void makeSound(){
super.makeSound();
System.out.println("bow bow");
}
}
class Polymor{
public static void main(String []args){
Dog d=new Dog();
d.makeSound();
}
}