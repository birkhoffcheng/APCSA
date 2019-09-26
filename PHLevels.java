public class PHLevels
{
    public static int findmin(double [] numbers)
    {
        double min = Double.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int findmax(double [] numbers)
    {
      	double max = Double.MIN_VALUE;
      	int maxIndex = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }
     	return maxIndex;
    }
    
	public static void main(String [] args)	{
		double [] phLevels = { 5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 2.1, 6.9 };
		phLevels[findmin(phLevels)] = 0.0;
		phLevels[findmax(phLevels)] = 0.0;
		double sum = 0.0;
		for ( double ph : phLevels ) {
			sum += ph;
		}
		System.out.print("PH Levels:\t");
		for ( double ph : phLevels ) {
			if ( ph != 0.0 )
			{
				System.out.print(ph + "\t");
			}
		}
		double avg = sum / (double)( phLevels.length - 2 );
		System.out.println("\nAverage PH Level:\t" + avg);
	}
}
