package com.epam.brest.mode;

public class Currency {
    private int currencyId;

    private String charsCode;

    private String currencyName;

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getCharsCode() {
        return charsCode;
    }

    public void setCharsCode(String charsCode) {
        this.charsCode = charsCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
}
