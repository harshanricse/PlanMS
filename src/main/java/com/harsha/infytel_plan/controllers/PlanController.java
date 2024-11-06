package com.harsha.infytel_plan.controllers;

import com.harsha.infytel_plan.dtos.PlanDTO;
import com.harsha.infytel_plan.services.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanController {
    @Autowired
    PlanService planService;
    //fetches all plan details
    @GetMapping(value="/plans")
    public List<PlanDTO> getAllPlans(){
        return planService.getAllPlans();
    }
    @GetMapping(value="/plans/{planId}")
    public PlanDTO getPlan(@PathVariable("planId") Integer planId){
        return planService.getPlan(planId);
    }
}
