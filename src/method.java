public class method {
    public static void main(String[] args){
      double yeild=calculatePropertyYield(130000,250000);
        System.out.println(yeild + "%");
    }
    private static  double calculatePropertyYield(double rent ,double propertyPrice){
        double yearlyRent=rent *12;
        double yield=(yearlyRent /propertyPrice)*100;
        return yield;
    }
}
