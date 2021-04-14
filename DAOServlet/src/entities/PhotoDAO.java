package entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bernd OK
 */
public class PhotoDAO {
    // A very simple Data Object abstraction for DB access via JDBC
    private List<Photo> resultList;
    private Statement stmt = null;
    private Connection conn = null;
    private ResultSet rs = null;
    private final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/PhotoLibrary?serverTimezone=UTC&user=root&password=mysql4me";

    
    public PhotoDAO() {
    	resultList = new ArrayList<>();

    }
    
    private List<Photo> megaSearch(String query) {

        try { 
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                Photo d = new Photo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8) );
                resultList.add(d);
            }
        } catch (ClassNotFoundException | SQLException e) {
            Logger.getLogger(PhotoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try { // Did I mention I hate "try" in a "finally" clause...
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                Logger.getLogger(PhotoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }    	
        return resultList;
    }

    public List<Photo> findAll() {
    	String query = "SELECT * from PHOTOS";
        return megaSearch(query);
    }
    
    public List<Photo> findByCreator(String keyword){
    	String query = "SELECT * from PHOTOS WHERE PHOTOFirstName = '" + keyword + "'";
    	return megaSearch(query);
    }
    
 public List<Photo> findByBoth(String keyword, String creator){
	 String query = "SELECT * from PHOTOS WHERE PHOTOKeywords = '" + keyword + "' AND PHOTOFirstName = '" + creator + "'" ;
    	return megaSearch(query);
    }
    
 public List<Photo> findByKeyword(String keyword){
 	String query = "SELECT * from PHOTOS WHERE PHOTOKeywords = '" + keyword + "'" ; 
 	return megaSearch(query); 
 }
    
    
    
    
}
