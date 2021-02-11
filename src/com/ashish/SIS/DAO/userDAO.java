package com.ashish.SIS.DAO;

import coml.ashish.SIS.DTO.userDTO;
import com.ashish.SIS.Database.ConnectionFactory;
import com.ashish.SIS.GUI.ChangeUsernameAndPassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class userDAO {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    public userDAO() {
        con = new ConnectionFactory().getConnection();
    }

    public void addUser(userDTO user) {
        String query = "INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, user.getUserId());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getFirstname());
            pstmt.setString(4, user.getMiddlename());
            pstmt.setString(5, user.getLastname());
            pstmt.setString(6, user.getPassword());
            pstmt.setString(7, user.getPeraddress());
            pstmt.setString(8, user.getTempaddress());
            pstmt.setString(9, user.getContact());
            pstmt.setString(10, user.getEmail());

            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record insert Successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String query1 = "INSERT INTO logintbl VALUES(?,?,?)";
        try {
            pstmt = con.prepareStatement(query1);
            pstmt.setInt(1, user.getUserId());
            pstmt.setString(2, user.getUsername());
            pstmt.setString(3, user.getPassword());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet getQueryResult() {
        String query = "SELECT userid,username,firstname,middlename,"
                + "lastname,peraddress,"
                + "tempaddress,contact,email FROM user";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    public DefaultTableModel builtTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnName = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnName.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnName);
    }

    public Vector<String> getColumnNames(ResultSet rs) {
        Vector<String> columnName = new Vector<String>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int column = 1; column <= columnCount; column++) {
                columnName.add(metaData.getColumnName(column));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnName;
    }

    public ResultSet searchUser(String name, String value) {
        String query;

        if (name.equalsIgnoreCase("userid")) {
            query = "SELECT userid,username,firstname,"
                    + "middlename,lastname,peraddress,"
                    + "tempaddress,contact,"
                    + "email FROM user WHERE "
                    + "" + name + "=" + value;
        } else {
            query = "SELECT userid,username,firstname,"
                    + "middlename,lastname,peraddress,tempaddress,contact,"
                    + "email FROM user WHERE " 
                    + name + "='" + value + "'";
        }
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "Search not found");
            } else {
                rs.beforeFirst();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void delete(String value) {
        String query1 = "DELETE FROM user WHERE userid=?";
        String query2 = "DELETE FROM logintbl WHERE id=?";

        try {
            pstmt = con.prepareStatement(query1);
            pstmt.setInt(1, Integer.parseInt(value));
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record deleted successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            pstmt = con.prepareStatement(query2);
            pstmt.setInt(1, Integer.parseInt(value));
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public userDTO editUser(JTable table) {
        userDTO user = new userDTO();

        user.setUserId((Integer) table.getValueAt(table.getSelectedRow(), 0));
        user.setUsername((String) table.getValueAt(table.getSelectedRow(), 1));
        user.setFirstname((String) table.getValueAt(table.getSelectedRow(), 2));
        user.setMiddlename((String) table.getValueAt(table.getSelectedRow(), 3));
        user.setLastname((String) table.getValueAt(table.getSelectedRow(), 4));
        user.setPeraddress((String) table.getValueAt(table.getSelectedRow(), 5));
        user.setTempaddress((String) table.getValueAt(table.getSelectedRow(), 6));
        user.setContact((String) table.getValueAt(table.getSelectedRow(), 7));
        user.setEmail((String) table.getValueAt(table.getSelectedRow(), 8));

        return user;
    }

    public void UpdateUser(userDTO user) {
        String query = "UPDATE user SET firstname=?,middlename=?,"
                + "lastname=?,peraddress=?,tempaddress=?,contact=?,"
                + "email=? WHERE userId=?";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, user.getFirstname());
            pstmt.setString(2, user.getMiddlename());
            pstmt.setString(3, user.getLastname());
            pstmt.setString(4, user.getPeraddress());
            pstmt.setString(5, user.getTempaddress());
            pstmt.setString(6, user.getContact());
            pstmt.setString(7, user.getEmail());
            pstmt.setInt(8, user.getUserId());
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record Update Successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean isokey;
    public boolean changePassword(String username, 
            String oldpass, String newpass) {
        isokey=false;
        String query1 = "UPDATE user SET password=? WHERE "
                + "username=? AND password=?";
      //  String query2 = "UPDATE logintbl SET password=? WHERE username=? AND password=?";
        try {
            pstmt = con.prepareStatement(query1);
            pstmt.setString(1, newpass);
            pstmt.setString(2, username);
            pstmt.setString(3, oldpass);
            if (pstmt.executeUpdate() > 0) {
                isokey = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            pstmt = con.prepareStatement(query2);
//            pstmt.setString(1, newpass);
//            pstmt.setString(2, username);
//            pstmt.setString(3, oldpass);
//            pstmt.executeUpdate();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return isokey;
    }

}
