

package ro.sapientia.andras.pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "student")
@JsonIgnoreProperties(ignoreUnknown=true)	

public class StudentPojo  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "firstname")
	private String firstName;
	
	
	@Column(name = "lastname")
	private String lastName;
	
	
	@Column(name = "szak")
	private String department;
	
	@Column(name = "evfolyam")
	private Integer year;
	
	@Column(name = "update_dat")
    @Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updated;
	
	@Column(name = "regisztralas_dat")
    @CreatedDate
	private Date created;
	
	@Column(name = "status")
	private Integer status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StudentPojo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", year=" + year + ", updated=" + updated + ", created=" + created + ", status=" + status
				+ "]";
	}
}
