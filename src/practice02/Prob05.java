package practice02;
import java.util.Random;
import java.util.Scanner;

public class Prob05 {


	public static void main(String[] args) {
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		Scanner scanner=new Scanner(System.in);
		int num,maxNum=100,minNum=1,cnt=10000;
		boolean isControl=true;
		System.out.println("수를 결정하였습니다. 맞춰보세요");
		System.out.println("1-100");
		System.out.print("1>>");
		num=scanner.nextInt();
		while(isControl) {
			for(int i=2;i<cnt;i++) {
				if(k>num) {
					minNum=num;
					System.out.println("더높게");
					System.out.println(num+"-"+maxNum);
					System.out.print(i+">>");
					num=scanner.nextInt();
				}
				else if(k<num) {
					maxNum=num;
					System.out.println("더낮게");
					System.out.println(minNum+"-"+num);
					System.out.print(i+">>");
					num=scanner.nextInt();
				}
				else if(k==num) {
					System.out.println("맞았습니다.");
					System.out.print("다시 하시겠습니까(y/n)>>");
					String answer = scanner.next();
					if( answer.equals("y")){
						cnt=0;
						isControl=false;
					}
					else
					{	cnt=0;
						isControl=false;
					}
				}
				}
			}
			
		
		}
	}

