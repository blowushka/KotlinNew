fun main() {
    val seconds = 6480

    val hours = seconds / 3600
    val remainingAfterHours = seconds % 3600
    val minutesLeft = remainingAfterHours / 60
    val secondsLeft = remainingAfterHours % 60

    val hh = "%02d".format(hours)
    val mm = "%02d".format(minutesLeft)
    val ss = "%02d".format(secondsLeft)

    println("$hh:$mm:$ss")

}