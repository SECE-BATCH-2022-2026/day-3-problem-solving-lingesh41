import java.util.*;
public class pg4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	boolean result = UserMainCode.validateCode(input);
	System.out.println(result);
    }
}

class UserMainCode {
	public static boolean validateCode(String s) {
        	String pattern = "^[CPT]{3}-\\d{6}$";
        	return s.matches(pattern);
    	}
}
