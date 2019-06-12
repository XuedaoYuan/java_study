package chuanzhi0611_file;

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        String filename = pathname.getName();
      /*  String[] arr = filename.split(".");
        if (arr.length > 0) {
            String extendName = arr[arr.length - 1];
            return extendName == "java";
        } else {
            return false;
        }*/

        if (filename == "chuanzhi0611_file") {
            return true;
        }
        return false;
    }
}
