//蒙特卡洛方法计算圆周率近似值(撒豆子)

package packEx;

import java.util.Scanner;

public class MonteCarloMethod {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println( "蒙特卡洛方法计算圆周率近似值(撒豆子)" );
		while(true) {
			System.out.println( "输入次数:" );
			try {
				num = scan.nextInt();
				if ( num>0 )
					System.out.println( "近似值为:" + MonteCarlo(num) );
				else
					System.out.println( "请输入一个正整数!" );
			}
			catch( Exception e ) {
				e.printStackTrace();
			}
			System.out.println();
		}
	}
	
	public static double MonteCarlo( int num ) throws Exception {
		double x,y;		
		int count = 0;
		int n = 0;
		while( n<num ) {
			x = Math.random();
			y = Math.random();
			if( x*x+y*y<=1 )	//
				++n;
			++count;
		}
		return 4*(double)num/(double)count;
	}
	
}
