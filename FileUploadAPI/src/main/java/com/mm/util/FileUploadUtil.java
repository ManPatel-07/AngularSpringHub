package com.mm.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadUtil 
{
	private final String UPLOAD_URL = "J:\\InternShip_Aemnex\\FileUploadAPI\\src\\main\\resources\\static\\images";
	
	public void uploadFile(MultipartFile file) throws IOException
	{
		String uuid = UUID.randomUUID().toString();
		String ext = StringUtils.getFilenameExtension(file.getOriginalFilename());
		String newFilename = uuid+"."+ext;
		
		Files.copy(file.getInputStream(), Paths.get(UPLOAD_URL+File.separator+newFilename), StandardCopyOption.REPLACE_EXISTING);
	}
}
