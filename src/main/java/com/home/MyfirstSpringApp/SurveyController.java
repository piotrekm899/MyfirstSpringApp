package com.home.MyfirstSpringApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SurveyController {

    @Value("#{countryOptions}")
    private Map<String,String> countryOptionsFile;

@RequestMapping ("/survey")
public String showSurvey(Model theModel){

    Respondent theRespondent = new Respondent();

    theModel.addAttribute("respondent", theRespondent);

    theModel.addAttribute("theCountryOptionsFile",countryOptionsFile);

    return "survey";
}

@RequestMapping("/processForm")
public String confirmationSurvey(@ModelAttribute("respondent") Respondent respondent){
    return "confirmationSurvey";
}

}
