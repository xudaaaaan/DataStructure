/**
 * 在8×8格的国际象棋上摆放八个皇后，使其不能互相攻击，
 * 即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
 * @author xudan
 *
 */

public class eightQueens {
	static int[] a = new int[9];
	static int n = 8,i,t = 1;
	public static void main(String[] args) {
		search(1);
	}
	
	public static void search(int i){
		int j,k;
		for(j = 1; j <= 8; j++){
			a[i] = j;
			if(check(a,i)){
				if(i < n){
					search(i + 1);
				}else{
					System.out.print("the " + t++ + "th method: \n");
					for(k = 1;k <= n ; k ++){
						System.out.print(a[k] + "  ");
					}
					System.out.println();
				}
			}
		}
		
	}
	
	//判断第n行第皇后是否和前面几行的有冲突
	public static boolean check(int[] a, int n){
		for(int i = 1; i < n ; i++){
			if(Math.abs(a[i]-a[n]) == Math.abs(i-n) || a[i]==a[n])
				return false;
		}
		return true;
	}

}
