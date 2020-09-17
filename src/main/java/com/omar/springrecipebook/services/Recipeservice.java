package com.omar.springrecipebook.services;

import com.omar.springrecipebook.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface Recipeservice{

    public Set<Recipe> getRecipe();
}
