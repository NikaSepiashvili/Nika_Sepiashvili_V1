package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {
    double exchangeRate;

    public void setExchangeRate(double value) {
        exchangeRate = value;
    }

    public double convert(double value) {
        return value / exchangeRate;
    }


    public double convert(int value) {
        return  value / exchangeRate;
    }


}
