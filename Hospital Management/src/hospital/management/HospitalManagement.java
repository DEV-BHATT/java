/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management;




/**
 *
 * @author DEV
 */
public class HospitalManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
           // Splash.setVisible(false);
             //Reg tb=new Reg(;
             //tb.setVisible(true);
        // Splash.setVisible(false);
        Progesser Splash =new Progesser();

       Splash.setVisible(true);
       try
       {
           for(int i=0;i<=100;i++)
           {
               Thread.sleep(90);
               Splash.loadingNum.setText(Integer.toString(i)+"%");
               Splash.jProgressBar1.setValue(i);
               if(i==100)
               {
                   Splash.setVisible(false);
                   //t1.setVisible(true);
               }
           }
           
       }
       catch(Exception e){
        System.out.println(e);
       }
    }
}    
                   
               
           
       
    
    


    
