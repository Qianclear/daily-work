package homework;

import java.util.Scanner;

public class AreOfCricle {
	
	public static void main(String[] args) {
		double PI = 3.14;
		System.out.print("请输入圆半径：");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.println("输入后的圆半径：" + r + "面积为" + PI * r * r);
		sc.close();
	}

}
