/*
 * 出售金鱼问题：
 * 第一次卖出全部金鱼的一半加二分之一条金鱼；
 * 第二次卖出乘余金鱼的三分之一加三分之一条金鱼；
 * 第三次卖出剩余金鱼的四分之一加四分之一条金鱼；
 * 第四次卖出剩余金鱼的五分之一加五分之一条金鱼；
 * 现在还剩下11条金鱼，在出售金鱼时不能把金鱼切开或者有任何破损的。
 * 问这鱼缸里原有多少条金鱼？
 */
public class Recursion3 {

	public static void main(String[] args) {
		int[] fish = new int[6];
		fish[5] = 11;
		for(int i = 4;i > 0; i--){
			fish[i] = (fish[i + 1] * (i + 1) + 1) /i;
		}
		System.out.println("原有" + fish[1] + "条金鱼。");
	}
	
	
}

/*
 * int x = 1, n = 1;
		for(;;n++){
			if(f(x,n)) break;
		}
		System.out.println("鱼缸里原有" + n + "条金鱼。");
		//第x次卖出之前还剩n条鱼
	public static boolean f(int x, int n){
		if(x == 5 && n == 11){
			return true;
		}
		else if((n + 1) % (x + 1) == 0){
			x++;
			n = n - ( n / x + 1 / x);
			f(x,n);
			return false;
		}else 
			return false;
	}
*/
