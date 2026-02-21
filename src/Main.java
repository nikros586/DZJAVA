public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        TransportManager transportManager = new TransportManager();
        transportManager.startTranspoert(car);
        transportManager.startTranspoert(bike);
    }
}

interface Transport{
    void move();
}

class Car implements Transport{
    @Override
    public void move(){
        System.out.println("Врум врум");
    }
}
class Bike implements Transport{
    @Override
    public void move(){
        System.out.println("скрип скрип");
    }
}

class TransportManager{
    void startTranspoert(Transport transport){
        transport.move();
    }
}