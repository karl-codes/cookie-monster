package cookie;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public abstract class CookieApi<T extends Cookie> {

    private final CookieService<T> cookieService;

    public CookieApi(CookieService<T> cookieService) {
        this.cookieService = cookieService;
        //Assert.notNull(this.cookieService, "Cookie service must be set.");
    }

    @PostMapping("/{cookieId}")
    public ResponseEntity<?> eatCookie(@PathVariable long cookieId) {
        final T cookie = cookieService.findCookie(cookieId); // Cookie service is null
        cookieService.eatCookie(cookie);
        return new ResponseEntity<>(HttpStatus.OK);
    }
	
}
