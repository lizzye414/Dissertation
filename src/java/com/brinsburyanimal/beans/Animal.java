package com.brinsburyanimal.beans;
// Generated 22-Jul-2019 17:44:49 by Hibernate Tools 4.3.1


import com.brinsburyanimal.dao.AnimalDao;
import com.brinsburyanimal.dao.HealthCheckDao;
import com.brinsburyanimal.util.Utilities;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * Animal generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class Animal  implements java.io.Serializable {


     private AnimalId id;
     private Accommodation accommodation;
     private Species species;
     private String idNo;
     private Date dob;
     private String sex;
     private String distFeatures;
     private Boolean inCollection = true;
     private Set sloughs = new HashSet(0);
     private Set healthChecks = new HashSet(0);
     private String latinName;
     private String animalName;

    public Animal() {
    }

	
    public Animal(AnimalId id) {
        this.id = id;
    }
    public Animal(AnimalId id, Accommodation accommodation, Species species, String idNo, Date dob, String sex, String distFeatures, Boolean inCollection, Set sloughs, Set healthChecks) {
       this.id = id;
       this.accommodation = accommodation;
       this.species = species;
       this.idNo = idNo;
       this.dob = dob;
       this.sex = sex;
       this.distFeatures = distFeatures;
       this.inCollection = inCollection;
       this.sloughs = sloughs;
       this.healthChecks = healthChecks;
    }
   
    public AnimalId getId() {
        return this.id;
    }
    
    public void setId(AnimalId id) {
        this.id = id;
    }
    public Accommodation getAccommodation() {
        return this.accommodation;
    }
    
    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }
    public Species getSpecies() {
        return this.species;
    }
    
    public void setSpecies(Species species) {
        this.species = species;
    }
    public String getIdNo() {
        return this.idNo;
    }
    
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getDistFeatures() {
        return this.distFeatures;
    }
    
    public void setDistFeatures(String distFeatures) {
        this.distFeatures = distFeatures;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
    
    
    
    public Boolean getInCollection() {
        return this.inCollection;
    }
    
    public void setInCollection(Boolean inCollection) {
        this.inCollection = inCollection;
    }
    public Set getSloughs() {
        return this.sloughs;
    }
    
    public void setSloughs(Set sloughs) {
        this.sloughs = sloughs;
    }
    public Set getHealthChecks() {
        return this.healthChecks;
    }
    
    public void setHealthChecks(Set healthChecks) {
        this.healthChecks = healthChecks;
    }  
    
    public String saveAnimal() {
        this.id = new AnimalId(this.latinName, this.animalName);
        AnimalDao dao = new AnimalDao();
        dao.addAnimal(this);
        clearAll();
        return "CentreMgt";
    }
    
        private void clearAll() {
        this.animalName = "";
        this.idNo = "";
        this.dob = null;
        this.sex = "";
        this.distFeatures = "";
    }
    
    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        AnimalDao dao = new AnimalDao();
        animals = dao.getAllAnimals();
        return animals;
    }
    
    public Animal findAnimalById(AnimalId animalId){
        Animal animal = new Animal();
        List<Animal> allAnimals = this.getAllAnimals();
        for (Animal eachAnimal: allAnimals){
            if(eachAnimal.getId().equals(animalId)){
                animal = eachAnimal;
            }
        }
        return animal;        
    }
    
    public Animal findAnimalByStringId(String animalId){
        Animal animal = new Animal();
        List<Animal> allAnimals = this.getAllAnimals();
        for (Animal eachAnimal: allAnimals){
            if(eachAnimal.getId().toString().equals(animalId)){
                animal = eachAnimal;
            }
        }
        return animal;        
    }
    
    public String getAnimalNameFromId(){
        String name = this.id.getAnimalName();
        return name;
    }
    
    public String showAnimals(){
        List<Animal> animals = this.getAllAnimals();
        String result = Utilities.printAnimalTable(animals);
        return result;
    }
    
    public List<String> getAllAnimalNames(){
        List<Animal> allAnimals = this.getAllAnimals();
        List<String> animalNames = new ArrayList<>();
        for (Animal eachAnimal: allAnimals){
            animalNames.add(eachAnimal.getAnimalName());
        }
        return animalNames;
    }
    
    public List<Animal> getAllAnimalsinAccommodation(){
        List<Animal> allAnimals = this.getAllAnimals();
        List<Animal> animalsInAccomm = new ArrayList<>();
        for (Animal eachAnimal: allAnimals){
            if(eachAnimal.accommodation.equals(this.accommodation)){
                animalsInAccomm.add(eachAnimal);
            }
        }
        return animalsInAccomm;        
    }
    
    public List<HealthCheck> getHealthChecksForAccommodation(){
        List<Animal> animalsInAccomm = this.getAllAnimalsinAccommodation();
        List<HealthCheck> healthChecks = new ArrayList<>();
        HealthCheckDao dao = new HealthCheckDao();
        for(Animal eachAnimal: animalsInAccomm){
            healthChecks.addAll(dao.getHealthChecksForAnimal(eachAnimal));
        }
        return healthChecks;
    }
    
    public String showHealthChecks(){
        List<HealthCheck> healthChecks = this.getHealthChecksForAccommodation();
        String result = Utilities.printHealthCheckTable(healthChecks);
        return result;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.beans.Animal[id=" + id + "]";
    }
    
    @FacesConverter("AnimalConverter")
    public static class AnimalConverter implements Converter {

        private Animal animal = new Animal();

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            try {
                 return animal.findAnimalByStringId(value);
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(value + " is not a valid animal ID"), e);
            }
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return "";
            }

            if (object instanceof Animal) {
                return String.valueOf(((Animal) object).getId());
            } else {
                throw new ConverterException(new FacesMessage(object + " is not a valid animal"));
            }
        }
    }
    
    




}


