public class App {
    public static void main(String[] args) throws Exception {

        multiply(10);
    }

    public static void multiply(int number) {
        for (int i = 0; i < 11; i++) {
            int result = i * number;
            System.out.println(result);
        }
    }
}
