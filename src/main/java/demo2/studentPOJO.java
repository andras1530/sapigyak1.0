

package demo2;

public class studentPOJO {
		private int id;
		private String firstname;
		private String lastname;
		private String szak;
		private int evfolyam;
		private String regisztralas_dat;
		private String update_date;
		private int status;
		
		

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

		public void setEvfolyam(int evfolyam) {
			this.evfolyam = evfolyam;
		}

		public String getRegisztralas_dat() {
			return regisztralas_dat;
		}

		public void setRegisztralas_dat(String regisztralas_dat) {
			this.regisztralas_dat = regisztralas_dat;
		}

		public String getUpdate_date() {
			return update_date;
		}

		public void setUpdate_date(String update_date) {
			this.update_date = update_date;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		@Override
		public String toString() {
			return "studentPOJO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", szak=" + szak
					+ ", evfolyam=" + evfolyam + ", regisztralas_dat=" + regisztralas_dat + ", update_date="
					+ update_date + ", status=" + status + "]";
		}

		public studentPOJO(int id, String firstname, String lastname, String szak, int evfolyam,
				String regisztralas_dat, String update_date, int status) {
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
		
		
}
