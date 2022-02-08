package Parser.entity;

import org.springframework.stereotype.Repository;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class SalaryUSA extends AllCounties{

    List<Integer> salaryOfUSAList = Arrays.asList(2658,2738,2662,3205,2842,2569,2808,3316,4736,2845,2693,3092,2783,3017,2233,2995,2806,2600,3020,2726,3286,2718,2630,3127,3325,2633,3483,3054,2419,2755,2841,2678,2773,3238,2770,2738,2984,3234,3402,2735,2805,2681,4750,2979,2850,1799,3110,2832,2776,2686,2836,2752,2577,2639,2802);
    public double getDollar() throws IOException {
        return getValue();


    }

    int cityUSA;


    int salaryRus =0;




    public int getSalaryOfUSAList(int city) {
        return salaryOfUSAList.get(city);
    }

    public void setSalaryOfUSAList(List<Integer> salaryOfUSAList) {
        this.salaryOfUSAList = salaryOfUSAList;
    }

    public int getCityUSA() {
        return cityUSA;
    }

    public void setCityUSA(int cityUSA) {
        this.cityUSA = cityUSA;
    }

    public int getSalaryRus() {
        return salaryRus;
    }

    public void setSalaryRus(int salaryRus) {
        this.salaryRus = salaryRus;
    }



    public SalaryUSA() {
    }
}
