package controller;

public class UseController{
    public static void main(String[] args) {
        Controller controller = new Controller(5);
        controller.ToString();
        controller.Choose(3);
        controller.ToString();
        controller.Choose(1);
        controller.ToString();
        System.out.println("MaDioca'");
    }
}
