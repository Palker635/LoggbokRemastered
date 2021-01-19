public class User {
    private String name;
    private String lastname;
    private String User;


    public User(String name, String lastname, String User) {
        this.User = User;
        this.lastname = lastname;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUser() {
        return User;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUser(String user) {
        User = user;
    }



}