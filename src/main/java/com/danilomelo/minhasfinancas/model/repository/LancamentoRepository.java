package com.danilomelo.minhasfinancas.model.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.danilomelo.minhasfinancas.model.entity.Lancamento;
import com.danilomelo.minhasfinancas.model.enums.StatusLancamento;
import com.danilomelo.minhasfinancas.model.enums.TipoLancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
	
	@Query(value = "select sum(l.valor) from Lancamento l join l.usuario u where u.id = :idUsuario and l.tipo = :tipo and l.status = :status group by u")
	BigDecimal obterSaldoPorTipoLancamentoEUsuarioEStatus(@Param("idUsuario") Long idUsuario, @Param("tipo") TipoLancamento tipo, StatusLancamento status);
}
