package cookie;

public interface CookieService<T extends Cookie> {
	
	T findCookie(long cookieId);

	void eatCookie(T cookie);
	
}