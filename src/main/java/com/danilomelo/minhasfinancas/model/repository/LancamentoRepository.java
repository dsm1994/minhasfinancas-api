package com.danilomelo.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danilomelo.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
