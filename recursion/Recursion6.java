/**
 * 小华读书。
 * 第一天读了全书的一半加二页，
 * 第二天读了剩下的一半加二页，以后天天如此...,
 * 第六天读完了最后的三页,
 * 问全书有多少页？
 * @author xudan
 *
 */
public class Recursion6 {

	public static void main(String[] args) {
		System.out.println("全书共有" + reserve(1) + "页。");
		
		//验证：
		for(int i = 1; i <= 6 ; i++){
			int read = reserve(i) / 2 + 2;
			System.out.println("第" + i + "天共有" + reserve(i) + "页，读了" + read + "页");
		}

	}
	
	public static int reserve(int i){
		if(i == 6)
			return 3;
		else
			return (reserve(i + 1) + 2) * 2;
	}

}
