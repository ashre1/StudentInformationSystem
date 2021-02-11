package com.ashish.SIS.DAO;

import coml.ashish.SIS.DTO.StudentDTO;
import com.ashish.SIS.Database.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentDAO {

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pstmt;

    public StudentDAO() {
        con = new ConnectionFactory().getConnection();
    }

    public ResultSet getQueryResult() {
        String query = "SELECT * FROM student";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet searchStudent(String name, String value) {
        String query;
        if (name.equalsIgnoreCase("stdId")) {
            query = "SELECT * FROM student WHERE " + name + "=" + value;
        } else {
            query = "SELECT * FROM student WHERE " + name + "='" + value + "'";
        }
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "NO search found");
            } else {
                rs.beforeFirst();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    public Vector<String> getColumnNames(ResultSet rs) {
        Vector<String> columnName = new Vector<String>();
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            for (int i = 1; i <= columnCount; i++) {
                columnName.add(metaData.getColumnName(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnName;
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

    public void addStudent(StudentDTO std) {
        String query = "INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, std.getStdId());
            pstmt.setString(2, std.getFirstName());
            pstmt.setString(3, std.getMiddleName());
            pstmt.setString(4, std.getLastName());
            pstmt.setString(5, std.getGender());
            pstmt.setString(6, std.getPerAddress());
            pstmt.setString(7, std.getTempAddress());
            pstmt.setString(8, std.getEmail());
            pstmt.setString(9, std.getMobile());
            pstmt.setString(10, std.getProgram());
            pstmt.setString(11, std.getSemester());
            pstmt.setString(12, std.getSection());

            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record Successfully Inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(String value) {
        String query = "DELETE FROM student WHERE stdId=?";
        try {
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(value));
            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record Deleted Successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StudentDTO editStudent(JTable table) {
        StudentDTO std = new StudentDTO();
        std.setStdId((Integer) table.getValueAt(table.getSelectedRow(), 0));
        std.setFirstName((String) table.getValueAt(table.getSelectedRow(), 1));
        std.setMiddleName((String) table.getValueAt(table.getSelectedRow(), 2));
        std.setLastName((String) table.getValueAt(table.getSelectedRow(), 3));
        std.setGender((String) table.getValueAt(table.getSelectedRow(), 4));
        std.setPerAddress((String) table.getValueAt(table.getSelectedRow(), 5));
        std.setTempAddress((String) table.getValueAt(table.getSelectedRow(), 6));
        std.setEmail((String) table.getValueAt(table.getSelectedRow(), 7));
        std.setMobile((String) table.getValueAt(table.getSelectedRow(), 8));
        std.setProgram((String) table.getValueAt(table.getSelectedRow(), 9));
        std.setSemester((String) table.getValueAt(table.getSelectedRow(), 10));
        std.setSection((String) table.getValueAt(table.getSelectedRow(), 11));

        return std;
    }

    public void updateStudent(StudentDTO std) {
        String query = "UPDATE student set firstname=?,middlename=?,lastname=?,"
                + "gender=?,peraddress=?,tempaddress=?,email=?,mobile=?,program=?,"
                + "semester=?,section=? WHERE stdId=?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, std.getFirstName());
            pstmt.setString(2, std.getMiddleName());
            pstmt.setString(3, std.getLastName());
            pstmt.setString(4, std.getGender());
            pstmt.setString(5, std.getPerAddress());
            pstmt.setString(6, std.getTempAddress());
            pstmt.setString(7, std.getEmail());
            pstmt.setString(8, std.getMobile());
            pstmt.setString(9, std.getProgram());
            pstmt.setString(10, std.getSemester());
            pstmt.setString(11, std.getSection());
            pstmt.setInt(12, std.getStdId());

            if (pstmt.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "One record Updated Successfully");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean checkId(String id){
        String query="SELECT stdid FROM student WHERE stdId=?";
        try {
            pstmt=con.prepareStatement(query);
            pstmt.setInt(1, Integer.parseInt(id));
            rs=pstmt.executeQuery();
            while (rs.next()) {                
                return false;
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
        return true;
    }

}
