package ru.practicum.ewm.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.practicum.ewm.category.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("SELECT COUNT(e) > 0 FROM Event e WHERE e.category.id = :categoryId")
    boolean existsByCategoryId(Long categoryId);
}