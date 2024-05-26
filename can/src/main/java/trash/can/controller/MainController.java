package trash.can.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Horodenko")
public class MainController {
	
	// Testar = http://localhost:8080/Horodenko/getCodeLines?caminho=
	@RequestMapping("/getCodeLines")
	public void getCodeLines(@RequestParam String caminho) throws Exception {	
		
		URL url = new URL("https://open.spotify.com/queue");
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line = null;
        
            // Read each (code) line and write to System.out
            while ((line = br.readLine()) != null) {
                System.out.println(line + "\n");
            }
        }
	}
	
	// Testar = http://localhost:8080/Horodenko/getMusicLink?musicName=
	@RequestMapping("/getMusicLink")
	public void getMusicLink(@RequestParam String musicName) {
		System.out.println(musicName);
	}
}
