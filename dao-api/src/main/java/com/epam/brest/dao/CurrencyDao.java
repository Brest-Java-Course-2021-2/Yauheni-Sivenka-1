package com.epam.brest.dao;

import java.util.Currency;
import java.util.List;

public interface CurrencyDao {

    List<Currency> findAll();

    Integer create(Currency currency); //возвращает ID созданной валюты

    Integer update(Currency currency);

    Integer delete(Integer currencyId);

}
