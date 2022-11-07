//Current working directory:
public class CurrentDirectory1 {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println("Working Directory = " + path);

    }
}

//Output:  Working Directory = /home




//Using Path:
import java.nio.file.Paths;
public class CurrDirectory2 {
    public static void main(String[] args) {
        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);

    }
}
