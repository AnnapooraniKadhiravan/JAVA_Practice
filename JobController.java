package com.wipro.Jobs;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
@RequestMapping("/jobs")

public class JobController {
	
	private static final String UPLOAD_DIR = "uploads";
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadCV(@RequestParam("file") MultipartFile file){
		try {
			File dir = new File(UPLOAD_DIR);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			String fileName = file.getOriginalFilename();
			File savedFile = new File(dir, fileName);
			
			try (FileOutputStream fos = new FileOutputStream(savedFile)){
				fos.write(file.getBytes());
			}
			return ResponseEntity.ok("File uploaded successfully: " + fileName);
		} catch (Exception e) {
			return ResponseEntity.internalServerError()
					.body("File upload failed: " + e.getMessage());
		}
	}
	
@GetMapping("/download/{fileName}")
public ResponseEntity<InputStreamResource> downloadCV(@PathVariable String fileName){
	try {
		File file = new File(UPLOAD_DIR, fileName);
		
		if (!file.exists()) {
			return ResponseEntity.notFound().build();
		}
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename="+file.getName())
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.contentLength(file.length())
				.body(resource);
	} catch(Exception e) {
		return ResponseEntity.internalServerError().build();
	}
}

}
