package com.harsha.infytel_plan.services;

import com.harsha.infytel_plan.dtos.PlanDTO;
import com.harsha.infytel_plan.entities.Plan;
import com.harsha.infytel_plan.repositories.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlanService {
    @Autowired
    PlanRepository planRepo;

    //Fetches all plan details
    public List<PlanDTO> getAllPlans(){
        List<Plan> plans = planRepo.findAll();
        List<PlanDTO> planDTOS = new ArrayList<>();
        for(Plan plan : plans){
            PlanDTO planDTO = PlanDTO.valueOf(plan);
            planDTOS.add(planDTO);
        }
        System.out.println("Plan details : "+planDTOS);
        return  planDTOS;
    }
    //To get a plan based on plan Id
    public PlanDTO getPlan(Integer planId){
        PlanDTO planDTO = null;
        Optional<Plan> optionalPlan = planRepo.findById(planId);
        if(optionalPlan.isPresent()){
            Plan plan = optionalPlan.get();
            planDTO = planDTO.valueOf(plan);
        }
        return planDTO;
    }
}
