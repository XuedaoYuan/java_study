package chuanzhi0611_file;

import java.io.File;
import java.io.FilenameFilter;

public class DemoMain3 {
    public static void main(String[] args) {
        File f = new File("/Users/cloud/Desktop/frontEndTestCode/java_study_05_06/src");
        getAffFile(f);
    }

    public static void getAffFile(File f) {

        /*File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.isDirectory() || name.toLowerCase().endsWith("java");
            }
        });*/
        File[] files = f.listFiles((File dir, String name) -> {
            return dir.isDirectory() || name.toLowerCase().endsWith("java");
        });
        for (File file : files) {
            if (file.isDirectory()) {
                getAffFile(file);
            } else {
                System.out.println(file.getName());
            }
        }
    }
}
