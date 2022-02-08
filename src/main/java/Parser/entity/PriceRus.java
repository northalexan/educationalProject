package Parser.entity;

import org.springframework.stereotype.Repository;

@Repository
public class PriceRus implements PriceOfCountry{
    int coffeStarBucks=255;
    int BigMac=150;
    int fuel95=52;
    int priceIphone12=70000;

    @Override
    public int priceCoffe(int salary) {
        return salary/coffeStarBucks;
    }

    @Override
    public int priceMac(int salary) {
        return salary/BigMac;
    }

    @Override
    public int priceFuel(int salary) {
        return salary/fuel95;
    }

    @Override
    public int priceIphone(int salary) {
        return salary/priceIphone12;
    }

    public int getCoffeStarBucks() {
        return coffeStarBucks;
    }

    public void setCoffeStarBucks(int coffeStarBucks) {
        this.coffeStarBucks = coffeStarBucks;
    }

    public int getBigMac() {
        return BigMac;
    }

    public void setBigMac(int bigMac) {
        BigMac = bigMac;
    }

    public int getFuel95() {
        return fuel95;
    }

    public void setFuel95(int fuel95) {
        this.fuel95 = fuel95;
    }

    public int getPriceIphone12() {
        return priceIphone12;
    }

    public void setPriceIphone12(int priceIphone12) {
        this.priceIphone12 = priceIphone12;
    }
}
