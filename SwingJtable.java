import java.awt.event.ActionEvent;
import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.ResultSet;
 import java.sql.Statement;
 import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
 import javax.swing.table.TableModel;
 public class SwingJtable extends javax.swing.JFrame {

 
	 private javax.swing.JButton jButton_Delete;
	    private javax.swing.JButton jButton_Insert;
	    private javax.swing.JButton jButton_Update;
	    private javax.swing.JButton jButton_Exit;

	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	 
		
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JTable jTable_Display_Users2;
	    private javax.swing.JTextField jTextField_Pat_id;
		private javax.swing.JTextField jTextField_Pat_name;
		private javax.swing.JTextField jTextField_Age;
		private javax.swing.JTextField jTextField_Gender;
		private javax.swing.JTextField jTextField_Martialstatus;
		private javax.swing.JTextField jTextField_AvailableDate;
		private javax.swing.JTextField jTextField_Address;
		private javax.swing.JTextField jTextField_City;
		private javax.swing.JTextField jTextField_Phoneno;
	
		
	 
     public SwingJtable() {
         initComponents();
         Show_Users2_In_JTable();
     }
     
    // private void Show_Users2_In_JTable1() {
		// TODO Auto-generated method stub
		
      //}

	// get the connection
    public Connection getConnection()
    {
        Connection con;
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
         

  // get a list of users from mysql database
    public ArrayList<User1> getUsers2List()
    {
        ArrayList<User1> Users2List = new ArrayList<User1>();
        Connection connection = getConnection();
        
        String query = "SELECT * FROM  Users2 ";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User1 user;
            while(rs.next())
            {
                user = new User1(rs.getString("Pat_id"),rs.getString("Pat_name"),rs.getString("Age"),rs.getString("Gender"),rs.getString("Martialstatus"),rs.getString("AvailableDate"),rs.getString("Address"),rs.getString("City"),rs.getString("Phoneno"));
                Users2List.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Users2List;
    }
   
 
    public void Show_Users2_In_JTable()
    {
        ArrayList<User1> list = getUsers2List();
        DefaultTableModel model = (DefaultTableModel)jTable_Display_Users2.getModel();
        Object[] row = new Object[9];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getPat_id();       //.getFlight_ID();
            row[1] = list.get(i).getPat_name();
            row[2] = list.get(i).getAge();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getMartialstatus();
            row[5] = list.get(i).getAvailableDate();
            row[6] = list.get(i).getAddress();
            row[7] = list.get(i).getCity();
            row[8] = list.get(i).getPhoneno();


            
            
            model.addRow(row);
        }
     }
         
    // Execute The Insert Update And Delete Querys
    public void executeSQlQuery(String query, String message)
    {
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if((st.executeUpdate(query)) == 1)
            {
                // refresh jtable data
                DefaultTableModel model = (DefaultTableModel)jTable_Display_Users2.getModel();
                model.setRowCount(0);
                Show_Users2_In_JTable();
                
                JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
            }else{
                JOptionPane.showMessageDialog(null, "Data Not "+message);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {

         jPanel1 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         jLabel4 = new javax.swing.JLabel();
         jLabel5 = new javax.swing.JLabel();
         jLabel6 = new javax.swing.JLabel();
         jLabel7 = new javax.swing.JLabel();
         jLabel8 = new javax.swing.JLabel();
         jLabel9 = new javax.swing.JLabel();
         jTextField_Pat_id = new javax.swing.JTextField();
         jTextField_Pat_name = new javax.swing.JTextField();
         jTextField_Age = new javax.swing.JTextField();
         jTextField_Gender = new javax.swing.JTextField();
         jTextField_Martialstatus = new javax.swing.JTextField();
         jTextField_AvailableDate = new javax.swing.JTextField();
         jTextField_Address = new javax.swing.JTextField();
         jTextField_City= new javax.swing.JTextField();
         jTextField_Phoneno = new javax.swing.JTextField();        
         jScrollPane1 = new javax.swing.JScrollPane();
         jTable_Display_Users2 = new javax.swing.JTable();
         jButton_Insert = new javax.swing.JButton();
         jButton_Update = new javax.swing.JButton();
         jButton_Delete = new javax.swing.JButton();
         jButton_Exit = new javax.swing.JButton();

         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

         jPanel1.setBackground(new java.awt.Color(204, 204, 204));

         jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel1.setText("Pat_id:");

         jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel2.setText("Pat_name:");

         jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel3.setText("Age:");

         jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel4.setText("Gender:");
         
         jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel5.setText("Martialstatus:");
         
         jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel6.setText("AvailableDate:");
         
         jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel7.setText("Address:");
         
         jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel8.setText("City:");
         
         jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
         jLabel9.setText("Phoneno:");


         jTextField_Pat_id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

         jTextField_Pat_name.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_Pat_name.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_Pat_nameActionPerformed(evt);
             }
         });
         

         jTextField_Age.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_Age.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_AgeActionPerformed(evt);
             }
         });

         jTextField_Gender.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_Gender.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_GenderActionPerformed(evt);
             }
         });
         jTextField_Martialstatus.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_Martialstatus.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_MartialstatusActionPerformed(evt);
             }
         });
         jTextField_AvailableDate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_AvailableDate.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_AvailableDateActionPerformed(evt);
                 
             }

			//private void jTextField_Arrived_TimeActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				
			//}
         });
         
         jTextField_Address.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_Address.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_AddressActionPerformed(evt);
             }
         });
         
         jTextField_City.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_City.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_CityActionPerformed(evt);
             }
         });
         jTextField_Phoneno.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
         jTextField_Phoneno.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jTextField_PhonenoActionPerformed(evt);
             }
         });
         jTable_Display_Users2.setModel(new javax.swing.table.DefaultTableModel(
             new Object [][] {

             },
             new String [] {
                 "Pat_id", "Pat_name", "Age", "Gender","Martialstatus","AvailableDate","Address","City","Phoneno"
             }
         ));
         jTable_Display_Users2.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 jTable_Display_Users2MouseClicked(evt);
             }
         });
         jScrollPane1.setViewportView(jTable_Display_Users2);

         jButton_Insert.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        // jButton_Insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("K:/talentsculptors/Imgs/apple.jpeg"))); // NOI18N
         jButton_Insert.setText("Insert");
         jButton_Insert.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton_InsertActionPerformed(evt);
             }
         });

         jButton_Update.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        // jButton_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("K:/talentsculptors/Imgs/apple.jpeg"))); // NOI18N
         jButton_Update.setText("Update");
         jButton_Update.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton_UpdateActionPerformed(evt);
             }
         });

         jButton_Delete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
         //jButton_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("K:/talentsculptors/Imgs/apple.jpeg"))); // NOI18N
         jButton_Delete.setText("Delete");
         jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton_DeleteActionPerformed(evt);
             }
         });
         jButton_Exit.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
         //jButton_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("K:/talentsculptors/Imgs/apple.jpeg"))); // NOI18N
         jButton_Exit.setText("Exit");
         jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 receportal mt= new receportal();
           	  mt.setVisible(true);
           	  dispose();
                
            	 
                // jButton_ExitActionPerformed(evt);
             }
         });

         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(33, 33, 33)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(jPanel1Layout.createSequentialGroup()
                                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                		 .addComponent(jLabel9)
                                		 .addComponent(jLabel8)
                                		 .addComponent(jLabel7)
                                		 .addComponent(jLabel6)
                                     .addComponent(jLabel5))
                                 .addGap(12, 12, 12))
                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                     .addComponent(jLabel4)
                                     .addComponent(jLabel3)
                                 .addComponent(jLabel2)
                                 .addComponent(jLabel1))
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addComponent(jTextField_Pat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_Pat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_Martialstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_AvailableDate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(jTextField_Phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addContainerGap()
                         .addComponent(jButton_Insert)
                         .addGap(18, 18, 18)
                         .addComponent(jButton_Update)
                         .addGap(18, 18, 18)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                         .addComponent(jButton_Delete)
                         .addGap(18, 18, 18)
                         .addComponent(jButton_Exit)

                         ))
                 .addGap(18, 18, 18)

                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap())
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(36, 36, 36)
                         .addComponent(jLabel1))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jTextField_Pat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(jTextField_Pat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(jTextField_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel5)
                         .addComponent(jTextField_Martialstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)

                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel6)
                         .addComponent(jTextField_AvailableDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)

                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addComponent(jLabel7)
                         .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)
                 
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addGap(18, 18, 18)
                         .addComponent(jLabel8)
                         .addComponent(jTextField_City, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(18, 18, 18)

                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         .addGap(18, 18, 18)

                		 .addComponent(jLabel9)
                       

                		 .addComponent(jTextField_Phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                         
                     .addComponent(jButton_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addComponent(jButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                   
                 .addGap(192, 192, 192))
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
  
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );

         pack();
     }// </editor-fold>    
     
     
     
     

     private void jTextField_PhonenoActionPerformed(ActionEvent evt) {
 		// TODO Auto-generated method stub
 		
 	}

 	
 	private void jTextField_CityActionPerformed(ActionEvent evt) {
 		// TODO Auto-generated method stub
 		
 	}

 	private void jTextField_AddressActionPerformed(ActionEvent evt) {
 		// TODO Auto-generated method stub
 		
 	}

 	private void jTextField_AvailableDateActionPerformed(ActionEvent evt) {
 		// TODO Auto-generated method stub
 		
 	}
 	 private void jTextField_MartialstatusActionPerformed(ActionEvent evt) {
  		// TODO Auto-generated method stub
  		
  	}

  	
  	private void jTextField_GenderActionPerformed(ActionEvent evt) {
  		// TODO Auto-generated method stub
  		
  	}

  	private void jTextField_AgeActionPerformed(ActionEvent evt) {
  		// TODO Auto-generated method stub
  		
  	}

  	private void jTextField_Pat_nameActionPerformed(ActionEvent evt) {
  		// TODO Auto-generated method stub
  		
  	}

 	
 	 private void jTextField_Pat_idActionPerformed(java.awt.event.ActionEvent evt) {                                               
          // TODO add your handling code here:
      } 
     private void jTable_Display_Users2MouseClicked(java.awt.event.MouseEvent evt) {                                                  
         // Get The Index Of The Slected Row 
          int i = jTable_Display_Users2.getSelectedRow();

          TableModel model = jTable_Display_Users2.getModel();
          
           // Display Slected Row In JTexteFields
          jTextField_Pat_id.setText(model.getValueAt(i,0).toString());
          jTextField_Pat_name.setText(model.getValueAt(i,1).toString());
          jTextField_Age.setText(model.getValueAt(i,2).toString());
          jTextField_Gender.setText(model.getValueAt(i,3).toString());
          jTextField_Martialstatus.setText(model.getValueAt(i,4).toString());
          jTextField_AvailableDate.setText(model.getValueAt(i,5).toString());
          jTextField_Address.setText(model.getValueAt(i,6).toString());
          jTextField_City.setText(model.getValueAt(i,7).toString());
          jTextField_Phoneno.setText(model.getValueAt(i,8).toString());

      }                                                 

   // Button Insert
      private void jButton_InsertActionPerformed(java.awt.event.ActionEvent evt) {                                               
          String query = "INSERT INTO Users2(Pat_id,Pat_name,Age,Gender,Martialstatus,AvailableDate,Address,City,Phoneno) VALUES ('"+jTextField_Pat_id.getText()+"','"+jTextField_Pat_name.getText()+"','"+jTextField_Age.getText()+"','"+jTextField_Gender.getText()+"','"+jTextField_Martialstatus.getText()+"','"+jTextField_AvailableDate.getText()+"','"+jTextField_Address.getText()+"','"+jTextField_City.getText()+"','"+jTextField_Phoneno.getText()+"')";
          
          executeSQlQuery(query, "Inserted");
        
      }                                              


   // Button Update
      private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                               
         String query = "UPDATE Users2 SET  Pat_name= '"+jTextField_Pat_name.getText()+"',Age='"+jTextField_Age.getText()+"',Gender='"+jTextField_Gender.getText()+"',MartialStatus='"+jTextField_Martialstatus.getText()+"',AvailableDate='"+jTextField_AvailableDate.getText()+"',Address='"+jTextField_Address.getText()+"',City='"+jTextField_City.getText()+"',Phoneno='"+jTextField_Phoneno.getText()+"' WHERE Pat_id = "+jTextField_Pat_id.getText();
         executeSQlQuery(query, "Updated");
      }                                              


   // Button Delete
      private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                               
          String query = "DELETE FROM Users2 WHERE Pat_id = "+jTextField_Pat_id.getText();
           executeSQlQuery(query, "Deleted");
      }  
      void jButton_ExitActionPerformed1(java.awt.event.ActionEvent evt) {
    	 receportal mt= new receportal();
    	  mt.setVisible(true);
    	dispose();
         
      }//                                              


      //private MenuTable MenuTable() {
		// TODO Auto-generated method stub
		//return null;
	//}

	/**
       * @param args the command line arguments
       */
      public static void main(String args[]) {
          /* Set the Nimbus look and feel */
          //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
          /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
           * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
           */
          try {
              for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                  if ("Nimbus".equals(info.getName())) {
                      javax.swing.UIManager.setLookAndFeel(info.getClassName());
                      break;
                      
                
                  }
              }
          } catch (ClassNotFoundException ex) {
              java.util.logging.Logger.getLogger(SwingJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex) {
              java.util.logging.Logger.getLogger(SwingJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex) {
              java.util.logging.Logger.getLogger(SwingJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex) {
              java.util.logging.Logger.getLogger(SwingJtable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        //</editor-fold>

          /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                  new SwingJtable().setVisible(true);
              }
          });
      }
}
