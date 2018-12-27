package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		String reversStr=(new StringBuffer(str).reverse().toString()); //문자거꾸로함
		char[] c=new char[reversStr.length()]; //char형 선언해준다 ->거꾸로 바꾼 문자수의 길이만큼
		for(int i=0;i<str.length();i++)
		{
			c[i]=reversStr.charAt(i); //char형식에 글자하나씩 넣어준다
		}
		return c; //c 전체를 반환
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
