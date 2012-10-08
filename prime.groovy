String str = System.console().readLine()
int i = Integer.parseInt(str)

boolean prime = true
int x = 1

//Adding a comment line

while (x < i) {
    x++;
    if (x != i) {
        if ((i % x) == 0) {
            prime = false;
            break;
        }
    }
}

if (prime == true) {
    println("Prime");
} else {
    println("Not Prime");
}
