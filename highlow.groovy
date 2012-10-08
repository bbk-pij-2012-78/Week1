String str = ""
int num = 0
int lastNum = 0
boolean cont = true
int counter = 0
boolean inSequence = true
boolean goingUp = true


while (cont == true) {
    str = System.console().readLine()
    num = Integer.parseInt(str)

    counter ++;

    if (num != -1) {
        if (counter == 1) {
            lastNum = num;

        } 
        else if (counter == 2) {
            goingUp = (num > lastNum)
            lastNum = num;
        }
        else if (counter > 2) {
            if (goingUp == true) {
                if (num <= lastNum) {
                    inSequence = false;
                }
            }
            else {
                if (num >= lastNum) {
                    inSequence = false;
                }
            }
            
            lastNum = num;
        }
        
    } 
    else {
        cont = false;  
    }
}

if (inSequence == true) {
    println("Yes")
}
else {
    println("No")
}


