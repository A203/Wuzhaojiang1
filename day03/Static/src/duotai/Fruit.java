package duotai;

public abstract class Fruit {
	public static void main(String[] args) {
		
	}
}
	class Apple extends Fruit{
		public String toString(){
			return("苹果");
		}
	}

	class Juicer{
		public void juice(Fruit fruit){
			System.out.println("榨"+fruit+"汁");
		}
		public static void main(String[] args) {
			Juicer j=new Juicer();
			Fruit fruit=new Apple();
			j.juice(fruit);
		}
	}
	//子类对于同一种行为表现出多种形态
	


