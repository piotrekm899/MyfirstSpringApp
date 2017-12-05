package com.home.MyfirstSpringApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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

    @InitBinder /* Converts empty strings into null when a form is submitted */
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

@RequestMapping("/processForm")
public String processForm(
        @Valid @ModelAttribute("respondent") Respondent theRespondent, BindingResult theBindingResult){

    if (theBindingResult.hasErrors()) {
        return "survey";
    } else {
        return "confirmationSurvey";
    }

    }
}
