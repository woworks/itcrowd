package com.woworks.itcrowd.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    void store(MultipartFile file);
}
