package org.mm.service;

import org.mm.entities.FileEntity;
import org.mm.repository.FileDBRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class FileService {

    @Autowired
    private FileDBRepo fileRepository;

    public FileEntity storeFile(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        String fileType = file.getContentType();
        byte[] data = file.getBytes();

        FileEntity fileEntity = new FileEntity(fileName, fileType, data);
        return fileRepository.save(fileEntity);
    }

    public FileEntity getFile(Long fileId) {
        Optional<FileEntity> fileEntity = fileRepository.findById(fileId);
        return fileEntity.orElseThrow(() -> new RuntimeException("File not found with id " + fileId));
    }
}

