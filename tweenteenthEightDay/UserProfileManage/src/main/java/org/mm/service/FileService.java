package org.mm.service;

import java.io.IOException;

import org.mm.entities.FileEntity;
import org.mm.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService 
{
	@Autowired
	private FileRepository fileRepo;
	
	public FileEntity storeFile(MultipartFile file) throws IOException
	{
		String fileName = file.getOriginalFilename();
		String fileType = file.getContentType();
		byte[] data = file.getBytes();
		
		FileEntity fileEntity = new FileEntity(fileName, fileType, data);
		return fileRepo.save(fileEntity);
	}
	
    public FileEntity getFile(Long fileId)
    {
        return fileRepo.findById(fileId).orElseThrow(() -> new RuntimeException("File not found with id: " + fileId));
    }
}
