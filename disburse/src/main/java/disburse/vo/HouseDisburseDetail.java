package disburse.vo;

import java.util.Date;

public class HouseDisburseDetail
{
 private String BIOGUIDE_ID;
 private String OFFICE;
 private String CATEGORY;
 private String PAYEE;
 private Date START_DATE;
 private Date END_DATE;
 private String PURPOSE;
 private double AMOUNT;
 private int YEAR;

    public String getBIOGUIDE_ID()
    {
        return BIOGUIDE_ID;
    }

    public void setBIOGUIDE_ID(String BIOGUIDE_ID)
    {
        this.BIOGUIDE_ID = BIOGUIDE_ID;
    }

    public String getOFFICE()
    {
        return OFFICE;
    }

    public void setOFFICE(String OFFICE)
    {
        this.OFFICE = OFFICE;
    }

    public String getCATEGORY()
    {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY)
    {
        this.CATEGORY = CATEGORY;
    }

    public String getPAYEE()
    {
        return PAYEE;
    }

    public void setPAYEE(String PAYEE)
    {
        this.PAYEE = PAYEE;
    }

    public Date getSTART_DATE()
    {
        return START_DATE;
    }

    public void setSTART_DATE(Date START_DATE)
    {
        this.START_DATE = START_DATE;
    }

    public Date getEND_DATE()
    {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE)
    {
        this.END_DATE = END_DATE;
    }

    public String getPURPOSE()
    {
        return PURPOSE;
    }

    public void setPURPOSE(String PURPOSE)
    {
        this.PURPOSE = PURPOSE;
    }

    public double getAMOUNT()
    {
        return AMOUNT;
    }

    public void setAMOUNT(double AMOUNT)
    {
        this.AMOUNT = AMOUNT;
    }

    public int getYEAR()
    {
        return YEAR;
    }

    public void setYEAR(int YEAR)
    {
        this.YEAR = YEAR;
    }
}



