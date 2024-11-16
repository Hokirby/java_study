package Exercise.Exercise1000.Problem027;

public class User {
    String name;
    boolean isMale;
    double point;

    public User(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
        this.point = Math.random() * 5;
    }

    public String toString() {
        return String.format("%s(%s: %.1f)\n", name, isMale, point);
    }

    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("소희", false);
        users[1] = new User("영수", true);
        users[2] = new User("설민", true);
        users[3] = new User("민아", false);
        users[4] = new User("호수", false);
        users[5] = new User("민성", true);
        users[6] = new User("종현", true);
        users[7] = new User("민영", false);
        users[8] = new User("지은", false);
        users[9] = new User("상현", true);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                User source = users[i];
                User target = users[j];
                if (source.isMale != target.isMale) {
                    if (Math.abs(source.point - target.point) < 0.8)
                        System.out.println(source.toString() + " - " + target.toString());
                }
            }
        }
    }
}
