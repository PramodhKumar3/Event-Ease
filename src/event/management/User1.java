package event.management;


class User1 {
    private int fid ,fcost;
    private String fname;
    private byte[] picture;

    
    public User1(int fid,String fname,int fcost,byte[]image)
    {
        this.fid=fid;
        this.fname=fname;
        this.fcost=fcost;
        this.picture=image;
        
    }
    public int getfid(){
        return fid;
    }
     public String getfname(){
        return fname;
    }
      public int getfcost(){
        return fcost;
    }
      public byte[] getImage(){
          return picture;
      }
       
}

    

