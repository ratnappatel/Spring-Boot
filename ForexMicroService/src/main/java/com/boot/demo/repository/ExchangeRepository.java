package  com.boot.demo.repository;

import org.springframework.data.repository.CrudRepository;


import  com.boot.demo.model.CurrencyExcchange;

public interface ExchangeRepository extends CrudRepository<CurrencyExcchange, Long>{

	public CurrencyExcchange findByFromAndTo(String from,String to);
}
