package com.omar.springrecipebook.repositories;

import com.omar.springrecipebook.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
