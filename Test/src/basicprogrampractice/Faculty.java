package basicprogrampractice;

public class Faculty {
	int id;
	String name, subject;
	long contact;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}
	public String toString()
	{
		return id+" "+name+" "+subject+" "+contact;
	}
}
