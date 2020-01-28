package main.service;

import main.entity.UploadFile;
import main.repository.UploadFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Project DataParser
 * Created by End on янв., 2020
 */
@Service
public class UploadFileService {

    @Autowired
    UploadFileRepository repository;

    public UploadFile addFile(MultipartFile multipartFile) {
        UploadFile uploadFile = new UploadFile();
        try {
            uploadFile.setData(multipartFile.getBytes());
            uploadFile.setFilename(multipartFile.getOriginalFilename());
            uploadFile.setDate(new Date());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return repository.save(uploadFile);
    }

    public List<UploadFile> getAllFiles() {
        return repository.findAll();
    }
}
