
public class Demo01 {
	public static void main(String[] args){
		Person person = new Person();
		
	}

}
class Person{
	String name;
	int age;
	String address;
	public Person(){}
	public Person(String name,int age ){
		this.name=name;
		this.age=age;
	}
	public Person(String name,int age,String address){
		this(name,age);
		this.address=address;
	}
	void hello(){
		System.out.println("hello...");
	}
	void introduce(){
		System.out.println("name:"+this.name+this.age+this.address);
		hello();
		
	}
	
	
}
