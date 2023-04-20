package trash.can.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Horodenko")
public class MainController {
	
	@RequestMapping("/getCodeLines")
	public void main() throws Exception {	
		
		URL url = new URL("https://plaintextproject.online/articles.html");
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line = null;
        
            // Read each (code) line and write to System.out
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
	}
	
}
