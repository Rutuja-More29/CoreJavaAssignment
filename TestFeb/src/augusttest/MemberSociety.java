package augusttest;

public class MemberSociety {
	int memberid;
	String wing_flatNo;
	String name;
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public String getWing_flatNo() {
		return wing_flatNo;
	}
	public void setWing_flatNo(String wing_flatNo) {
		this.wing_flatNo = wing_flatNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return memberid+" "+wing_flatNo+" "+name;
	}
}
