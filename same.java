class A
{
static void m1(){
System.out.println("print A");
}
void m2()
{
System.out.println("print B");
}
}
class B
{
static void m1(){
System.out.println("print c");
}
void m2(){
System.out.println("print d");
}
}
class D{
static void m1(){
System.out.println("print e");
}
 void m2(){
System.out.println("print f");
}
public static void main(String[] args)
{
System.out.println("print g");
A.m1();
B.m1();
m1();
A a1=new A();
a1.m2();
B b2=new B();
b2.m2();
D d2=new D();
d2.m2();
}}