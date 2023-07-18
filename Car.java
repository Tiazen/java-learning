public class Car {

    String sound;

    public void go() { 
        System.out.println("Car goes " + sound);
    }

    public String toString() { 
        return "This is a car";
    }

    public Car(String sound) {
        this.sound = sound;
    }

    public static void main(String[] args) { 
        Car ferrari = new Car("whoom");
        ferrari.go();
        System.out.println(ferrari);
    }
}
