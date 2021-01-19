import java.io.*;

public class Loggbok {
    private String filename;
    private String time;
    private String log;
    private String text;
    private String textFile = "data.txt";
    private String data[];

    public Loggbok(String filename, String time, String log) {
        this.filename = filename;
        this.time = time;
        this.log = log;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTime() {
        return time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    private void CharStreamExample() throws IOException {

        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(textFile)));
            for (int i = 0; i < data.length; i++) {
                out.println(data[i]);
            }
        } finally {
            out.close();
        }
    }
}