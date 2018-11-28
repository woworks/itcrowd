package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.Category;
import com.woworks.itcrowd.service.CategoryService;
import com.woworks.itcrowd.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class FileController {

    private final FileService fileService;

    @Autowired
    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping(value = "api/files/upload", consumes = "multipart/form-data")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
            this.fileService.store(file);
            message = "You successfully uploaded " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            e.printStackTrace();
            message = "FAIL to upload " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
        }
    }


}
