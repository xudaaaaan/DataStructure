/**
 * 猴子吃桃。有一群猴子摘来了一批桃子，
 * 猴王规定每天只准吃一半加一只（即第二天吃剩下的一半加一只，以此类推），
 * 第九天正好吃完，问猴子们摘来了多少桃子？
 * @author xudan
 *
 */
public class Recursion5 {

	public static void main(String[] args) {
		int i = 9, n = 0;
		for(;i > 0;i--){
			n = (n + 1) * 2;
		}
		System.out.println("一共摘了" + n + "个桃子");

	}

}
