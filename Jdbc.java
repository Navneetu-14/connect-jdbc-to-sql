import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc{
public static void main(String[] args)throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
Statement s=con.createStatement();
//s.execute("create table Movies(name varchar(20), actor_name varchar(90), actress_name varchar(90),director varchar(20),year_of_release int)");
//s.execute("insert into Movies values('Singham','Ajay devgan','Kajal aggrwal','Rohit shetty',2011)");
//s.execute("insert into Movies values('Gully boy','Ranveer singh','Alia bhatt','Zoya akhtar',2019)");
s.execute("insert into Movies values('Street dancer3D','Varun dhawan','Shraddha kapoor','Remo Dsouza',2020)");
con.close();
System.out.println("done");
}
}