public class Runner {

    public static void main(String[] args) {

        WaterBottle myBottle = new WaterBottle(100);
        myBottle.drink();
        System.out.println(myBottle.volume());
    }
}
