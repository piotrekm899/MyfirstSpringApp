package com.home.MyfirstSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/login")
    public String showForm(){
        return "loginForm";
    }

    @RequestMapping(value = "/loggedin", method = RequestMethod.POST)
    public String loginPage(@RequestParam String login,
                            @RequestParam String password,
                            ModelMap model) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

        Audi sadAudi = context.getBean("Audi", Audi.class);
        Audi happyAudi = context.getBean("AudiHappy", Audi.class);
        Volkswagen sadVolks = context.getBean("Volks", Volkswagen.class);
        Volkswagen happyVolks = context.getBean("VolksHappy", Volkswagen.class);

        model.put("login", login);
        model.put("password", password);
        model.put("happyAudi",happyAudi);
        model.put("happyAudiSong",happyAudi.playASong());
        model.put("sadAudi",sadAudi);
        model.put("sadAudiSong",sadAudi.playASong());
        model.put("happyVolks",happyVolks);
        model.put("happyVolksSong",happyVolks.playASong());
        model.put("sadVolks",sadVolks);
        model.put("sadVolksSong",sadVolks.playASong());


        if (loginService.validate(login, password))
            return "cars";
        else{
            model.put("errormsg", "wrong password or username!");
            return "loginForm";
        }
    }
}
