package lesson2;

public class loops {
	/**
	 * This method computes the average for a given array of integers
	 * @param array of integers
	 * @return the minimum as an integer
	 */
	public static int getMinimum(int [] arrayOfIntegers){
		int minimum = Integer.MAX_VALUE;
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			int item = arrayOfIntegers[i];
			minimum = Math.min(item, minimum);
		}
		return minimum;
	}
	
	/**
	 * This method computes the average for a given array of integers
	 * @param array of integers
	 * @return the average as an integer
	 */
	public static int getAverage(int [] arrayOfIntegers){
		int sum = 0;
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			int item = arrayOfIntegers[i];
			sum += item;
		}
		return sum/arrayOfIntegers.length;
	}
	
	/**
	 * This method computes the maximum for a given array of integers
	 * @param array of integers
	 * @return the maximum as an integer
	 */
	public static int getMaximum(int [] arrayOfIntegers){
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < arrayOfIntegers.length; i++) {
			int item = arrayOfIntegers[i];
			maximum = Math.max(item, maximum);
		}
		return maximum;
	}
	
	/**
	 * This method computes the median for a given array of integers
	 * @param array of integers
	 * @return the median as an integer
	 */
	public static int getMedian(int [] arrayOfIntegers){
		int length = arrayOfIntegers.length;
		if (conditional.isEven(length)){
			return (arrayOfIntegers[length / 2 - 1] + arrayOfIntegers[length / 2]) / 2;
		}
		else{
			int middleOfTheArray = (length - 1)/2;
			return arrayOfIntegers[middleOfTheArray];
		}
	}
}
