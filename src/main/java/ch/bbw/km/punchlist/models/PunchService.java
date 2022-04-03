package ch.bbw.km.punchlist.models;

import ch.bbw.km.punchlist.models.Punch;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Punch Service to get Punch Items
 * @authhor marco
 * @version04.03.2022
 */
@Service
public class PunchService {
    private List<Punch> punchList = new ArrayList<>() {
        {
            add(new Punch( "Punch 1", "Punch 1 description",  new Date(), "Meter", "Marco","-"));

        }
    };

    public List<Punch> getPunchList() {
        return punchList;
    }

    public void addPunch(Punch punch) {
        punchList.add(punch);
    }
}

