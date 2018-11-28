package com.woworks.itcrowd.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@Service
public class FileServiceImpl implements FileService {

    Logger LOG = LoggerFactory.getLogger(FileServiceImpl.class);

    @Value("${files.upload-dir}")
    private Path rootLocation;

    @Override
    public void store(MultipartFile file) {
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new StorageException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            Path uploadFolder = this.rootLocation.toAbsolutePath();
            boolean uploadFolderExists = Files.exists(uploadFolder, new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
            if (!uploadFolderExists) {
                LOG.info("Upload folder was created at {}", uploadFolder);
                Files.createDirectory(uploadFolder);
            }

            try (InputStream inputStream = file.getInputStream()) {
                Files.copy(inputStream, this.rootLocation.resolve(filename),
                        StandardCopyOption.REPLACE_EXISTING);
            }
        }
        catch (IOException e) {
            throw new StorageException("Failed to store file " + filename, e);
        }
    }
}
