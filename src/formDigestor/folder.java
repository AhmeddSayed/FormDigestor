package formDigestor;

import java.io.File;

public class folder {

    //String FolderPath = "F:\\Ahmed\\yellout\\Yellout-Forms";
    String FolderPath = "resources";
    File folder = new File(FolderPath);
    File[] allFiles = folder.listFiles();
    public void folder() {
        // No Cooking Recipe for now
    }
}