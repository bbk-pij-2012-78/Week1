String str = System.console().readLine()
int num1 = Integer.parseInt(str)

str = System.console().readLine()
int num2 = Integer.parseInt(str)

int wholeCount = 0
int remain = 0

int origNum1 = num1

while (remain == 0) {
    if (num2 <= num1) {
        wholeCount ++;
        num1 = (num1 - num2)
    }
    else {
        remain = num1
        break;
    }
}

println(origNum1 + " divided by " + num2 + " is " + wholeCount + " remainder " + remain);

