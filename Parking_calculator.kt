fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    /*var time : Double = 5
    var day : Double = 24*/
    var total: Double
    if(hours < 5 && hours >0){
        total = 1.0*hours
        println(total)
    }else if(hours >5 && hours < 24){
        total = 5 + (hours-5)*0.5
        println(total)
    }else if(hours >24){
        if(hours%24!=0){
            total = (hours/24)*15 + (hours%24)*0.5
            println(total)
        }else{
            total = (hours/24)*15.0
            println(total)
        }         
    }else{
        println("invalid input")
    }
}
