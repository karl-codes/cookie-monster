package cookie;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chocolateCookies")
public class ChocolateCookieApi extends CookieApi<ChocolateCookie> {
	
    @GetMapping("/{cookieId}")
    public ResponseEntity<Cookie> findCookie(@PathVariable long cookieId) {
        final Cookie cookie = new Cookie();
        cookie.setId(cookieId);
        cookie.setExpirationDate(LocalDateTime.now().plusWeeks(4));
        return new ResponseEntity<>(cookie, HttpStatus.OK);
    }
	
	@Autowired
	public ChocolateCookieApi(ChocolateCookieService cookieService) {
		super(cookieService);
	}

	@PostMapping
	public ResponseEntity<ChocolateCookie> create(@RequestBody ChocolateCookie dto) {
		//Converting to java.util.Date before setting to entity object that will be used to insert record.
		//Instant instant = Instant.ofEpochMilli(date.getTime());
		Date expDate = Date.valueOf(dto.getExpirationDate().toLocalDate());
		System.out.println(expDate);
		return ResponseEntity.ok(dto);
	}
	
}
