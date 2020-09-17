package com.omar.springrecipebook.controllers;


import com.omar.springrecipebook.domain.Category;
import com.omar.springrecipebook.domain.UnitOfMeasure;
import com.omar.springrecipebook.repositories.CategoryRepository;
import com.omar.springrecipebook.repositories.UnitOfMeasureRepository;
import com.omar.springrecipebook.services.Recipeservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final Recipeservice recipeservice;

    public IndexController(Recipeservice recipeservice) {
        this.recipeservice = recipeservice;
    }

    @RequestMapping({"","/","/index"})
    public String getIndex(Model model){
        model.addAttribute("recipes",recipeservice.getRecipe());
        return "index";
    }
}
