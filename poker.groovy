String str = ""
int count = 0
int num = 0
boolean cont = true
def cards = new String[5]
def suits = new String[5]
boolean bPair = false;
boolean bFlush = true;
boolean bValid = true

while (count < 5) {
    print("Enter Card Rank: ")
    str = System.console().readLine()
    
    if (str == "K") {
        num = 13;
    }
    else if (str == "Q") {
        num = 12;
    }
    else if (str == "J") {
        num = 11;
    }
    else {
        num = Integer.parseInt(str)
    	if ((num < 1) or (num > 10)) {
    	    bValid = false;
    	}
    }
    
    cards[count] = num;
    
    print("Enter Card Suit: ")
    str = System.console().readLine()
    suits[count] = str;    
    
    if (bValid == true) {
        count ++;
    {
    else {
        println("Invalid Card - Re Enter")
    }
    
}





count = 0;
while (count < 5) {
     println(cards[count] + " " + suits[count]);
     count ++;
}

count = 1;
while (count < 5) {
     if (suits[count -1] != suits[count]) {
         bFlush = false;
     }
     count ++;
}





if (bFlush == true) {
    println("FLUSH !!");
}