package org.mm.service;

import java.io.IOException;
import java.util.List;

import org.mm.entities.FileEntity;
import org.mm.entities.ProfileEntity;
import org.mm.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProfileService 
{
	@Autowired
	private ProfileRepository profileRepo;
	
	@Autowired
	private FileService fileService;
	
    public ProfileEntity createProfile(String name, String email, MultipartFile profilePicture) throws IOException {
        FileEntity profilePic = fileService.storeFile(profilePicture);

        ProfileEntity profile = new ProfileEntity();
        profile.setName(name);
        profile.setEmail(email);
        profile.setProfilePicture(profilePic);

        return profileRepo.save(profile);
    }
    
    public List<ProfileEntity> getAllProfiles() {
        return profileRepo.findAll();
    }

    public ProfileEntity getProfile(Long id) {
        return profileRepo.findById(id).orElseThrow(() -> new RuntimeException("Profile not found"));
    }
    
    public String deleteProfile(Long id)
    {
    	profileRepo.deleteById(id);
    	return "profile deleted ...";
    }
    
    public ProfileEntity updateProfile(Long id, ProfileEntity profileEntity)
    {    	
    	ProfileEntity profileEntity2 = profileRepo.findById(id).orElseThrow();
    	
    	FileEntity fileEntity = profileEntity2.getProfilePicture();
    	
    	profileEntity.setId(id);
    	profileEntity.setProfilePicture(fileEntity);
    	
    	return profileRepo.save(profileEntity);
    }
}
