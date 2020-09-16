package com.omar.springrecipebook.repositories;

import com.omar.springrecipebook.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
