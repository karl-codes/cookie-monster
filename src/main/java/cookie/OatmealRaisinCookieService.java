package cookie;

import org.springframework.stereotype.Service;

@Service
public class OatmealRaisinCookieService implements CookieService<OatmealRaisinCookie> {

	@Override
	public OatmealRaisinCookie findCookie(long cookieId) {
		// TODO Auto-generated method stub
		return new OatmealRaisinCookie();
	}

	@Override
	public void eatCookie(OatmealRaisinCookie cookie) {
		// TODO Auto-generated method stub
	}

}
