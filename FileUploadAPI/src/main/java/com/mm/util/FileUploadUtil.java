package com.mm.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadUtil 
{
	private final String UPLOAD_URL = "J:\\InternShip_Aemnex\\FileUploadAPI\\src\\main\\resources\\static\\images";
	
	public void uploadFile(MultipartFile file) throws IOException
	{
		Files.copy(file.getInputStream(), Paths.get(UPLOAD_URL+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
	}
}
