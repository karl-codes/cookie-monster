package cookie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chocolateCookies")
public class ChocolateCookieApi extends CookieApi<ChocolateCookie> {
	
	@Autowired
	public ChocolateCookieApi(ChocolateCookieService cookieService) {
		super(cookieService);
	}

	@PostMapping
	public ResponseEntity<ChocolateCookie> create(@RequestBody ChocolateCookie dto) {
		// TODO Process DTO and store the cookie
		return ResponseEntity.ok(dto);
	}
}
