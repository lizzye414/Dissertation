/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brinsburyanimal.util;

import com.brinsburyanimal.beans.Accommodation;
import com.brinsburyanimal.beans.Animal;
import com.brinsburyanimal.beans.BirdMammalRecord;
import com.brinsburyanimal.beans.Cleaning;
import com.brinsburyanimal.beans.Feeding;
import com.brinsburyanimal.beans.HealthCheck;
import com.brinsburyanimal.beans.Species;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Liz
 */
public class Utilities {
    
    public static String printAccommodationTable(List<Accommodation> accommodations)
   {
      StringBuilder temp = new StringBuilder("<table>");

      String header = "<tr><th>%s</th><th>%s</th><th>%s</th></tr>";
      String row = "<tr><td>%s</td><td>%s</td>td>%s</td></tr>";

      temp.append(String.format(header, "id", "area", "number"));

      System.out.println(temp.toString());

      for (int i = 0; i < accommodations.size(); i++)
      {
         Accommodation accommodation = (Accommodation) accommodations.get(i);
     

         int id = accommodation.getAccommId();
         String area = accommodation.getArea();
         int number = accommodation.getNumber();

         temp.append(String.format(row, id, area, number));

         System.out.println(String.format(row, id, area, number));
      }

      temp.append("</table>");

      return temp.toString();
   }
    
   public static String printSpeciesTable(List<Species> species)
   {
      StringBuilder temp = new StringBuilder("<table>");

      String header = "<tr><th>%s</th><th>%s</th><th>%s</th></tr>";
      String row = "<tr><td>%s</td><td>%s</td><td>%s</td></tr>";

      temp.append(String.format(header, "Latin Name", "Common Name", "Info"));

      System.out.println(temp.toString());

      for (int i = 0; i < species.size(); i++)
      {
         Species oneSpecies = (Species) species.get(i);
     

         String latinName = oneSpecies.getLatinName();
         String commonName = oneSpecies.getCommonName();
         String info = oneSpecies.getInfo();

         temp.append(String.format(row, latinName, commonName, info));

         System.out.println(String.format(row, latinName, commonName, info));
      }

      temp.append("</table>");

      return temp.toString();
   }
   
   public static String printCleaningTable(List<Cleaning> cleanings)
   {
      StringBuilder temp = new StringBuilder("<table>");

      String header = "<tr><th>%s</th><th>%s</th></tr>";
      String row = "<tr><td>%s</td><td>%s</td></tr>";

      temp.append(String.format(header, "Cleaning ID", "Description"));

      System.out.println(temp.toString());

      for (int i = 0; i < cleanings.size(); i++)
      {
         Cleaning cleaning = (Cleaning) cleanings.get(i);
     

         int cleaningId = cleaning.getCleaningId();
         String description = cleaning.getDescript();
         
         temp.append(String.format(row, cleaningId, description));

         System.out.println(String.format(row, cleaningId, description));
      }

      temp.append("</table>");

      return temp.toString();
   }
   
   public static String printFeedingTable(List<Feeding> feedings)
   {
      StringBuilder temp = new StringBuilder("<table>");

      String header = "<tr><th>%s</th><th>%s</th><th>%s</th><th>%s</th></tr>";
      String row = "<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>";

      temp.append(String.format(header, "Feeding Id", "Description", "AM", "PM"));

      System.out.println(temp.toString());

      for (int i = 0; i < feedings.size(); i++)
      {
         Feeding feeding = (Feeding) feedings.get(i);
     

         int feedingId = feeding.getFeedingId();
         String description = feeding.getDescript();
         Boolean am = feeding.getAm();
         Boolean pm = feeding.getPm();

         temp.append(String.format(row, feedingId, description, am, pm));

         System.out.println(String.format(row, feedingId, description, am, pm));
      }

      temp.append("</table>");

      return temp.toString();
   }
   
   public static String printAnimalTable(List<Animal> animals)
   {
      StringBuilder temp = new StringBuilder("<table>");

      String header = "<tr><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th></tr>";
      String row = "<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>";

      temp.append(String.format(header, "Latin name", "Name", "Accommodation", "Date of Birth", "Sex", "Distinguishing features"));

      System.out.println(temp.toString());

      for (int i = 0; i < animals.size(); i++)
      {
         Animal animal = (Animal) animals.get(i);
     

         String latinName = animal.getId().getLatinName();
         String name = animal.getId().getAnimalName();
         String accommodation = animal.getAccommodation().getIdentity();
         Date dob = animal.getDob();
         String sex = animal.getSex();
         String dist = animal.getDistFeatures();

         temp.append(String.format(row, latinName, name, accommodation, dob, sex, dist));

         System.out.println(String.format(row, latinName, name, accommodation, dob, sex, dist));
      }

      temp.append("</table>");

      return temp.toString();
   }
   
   public static String printHealthCheckTable(List<HealthCheck> healthChecks)
   {
      StringBuilder temp = new StringBuilder("<table>");

      String header = "<tr><th>%s</th><th>%s</th><th>%s</th><th>%s</th></tr>";
      String row = "<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>";

      temp.append(String.format(header, "Date", "Weight", "Health issue", "Treatment"));

      System.out.println(temp.toString());

      for (int i = 0; i < healthChecks.size(); i++)
      {
         HealthCheck healthCheck = (HealthCheck) healthChecks.get(i);
     

         Date date = healthCheck.getId().getRecordDate();
         int weight = healthCheck.getWeight();
         String healthIssue = healthCheck.getHealthIssue();
         String treatment = healthCheck.getTreatment();

         temp.append(String.format(row, date, weight, healthIssue, treatment));

         System.out.println(String.format(row, date, weight, healthIssue, treatment));
      }

      temp.append("</table>");

      return temp.toString();
   }
   
   public static String printRecordsTable(List<BirdMammalRecord> records)
   {
      StringBuilder temp = new StringBuilder("<table>");

      String header = "<tr><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th><th>%s</th></tr>";
      String row = "<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>";

      temp.append(String.format(header, "Student name", "Date", "Time", "Full clean", "Water changed", "Swept", "Enrichment", "Security", "Weeding", "Comments"));

      System.out.println(temp.toString());

      for (int i = 0; i < records.size(); i++)
      {
         BirdMammalRecord bmRecord = (BirdMammalRecord) records.get(i);
     

         String name = bmRecord.getStudentName();
         Date date = bmRecord.getId().getRecordDate();
         String time = bmRecord.getId().getRecordTime();
         Boolean clean = bmRecord.getFullClean();
         Boolean water = bmRecord.getWater();
         Boolean swept = bmRecord.getConcreteSwept();
         String enrichment = bmRecord.getEnrichment();
         Boolean security = bmRecord.getSecurityCheck();
         Boolean weeding = bmRecord.getWeeding();
         String comments = bmRecord.getComments();

         temp.append(String.format(row, name, date, time, clean, water, swept, enrichment, security, weeding, comments));

         System.out.println(String.format(row, name, date, time, clean, water, swept, enrichment, security, weeding, comments));
      }

      temp.append("</table>");

      return temp.toString();
   }
    
}
