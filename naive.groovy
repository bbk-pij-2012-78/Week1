String str = System.console().readLine()
int num1 = Integer.parseInt(str)

str = System.console().readLine()
int num2 = Integer.parseInt(str)

str = System.console().readLine()
int num3 = Integer.parseInt(str)

int tmp = 0
boolean sorted = false

while (sorted == false) {
    while (num2 > num3) {
        tmp = num3;
        num3 = num2;
        num2 = tmp;
    }

    while (num1 > num2) {
        tmp = num2;
        num2 = num1;
        num1 = tmp;       
    }

    if (num1 < num2) {
        if (num2 < num3) {
            sorted = true;
        }
    }

}

println(num1)
println(num2)
println(num3)


