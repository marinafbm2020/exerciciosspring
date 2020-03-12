package br.com.rd.exerciciospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_cupom_item")
    private Long idCupomItem;

    @Column (name = "id_cupom")
    private Long idCupom;

    @Column (name = "id_produto")
    private Long idProduto;

    @Column (name = "qt_produto")
    private Long qtProduto;

    @Column (name = "vl_produto")
    private Long vlProduto;
}
