package com.raf.si.Banka2Backend.repositories.mariadb;

import com.raf.si.Banka2Backend.models.mariadb.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

  Optional<Exchange> findExchangeByAcronym(String acronym);

  Optional<Exchange> findExchangeByMicCode(String micCode);
}