package Service;

import java.io.File;

/**
 * Created by forteen inches on 7/7/16.
 */

public abstract class AbstractFileFetcher implements FileFetcher{

    protected File inputFile = null;

    public File getFile(String classifier) {
        return inputFile;
    }
}
