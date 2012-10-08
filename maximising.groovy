String str = ""
int num = 0
int highest = 0
boolean cont = true

while (cont == true) {
    str = System.console().readLine()
    num = Integer.parseInt(str)

    if (num != -1) {
        if (num > highest) {
            highest = num;
        }
    } 
    else {
        cont = false;  
    }
}

println("Highest: " + highest)


