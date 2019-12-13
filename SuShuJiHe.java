package homework;
import java.util.ArrayList;
import java.util.List;
public class SuShuJiHe {
	public static void main(String[] args) {
		List<Integer> pns = new ArrayList<>();
		for (int i = 0;i<=10000; i ++ ) {
			if (isPrimeNumber(i)) {
				pns.add(i);
			}
		}
		System.out.println("0-10000的素数一共有" + pns.size() + "个");
		for(int i = 0;i< pns.size();i++) {
			if (i%10==9) {
				System.out.println(String.format("%7s", pns.get(i))
						+String.format("%7s", "第" + (i / 10 + 1) + "行" ));
			}else {
				System.out.print(String.format("%7s",pns.get(i)));
			}
		}
	}
	static boolean isPrimeNumber(int num) {
		if (num<2) {
			return false;
		}
		int c =0;
		boolean result =true;
		for (int i = 1;i<=num; i++) {
			if (num%i==0) {
				c++;
			}
			if (c>2) {
				result = false;
				break;
			}
		}
		return result;
	}

}
