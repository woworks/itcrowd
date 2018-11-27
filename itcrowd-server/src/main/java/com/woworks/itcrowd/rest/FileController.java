package com.woworks.itcrowd.rest;

import com.woworks.itcrowd.domain.Category;
import com.woworks.itcrowd.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class FileController {

    private final CategoryService categoryService;

    @Autowired
    public FileController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    /*@PostMapping("api/file/upload")
    @RequestMapping(value = "/api/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity upload(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        MultipartHttpServletRequest mpr = (MultipartHttpServletRequest) request;
        return ResponseEntity.ok("File was uploaded");
    }*/

    @PostMapping(value = "api/files/upload", consumes = "multipart/form-data")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        String message = "";
        try {
/*            storageService.store(file);
            files.add(file.getOriginalFilename());*/

            message = "You successfully uploaded " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            message = "FAIL to upload " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
        }
    }


}
