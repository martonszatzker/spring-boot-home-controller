package com.tzkinformatics.measapp.meassurement.controller;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.tzkinformatics.measapp.meassurement.domain.Meassurement;
import com.tzkinformatics.measapp.meassurement.repository.MeassurementRepository;
import com.tzkinformatics.measapp.meassurement.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping("/")
    @JsonBackReference
    public ArrayList<Meassurement> index(){
        /*model.addAttribute("pageTitle","Ez már igen, címed adtál!");
        model.addAttribute("meassurements",getMeassurements());*/
        return getMeassurements();
    }

    @RequestMapping("/user/{id}")
    public String searchForUser(@PathVariable(value = "id") String id) throws Exception {
        if(id == null) throw new Exception("Nincs ilyen id!!!");
        return "users";
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping("/custom/home")
    public String getCustomHome() throws Exception {
        return "custome home";
    }

    @Secured("ROLE_USER")
    @RequestMapping("/custome/secured/home")
    public String getcSecuredCustomeHome() throws Exception {
        return "custome secured home";
    }


    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest request,Exception ex, Model model){
        model.addAttribute("errMessage", ex.getMessage());
        return "exceptionHandler";
    }

    private ArrayList<Meassurement> getMeassurements (){
        ArrayList<Meassurement> meassuremnets = homeService.getMeassurements();
        return meassuremnets;
    }


}
