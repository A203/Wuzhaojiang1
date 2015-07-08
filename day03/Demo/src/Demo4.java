import java.util.Scanner;
public class Demo4 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("«Î ‰»Î––∫≈£∫");
		int num=input.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println( );
		}
		
	}

}
