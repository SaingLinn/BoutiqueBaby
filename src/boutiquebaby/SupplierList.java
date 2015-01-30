/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutiquebaby;

import java.util.ArrayList;

/**
 *
 * @author xikang
 */
public class SupplierList {
    
      protected ArrayList<Supplier> supplierList;
    
    public SupplierList(){
      
        supplierList = new ArrayList<>();
    }
    
    public void add(Supplier supplier){
        
        supplierList.add(supplier);
    }
    
    public void deletById(int id){
        
        supplierList.remove(id);
    }
    
    public int getSize(){
        
       return  supplierList.size();
       
    }
    
    public Supplier getById(int id){
        
        return supplierList.get(id);
    }
    
    
    
    
}
