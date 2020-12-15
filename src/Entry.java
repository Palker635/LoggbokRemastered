import java.util.Date;

public class Entry {

    private String User;
    private String Text;
    public Date TimeEntry;

    public Entry(String getText, String User, String Time) {
        this.User = getUser();

    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        this.Text = Text;
    }

    public java.util.Date getTimeEntry() {
        TimeEntry = java.util.Calendar.getInstance().getTime();
        System.out.println(TimeEntry);
        return TimeEntry;
    }

    public String getUser() {
        return User;
    }
}