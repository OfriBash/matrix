package matrix;
import java.util.Scanner;
public class mat_2{
	public static Scanner input = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		
		int [][] m = new int[3][4];
		int r = (int)(Math.random()*(11));
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				m[i][j] = (int)(Math.random()*(10));
			}
		}
		System.out.println(posAvg(m));
	}
	
		
	public static double posAvg(int[][] m)
	{
		int rows = m.length;
		int cols = m[0].length;
		int sum = 0;
		int divide = 0;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				if (m[i][j]>0) {
					sum += m[i][j];
					divide++;
				}
			}
		}

		return (double)sum / (divide);
	}


	

	}
