String str = System.console().readLine()
int num1 = Integer.parseInt(str)

str = System.console().readLine()
int num2 = Integer.parseInt(str)

int total = 0
int x = 0

while (x < num2) {
    x ++;
    total = total + num1
}

println(total);

