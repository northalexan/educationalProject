package Parser.entity;


import org.springframework.stereotype.Repository;
import java.io.IOException;

@Repository
public class PopulationUSA extends AllCounties implements Popylation {

    @Override
    public int getFullPopylation() throws IOException {
        return getValuePopulation("https://countrymeters.info/ru/United_States_of_America_(USA)",
                "div[id=cp1]");
    }

    @Override
    public int getManPopylation() throws IOException {
        return getValuePopulation("https://countrymeters.info/ru/United_States_of_America_(USA)",
                "div[id=cp2]");
    }

    @Override
    public int getWomanPopylation() throws IOException {
        return getValuePopulation("https://countrymeters.info/ru/United_States_of_America_(USA)",
                "div[id=cp3]");
    }
}
