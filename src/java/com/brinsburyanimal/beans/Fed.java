package com.brinsburyanimal.beans;
// Generated 22-Jul-2019 17:44:49 by Hibernate Tools 4.3.1


import com.brinsburyanimal.dao.BirdMammalRecordDao;
import com.brinsburyanimal.dao.FedDao;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Fed generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class Fed  implements java.io.Serializable {


     private int fedId;
     private String food;
     private Integer amount;
     private String fruitVeg;
     private Boolean ate;
     private Integer amountLeft;
     private Set fishRecords = new HashSet(0);
     private Set birdMammalRecords = new HashSet(0);
     private Set herptileRecords = new HashSet(0);

    public Fed() {
    }
    
    public Fed(String food, Integer amount, String fruitVeg, Boolean ate, Integer amountLeft){
       this.food = food;
       this.amount = amount;
       this.fruitVeg = fruitVeg;
       this.ate = ate;
       this.amountLeft = amountLeft;
    }

	
    public Fed(int fedId) {
        this.fedId = fedId;
    }
    public Fed(int fedId, String food, Integer amount, String fruitVeg, Boolean ate, Integer amountLeft, Set fishRecords, Set birdMammalRecords, Set herptileRecords) {
       this.fedId = fedId;
       this.food = food;
       this.amount = amount;
       this.fruitVeg = fruitVeg;
       this.ate = ate;
       this.amountLeft = amountLeft;
       this.fishRecords = fishRecords;
       this.birdMammalRecords = birdMammalRecords;
       this.herptileRecords = herptileRecords;
    }

  
    public int getFedId() {
        return this.fedId;
    }
    
    public void setFedId(int fedId) {
        this.fedId = fedId;
    }
    public String getFood() {
        return this.food;
    }
    
    public void setFood(String food) {
        this.food = food;
    }
    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public String getFruitVeg() {
        return this.fruitVeg;
    }
    
    public void setFruitVeg(String fruitVeg) {
        this.fruitVeg = fruitVeg;
    }
    public Boolean getAte() {
        return this.ate;
    }
    
    public void setAte(Boolean ate) {
        this.ate = ate;
    }
    public Integer getAmountLeft() {
        return this.amountLeft;
    }
    
    public void setAmountLeft(Integer amountLeft) {
        this.amountLeft = amountLeft;
    }
    public Set getFishRecords() {
        return this.fishRecords;
    }
    
    public void setFishRecords(Set fishRecords) {
        this.fishRecords = fishRecords;
    }
    public Set getBirdMammalRecords() {
        return this.birdMammalRecords;
    }
    
    public void setBirdMammalRecords(Set birdMammalRecords) {
        this.birdMammalRecords = birdMammalRecords;
    }
    public Set getHerptileRecords() {
        return this.herptileRecords;
    }
    
    public void setHerptileRecords(Set herptileRecords) {
        this.herptileRecords = herptileRecords;
    }
    
    public String saveRecord() {
        FedDao daoFed = new FedDao();
        daoFed.addRecord(this);
        return "BirdMammalRecord";
    }
    
    public List<Fed> getAllFeds(){
        List<Fed> feds = new ArrayList<>();
        FedDao dao = new FedDao();
        feds = dao.getAllFeds();
        return feds;
    }
    
    public Fed getFedById(int theFedId){
        Fed selectedFed = new Fed();
        List<Fed> feds = this.getAllFeds();
        for(Fed eachFed: feds){
            if (eachFed.fedId == theFedId){
                selectedFed = eachFed;
            }
        }
        return selectedFed;
    }
        
        
    }






