package event.management;

class User {
    private int vid ,vcost;
    private String vname,vplace;
    private byte[]picture;
    
    public User(int vid,String vname,String vplace,int vcost,byte[]image)
    {
        this.vid=vid;
        this.vname=vname;
        this.vplace=vplace;
        this.vcost=vcost;
        this.picture=image;
    }
    public int getvid(){
        return vid;
    }
     public String getvname(){
        return vname;
    }
      public String getvplace(){
        return vplace;
    }
      public int getvcost(){
        return vcost;
    }
       public byte[] getImage(){
        return picture;
    }

}
 
