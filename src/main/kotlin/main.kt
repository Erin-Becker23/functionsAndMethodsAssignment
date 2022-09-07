fun main() {
    var input = 0
    do {
        println("1) Square")
        println("2) Triangle")
        println("3) Trapezoid")
        println("4) Circle")
        println("5) Exit")

        println("please pick 1-5: ")
        input = readln()!!.toInt()

    if(input == 1){
        square()
    }
    else if (input == 2){
       triangle()
    }
    else if (input == 3){
        trapezoid()
    }
    else if( input == 4){
        circle()
    }
    else if (input < 5) {
        println("please choose an option")
    }

    } while (input != 5)
    }


fun square(h: Int = 4, b: Int = 7){
    var area = b*h
    println("The base is : $b")
    println("The height is : $h")
    println("The area is: $area")
    println("---------------------")

}

fun triangle (h:Int = 4, b:Int  = 7){
    var area = (b*h)*.5
    println("The base is : $b")
    println("The height is : $h")
    println("The area is: $area")
    println("---------------------")

}

fun trapezoid (h:Int = 4, b1:Int  = 7,  b2:Int  = 5){
    var area = ((b1+b2)/2)*h
    println("Base 1 is : $b1")
    println("Base 2 is : $b2")
    println("The height is : $h")
    println("The area is: $area")
    println("---------------------")

}

fun circle (r: Double = 6.0, pi: Double = 3.14){
    var area = (r*pi)*(r*pi)
    println("The radius is : $r")
    println("the area is: $area")
    println("---------------------")

}