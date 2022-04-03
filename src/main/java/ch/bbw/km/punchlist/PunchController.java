package ch.bbw.km.punchlist;

import ch.bbw.km.punchlist.models.Punch;
import ch.bbw.km.punchlist.models.PunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * PunchController
 * @author marco
 * @version 03.04.2022
 */
@Controller
public class PunchController {

    @Autowired
    private PunchService punchService;

    @Autowired
    public PunchController(PunchService punchService) {
        this.punchService = punchService;
    }

    @GetMapping("/")
    @RequestMapping(value = {"/", "/punchList"}, method = RequestMethod.GET)
    public String addPunchList(Model model) {
        System.out.println("Controller show punchlistview");
        model.addAttribute("punch", new Punch());
        model.addAttribute("punchList", punchService.getPunchList());
        return "punchlistview";
    }
    @PostMapping("/punchList")
    public String showPunhList(@ModelAttribute("punch") Punch punch, Model model) {
        System.out.println("Controller add punch to punchList");
        punchService.getPunchList().add(punch);
        System.out.println("add punch to punchList");
        model.addAttribute("punch", new Punch());
        model.addAttribute("punchList", punchService.getPunchList());
        return "punchlistview";
    }


}
