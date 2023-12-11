package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
    public boolean check (String filename) throws FilenameException {
        if (filename == null) {
            throw new FilenameException();
        }
        else if (filename.contains(".java")) {
            return true;
        }
        else return false;
    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> myMap = new HashMap<>();
        for (String file : filenames) {
            try {
                if(check(file) == true) {
                    myMap.put(file, 1);
                }
                else {
                    myMap.put(file, 0);
                }

            }
            catch(FilenameException e){
                myMap.put(file, -1);
                e.printStackTrace();
            }
        }
        return myMap;
    }
}
