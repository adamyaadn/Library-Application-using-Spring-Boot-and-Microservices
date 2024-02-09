package training.trg.bookdata.entity;


public class Author {
	private int authId;
	
	@Override
	public String toString() {
		return "Author [authId=" + authId + ", name=" + name + ", subject=" + subject + ", mobile=" + mobile + "]";
	}
	private String name;
	private String subject;
	private float mobile;
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public float getMobile() {
		return mobile;
	}
	public void setMobile(float mobile) {
		this.mobile = mobile;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authId, String name, String subject, float mobile) {
		super();
		this.authId = authId;
		this.name = name;
		this.subject = subject;
		this.mobile = mobile;
	}
}
