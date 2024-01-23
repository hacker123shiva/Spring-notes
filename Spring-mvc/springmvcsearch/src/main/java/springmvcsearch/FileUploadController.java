package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String  fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model) throws IOException {
		System.out.println("file upload Handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getStorageDescription());
		
		byte [] data=file.getBytes();
		//we have to save this file to server...
		String path=session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+
				"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("file uploaded");
		model.addAttribute("msg","uploaded succesfully");
		model.addAttribute("filename", file.getOriginalFilename());
		return "filesuccess";
	}
}
