package Parser;

import Parser.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.text.DecimalFormat;
/*
Есть нарушения SOLID, не совсем корректная работа с Spring. Проект, как я уже говорил, учебный.
На нем я "тестировал" свои знания.
 */

@Controller
public class ParserController {
    DecimalFormat dF = new DecimalFormat( "###,###,###,###.##" );
    final
    PopulationRus naselenieRus;
    final
    PopulationUSA naselenieUSA;
    final
    PriceUSA priceUSA;
    final
    PriceRus priceRus;

    public ParserController(PopulationRus naselenieRus, PopulationUSA naselenieUSA, PriceUSA priceUSA, PriceRus priceRus) {
        this.naselenieRus = naselenieRus;
        this.naselenieUSA = naselenieUSA;
        this.priceUSA = priceUSA;
        this.priceRus = priceRus;
    }
    @RequestMapping("/start")
    public String startPage() {
    return "startPage";
    }

    @RequestMapping("/population")
    public String NaselenieStran(Model model) throws IOException {


        int rus =naselenieRus.getFullPopylation();
        int rusMan = naselenieRus.getManPopylation();
        int rusWoman = naselenieRus.getWomanPopylation();
        int USA = naselenieUSA.getFullPopylation();
        int USAMan = naselenieUSA.getManPopylation();
        int USAWoman = naselenieUSA.getWomanPopylation();

        String rusOrUSA;
        String rusManOrUSAMan;
        String rusWomanOrUSAWoman;


        if (rus > USA) {
            double prosent = (double) USA / rus * 100;
            rusOrUSA = "Население России больше, чем население Америки на " + dF.format(prosent) + " %"
                    + " или на " + dF.format(rus - USA) + " человек.";
        } else if (rus < USA) {
            double prosent = (double) rus / USA * 100.0;
            rusOrUSA = "Население Америки больше, чем население России на " + dF.format(prosent) + " %"
                    + " или на " + dF.format(USA - rus) + " человек.";
        } else {
            rusOrUSA = "Население стран равно";
        }


        if (rusMan > USAMan) {
            double prosent = (double) USAMan / rusMan * 100;
            rusManOrUSAMan = "Количество мужского населения России больше, чем количество мужского населения Америки на " + dF.format(prosent) + " %"
                    + " или на " + dF.format(rusMan - USAMan) + " человек.";
        } else if (rusMan < USAMan) {
            double prosent = (double) rusMan / USAMan * 100.0;
            rusManOrUSAMan = "Количество мужского населения Америки больше, чем количество мужского населения России на " + dF.format(prosent) + " %"
                    + " или на " + dF.format(USAMan - rusMan) + " человек.";
        } else {
            rusManOrUSAMan = "Population=population";
        }


        if (rusWoman > USAWoman) {
            double prosent = (double) USAWoman / rusWoman * 100;
            rusWomanOrUSAWoman = "Количество женского населения России больше, чем количество женского населения Америки на " + dF.format(prosent) + "%"
                    + " или на " + dF.format(rusWoman - USAWoman) + " человек.";
        } else if (rusWoman < USAWoman) {
            double prosent = (double) rusWoman / USAWoman * 100.0;
            rusWomanOrUSAWoman = "Количество женского населения Америки больше, чем количество женского населения России на " + dF.format(prosent) + "%"
                    + " или на " + dF.format(USAMan - rusMan) + " человек.";
        } else {
            rusWomanOrUSAWoman = "Population=population";
        }



        model.addAttribute("rusPopMan", dF.format(rusMan));
        model.addAttribute("UsaPopMan", dF.format(USAMan));
        model.addAttribute("rusManOrUSAMan", rusManOrUSAMan);
        model.addAttribute("rusWoman", dF.format(rusWoman));
        model.addAttribute("USAWoman", dF.format(USAWoman));
        model.addAttribute("rusWomanOrUSAWoman", rusWomanOrUSAWoman);
        model.addAttribute("rusPop", dF.format(rus));
        model.addAttribute("usaPop", dF.format(USA));
        model.addAttribute("rusOrUSA", rusOrUSA);

        return "firstPage";
    }



    @GetMapping("/salary")
    protected String adddMan(@ModelAttribute("salary") SalaryRus salary,
                             @ModelAttribute("salary1") SalaryUSA salary1) {
        return "twoPage";
    }




    @PostMapping("/salary")
    public String getSalary( @ModelAttribute("salary") SalaryRus salary,
                             @ModelAttribute("salary1") SalaryUSA salary1,
                             Model model) throws IOException {
        int sal = salary.setSalary(salary.getSalary());
        int cit = salary.setCity(salary.getCity());
        int year = 2020;
//не смог разобраться почему формы не выполняются по отдельности. По этому через if
    if (sal == 0) {
        int salRus = salary1.getSalaryRus();
        int salUSA = (int) (salary1.getSalaryOfUSAList(salary1.getCityUSA()) * salary1.getDollar());

        String salaryUSA = "Заработная плата в выбраном Вами штате " + dF.format(salUSA) + " рублей";
        model.addAttribute("salaryUSA", salaryUSA);

        if (salUSA > salRus) {
            String isUSAMoreRus = "Средняя заработная плата в выбранном Вами штате больше, " +
                    "чем Ваша на " + dF.format((salUSA - salRus)) + " рублей.";
            model.addAttribute("isUSAMoreRus", isUSAMoreRus);
        } else if (salRus > salUSA) {
            String isRusMoreUSA = "Ваша заработная плата больше, " +
                    "чем средняя заработная плата выбранного Вами штата на " + dF.format((salRus - salUSA)) + " рублей.";
            model.addAttribute("isRusMoreUSA", isRusMoreUSA);
        } else {
            String equal = "Ваша заработная плата равна заработной плате в выбранном Вами штате.";
            model.addAttribute("equal", equal);
        }

        String USA="На среднюю заработную плату в этом штате, Американец может себе позволить:";
        String coffeUSA=priceUSA.priceCoffe(salary1.getSalaryOfUSAList(salary1.getCityUSA()))+" кофе в Starbucks.";
        String macUSA=priceUSA.priceMac(salary1.getSalaryOfUSAList(salary1.getCityUSA()))+" бигмаков.";
        String fuel95USA=priceUSA.priceFuel(salary1.getSalaryOfUSAList(salary1.getCityUSA()))+" л. 95-го бензина.";
        String iphone12USA;

        if(salUSA>priceUSA.getPriceIphone12()){
            iphone12USA=priceUSA.priceIphone(salary1.getSalaryOfUSAList(salary1.getCityUSA()))+" Iphone 12.";
        }else{
            iphone12USA="ни одного Iphone 12.";
        }

        model.addAttribute("USA", USA);
        model.addAttribute("coffeUSA", coffeUSA);
        model.addAttribute("macUSA", macUSA);
        model.addAttribute("fuel95USA", fuel95USA);
        model.addAttribute("iphone12USA", iphone12USA);
    } else {
        for (int i = 0; i < salary.getSalarysOfCityLangthString(cit); i++) {
            if (salary.getSalarysOfCity(cit, i) > sal) {
                year--;
                try {
                    if (Math.abs(sal - salary.getSalarysOfCity(cit, i)) < Math.abs(salary.getSalarysOfCity(cit, i + 1) - sal)) {
                        year++;
                        break;
                    } else {
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    year++;
                    String isLoss = "Сочувствуем! Вы получаете меньше, чем заработная плата в "
                            + year + " году в вашем регионе на "
                            + dF.format(salary.getSalarysOfCity(cit, salary.getSalarysOfCityLangthString(cit) - 1) - sal) + " рублей.";

                    model.addAttribute("isLoss", isLoss);
                    break;
                }
            }
        }
        if (sal > salary.getSalarysOfCity(cit, 0)) {
            String isMore = "Поздравлем! Вы получаете больше, чем заработная плата в " + year + " году в вашем регионе на "
                    + dF.format(sal - salary.getSalarysOfCity(cit, 0)) + " рублей.";
            model.addAttribute("isMore", isMore);
        } else if (sal > (salary.getSalarysOfCity(cit, salary.getSalarysOfCityLangthString(cit) - 1))) {
            String salaryOfYear = "Вы получаете заработную плату за " + year + " год в вашем регионе.";
            model.addAttribute("salaryOfYear", salaryOfYear);
        }
        String Rus="На свою заработную плату вы можете себе позволить:";
        String coffeRus=priceRus.priceCoffe(sal)+" кофе в Starbucks.";
        String macRus=priceRus.priceMac(sal)+" бигмаков.";
        String fuel95Rus=priceRus.priceFuel(sal)+" л. 95-го бензина.";
        String iphone12Rus;
        if(sal>priceRus.getPriceIphone12()){
            iphone12Rus=priceRus.priceIphone(sal)+" Iphone 12.";
        }else{
            iphone12Rus="ни одного Iphone 12.";
        }
        model.addAttribute("Rus", Rus);
        model.addAttribute("coffeRus", coffeRus);
        model.addAttribute("macRus", macRus);
        model.addAttribute("fuel95Rus", fuel95Rus);
        model.addAttribute("iphone12Rus", iphone12Rus);
    }
            return "twoPage";
    }
}




