public class BicycleClient{
    public static void main(String[] args) {

        // creating an object1
        Bicycle sportsBicyle = new Bicycle();
        System.out.println(sportsBicyle.gear);
        sportsBicyle.braking();

        // creating an object2
        Bicycle touringBicycle = new Bicycle();
        System.out.println(touringBicycle.gear);
        touringBicycle.braking();
    }
}