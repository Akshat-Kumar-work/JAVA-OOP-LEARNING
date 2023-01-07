class company {
    int price;
    private int price2; //encapsulation 
    //to acess price 
    public void setprice(int price2){
        this.price2=price2;
    }
    public int getPrice2() {
        return price2;
    }
    public void setPrice2(int price2) {
        this.price2 = price2;
    }
}

public class EncapSulation {
    public static void main (String [] args){
     company ty = new company();
     ty.price=12; //here price can be accessed directly 

     ty.setprice(6); //but here it can accesses only by some special function 
     System.out.println(ty.getPrice2());
    }
}