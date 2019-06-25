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

 class User {
	
    private String d_id;
    private String doc_name;
    private String specalist;
    private String city;
    private String visitingtime;
    
    public User(String d_id, String doc_name, String specalist, String city,String visitingtime)
    {
        this.d_id=d_id;
        this.doc_name = doc_name;
        this.specalist = specalist;
        this.city = city;
        this.visitingtime = visitingtime;
    }
    
    //public User(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	//}

	public  String getd_id()
    {
        return d_id;
    }
    public void setd_id(String d_id)
    {
    	this.d_id=d_id;
    }
    
    public String getdoc_name()
    {
        return doc_name;
    }
    public void setdoc_name(String doc_name)
    {
    	this.doc_name=doc_name;
    }
    
    public String getspecalist()
    {
        return specalist;
    }
    public void setspecalist(String specalist)
    {
    	this.specalist=specalist;
    }
    
    
    public String getcity()
    {
        return city;
    }
    public void setcity(String city)
    {
    	this.city=city;
    }
    
    
   public String getvisitingtime()
        {
        return visitingtime;
    }
        public void setvisitingtime(String visitingtime)
        {
        	this.visitingtime=visitingtime;
        }

 }

		
 

 
