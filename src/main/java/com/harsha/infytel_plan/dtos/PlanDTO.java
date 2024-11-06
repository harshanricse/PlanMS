package com.harsha.infytel_plan.dtos;

import com.harsha.infytel_plan.entities.Plan;
import lombok.Data;

@Data
public class PlanDTO {
    private Integer planId;
    private String planName;
    private Integer nationalRate;
    private Integer localRate;

    //converts entity to dto
    public static PlanDTO valueOf(Plan plan){
        PlanDTO planDTO = new PlanDTO();
        planDTO.setLocalRate(plan.getLocalRate());
        planDTO.setNationalRate(plan.getNationalRate());
        planDTO.setPlanName(plan.getPlanName());
        planDTO.setPlanId(plan.getPlanId());
        return planDTO;
    }
}
