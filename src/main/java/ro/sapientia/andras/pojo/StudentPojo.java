

package ro.sapientia.andras.pojo;

import java.util.Date;
import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "student")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"regisztralas_dat", "update_dat"}, 
        allowGetters = true)

public class StudentPojo implements Serializable  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")
	private Integer id;
	
	@NotBlank
	@Column(name = "firstname")
		private String firstname;
	@NotBlank
	@Column(name = "lastname")
		private String lastname;
	@NotBlank
	@Column(name = "szak")
		private String szak;
		
	@Column(name = "evfolyam")
		private Integer evfolyam;
		
		@Column(nullable = false, updatable = false,name="regisztralas_dat")
	    @Temporal(TemporalType.TIMESTAMP)
	    @CreatedDate
		private Date regisztralas_dat;
		
		@Column(nullable = false,name="update_dat")
	    @Temporal(TemporalType.TIMESTAMP)
	    @LastModifiedDate
		private Date update_date;
		@Column(name = "status")
		private Integer status;
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getSzak() {
			return szak;
		}

		public void setSzak(String szak) {
			this.szak = szak;
		}

		public int getEvfolyam() {
			return evfolyam;
		}

		public void setEvfolyam(Integer evfolyam) {
			this.evfolyam = evfolyam;
		}

		public Date getRegisztralas_dat() {
			return regisztralas_dat;
		}

		public void setRegisztralas_dat(Date regisztralas_dat) {
			this.regisztralas_dat = regisztralas_dat;
		}

		public Date getUpdate_date() {
			return update_date;
		}

		public void setUpdate_date(Date update_date) {
			this.update_date = update_date;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "studentPOJO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", szak=" + szak
					+ ", evfolyam=" + evfolyam + ", regisztralas_dat=" + regisztralas_dat + ", update_date="
					+ update_date + ", status=" + status + "]";
		}
/*
		public StudentPojo(Integer id, String firstname, String lastname, String szak, Integer evfolyam,
				Date regisztralas_dat, Date update_date, Integer status) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.szak = szak;
			this.evfolyam = evfolyam;
			this.regisztralas_dat = regisztralas_dat;
			this.update_date = update_date;
			this.status = status;
		}
		
	*/	
}
