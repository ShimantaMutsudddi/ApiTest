package com.example.retrofitgsontorv;

public class DataSet
{
    String name,capital,currency;

    public DataSet()
    {

    }

    public DataSet(String name, String capital, String currency)
    {
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }
}
