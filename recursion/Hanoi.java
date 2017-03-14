//经典汉诺塔问题
import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		System.out.println("Please enter the number of plates:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		hanoi(n,1,2,3);
		in.close();
	}
	
	//将第n个盘子从第from根针移到第to根针
	public static void move(int n, int from, int to){
		System.out.println("move the " + n + "th plate from " + from + " to " + to);
	}
	
	//将m个盘子从第from根针移到第to根针
	public static void hanoi(int m, int from, int mediate, int to){
		if(m == 1){
			move(1,from,to);
		}else{
			hanoi(m-1,from,to,mediate);
			move(m,from,to);
			hanoi(m-1,mediate,from,to);
		}
	}

}
