import java.sql.*
import java.time.LocalDate
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()
    // Create credentials encrypted through seperated class file, which is ignored by the ignore file
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePass
    // Create the connect: this will allow you to run queries on it
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.databaseName +
                ":" + "3306" + "/" + credentials.databaseUser, connectionProps)

    //Challenge 1:
    //Ask the place to go
    println("Where do you want to go")
    val userAnswer = readLine()
    val currentDate = LocalDate.now()

    //Collect data for place
    val statement = connection.prepareStatement("SELECT * FROM 6_trains where city_A = '${userAnswer}' AND CURRENT_DATE = DATE(departure_time) order by departure_time DESC limit 3")
    val result = statement.executeQuery()

    //Print data
    while(result.next()) {
        println( "Naar:" + result.getString("city_B"))
        println( "Om:" + result.getString("departure_time"))
        println("Op perron " + result.getInt("platform"))
        println("Met:" + result.getString("type"))
        println(" ")
    }
}



