public class Main
{
    public static void main(String[] args)
    {
        demoInterface dm = User ::new;
        User user = dm.getUser("riya");
        System.out.println("Name:"+ user.userName);
        demoInterface userinterface = s->new User(s);
        User user1 = userinterface.getUser("sonali");
        System.out.println("name:"+user1.userName);
    }
}