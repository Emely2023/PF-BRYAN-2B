package Modelo

import java.sql.DriverManager
import java.sql.Connection

class conexion {

    fun StringConection(): Connection?
    {
        try {
            val ip = "jdbc:oracle:thin:@192.168.5.20:1521:xe"
            val user = "SYSTEM"
            val password = "00000"

            val strConnection = DriverManager.getConnection(ip,user,password)
            return  strConnection
        }
        catch (e:Exception)
        {
            println("Error: $e")
            return null
        }
    }
}