package duotai;

public abstract class Fruit {
	public static void main(String[] args) {
		
	}
}
	class Apple extends Fruit{
		public String toString(){
			return("ƻ��");
		}
	}

	class Juicer{
		public void juice(Fruit fruit){
			System.out.println("ե"+fruit+"֭");
		}
		public static void main(String[] args) {
			Juicer j=new Juicer();
			Fruit fruit=new Apple();
			j.juice(fruit);
		}
	}
	//�������ͬһ����Ϊ���ֳ�������̬
	


