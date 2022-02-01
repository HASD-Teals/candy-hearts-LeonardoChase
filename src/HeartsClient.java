public class HeartsClient {
    public static void main(String[] args){

      Heart group1 = new Heart("red",3,"Hi",0,5.00,50);
      Heart group2 = new Heart("teal",3,"Love CS-A",0,4.50,200);
      Heart group3 = new Heart("green",2,"Go Girl!",0,3.50,75);

      System.out.println(group1.getReport());
      System.out.println(group2.getReport());
      System.out.println(group3.getReport());

      Heart [] store = new Heart[3];
      store[0]=group1;
      store[1]=group2;
      store[2]=group3;

      System.out.println(buyOut (store));
    }

    public static int buyOut (Heart[] store) {
        int total=0;
        for (int i=0; i<store.length; i++) {
            total = total + store[i].getStock();
        }

        return total;
    }
}
