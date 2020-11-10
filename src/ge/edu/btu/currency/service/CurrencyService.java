package ge.edu.btu.currency.service;

public interface CurrencyService {
    void setExchangeRate(double value);
    double convert(double value);
    double convert(int value);
}
