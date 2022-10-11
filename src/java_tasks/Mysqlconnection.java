package java_tasks;

import  java.sql.*;

public class Mysqlconnection {
    Connection _con;

    public Mysqlconnection(String url, String login, String pass) throws SQLException {
        this._con = DriverManager.getConnection(url, login, pass);
    }

    public ResultSet execute(String sql) throws SQLException{
        Statement stmt = this._con.createStatement();
        return stmt.executeQuery(sql);
    }

    public PreparedStatement Insert_into(String tablename, String qw) throws SQLException{
        return this._con.prepareStatement("INSERT INTO " + tablename + qw);
    }

    public void Create_table(String tablename, int table_num) throws SQLException{
        String query = null;
        if (table_num == 1)
        {
            query = "CREATE TABLE IF NOT EXISTS " + tablename + " ( value1 int, operation varchar(255), value2 int, answer int)";
        }
        else if (table_num == 2)
        {
            query = "CREATE TABLE IF NOT EXISTS " + tablename + " (string1 varchar(255), string2 varchar(255), len_string1 int, len_string2 int, string_sum varchar(255), comparison varchar(255))";
        }
        else if (table_num == 3)
        {
            query = "CREATE TABLE IF NOT EXISTS " + tablename + " ( number int, description varchar(255))";
        }
        else if (table_num == 4)
        {
            query = "CREATE TABLE IF NOT EXISTS " + tablename + " ( string1 varchar(255), string2 varchar(255), substring1 varchar(255), substring2 varchar(255), lower1 varchar(255), lower2 varchar(255), upper1 varchar(255), upper2 varchar(255), endswith1 varchar(255), endwith2 varchar(255))";
        }
        else
        {
            query = "CREATE TABLE IF NOT EXISTS " + tablename + " (string1 varchar(255), string2 varchar(255), reverse1 varchar(255), reverse2 varchar(255), append varchar(255))";;
        }
        Statement stmt1 = this._con.createStatement();
        stmt1.executeUpdate(query);
    }

    public static void print_result(ResultSet result) throws SQLException {
        while(result.next())
        {
            System.out.println(result.getString(1));
        }
    }
}
