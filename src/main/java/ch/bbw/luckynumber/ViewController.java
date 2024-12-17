package ch.bbw.luckynumber;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * ViewController
 *    Kontrolliert Zusammenspiel mit der View.
 *    Regiert auf Aktionen in der View.
 * @author Peter Rutschmann
 * @version 06.09.2021
 */
@Controller
public class ViewController {

    ViewData viewData = new  ViewData();
    LuckyNumber generator = new LuckyNumber();

    @GetMapping("/")
    public String redirect() {
        return "redirect:/luckyNumberView";
    }

    @GetMapping("/luckyNumberView")
    public String showView(Model model) {
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=singleDice"})
    public String showSingleDice(Model model) {
        viewData.setResult("Single dice: " + generator.singleDice());
        //viewData.setResultImageUrl(...
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=doubleDice"})
    public String showDoubleDice(Model model) {
        viewData.setResult("Double dice: " + generator.doubleDice());
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=trueOrFalse"})
    public String showTrueOrFalse(Model model) {
        viewData.setResult("True or false: " + generator.trueOrFalse());
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=playingCard"})
    public String showPlayingCard(Model model) {
        viewData.setResult("Playingcard: " + generator.playingCard());
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=sixLottoNumbers"})
    public String showSixLottoNumbers(Model model) {
        viewData.setResult("Six lotto numbers: " + generator.sixLottoNumbers());
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=prime"})
    public String showPrimeUpTo100(Model model) {
        viewData.setResultImageUrl("images/primes.png");
        viewData.setResult("Prime up to 100: " + generator.primeUpTo100());
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=primeNextTo"})
    public String showPrimeNextTo(Model model, @ModelAttribute("viewData") ViewData viewData) {
        viewData.setResult("Prime next to: "+viewData.getPrimeNextTo()+ " : " + generator.primeNextTo(viewData.getPrimeNextTo()));
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=triangleUpTo"})
    public String showTriangleNumbersUpTo(Model model, @ModelAttribute("viewData") ViewData viewData) {
        viewData.setResult("Triangle numbers up to: " + viewData.getTriangularNumberLimit() + " : "
              + generator.triangleNumbersUpTo(viewData.getTriangularNumberLimit()));
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }

    @PostMapping(value = "/luckyNumberView", params = {"showButton=resetView"})
    public String resetView(Model model) {
        viewData = new ViewData();
        model.addAttribute("viewData", viewData);
        return "luckyNumberForm";
    }
}
