String strRank = '';
String strSuit = '';
int count = 0;
int count2 = 0;
int count3 = 0;
int num = 0;
boolean cont = true;
def cards = new String[5];
boolean bPair = false;
boolean bFlush = true;
boolean bValid = true;


while (count < 5) {
	
	//set the valid flag to false
	bValid = false;
	
	//loop until the user enters a valid card
	while (bValid == false) {
		print('Enter Card ' + (count + 1).toString()  + ' Rank: ')
      	strRank = System.console().readLine()
        
		//check if the entry is a number
		if (strRank.isNumber() == true) {
			if ((Integer.parseInt(strRank) >= 1) && (Integer.parseInt(strRank) <= 10)) {
				bValid = true;
			}
		}
		else {
			if ((strRank.toUpperCase() == 'J') || (strRank.toUpperCase() == 'Q') || (strRank.toUpperCase() == 'K')) {
				bValid = true;
			} 
		}
		if (bValid == false) {
			println('Invalid Rank. Enter 1 to 10 or J, Q, K')
		}
	}
	
	//reset the valid flag and read the suit
	bValid = false;
	
	while (bValid == false) {
		print('Enter Card ' + (count + 1).toString() + ' Suit: ')
		strSuit = System.console().readLine()
		
		if ((strSuit.toUpperCase() == 'H') || (strSuit.toUpperCase() == 'C') || (strSuit.toUpperCase() == 'D') || (strSuit.toUpperCase() == 'S')) {
			bValid = true;
		}
		else {
			println('Invalid Suit Enter H, C, D or S');
		}
	}
	
	//add the card to the array
	cards[count] = strRank + strSuit.toUpperCase();
	
	//check if any cards are the same as this is an invalid hand
	count3 = 0;
	count2 = 0;
	bValid = true;
	
	while (count3 <= count) {
		while (count2 <= count) {
			if (count3 != count2) {
				if (cards[count3].toString() == cards[count2].toString()) {
					bValid = false;
				}
			}
			count2 ++;
		}
		count3++;
	}
	
	if (bValid == false) {
		println('You Cannot Have The Same Card Twice. Please Re-enter.')
	}
	else {
		//only increment the counter if the card is valid
		count ++;	    
	}
}

//display the hand on screen
count = 0;
print('Your Hand - ');
while (count < 5) {
     print(cards[count].toString() + ' ');
     count ++;
}



if (bValid == false) {
	println('Hand Is Not Valid !!')
}
else {
	println('Hand Is Valid')
}




