public class User {

    private final String trap;
    private final int i;

    public User(String trap, int i) {
        this.trap = trap;
        this.i = i;
        for (int j = 0; j < 100; j++) {
            System.out.println(j);
        }
        method();
    }

    private void method() {

    }

}
