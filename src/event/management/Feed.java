
package event.management;
class Feed {
   // private int vid ,vcost;
    private String name,event,rate,comment;
    private byte[]picture;
    
    public Feed(String name,String event,String rate,String comment,byte[]image)
    {
        this.name=name;
        this.event=event;
        this.rate=rate;
        this.comment=comment;
        this.picture=image;
    }
     public String getname(){
        return name;
    }
      public String getevent(){
        return event;
    }
      public String getrate(){
        return rate;
    }
      public String getcomment(){
        return comment;
    }
       public byte[] getImage(){
        return picture;
    }

}
    

