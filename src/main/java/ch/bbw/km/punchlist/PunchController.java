package ch.bbw.km.punchlist;

import ch.bbw.km.punchlist.models.Punch;
import ch.bbw.km.punchlist.models.PunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Controller
public class PunchController {

    @Autowired
    private PunchService punchService;

    @Autowired
    public PunchController(PunchService punchService) {
        this.punchService = punchService;
    }

    @GetMapping("/punchList")
    public String addPunchList(Model model) {
        System.out.println("show punchlistview");
        Punch punch = new Punch ("1", "1 Description", "30.08.2022");
        model.addAttribute("punch", punch);
        return "punchlistview";
    }
    @PostMapping("/punchList")
    public String showPunhList(@ModelAttribute("punch") Punch punch, Model model) {
        System.out.println("add punch to punchList");
        punchService.getPunchList().add(punch);
        System.out.println("add punch to punchList");
        model.addAttribute("punchList", punchService.getPunchList());
        return "punchlistview";
    }


}
