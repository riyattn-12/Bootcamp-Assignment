public class User {
    private String firstname, lastname;
    private int age;
    long pno;

    public User(String firstname, String lastname, int age, long pno) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phono=" + pno +
                '}';
    }

}
