package cookie;

import java.time.LocalDateTime;

public class Cookie {

	private long id;
	private LocalDateTime expirationDate;

	/**
	 * @return the expirationDate
	 */
	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

}
