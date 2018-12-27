package practice02;
import java.util.Scanner;
public class Prob01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int cash,num=0,result=0;
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		System.out.print("금액 : ");
		cash=scanner.nextInt();
		for(int i=0;i<MONEYS.length;i++) {
			num=MONEYS[i];
			result=cash/num;
			cash=cash%num;
			
			System.out.println(MONEYS[i]+"원 :"+result+"개");
		}
	}

}
