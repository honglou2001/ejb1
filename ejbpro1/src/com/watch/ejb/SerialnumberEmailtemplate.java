package com.watch.ejb;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_emailtemplate MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-12-20 11:42:28
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_serialnumber_emailtemplate")
public class SerialnumberEmailtemplate   implements Serializable {
    private static final long serialVersionUID = 1L;    
    @Id
	@Column(name = "FTemplateID")
	private String ftemplateid;
    
	@Column(name = "FIncreaseID",insertable=false,updatable=false)
	private Integer fincreaseid;
    
	@Column(name = "FAppId")
	private String fappid;
    
	@Column(name = "FUserID")
	private String fuserid;
    
	@Column(name = "FSNID")
	private String fsnid;
    
	@Column(name = "FSNNumber")
	private String fsnnumber;
    
	@Column(name = "FTag")
	private String ftag;
    
	@Column(name = "FTitle")
	private String ftitle;
    
	@Column(name = "FType")
	private Integer ftype;
    
	@Column(name = "FContent")
	private String fcontent;
    
	@Column(name = "FLanguage")
	private Integer flanguage;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FFieldStatus")
	private Integer ffieldstatus;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    
	@Column(name = "FRemark")
	private String fremark;
    

	public String getFtemplateid() {
		return ftemplateid;
	}
    
	public void setFtemplateid(String ftemplateid) {		     
         this.ftemplateid = ftemplateid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFappid() {
		return fappid;
	}
    
	public void setFappid(String fappid) {		     
         this.fappid = fappid;
	}
	public String getFuserid() {
		return fuserid;
	}
    
	public void setFuserid(String fuserid) {		     
         this.fuserid = fuserid;
	}
	public String getFsnid() {
		return fsnid;
	}
    
	public void setFsnid(String fsnid) {		     
         this.fsnid = fsnid;
	}
	public String getFsnnumber() {
		return fsnnumber;
	}
    
	public void setFsnnumber(String fsnnumber) {		     
         this.fsnnumber = fsnnumber;
	}
	public String getFtag() {
		return ftag;
	}
    
	public void setFtag(String ftag) {		     
         this.ftag = ftag;
	}
	public String getFtitle() {
		return ftitle;
	}
    
	public void setFtitle(String ftitle) {		     
         this.ftitle = ftitle;
	}
	public Integer getFtype() {
		return ftype;
	}
    
	public void setFtype(Integer ftype) {		     
         this.ftype = ftype;
	}
	public String getFcontent() {
		return fcontent;
	}
    
	public void setFcontent(String fcontent) {		     
         this.fcontent = fcontent;
	}
	public Integer getFlanguage() {
		return flanguage;
	}
    
	public void setFlanguage(Integer flanguage) {		     
         this.flanguage = flanguage;
	}
	public Integer getFdatastatus() {
		return fdatastatus;
	}
    
	public void setFdatastatus(Integer fdatastatus) {		     
         this.fdatastatus = fdatastatus;
	}
	public Integer getFfieldstatus() {
		return ffieldstatus;
	}
    
	public void setFfieldstatus(Integer ffieldstatus) {		     
         this.ffieldstatus = ffieldstatus;
	}
	public java.sql.Timestamp getFaddtime() {
		return faddtime;
	}
    
	public void setFaddtime(java.sql.Timestamp faddtime) {		     
         this.faddtime = faddtime;
	}
	public java.sql.Timestamp getFupdatetime() {
		return fupdatetime;
	}
    
	public void setFupdatetime(java.sql.Timestamp fupdatetime) {		     
         this.fupdatetime = fupdatetime;
	}
	public String getFremark() {
		return fremark;
	}
    
	public void setFremark(String fremark) {		     
         this.fremark = fremark;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}