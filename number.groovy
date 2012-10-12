import jline.ANSIBuffer

class Number {

	static main(args) {
		
		String str = "";
		int iChoice = 0;
		
		print(ANSIBuffer.ANSICodes.clrscr())
		
		while (iChoice != 5){
			
			println("1. Print Prime Numbers to 1000");
			println("2. Print First 1000 Prime Numbers");
			println("3. Guess My Number");
			println("4. Rock Paper Scissors");
			println("5. Exit");
			print("Enter Your Selection: ");
			str = System.console().readLine();
			iChoice = Integer.parseInt(str);
			
			switch (iChoice) {
				case 1:
					PrimeTo1000();
					break;
				case 2:
					First1000Prime();
					break;
				case 3:
					GuessMyNumber();
					break;
				case 4:
					RockPaperScissors();
					break;
			}
		}
	}

	public boolean IsPrime(int i) {
		
		boolean prime = true;
		int x = 1;
	
		while (x < i) {
			x++;
			if (x != i) {
				if ((i % x) == 0) {
					prime = false;
					break;
				}
			}
		}
		return prime;
	}


	public static GuessMyNumber() {
		
		int iGuess = 0;
		int iGuessCount = 0;
		int iNumberToGuess = Math.abs(1000 * Math.random())
		String str;
		
		while (iGuess != iNumberToGuess) {
			print("Enter your guess: ");
			str = System.console().readLine();
			iGuess = Integer.parseInt(str);
			
			iGuessCount++;
			
			if (iGuess > iNumberToGuess) {
				println("No! My number is lower.");
			} 
			else {
				println("No! My number is higher.");
			}
		}
		
		println("Correct! You needed " + iGuessCount + " guesses.")
	}
		
	static PrimeTo1000() {
		
		Number num;
		num = new Number();
		
		int x = 1;
		
		while (x <= 1000) {
			if (num.IsPrime(x) == true) {
				println(x);
			}
			x++;
		}
		
	}
	
	static First1000Prime() {
		
		Number num;
		num = new Number();
		int count = 0;
		int x = 0;
		
		while (count <= 1000){
			if (num.IsPrime(x) ==  true){
				println("(" + count + ")" + x);
				count++;
			}
			x++;
		}
	}
	
	static RockPaperScissors() {
		
		int iP1Score = 0;
		int iP2Score = 0;
		String sP1 = "";
		String sP2 = "";
		boolean cont = true;
		
		String str = "";
		File fl = new File('H:/Modules/Java/Week 01/Exercises/rps.txt')
		fl.eachLine { line -> str = line
			//println(str);
			
			if (cont == true) {
				sP1 = str.substring(0, 1)
				sP2 = str.substring(1, str.length())
			
				print("Player1: " + sP1 + " Player2: " + sP2)
				
				switch (sP1) {
					case 'R':
						if (sP2 == 'S') {
							iP1Score ++;
							println(' Player1 Wins')
						} 
						else if (sP2 == 'P') {
							iP2Score ++;
							println(' Player2 Wins')
						}
						else {
							println(' Draw')
						}
						break;
					
					case 'P':
						if (sP2 == 'R') {
							iP1Score ++;
							println(' Player1 Wins')
						}
						else if (sP2 == 'S') {
							iP2Score ++;
							println(' Player2 Wins')
						}
						else {
							println(' Draw')
						}
						break;
					
					case 'S':
						if (sP2 == 'P') {
							iP1Score ++;
							println(' Player1 Wins')
						}
						else if (sP2 == 'R') {
							iP2Score ++;
							println(' Player2 Wins')
						}
						else {
							println(' Draw')
						}
						break;
				}
			
				if ((iP1Score - iP2Score) >= 3) {
					println("Game Over! Player1 Wins");
					cont = false;
				} 
				else {
					if ((iP2Score - iP1Score) >= 3) {
						println("Game Over! Player2 Wins");
						cont = false;
					}
				}
			}
			
		}
		
		println("Player1 Score: " + iP1Score + " Player2 Score: " + iP2Score)		
	}
	
	
}

