/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;


import static java.lang.System.out;
import java.util.Scanner;


/**
 *
 * @author xikang
 */
public class Menus {
    
   public void menuStart(){
       int choice = 0;
       
       StockList stocklist = new StockList();
       Stock stock1 = new Stock(1, "Min");
       stocklist.add(stock1);
       Stock stock2 = new Stock(2, "Min");
       stocklist.add(stock2);
       Stock stock3 = new Stock(3, "Min");
       stocklist.add(stock3);
       out.println(stocklist.getById(1).getManfacture());
       
        while ( choice !=14){
       try {
           
           Scanner MenuScanner = new Scanner(System.in);
           
           // Array That contain answer 
           String[] menuQuestion = new String[]{
                   "\t\tMain Menu",
                   "\t\t---------",
                   "Eenter the Menu Number to chooice",
                   "1. Stock Menu",
                   "2. Customer Menu",
                   "3. Purchase Menu",
                   "4. Payment Menu",
                   "Enter Number that you want to continue."
           };
           
          this.buildMenu(menuQuestion); 
          // Build Menu using buildMenu function
          choice = MenuScanner.nextInt();	
          //using method to receive data and convert string to integer
    
           switch(choice){
               case 1:
                 // add list of questions to static array menuQuestion from StockMenu
                menuQuestion = new String[]{
                   "1. add Stock",
                   "2. Delete Stock",
                   "3. List All Stock",
                   "4. Search Stock"
               };
                 this.buildMenu(menuQuestion);
                 int choice1 = this.inputValidation(menuQuestion.length);
                 StockManager stockManager= new StockManager(stocklist);
                 this.decisionMaking(choice1, stockManager);
                 break;
               case 2:
                   break;
           }
           
       } catch (Exception e) {
           
           out.println(e);
       }
        }
   }
   
   protected int inputValidation(int questionNum ){
       
        boolean inputValidation = false;
        int responeNum = 0;
        while ( inputValidation == false){
            Scanner MenuScanner = new Scanner(System.in);
            responeNum = MenuScanner.nextInt();
            
            if(responeNum <= questionNum ){
                
                inputValidation = true;
                
               }else{
                
                 out.println("invalid command !Try again.");
                 inputValidation = false;
                 
               }
        }
        return responeNum;
    }
   
    public void buildMenu(String[] menuQuestion) {
        
          try{
                     for (String question : menuQuestion) {
                        
                         out.println(question);
                     }
                    
        }catch( Exception e){
              
             System.out.print(e);
          }
          
      
    }
    
    // 
    public void decisionMaking(int choice, Manager manager){
        
        switch(choice){
                case 1: 
                    manager.add();
                    break;
                case 2:
                    manager.delete();
                    break;
                case 3:
                    manager.list();
                    break;
                case 4:
                    manager.search();
                    break;
                case 5:
                    break;
        
        }
    }
}
