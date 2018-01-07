package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "E_ISSUEBOOK")
public class IssueBookBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String isbno;
	private String studentid;
	private String studentname;
	private long studentmobile;
	private Date issueddate;

	public IssueBookBean() {
	}

	public IssueBookBean(String isbno, String studentid, String studentname, long studentmobile,
			Date issueddate) {
		super();
		this.isbno = isbno;
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentmobile = studentmobile;
		this.issueddate = issueddate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbno() {
		return isbno;
	}

	public void setIsbno(String isbno) {
		this.isbno = isbno;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public long getStudentmobile() {
		return studentmobile;
	}

	public void setStudentmobile(long studentmobile) {
		this.studentmobile = studentmobile;
	}

	public Date getIssueddate() {
		return issueddate;
	}

	public void setIssueddate(Date issueddate) {
		this.issueddate = issueddate;
	}

}
