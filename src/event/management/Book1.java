
package event.management;

import java.time.LocalDate;
import java.util.Date;

class Book1 {
      private int customerid,guests,vcost,fcost,ecost,total ;
    private String customername,eventtype,venue,food,equipment;
    Date date = new Date();
    
    public  Book1(int customerid,int guests,int vcost,int fcost,int ecost,int total ,String customername,String eventtype,String venue,String food,String equipment,Date date)
    {
        this.customerid=customerid;
        this.guests=guests;
        this.vcost=vcost;
        this.fcost=fcost;
        this.ecost=ecost;
        this.total=total;
        this.customername=customername;
        this.eventtype=eventtype;
        this.venue=venue;
        this.food=food;
        this.equipment=equipment;
        this.date=date;
           
    }
    public int getcustomerid(){
        return customerid;
    }
    public int getguests(){
        return guests;
    }
    public int getvcost(){
        return vcost;
    }
    public int getfcost(){
        return fcost;
    }
    public int getecost(){
        return ecost;
    }
    public int gettotal(){
        return total;
    }
     public String getcustomername(){
        return customername;
    }
      public String geteventtype(){
        return eventtype;
    }
      public String getvenue(){
        return venue;
    }
      public String getfood(){
        return food;
    }
      public String getequipment(){
        return equipment;
    }
       public Date getdate(){
        return date;
    }
      
       
}

