package com.users.ejb;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

  
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_authority_rolemenu")
public class RMenu  implements Serializable {

	@Id
    @Column(name = "FID")
	private String id;
	
    @Column(name = "FRoleID")
	private String froleid;
    
    @Column(name = "FMenuID")
	private String fmenuid;
    
    @Column(name = "FAuthVal")
	private long fauthval;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFroleid() {
		return froleid;
	}

	public void setFroleid(String froleid) {
		this.froleid = froleid;
	}

	public String getFmenuid() {
		return fmenuid;
	}

	public void setFmenuid(String fmenuid) {
		this.fmenuid = fmenuid;
	}

	public long getFauthval() {
		return fauthval;
	}

	public void setFauthval(long fauthval) {
		this.fauthval = fauthval;
	}
	
}
