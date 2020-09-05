package ch5;

public class fd {

	public static void main(String[] args) {
//		int [][]a= {{1,2},{2},{1,3,4}};
//	//for (int []i:a)
//		for(int i=0;i<a.length;i++)
//		System.out.print(a[i].length);
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
		double[] sum1 = { 0.0, 0.0, 0.0 };
		double sum2 = 0.0;
		int i = 0;
	    int y = 0;
	    for (double[] s1 : interests) {
	        for (double s2 : s1) {
	            sum1[i] += s2;
	        }            
	        y++;
	        System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", y, sum1[i]/4);
	        sum2 += sum1[i]/4;
	        i++;
	    }
	    System.out.printf("3년간 평균 이자율 = %.2f%%\n", sum2/3);
	}
}