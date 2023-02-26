package SingleMethod;
public class Main {
    public static void main(String[] args) {
        SingleMethodInterface instance = new SingleMethodInterface() {
            @Override
            public void doSomething() {
                System.out.println("Анонимный класс производит какую-то работу");
            }
        };
    }
}