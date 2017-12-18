package com.cn.hwl.tag;

import java.io.Writer;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

/**
 * 带标属性的标签
 * 
 * @Description
 * @author Weiliang Hu
 * @date 2017年12月12日 上午11:17:27
 */
public class TestBodyTag extends BodyTagSupport {

    private String driver;

    private String url;

    private String username;

    private String password;

    private String sql;

    private Connection conn;

    private Statement statement;

    private ResultSet resultSet;

    private ResultSetMetaData resultSetMetaData;

    @Override
    public int doEndTag() throws JspException {

        try {
            Class.forName(this.driver);
            conn = (Connection) DriverManager.getConnection(url, username, password);
            statement = (Statement) conn.createStatement();
            resultSet = statement.executeQuery(sql);
            resultSetMetaData = (ResultSetMetaData) resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            Writer out = pageContext.getOut();
            out.write("<table border='1' bgColor='999999'>");
            while (resultSet.next()) {
                out.write("<tr>");
                for (int i = 1; i <= columnCount; i++) {
                    out.write("<td>");
                    out.write(resultSet.getString(i));
                    out.write("</td>");
                }
                out.write("</tr>");
            }

            out.write("</table>");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return EVAL_PAGE;
    }

    public void destory() {

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

}
