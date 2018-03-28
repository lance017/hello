import java.io.*;

public class demo {
    public static void main(String[] args) {
        System.out.println(File.separator);
        System.out.println(File.separatorChar);
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);

        String path = "/Users/mingchuang"+File.separator+"name.text";

//        createFile(path);

//        delete(path);

        printListName("/Users/mingchuang/music");

        try {
            write(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 创建文件
     * @param path
     */
    private static void createFile(String path) {
        File file = new File(path);
        try {
            // 创建文件 这个方法父文件夹必须存在否则创建失败
            file.createNewFile();
            // 创建文件夹，这个方法父文件夹必须存在否则创建失败
//            file.mkdir();
            // 创建文件夹，如果父文件夹不存在可以递归创建
//            file.mkdirs();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }


    private static void delete(String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }else {
            System.out.println("没有此文件");
        }
    }


    private static void printListName(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            // 这里仅仅是文件或者文件夹的名称
            String[] fileListName = file.list();
            for (String name : fileListName) {
                System.out.println(name);
            }
            // 这里列出的是完整路径
            File[] files = file.listFiles();
            for (File file1 : files) {
                System.out.println(file1);
            }

        } else {
            System.out.println("该路径不是文件夹");
        }
    }


    private static void write(String path) throws IOException {
        File file = new File(path);

//        file.createNewFile();
        OutputStream stream = new FileOutputStream(file,true);
        byte[] bytes = "你好".getBytes();
        for (byte b : bytes) {
            stream.write(b);
        }
//        stream.write(bytes);
        stream.close();

    }

//    private static void read(String path) throws FileNotFoundException {
//        File file = new File(path);
//        InputStream stream = new FileInputStream(file);
//        byte[] bytes = new b
//
//    }
//
//    private static void writeForString(String path) {
//        File file = new File(path);
//
//
//    }
}
