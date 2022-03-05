/*You are making a car parking software that needs to calculate and output the amount due based on the number of hours the car was parked.

The fee is calculated based on the following price structure:

 - the first 5 hours are billed at $1 per hour.
 - after that, each hour is billed at $0.5 per hour.
 - for each 24 hours, there is a flat fee of $15.

This means, that, for example, if a car parked for 26 hours, the bill should be 15+(2*0.5) = 16.0, because it was parked for 24 hours plus 2 additional hours.

Sample Input:
8

Sample Output: 
6.5

Explanation: The first 5 hours are billed at $1/hour, which results in $5. After that, the next 3 hours are billed at $0.5/hour = $1.5.
So, the total would be $5+$1.5 = $6.5*/


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
