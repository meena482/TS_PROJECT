import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 1bestcsharp.blogspot.com
 */
import javax.swing.table.*;

import java.awt.Image;
import java.sql.*;
import java.util.*;

import javax.swing.*;

 class User1 {
	
    private String Pat_id;
    private String Pat_name;
    private String Age;
    private String Gender;
    private String Martialstatus;
    private String AvailableDate;
    private String Address;
    private String City;
    private String Phoneno;
  
    
    public User1(String Pat_id, String Pat_name, String Age,String Gender,String Martialstatus,String AvailableDate,String Address,String City,String Phoneno)
    {
        this.Pat_id=Pat_id;
        this.Pat_name = Pat_name;
        
        this.Age= Age;
        this.Gender=Gender;
        this.Martialstatus=Martialstatus;
        this.AvailableDate = AvailableDate;
        this.Address=Address;
        this.City = City;
        this.Phoneno=Phoneno;
        
    }
    
    //public User(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	//}

	public  String getPat_id()
    {
        return Pat_id;
    }
    public void setPat_id(String Pat_id)
    {
    	this.Pat_id=Pat_id;
    }
    
    public String getPat_name()
    {
        return Pat_name;
    }
    public void setFirstname(String Pat_name)
    {
    	this.Pat_name=Pat_name;
    }
    
   
    
    
    public String getAge()
    {
        return Age;
    }
    public void setAge(String Age)
    {
    	this.Age=Age;
    }
    
    
   public String getGender()
        {
        return Gender;
    }
        public void setGender(String Gender)
        {
        	this.Gender=Gender;
        }
        
        
        public  String getMartialstatus()
        {
            return Martialstatus;
        }
        public void setMartialstatus(String Martialstatus)
        {
        	this.Martialstatus=Martialstatus;
        }
        
        public String getAvailableDate()
        {
            return AvailableDate;
        }
        public void setAvailableDate(String AvailableDate)
        {
        	this.AvailableDate=AvailableDate;
        }
        
        public String getAddress()
        {
            return Address;
        }
        public void setAddress(String Address)
        {
        	this.Address=Address;
        }
        
        
        public String getCity()
        {
            return City;
        }
        public void setCity(String City)
        {
        	this.City=City;
        }
        
        
       public String getPhoneno()
            {
            return Phoneno;
        }
            public void setPhoneno(String Phoneno)
            {
            	this.Phoneno=Phoneno;
            }
           
    }


     

    		
     

     


