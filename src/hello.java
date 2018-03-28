import java.io.File;
import java.io.IOException;

public class hello {
    public static void main(String[] args) {
        print(new File("/Users/mingchuang/Pictures/name"), 0);
    }

    public static void print(File file, Integer index) {
        if (file != null) {
//            System.out.println(file.getName());
            for (int i = 0; i < index; i++) {
                if (i == index - 1) {
                    System.out.printf("|--");
                } else {
                    System.out.printf("   ");
                }
            }
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                System.out.println(file.getName());
                for (File file1 : files) {
                    print(file1,index+1);
                }
            } else {
                System.out.println(file.getName());
            }
        }
    }
}
