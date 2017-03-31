/**
 * 古时丧葬活动中经常请高僧做法事。仪式结束后，有时会有“高僧斗法”的趣味节目，以舒缓压抑的气氛。
节目大略步骤为：先用粮食（一般是稻米）在地上“画”出若干级台阶（表示N级浮屠）。又有若干小和尚随机地“站”在某个台阶上。最高一级台阶必须站.
两位参加游戏的法师分别指挥某个小和尚向上走任意多级的台阶，但会被站在高级台阶上的小和尚阻挡，不能越过。两个小和尚也不能站在同一台阶，也不能向低级台阶移动。
两法师轮流发出指令，最后所有小和尚必然会都挤在高段台阶，再也不能向上移动。轮到哪个法师指挥时无法继续移动，则游戏结束，该法师认输.
对于已知的台阶数和小和尚的分布位置，请你计算先发指令的法师该如何决策才能保证胜出。
输入数据为一行用空格分开的N个整数，表示小和尚的位置。台阶序号从1算起，所以最后一个小和尚的位置即是台阶的总数。（N<100, 台阶总数<1000）
输出为一行用空格分开的两个整数: A B, 表示把A位置的小和尚移动到B位置。若有多个解，输出A值较小的解，若无解则输出-1。
 * @author xudan
 *
 */
import java.util.Scanner;
public class 高僧斗法 {
	//普通博弈问题解法
	public static boolean f(int[] x){
		for(int i = 0; i < x.length - 1; i++){
			for(int k = x[i] + 1; k < x[i + 1]; k++ ){
				int old = x[i];//保存现场
				x[i] = k;
				try{
					if(f(x) == false){
						//System.out.println(old + " " + k);
						//不能在这里输出，因为会输出递归过程中所有f(x)=false的情况
						return true;
					}
				}
				finally{
					x[i] = old;//回溯，返回走这一步之前的局面
				}	
			}
		}
		return false;
	}
	//Nim方法
	public static boolean g(int[] x){
		int num = x.length/2;//一共可以分多少组
		String[] y = new String[num];//y用来存放尼姆堆，在这个问题中两个一组即可构造出尼姆游戏的局面
		int m = 0;//记录二进制数的最大位宽
		for(int i = 0; i < num; i++){
			y[i] = Integer.toBinaryString(x[2 * i + 1] - x[2 * i] - 1);
			m = (m < y[i].length())? y[i].length():m;
		}
		for(int i = 0; i < m; i++){
			boolean flag = true;
			for(int j = 0; j < num; j++){
				int k = y[j].length() - (m - i);//判断关注二进制位是否为0
				if(k >= 0 && y[i].charAt(k) == '1'){
					flag = !flag;
				}
			}
			if(flag == false) return true;//如果轮到该玩家时，这个局面是非平衡局面，则一定能胜
		}
		return false;//否则return false
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] ss = input.nextLine().split(" ");
		int[] x = new int[ss.length];
		for(int i = 0; i < ss.length; i++){
			x[i] = Integer.parseInt(ss[i]);//将字符串转化为整数
		}
		/*
		普通博弈论方法
		for(int i = 0; i < x.length - 1; i++){
			for(int k = x[i] + 1; k < x[i + 1]; k++ ){
				int old = x[i];
				x[i] = k;
				try{
					if(f(x) == false){
						System.out.println(old + " " + k);
					}
				}
				finally{
					x[i] = old;
				}	
			}
		}*/
		
		//Nim方法
		int num = x.length/2;//一共可以分多少组
		String[] y = new String[num];//y用来存放尼姆堆，在这个问题中两个一组即可构造出尼姆游戏的局面
		int m = 0;//记录二进制数的最大位宽
		for(int i = 0; i < num; i++){
			y[i] = Integer.toBinaryString(x[2 * i + 1] - x[2 * i] - 1);
			m = (m < y[i].length())? y[i].length():m;
		}
		for(int i = 0; i < m; i++){
			boolean flag = true;
			for(int j = 0; j < num; j++){
				int k = y[j].length() - (m - i);//判断关注二进制位是否为0
				if(k >= 0 && y[i].charAt(k) == '1'){
					flag = !flag;
				}
			}
			if(flag == false) {
				System.out.println();//如果轮到该玩家时，这个局面是非平衡局面，则一定能胜
			}
		}
	
		 System.out.println(g(x));
		
		input.close();

	}

}
