package com.harsha.infytel_plan.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.relational.core.sql.In;

@Data
@Entity
public class Plan {
    @Id
    Integer planId;
    String planName;
    Integer nationalRate;
    Integer localRate;


}
