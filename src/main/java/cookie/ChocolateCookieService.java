package cookie;

import org.springframework.stereotype.Service;

@Service
public class ChocolateCookieService implements CookieService<ChocolateCookie> {

    @Override
    public ChocolateCookie findCookie(long cookieId) {
        // TODO Load a stored cookie and return it.
        return new ChocolateCookie();
    }

    @Override
    public void eatCookie(ChocolateCookie cookie) {
        // TODO Eat cookie;
    }
}