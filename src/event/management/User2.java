
package event.management;

class User2 {
     private int eid ,ecost;
     private String ename;
      private byte[] picture;
       
      public User2(int eid,String ename,int ecost,byte[]image)
    {
        this.eid=eid;
        this.ename=ename;
        this.ecost=ecost;
        this.picture=image;
    }
    public int geteid(){
        return eid;
    }
     public String getename(){
        return ename;
    }
      public int getecost(){
        return ecost;
    }
        public byte[] getImage(){
          return picture;
      }
}
