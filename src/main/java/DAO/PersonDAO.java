/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.PersonDTO;
import Database.DBConnection;
import Utility.CustomLogger;
import static Utility.CustomLogger.CustomLogger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 *
 * @author Vi Hao
 */
public class PersonDAO {

    private DBConnection db;

    public PersonDAO() {
        db = new DBConnection();
    }

    public ArrayList<PersonDTO> getAllPerson() {
        ArrayList<PersonDTO> listTmp = new ArrayList<PersonDTO>();
        String sql = "SELECT * FROM person";
        try {
            ResultSet rs = db.executeQuery(sql);
            PersonDTO tmp;
            while (rs.next()) {
                tmp = new PersonDTO();
                tmp.setPersonID(rs.getInt("personID"));
                tmp.setFirstName(rs.getString("firstName"));
                tmp.setLastName(rs.getString("lastName"));
                tmp.setEnrollmentDate(rs.getString("enrollmentDate"));
                tmp.setHireDate(rs.getString("hireDate"));
                listTmp.add(tmp);
            }
        } catch (Exception ex) {
            System.out.println("Error in file: PersonDAO.java");
            CustomLogger.CustomLogger(PersonDAO.class.getName(), ex.getMessage(), Level.SEVERE);
        }
        return listTmp;
    }
    
    public ArrayList<PersonDTO> getAllPersonBySearch(String input) {
        ArrayList<PersonDTO> listTmp = new ArrayList<PersonDTO>();
//        String sql = "SELECT * FROM person";
        String sql = "SELECT * FROM person WHERE personID LIKE '%";
            sql += input +"%' OR firstName LIKE '%";
            sql += input +"%' OR lastName LIKE '%";
            sql += input +"%'";
        System.out.println(sql);

        try {
            ResultSet rs = db.executeQuery(sql);
            PersonDTO tmp;
            while (rs.next()) {
                tmp = new PersonDTO();
                tmp.setPersonID(rs.getInt("personID"));
                tmp.setFirstName(rs.getString("firstName"));
                tmp.setLastName(rs.getString("lastName"));
                tmp.setEnrollmentDate(rs.getString("enrollmentDate"));
                tmp.setHireDate(rs.getString("hireDate"));
                listTmp.add(tmp);
            }
        } catch (Exception ex) {
            System.out.println("Error in file: PersonDAO.java");
            CustomLogger.CustomLogger(PersonDAO.class.getName(), ex.getMessage(), Level.SEVERE);
        }
        return listTmp;
    }

    public boolean Add(PersonDTO ps) {
        try {
            String sql = "INSERT INTO person(firstName,lastName,enrollmentDate,hireDate) VALUES ('"
                    + ps.getFirstName() + "','"
                    + ps.getLastName() + "',"
                    + ps.getEnrollmentDate() + ","
                    + ps.getHireDate() + ")";
            db.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in file: PersonDAO.java");
            System.out.println(e);
            return false;
        }
    }

    public boolean Set(PersonDTO ps) {
        try {
            String sql = "UPDATE person SET ";
            sql += "firstName = '" + ps.getFirstName() + "',";
            sql += "lastName = '" + ps.getLastName() + "',";
            sql += "enrollmentDate = " + ps.getEnrollmentDate() + ",";
            sql += "hireDate = " + ps.getHireDate();
            sql += " WHERE personID = " + ps.getPersonID();
            db.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error in file: PersonDAO.java");
            System.out.println(e);
            return false;
        }
    }
}
