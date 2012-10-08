int i = 0


while (i < 10) {
    i++;
    x = 1;
    while (x <= i) {
        if (x == i) {
            println(i) 
        } else {
            print(i)        
        }
        x++;
    }
}

i = 11;

while (i > 1) {
    i = i - 1;
    x = 1;
    while (x <= i) {
        if (x == i) {
            println(i) 
        } else {
            print(i)        
        }
        x++;
    }    
}

println("finished");