import java.util.*;
class sample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	String s = sc.nextLine();
        	int n = sc.nextInt();
        	String output = UserMainCode.repeatFront(s,n);
        	System.out.println(output);
	}
}
class UserMainCode {
	public static String repeatFront(String s, int n) {
        	String front;
        	if (s.length() < 3) {
            		front = s;
        	} 
		else {
            		front = s.substring(0, 3);
        	}
        	StringBuilder result = new StringBuilder();
        	for (int i = 0; i < n; i++) {
            		result.append(front);
        	}
		return result.toString();
	}
}
