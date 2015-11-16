package designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Tomek on 2015-11-16.
 */
public class BossOffice {
    private BossOffice() {}

    private Random random = new Random();

    private Map<String, Integer> requestCounter = new HashMap<String, Integer>();

    public boolean askForRise(String employeeId) throws IllegalAccessException {
        boolean requestAccepted = random.nextBoolean();

        if (requestCounter.containsKey(employeeId)) {
            int count = requestCounter.get(employeeId);
            if (count > 4) {
                throw new IllegalArgumentException("You ask for raise too mant times! FIRED!");
            }
            count++;
            requestCounter.put(employeeId, count);
        } else {
            requestCounter.put(employeeId, 1);
        }

        return requestAccepted;
    }

    private static class SingeltonHolder {
        public static final BossOffice INSTANCE = new BossOffice();
    }

    public static BossOffice getInstance() {
        return SingeltonHolder.INSTANCE;
    }

    public int getEmployeeRequestCount(String employeeId) {
        return requestCounter.get(employeeId);
    }
}
