A lottery company sells scratch cards.  In addition to the game itself, each contains a verification code.  When a user wishes to claim a win, they enter the value they are claiming and the verification code into a computer system.  The system uses a secret key to determine the validity of the claim. 
You are to write the verification method that will be passed the data entered by the claimant together with the secret key.
The verification method verifyWin takes three arguments, the claimValue in pounds as an int,  the verificationCode from the card as a String and the secretKey as a String.  The prizes available are £1, £3 and £5.  It returns a Boolean value, true if the claim is valid, false if not.
 
To determine whether a verificationCode is valid, it is compared to the secretKey character by character. 
A local variable prize (which you must create) is initially set to 0 and will represent the prize value in the verificationCode once the processing has completed.
Next an appropriate loop is entered to compare the characters in the verificationCode and the secretKey, one at a time in the order left to right. 
Each time the code in the body of the loop executes, it examines the next pair of characters.  If the characters at the current position match, the numerical position of the match is added to the prize.  If they do not match, the numerical position is subtracted. We take the position to start from 1, whereas Strings are indexed from 0.
 
When all of the characters have been compared the value in prize contains the value of a valid claim for this card.  It is compared to the claimValue to determine if the claim is valid.  If they match, return true.  If not return false.
 
Both keys are always expected to be exactly 6 characters long and if they are longer, any characters beyond the first six are to be ignored.
You will need the charAt() method to access the correct character.
You should assume that the inputs are always valid.
 
Note:- Unless you are extremely confident, you are advised to write your code in BlueJ and copy the final working version in here to test. 
Although you can edit your code here, this is not a development environment and If your code contains syntax errors you may get unhelpful error messages here.

		public Boolean verifyWin(int claimValue, String verificationCode, String secretKey) 
	{
	     //create and initialise your local variable prize here
		 
		 int prize = 0;		
		 
		 boolean result = true;
			 
			 for(int i = 1; i <= 6; i++) {
				 if (secretKey.charAt(i) == verificationCode.charAt(i)) {
					 result = true;
				 }	else {
					 result = false;
			 }
			 
			 if(result == true) {
			     prize = claimValue + (i + 1);
			 } else if (result == false) {
			     prize = claimValue - (i - 1);
			 }
			 return result;
			 
			}
			 return (prize == claimValue);
}