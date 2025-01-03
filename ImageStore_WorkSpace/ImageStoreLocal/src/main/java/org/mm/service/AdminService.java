package org.mm.service;

import java.io.File;

import org.json.JSONObject;
import org.mm.dao.AdminDao;
import org.mm.entity.AdminEntity;
import org.mm.repository.AdminRepository;
import org.mm.service.utility.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AdminService 
{
	private final AdminRepository adminRepo;
	
	@Autowired
	private FileUtils fileUtils;
	
	public ResponseEntity<?> addAdminDetails(String json, MultipartFile adminImage)
	{
		JSONObject requestObj = new JSONObject(json);
		AdminDao dao = new Gson().fromJson(json, AdminDao.class);
		AdminEntity adminEntity = new AdminEntity();
		
		if (adminImage != null) {
			File file = fileUtils.uploadFile(adminImage, "materialImages");

			if (file != null) {
				requestObj.put("materialImages", file.getName());
				adminEntity.setAdminImage(file.getName());
			}
		}
		
		adminEntity.setAdminNo(dao.getAdminNo());
		adminEntity.setName(dao.getName());
		
		adminRepo.save(adminEntity);
		
		return new ResponseEntity<>(adminEntity, HttpStatus.OK);
	}	

}
