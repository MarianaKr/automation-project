package utilities;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class CustomFile {

    public String getDriverFilePath(String driverFileName) {
        return getResourceFilePath(driverFileName);
    }


    private String getResourceFilePath(String fileName) {
        try {
            URL res = getClass().getClassLoader().getResource(fileName);
            File file = Paths.get(res.toURI()).toFile();
            String absolutePath = file.getAbsolutePath();

            return absolutePath;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return "";
        }
    }
}
