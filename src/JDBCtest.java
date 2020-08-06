import java.sql.*;

public class JDBCtest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class<?> cls=Class.forName("com.mysql.jdbc.Driver");
        System.out.println(cls.getSimpleName());
        /**
         * 完整目标是执行select * from student_0604;
         */

        //建立数据库连接

        //写明Mysql服务端所在地

        //以后写项目，只需修改默认数据库名称即可
        String defaultDatabaseName="student_0604";
        //数据库密码
        String password="2011secret";

        //下面这里，基本不变
        String user="root";
        String url="jdbc:mysql://127.0.0.1:3306/"+defaultDatabaseName+"?useSSL=false&characterEncoding-utf8";

        Connection connection = DriverManager.getConnection(url, user, password);
        //连接状态打印
        System.out.println(connection);
        queryDemo(connection);


        //关闭刚才的connectiong
        connection.close();
    }

    private static void queryDemo(Connection connection) throws SQLException {
        //真正的执行sql语言，并且获取数据库返回的结果
        Statement statement=connection.createStatement();

        String sql="select * from tb_student";
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next()){
            String id=resultSet.getString(1);
            String name=resultSet.getString(2);
            System.out.println(id+name);
        }

        resultSet.close();
        //关闭statement对象
        statement.close();
    }
}
