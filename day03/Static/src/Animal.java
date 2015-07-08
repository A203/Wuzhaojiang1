//一个类中有抽象方法，则这个类是抽象类
public abstract class Animal {
	public abstract void sleep();

}
//子类要继承父类，必须要实现父类中的所有抽象方法；否则子类也是抽象的
class Tiger extends Animal{

	public void sleep() {
		System.out.println("趴着睡");
		
	}
	}
