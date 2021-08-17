import java.sql.*;
class JdbcDb2
{
public static void main(String[] args)throws Exception
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
Statement s=con.createStatement();

ResultSet rs=s.executeQuery("select * from Movies where Actor_name ='Ajay devgan'");
while(rs.next()){

System.out.println("Name: "+rs.getString(1)+"  "+"Actor name: "+rs.getString(2)+"  "+"Actress name: "+rs.getString(3)+"  "+"Director : "+rs.getString(4)+" "+"Year_of_year : "+rs.getInt(5));
}
con.close();
}
catch(Exception e)
{
e.printStackTrace();

  }
 }
}