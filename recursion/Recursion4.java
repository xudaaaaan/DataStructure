/**
 * 某路公共汽车，总共有八站，从一号站发轩时车上已有n位乘客，
 * 到了第二站先下一半乘客，再上来了六位乘客；
 * 到了第三站也先下一半乘客，再上来了五位乘客，
 * 以后每到一站都先下车上已有的一半乘客，再上来了乘客比前一站少一个，
 * 到了终点站车上还有乘客六人，问发车时车上的乘客有多少？
 * @author xudan
 *
 */
public class Recursion4 {

	public static void main(String[] args) {
		int n = 6;
		for(int i = 7; i > 0 ; i--){
			n = (n - 7 + i) * 2;
		}
		System.out.println("发车时乘客有" + n + "个。");

	}
	
	

}
