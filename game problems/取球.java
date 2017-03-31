/**
 * 一个盒子装n个球，甲乙轮流取球，可取的个数为1，3，4，7.取到最后一个输。
 * 甲先取球，用户输入n，甲是否能赢？
 * @author xudan
 *
 */
import java.util.Scanner;
public class 取球 {
	public static boolean f(int n){
		if(n > 1 && f(n - 1) == false)
			return true;
		if(n > 3 && f(n - 3) == false)
			return true;
		if(n > 4 && f(n - 4) == false)
			return true;
		if(n > 7 && f(n - 7) == false)
			return true;
		return false;
			
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		System.out.println(f(n));

	}

}
