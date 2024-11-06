package com.harsha.infytel_plan.repositories;

import com.harsha.infytel_plan.entities.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.sql.In;

public interface PlanRepository extends JpaRepository<Plan, Integer> {
}
