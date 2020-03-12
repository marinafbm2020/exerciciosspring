package br.com.rd.exerciciospring.repository;


import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbCupom extends JpaRepository<Cupom, Long> {

    List<Cupom> findByIdCliente (Long idCliente);
    List<Cupom> findByDtVenda (String dtVenda);
}
