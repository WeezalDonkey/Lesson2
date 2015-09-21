package lesson2;

public class conditional {
	/**
	 * This method returns whether the number is even or not
	 * @param number
	 * @return
	 */
	public static boolean isEven(int number){
		int remainder = number % 2;
		if (remainder == 0) return true;
		return false;
	}
	
	/**
	 * This method returns a string with the verb "is" or "is not"
	 * @param isTrue
	 * @return either "is" or "is not"
	 */
	public static String isOrIsNot(boolean isTrue){
		if (isTrue) 
			return "is";
		return "is not";
	}
	
	/**
	 * This methods returns the number of days in a given month
	 * @param month
	 * @return
	 * @throws Exception
	 */
	public static int getDays(String month) throws Exception{
		// all lowercase
		String lowercaseMonth = month.toLowerCase();
		String threeLetterLowerCaseMonth = lowercaseMonth.substring(0, 3);
		
		switch (threeLetterLowerCaseMonth) {
		case "jan":
			return 31;
		case "feb":
			return 28;
		case "mar":
			return 31;
		default:
			throw new Exception("Month not recognized");
		}
	}
}
