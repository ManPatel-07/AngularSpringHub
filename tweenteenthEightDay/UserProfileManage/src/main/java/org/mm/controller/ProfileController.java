package org.mm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mm.entities.ProfileEntity;
import org.mm.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/profiles")
public class ProfileController 
{

    @Autowired
    private ProfileService profileService;

    @PostMapping("/create")
    public ResponseEntity<ProfileEntity> createProfile(
    	    @RequestPart("name") String name,
    	    @RequestPart("email") String email,
    	    @RequestPart(value = "profilePicture", required = false) MultipartFile profilePicture) {
        try {
            ProfileEntity profile = profileService.createProfile(name, email, profilePicture);
            return ResponseEntity.ok(profile);
        } catch (IOException e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping
    public ResponseEntity<List<ProfileEntity>> getAllProfiles() {
        List<ProfileEntity> profiles = profileService.getAllProfiles();
        return ResponseEntity.ok(profiles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfileEntity> getProfile(@PathVariable Long id) {
        ProfileEntity profile = profileService.getProfile(id);
        return ResponseEntity.ok(profile);
    }
    
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Map<String, String>> deleteProfile(@PathVariable("id") Long id)
    {
    	String deleteMessage = profileService.deleteProfile(id);
    	
		Map<String, String> response = new HashMap<>();
		response.put("message", deleteMessage);
		
		return new ResponseEntity<Map<String,String>>(response, HttpStatus.OK);
    }
    
    @PutMapping(path = "/{id}")
    public ResponseEntity<ProfileEntity> updateProfile(
    		@PathVariable("id") Long id,
    		@RequestBody ProfileEntity profileEntity)
    {
    	ProfileEntity profileEntity2 = profileService.updateProfile(id, profileEntity);
    	return new ResponseEntity<ProfileEntity>(profileEntity2, HttpStatus.OK);
    }

}

