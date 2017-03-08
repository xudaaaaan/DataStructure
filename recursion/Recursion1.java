/**
 * 运动会开了N天，一共发出金牌M枚。
 * 第一天发金牌1枚加剩下的七分之一枚，
 * 第二天发金牌2枚加剩下的七分之一枚，
 * 第3天发金牌3枚加剩下的七分之一枚，
 * 以后每天都照此办理。到了第N天刚好还有金牌N枚，到此金牌全部发完。编程求N和M。
 * @author xudan
 *
 */

public class Recursion1 {
	public static void main(String[] args) {
		int N,M;
		for(int i = 1;; i++){
			N = i;
			M = i;
			if(medal(N,M)) {
				break;
			}
		}
		for(int i = 5; i > 0; i--){
			M = M * 7 / 6 + i;
		}
		
		System.out.println("N = " + N + " M = " + M);
		
	}
	
	public static boolean medal(int n, int m){
	//若第n天开始时，还剩m块金牌
		if(m % 6 == 0){
			if(n == 1){
				return true;
			}
			else{
				n--;
				m = m/6*7 + n;
				medal(n,m);
				return true;
			}
		}
		else return false;
	}
}
