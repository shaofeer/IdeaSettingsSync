package ${PACKAGE_NAME};

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/**
 * @description: description: 
 * <p>
 * @author:  upuptop
 * <p>
 * @qq: 337081267
 * <p>
 * @CSDN:   http://blog.csdn.net/pyfysf
 * <p>
 * @cnblogs:   http://www.cnblogs.com/upuptop
 * <p>
 * @blog:   http://wintp.top
 * <p>
 * @email:  pyfysf@163.com
 * <p>
 * @time: ${YEAR}/${MONTH}/${DATE}
 * <p>
 */
#parse("File Header.java")
public class ${NAME} extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
