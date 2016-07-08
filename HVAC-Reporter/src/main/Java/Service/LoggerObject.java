package Service;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by forteen inches on 7/7/16.
 */
public class LoggerObject {
    static Logger logger = null;
    static FileHandler fh;


    public static Logger getLoggerObject(){

        if(logger==null) {
            logger = Logger.getLogger("HVAC-Reporter-Log");Logger.getLogger("HVAC-Reporter-Log");
            try {
                fh = new FileHandler("/home/forteeninches/HVACDataAnalysis/HVAC-Reporter/log/systemLog.log");
            } catch (IOException e) {
                e.printStackTrace();
            }
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            return logger;
        }else{
            return logger;
        }
    }
}
