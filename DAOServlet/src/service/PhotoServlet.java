package service;

import model.Model;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/service")
public class PhotoServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    	
    	
    	String searchCreator = request.getParameter("creator");
    	String searchkey = request.getParameter("searchkey");
    	
    	System.out.println("SEARCH KEY: " + searchkey);
    	
    	if(searchkey == null) {
    		searchkey = "";
    	}

    	if(searchCreator == null) {
    		searchCreator = "";
    	}
        Model m = new Model();
        
        if(searchkey.equals("") && searchCreator.equals("") ) {
        	
        	m.getAll();
        }
        
        else if(searchkey.equals("") && !searchCreator.equals("")) {
        	m.getByCreator(searchCreator);
        }
       
        else if(!searchkey.equals("") && searchCreator.equals("")) {
        	m.getByKeyword(searchkey);
        }
        
        else {
        	m.getByBoth(searchkey, searchCreator);
        }
        
        System.out.println("MODEL:: " + m.toString());
        
        PrintWriter out = response.getWriter();
        switch (request.getHeader("Accept").toLowerCase()) {
            case "application/json":
                response.setContentType("application/json");
                out.println(m.toString());
                break;
            default:
                System.out.println("Request type: " + request.getHeader("Accept").toLowerCase());
            	response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE); // 415
        }
    }

    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
