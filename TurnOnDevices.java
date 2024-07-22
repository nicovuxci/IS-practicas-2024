interface Connectable {

   public void turnOff();
   public void turnOn();
   public String isOn();
}

class Lamp implements Connectable {
   @Override
   public void turnOff() {
       System.out.println("Turn off the Lamp...");
   }

   @Override
   public void turnOn() {
       System.out.println("Turn on the Lamp...");
   }

   @Override
   public String isOn() {
       return "On.";
   }

}

class Computer implements Connectable {
   @Override
   public void turnOff() {
       System.out.println("Turn off the Computer...");
   }

   @Override
   public void turnOn() {
       System.out.println("Turn on the Computer...");

   }

   @Override
   public String isOn() {
       return "On.";
   }
}

class CoffeeMaker {
   public void on() {
       System.out.println("Turn on the coffee Maker...");

   };

   public void off() {
       System.out.println("Turn off the coffee Maker...");

   };

   public String isOff() {
       return "Off.";

   }
}

class CoffeeMakerAdapter implements Connectable {
   private final  CoffeeMaker coffeeMaker;

   public CoffeeMakerAdapter(CoffeeMaker object) {
       coffeeMaker = object;
   }

   @Override
   public void turnOff() {
      coffeeMaker.off();
   }

   @Override
   public void turnOn() {
       coffeeMaker.on();

   }

   @Override
   public String isOn() {
      return "On.";
   }

}

public class TurnOnDevices {

    public static void main(String[] args) {

       turnOnDevice(new Lamp());
       turnOnDevice(new Computer());
       turnOnDevice(new CoffeeMakerAdapter(new CoffeeMaker()));

    }

    private static void turnOnDevice(Connectable device) {
       device.turnOn();
       System.out.println(device.isOn());
    }
}