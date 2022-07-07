package GenericLib;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class propertyFile implements Constants {

    /**
     *
     * @author QSP
     *
     */

        /**
         * To read the data from propertyfile
         * @param keysvalue
         * @return
         * @throws FileNotFoundException
         * @throws IOException
         */

        public String getPropertyData(String keysvalue) throws FileNotFoundException, IOException {
            Properties p=new Properties();
            p.load(new FileInputStream(propertyfilepath));
            return p.getProperty(keysvalue);


        }

    }


