package br.com.moneyplan.model

import jakarta.persistence.*


@Entity
@Table(name = "tb_plan")
data class Plan(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
    val plan: String, val price: Double, val total:Double
) {


}
