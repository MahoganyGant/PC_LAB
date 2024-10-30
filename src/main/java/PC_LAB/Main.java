package PC_LAB;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(45, 25, 10);
        Case theCase = new Case("X", "Tesla", "400 volts", dimensions);
        Resolution resolution = new Resolution(1940, 1080);
        Monitor monitor = new Monitor(resolution, "Model 613", "Tesla");
        Motherboard motherBoard = new Motherboard("ASURA ROUGE", "ASUS", 6, 4, "BIOS v2.5");

        PC pc = new PC(theCase, motherBoard, monitor);
        pc.description();
        pc.powerUp();

    }
}
