public class CastingTest1 {

    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;       //업케스팅 그러나 fe에서 water()는 사용 불가.
        //car.water();
        fe2 = (FireEngine)car;  //다운 케스팅 어쩃든 다운 케스팅이다.
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive()    {
        System.out.println("drive, Brrrrr~");
    }

    void stop()     {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water()    {
        System.out.println("water~!!!");
    }
}