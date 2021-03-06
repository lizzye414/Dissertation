package com.brinsburyanimal.beans;
// Generated 22-Jul-2019 17:44:49 by Hibernate Tools 4.3.1

import com.brinsburyanimal.dao.AnimalDao;
import com.brinsburyanimal.dao.BirdMammalRecordDao;
import com.brinsburyanimal.util.Utilities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * BirdMammalRecord generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class BirdMammalRecord implements java.io.Serializable {

    private BirdMammalRecordId id;
    private Accommodation accommodation;
    private Fed fed;
    private String studentName;
    private Boolean fullClean;
    private Boolean water;
    private Boolean concreteSwept;
    private String enrichment;
    private Boolean securityCheck;
    private Boolean weeding;
    private String comments;
    private String recordTime;
    private String food;
    private Integer amount;
    private String fruitVeg;
    private Boolean ate;
    private Integer amountLeft;

    public BirdMammalRecord() {
    }

    public BirdMammalRecord(BirdMammalRecordId id, Accommodation accommodation) {
        this.id = id;
        this.accommodation = accommodation;
    }

    public BirdMammalRecord(BirdMammalRecordId id, Accommodation accommodation, Fed fed, String studentName, Boolean fullClean, Boolean water, Boolean concreteSwept, String enrichment, Boolean securityCheck, Boolean weeding, String comments) {
        this.id = id;
        this.accommodation = accommodation;
        this.fed = fed;
        this.studentName = studentName;
        this.fullClean = fullClean;
        this.water = water;
        this.concreteSwept = concreteSwept;
        this.enrichment = enrichment;
        this.securityCheck = securityCheck;
        this.weeding = weeding;
        this.comments = comments;
    }

    public BirdMammalRecordId getId() {
        return this.id;
    }

    public void setId(BirdMammalRecordId id) {
        this.id = id;
    }

    public Accommodation getAccommodation() {
        return this.accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public Fed getFed() {
        return this.fed;
    }

    public void setFed(Fed fed) {
        this.fed = fed;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Boolean getFullClean() {
        return this.fullClean;
    }

    public void setFullClean(Boolean fullClean) {
        this.fullClean = fullClean;
    }

    public Boolean getWater() {
        return this.water;
    }

    public void setWater(Boolean water) {
        this.water = water;
    }

    public Boolean getConcreteSwept() {
        return this.concreteSwept;
    }

    public void setConcreteSwept(Boolean concreteSwept) {
        this.concreteSwept = concreteSwept;
    }

    public String getEnrichment() {
        return this.enrichment;
    }

    public void setEnrichment(String enrichment) {
        this.enrichment = enrichment;
    }

    public Boolean getSecurityCheck() {
        return this.securityCheck;
    }

    public void setSecurityCheck(Boolean securityCheck) {
        this.securityCheck = securityCheck;
    }

    public Boolean getWeeding() {
        return this.weeding;
    }

    public void setWeeding(Boolean weeding) {
        this.weeding = weeding;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFruitVeg() {
        return fruitVeg;
    }

    public void setFruitVeg(String fruitVeg) {
        this.fruitVeg = fruitVeg;
    }

    public Boolean getAte() {
        return ate;
    }

    public void setAte(Boolean ate) {
        this.ate = ate;
    }

    public Integer getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(Integer amountLeft) {
        this.amountLeft = amountLeft;
    }
    
    /**
     * Displays the picture of the animal in that accommodation
     */
    public String getPicture(){
        String pictureAreaId = accommodation.getArea();
        int pictureNumberId = accommodation.getNumber();
        String pictureId = pictureAreaId + pictureNumberId;
        return pictureId + ".jpg";
    }
    
    public String saveRecord() {
        Date date = new Date();
        this.id = new BirdMammalRecordId(this.accommodation.getAccommId(), date, this.recordTime);
        BirdMammalRecordDao dao = new BirdMammalRecordDao();
        dao.addRecord(this);
        return "BirdMammal";
    }
    
    public String saveRecordAddHealthCheck() {
        Date date = new Date();
        this.id = new BirdMammalRecordId(this.accommodation.getAccommId(), date, this.recordTime);
        BirdMammalRecordDao dao = new BirdMammalRecordDao();
        dao.addRecord(this);
        return "HealthCheck";
    }   
    
    
    public Fed findFedById(int fedId){
        Fed fedById = new Fed();
        fedById = fedById.getFedById(fedId);
        return fedById;
    }
    
    public List<Animal> getAnimalsInSelectedAccommodation(){
        List<Animal> animals = new ArrayList<>();
        List<Animal> allAnimals = new ArrayList<>();
        AnimalDao dao = new AnimalDao();
        allAnimals = dao.getAllAnimals();
        for(Animal eachAnimal: allAnimals){
            if(eachAnimal.getAccommodation().equals(this.accommodation));
            animals.add(eachAnimal);
        }
        return animals;
    }
    
    public List<BirdMammalRecord> getAllRecords(){
        List<BirdMammalRecord> records = new ArrayList<>();
        BirdMammalRecordDao dao = new BirdMammalRecordDao();
        records = dao.getAllRecords();
        return records;
    }
    
    public List<BirdMammalRecord> getAllRecordsForAccommodation(Accommodation accommodation){
        List<BirdMammalRecord> records = new ArrayList<>();
        BirdMammalRecordDao dao = new BirdMammalRecordDao();
        records = dao.getAllRecordsForAccommodation(accommodation);
        return records;
    } 
    
    public String showRecords(){
        List<BirdMammalRecord> records = this.getAllRecordsForAccommodation(this.accommodation);
        String result = Utilities.printRecordsTable(records);
        return result;
    }
    
    
    
    public String showDailyRecords(){
        List<BirdMammalRecord> records = this.getAllRecordsForAccommodation(this.accommodation);
        List<BirdMammalRecord> selectedRecords = new ArrayList<>();
        for (BirdMammalRecord eachRecord: records){
            if (eachRecord.getAccommodation().equals(this.accommodation)){
                selectedRecords.add(eachRecord);
            }
        }
        String result = Utilities.printRecordsTable(selectedRecords);
        return result;
    }



}
