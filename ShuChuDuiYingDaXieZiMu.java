package homework;
import java.util.Scanner;


public class ShuChuDuiYingDaXieZiMu {
	public static void main(String[] args) {
		System.out.println("请输入一串小写字母：");
		Scanner sc = new Scanner(System.in);
		String lower = sc.next();
		String upper = "";
		for (int i = 0;i<lower.length();i++) {
			char l = lower.charAt(i);
			char u = (char)((char)l-32);
			upper += u;
		}
		System.out.println("对应的大写字母字符串为：" + upper);
		sc.close();
	}

}
