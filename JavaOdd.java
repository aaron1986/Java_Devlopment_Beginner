You are asked to write code for a method bothOdd that receives two arguments of type int to operate on. The method's job is to return an int value representing the sum of the two supplied arguments if both arguments are odd, otherwise return 0.
 
Unless you are extremely confident, you are advised to write your code in BlueJ and copy the final working version in here to test. 
Although you can edit your code here, this is not a development environment and If your code contains syntax errors you may get unhelpful error messages here.

/**
 *  This method takes two arguments
 *  If they are both odd it returns their sum as an int, otherwise it returns zero.
 *  
 */
	public int bothOdd(int a, int b) {
	
	
	if((a % 2 == 0) && (b % 2 == 0) && (a != 0) || ((a % 2 != 0) && (b % 2 != 0)))  {
		return (a + b);
	} else {
		return 0;
	}
	
}