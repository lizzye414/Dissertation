package com.brinsburyanimal.beans;
// Generated 22-Jul-2019 17:44:49 by Hibernate Tools 4.3.1


import com.brinsburyanimal.dao.CleaningDao;
import com.brinsburyanimal.util.Utilities;
import java.util.ArrayList;
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
 * Cleaning generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class Cleaning  implements java.io.Serializable {


     private Integer cleaningId;
     private String descript;
     private Set specieses = new HashSet(0);
     private List<Integer> cleaningIdList = new ArrayList<>();

    public Cleaning() {
    }

	
    public Cleaning(int cleaningId) {
        this.cleaningId = cleaningId;
    }
    public Cleaning(int cleaningId, String descript, Set specieses) {
       this.cleaningId = cleaningId;
       this.descript = descript;
       this.specieses = specieses;
    }
   
    public int getCleaningId() {
        return this.cleaningId;
    }
    
    public void setCleaningId(int cleaningId) {
        this.cleaningId = cleaningId;
    }
    public String getDescript() {
        return this.descript;
    }
    
    public void setDescript(String descript) {
        this.descript = descript;
    }
    public Set getSpecieses() {
        return this.specieses;
    }
    
    public void setSpecieses(Set specieses) {
        this.specieses = specieses;
    }
    
    public List<Cleaning> getAllCleanings() {
        List<Cleaning> cleanings = new ArrayList<>();
        CleaningDao dao = new CleaningDao();
        cleanings = dao.getAllCleaning();
        return cleanings;
    }
    
    public List<Integer> getAllCleaningIds(){
        cleaningIdList.clear();
        List<Cleaning> cleanings = this.getAllCleanings();
        
        for (Cleaning eachCleaning : cleanings){
            cleaningIdList.add(eachCleaning.cleaningId); 
        }
        return cleaningIdList;
    }
       
    public Cleaning findCleaningById(String cleaningId){
        Cleaning cleaning = new Cleaning();
        List<Cleaning> cleanings = this.getAllCleanings();
        int chosenCleaningId = Integer.parseInt(cleaningId);
        for (Cleaning eachClean: cleanings){
            if(eachClean.getCleaningId() == chosenCleaningId){
                cleaning = eachClean;
            }
        }
        return cleaning;        
    }
    
    public String showCleaning(){
        List<Cleaning> cleaning = this.getAllCleanings();
        String result = Utilities.printCleaningTable(cleaning);
        return result;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cleaningId != null ? cleaningId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cleaning)) {
            return false;
        }
        Cleaning other = (Cleaning) object;
        if ((this.cleaningId == null && other.cleaningId != null) || (this.cleaningId != null && !this.cleaningId.equals(other.cleaningId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.beans.Cleaning[ cleaningId=" + cleaningId + " ]";
    }
    
    @FacesConverter("CleaningConverter")
    public static class CleaningConverter implements Converter {

        private Cleaning cleaning = new Cleaning();

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            try {
                return cleaning.findCleaningById(value);
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(value + " is not a valid Cleaning ID"), e);
            }
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return "";
            }

            if (object instanceof Cleaning) {
                return String.valueOf(((Cleaning) object).getCleaningId());
            } else {
                throw new ConverterException(new FacesMessage(object + " is not a valid Cleaning"));
            }
        }

    }




}

