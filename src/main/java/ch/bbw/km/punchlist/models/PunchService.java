package ch.bbw.km.punchlist.models;

import ch.bbw.km.punchlist.models.Punch;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PunchService {
    private List<Punch> punchList = new ArrayList<>();

    public List<Punch> getPunchList() {
        return punchList;
    }

    public void addPunch(Punch punch) {
        punchList.add(punch);
    }
}

