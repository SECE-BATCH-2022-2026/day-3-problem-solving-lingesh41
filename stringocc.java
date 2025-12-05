import java.util.*;
class Strocc{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int cout=UserCode.countocc(s1,s2);
		System.out.print(cout);
	}
}
class UserCode{
	public static int countocc(String s1,String s2){
		int count = 0;
		for (int i = 0; i <= s1.length() - s2.length();) {
			if (s1.substring(i, i + s2.length()).equals(s2)) {
				count++;
				i = i + s2.length();  
			} 
			else {
				i++;  
			}
		}
		return count;
	}
}
