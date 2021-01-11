import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    private String nameClass;

    public RegexClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public RegexClass() {
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public void testClass() {
                boolean check = false;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên lớp");
            String name = sc.nextLine();
            String regex = "^[C,A,P]+[0-9]+[G,H,I,K,L,M]$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()) {
                setNameClass(name);
                System.out.println("Tên lớp hợp lệ");
            check = true;
            } else {
                System.out.println("Tên lớp không hợp lệ");
            }
        }while (check == false);
    }
}