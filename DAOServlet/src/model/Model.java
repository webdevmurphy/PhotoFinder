/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import entities.PhotoDAO;
import entities.Photo;

/**
 *
 * @author Bernd OK
 */
public class Model {
    private final Library library;

    public Model() {
        library = new Library();
  
    }
    
    
 public void applyFilter(String filter) {
	 
	 if(filter.equals("")) {
		 
		 for (Photo d : new PhotoDAO().findAll()) {
		     	System.out.println(d);
		         library.add(d);
		     }
	 }else {
		 
		 for (Photo d : new PhotoDAO().findByKeyword(filter)) {
		     	System.out.println(d);
		         library.add(d);
		     }
		 
		 
	 }
     
 }
    
public void getAll() {
	for (Photo d : new PhotoDAO().findAll()) {
     	System.out.println(d);
         library.add(d);
     }
}
    
public void getByKeyword(String filter) {
	
	for (Photo d : new PhotoDAO().findByKeyword(filter)) {
     	System.out.println(d);
         library.add(d);
     }
	
}

public void getByCreator(String filter) {

	for (Photo d : new PhotoDAO().findByCreator(filter)) {
     	System.out.println(d);
         library.add(d);
     }
}

public void getByBoth(String filter, String filter2) {
	
	for (Photo d : new PhotoDAO().findByBoth(filter, filter2)) {
     	System.out.println(d);
         library.add(d);
     }
	
}
 

    @Override
    public String toString() {
        return library.toString();
    }
}
