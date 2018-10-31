package com.utils;

import java.sql.*;

/**
 *  数据库连接工具类
 */
public class DBConnection {

    private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    //注：连接SQLServer 2008 没有microsoft，把这个去掉问题解决
    private static String url="jdbc:microsoft:sqlserver://127.0.0.1:1433;DatabaseName=epet";
    private static String user="sa";
    private static String password="sasa";

    static {
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }

    public static void closeAll(Connection con, Statement st, ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (st != null) {
            st.close();
        }
        if (con != null) {
            con.close();
        }
    }
     public int executeSQL(String sql,Object[] param) throws ClassNotFoundException{
            Connection con=null;
            PreparedStatement ps=null;
            /* 处理SQL,执行SQL */
            try{
                con=getConnection();            // 得到数据库连接对象
                ps=con.prepareStatement(sql);   // 得到PreparedStatement对象
                if(param!=null){
                    for(int i=0;i<param.length;i++){
                        ps.setObject(i+1,param);
                    }
                }
                ResultSet rs=ps.executeQuery();       //得到执行sql语句的结果集对象
            }catch (SQLException e){
                e.printStackTrace(); // 处理SQLException异常
            }finally {
                try {
                    DBConnection.closeAll(con,ps,null);
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            return 0;
        }

}
