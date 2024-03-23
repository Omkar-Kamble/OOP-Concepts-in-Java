public class Lamp{
    boolean isLampOn;

    void turnOn(){
        isLampOn = true;
        System.out.println("Light is turned on...");
    }

    void turnOff(){
        isLampOn = false;
        System.out.println("Light is turned off...");
    }
}