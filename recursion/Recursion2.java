/*
 * 国王分财产。某国王临终前给儿子们分财产。
 * 他把财产分为若干份，然后给第一个儿子一份，再加上剩余财产的1/10；
 * 给第二个儿子两份，再加上剩余财产的1/10；...；
 * 给第i个儿子i份，再加上剩余财产的1/10。
 * 每个儿子都窃窃自喜,以为得到了父王的偏爱，孰不知国王是“一碗水端平”的。
 * 请用程序回答，老国王共有几个儿子？财产共分成了多少份？
 */

public class Recursion2 {

	public static void main(String[] args) {
		int i = 1, n = 2;
		for(;; n++){
			if(isJust(i,n)) break;
		}
		int m = (n - 1) * 10 + 1;
		i = m / n;
		System.out.println("一共" + i + "个儿子，财产共分成" + m + "份。");
	}
	
	//若第i个儿子获得n份，判断第i+1个儿子获得的财产是否与其相等。
	public static boolean isJust(int i, int n){
		int reserve = (n - i) * 9;
		if (reserve == 0)
			return true;
		else{
		if((reserve - (i + 1)) % 10 == 0){
			if( n == (i + 1 + (reserve - (i + 1)) / 10)){
				i++;
				isJust(i,n);
				return true;
			}else return false;
		}else return false;
	}}

}
