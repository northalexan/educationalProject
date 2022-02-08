package Parser.entity;


import org.springframework.stereotype.Repository;
import java.io.IOException;

@Repository
public class PopulationRus extends AllCounties implements Popylation {

    @Override
    public int getFullPopylation() throws IOException {
        return getValuePopulation("https://countrymeters.info/ru/Russian_Federation",
                "div[id=cp1]");

    }
    @Override
    public int getManPopylation() throws IOException {
        return getValuePopulation("https://countrymeters.info/ru/Russian_Federation",
                "div[id=cp2]");
    }


    @Override
    public int getWomanPopylation() throws IOException {
       return getValuePopulation("https://countrymeters.info/ru/Russian_Federation",
               "div[id=cp3]");


    }



}
