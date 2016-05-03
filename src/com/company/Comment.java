package com.company;


public class Comment {

    private String ccy;

    private String buy;

    private String base_ccy;

    private String sale;

    public String getCcy ()
    {
        return ccy;
    }

    public void setCcy (String ccy)
    {
        this.ccy = ccy;
    }

    public String getBuy ()
    {
        return buy;
    }

    public void setBuy (String buy)
    {
        this.buy = buy;
    }

    public String getBase_ccy ()
    {
        return base_ccy;
    }

    public void setBase_ccy (String base_ccy)
    {
        this.base_ccy = base_ccy;
    }

    public String getSale ()
    {
        return sale;
    }

    public void setSale (String sale)
    {
        this.sale = sale;
    }

    @Override
    public String toString()
    {
        return "Курс "+ccy+" к "+ base_ccy+ " :  Покупка "+buy+" Продажа  = "+ sale + "\n";
    }
}



