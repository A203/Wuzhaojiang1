
public class Demo01 {
int age;
void hello(){
	System.out.println("hello.....");
}
static String name="Lisa";
static void hi(){
	System.out.println("hi....");
}
public static void main(String[] args){
	Demo01 d= new Demo01();
	System.out.println(Demo01.name);
	Demo01.hi();
}

}

