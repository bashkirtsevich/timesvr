package timesvr.app;

import java.util.Date;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author MAD
 */
@Stateless
@LocalBean
public class time {

    public synchronized static Date GetCurTime() {
        return new Date();
    }
}
