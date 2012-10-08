String str = ""
int num = 0
int lastNum = 0
boolean cont = true
boolean firstNum = true
boolean inSequence = true

while (cont == true) {
    str = System.console().readLine()
    num = Integer.parseInt(str)

    if (num != -1) {
        if (firstNum == true) {
            lastNum = num;
            firstNum = false;
        }
        else {
            if (num <= lastNum) {
                inSequence = false;
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


