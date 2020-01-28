package main.controller;

import main.entity.UploadFile;
import main.service.RabbitMqSender;
import main.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * Project DataParser
 * Created by End on янв., 2020
 */
@Controller
public class SendController {

    @Autowired
    RabbitMqSender rabbitMqSender;

    @Autowired
    UploadFileService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/receiveFile")
    public String list(Model model) {
        List<UploadFile> fileList = service.getAllFiles();
        model.addAttribute("files", fileList);
        return "receiveFile";
    }


    @GetMapping("/uploadFile")
    public String uploadFile() {
        return "uploadFile";
    }


    @PostMapping(value = "/uploadFile",consumes = {"multipart/form-data"})
    public String uploadFile(@RequestParam("uploadFile") MultipartFile multipartFile) throws IOException {
        service.addFile(multipartFile);
        rabbitMqSender.send(multipartFile.getBytes());
        return "index";
    }
}
