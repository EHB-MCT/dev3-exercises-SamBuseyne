import java.sql.*
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePass


    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.databaseName +
                ":" + "3306" + "/" + credentials.databaseUser, connectionProps)

    println("Where do you want to go")
    val userAnswer = readLine()

    val statement = connection.prepareStatement("SELECT * FROM 6_trains where city_A = '${userAnswer}' order by departure_time DESC limit 1")
    val result = statement.executeQuery()

    while(result.next()) {
        println(result.getString("departure_time"))
    }


}



