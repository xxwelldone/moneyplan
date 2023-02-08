package br.com.moneyplan.repository

import br.com.moneyplan.model.Plan
import org.springframework.data.jpa.repository.JpaRepository

interface PlanRepository:JpaRepository<Plan, String> {
    //fun findAllByPlanContainingIgnoreCase():MutableList<Plan>
}