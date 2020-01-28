package main.repository;

import main.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Project DataParser
 * Created by End on янв., 2020
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {
}
