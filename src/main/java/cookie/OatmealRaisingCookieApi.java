package cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oatmeal-raisin-cookie")
public class OatmealRaisingCookieApi extends CookieApi<OatmealRaisinCookie> {

	@Autowired
	public OatmealRaisingCookieApi(OatmealRaisinCookieService cookieService) {
		super(cookieService);
	}
	
	@PostMapping
	public ResponseEntity<OatmealRaisinCookie> create(@RequestBody OatmealRaisinCookie dto) {
		// TODO Process DTO and store the cookie
		return ResponseEntity.ok(dto);
	}

}
