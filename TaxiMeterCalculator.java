class TaxiMeterCalculator {
    private double distance;
    private double traffic;

    public void setDistance(double dis){
        if (dis<0)
            System.out.println("Error!");
        else 
            distance = dis; 
    }

    public void setTraffic(double traf){
        if (traf<0)
            System.out.println("Error!");
        else 
            traffic = traf; 
    }
    
    public double priceCalculate(){
        double fee = 35 + (distance * 10) + (traffic * 2);
        return fee; 
    }
    public void showPrice(double fee){
        System.out.println(distance +" km. and " + traffic + " mins of traffic = " + fee + "THB");
    }
}

class MeterDemo{
    public static void main(String[] args) {
        TaxiMeterCalculator testTexi = new TaxiMeterCalculator();
        testTexi.setDistance(100);
        testTexi.setTraffic(5);
        testTexi.showPrice(testTexi.priceCalculate());
    }
}