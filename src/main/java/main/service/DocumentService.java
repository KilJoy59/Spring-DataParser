package main.service;

import main.entity.Document;
import main.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project DataParser
 * Created by End on янв., 2020
 */
@Service
public class DocumentService {

    @Autowired
    DocumentRepository repository;

}
