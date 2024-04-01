
public class SumOfSquareAndSquareOfSumDiff 
{
	//diff between sum of squares and squares of sum

	public static boolean diffsumofsquaresandsquaresofsum(int n1, int n2, int sum,int squareofsum, int sumofsquare)
	{
		for(int n=n1;n<=n2;n=n+1)
		{
			sum=sum+n;
			sumofsquare=sum*sum;
			squareofsum=squareofsum+n*n;
		}
		System.out.println("sum of square= " +sumofsquare);
		System.out.println("square of sum= " +squareofsum);
		System.out.println("diff between sum of squares and squares of sum is= " +(sumofsquare-squareofsum));
		return true;
	}
	public static void main(String[] args)
	{
		diffsumofsquaresandsquaresofsum(1,10,0,0,0);
	}
}
