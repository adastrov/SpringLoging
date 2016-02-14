import com.palagen.logging.config.Config;
import com.palagen.logging.res.Resource;
import org.apache.log4j.Logger;

public class MainS {

    private static String LOG_PROPERTIES_FILE = Resource.Log.LOG_PROPERTIES_FILE;

    private static Logger logger = Logger.getLogger(MainS.class);

    public static void main(String []argv) {
        // Log4j
        Config conf = new Config(LOG_PROPERTIES_FILE);
        conf.init();

        logger.info("Program run...");

        logger.info("message...", new Exception());



    }

}
