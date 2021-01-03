package work8;

//11.17
import java.util.Scanner;
import java.util.ArrayList;
public class PerfectSquare {

	public static void main(String[] args) {
		
		//create Scanner
		Scanner input = new Scanner(System.in);
		//create a ArrayList
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		
		int m = input.nextInt();
		//求最小因子并存入artist�?
		int flag = 2;
		while (m != 1) {
			if (m % flag == 0) {
				arlist.add(flag);
				m /= flag;
			} else
				flag++;
		}
		int sum[] = new int[101];
		for(int i = 0; i < arlist.size(); i++) 
			sum[i] = 0;
		for(int i = 0; i < arlist.size(); i++) {
			sum[arlist.get(i)] += 1;
		}
		int ans = 1;
		for(int i = 0; i <= max(arlist); i++) {
			if(sum[i] % 2 != 0)
				ans *= i;
		}
		System.out.println(ans);
		
	}
	public static Integer max(ArrayList<Integer> list){
        if (list.size() == 0 || list == null)
            return 0;
        int ret = list.get(0);
        for (int i = 1;i < list.size();++i)
            if (list.get(i) > ret)
                ret = list.get(i);
        return ret;
    }

}
