
package com.users.ejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_scm_distributors MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-5-28 10:01:41
 */
@SuppressWarnings("serial") 
@Entity
@Table(name = "t_scm_distributors")
public class ScmDistributors   implements Serializable {
    @Id
	@Column(name = "FDistributorID")
	private String fdistributorid;
    
	@Column(name = "FParentID")
	private String fparentid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FIntroducer")
	private String fintroducer;
    
	@Column(name = "FIntroerType")
	private Integer fintroertype;
    
	@Column(name = "FName")
	private String fname;
    
	@Column(name = "FPhone")
	private String fphone;
    
	@Column(name = "FMobile")
	private String fmobile;
    
	@Column(name = "FAddress")
	private String faddress;
    
	@Column(name = "FZipCode")
	private String fzipcode;
    
	@Column(name = "fsex")
	private Integer fsex;
    
	@Column(name = "FBirthday")
	private java.sql.Timestamp fbirthday;
    
	@Column(name = "FWeight")
	private Integer fweight;
    
	@Column(name = "FHeight")
	private Integer fheight;
    
	@Column(name = "FRemark")
	private String fremark;
    
	@Column(name = "FPicture")
	private String fpicture;
    
	@Column(name = "FRelativeURL")
	private String frelativeurl;
    
	@Column(name = "FRank")
	private Integer frank;
    
	@Column(name = "FOrder")
	private Integer forder;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
    

	public String getFdistributorid() {
		return fdistributorid;
	}
    
	public void setFdistributorid(String fdistributorid) {		     
         this.fdistributorid = fdistributorid;
	}
	public String getFparentid() {
		return fparentid;
	}
    
	public void setFparentid(String fparentid) {		     
         this.fparentid = fparentid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFintroducer() {
		return fintroducer;
	}
    
	public void setFintroducer(String fintroducer) {		     
         this.fintroducer = fintroducer;
	}
	public Integer getFintroertype() {
		return fintroertype;
	}
    
	public void setFintroertype(Integer fintroertype) {		     
         this.fintroertype = fintroertype;
	}
	public String getFname() {
		return fname;
	}
    
	public void setFname(String fname) {		     
         this.fname = fname;
	}
	public String getFphone() {
		return fphone;
	}
    
	public void setFphone(String fphone) {		     
         this.fphone = fphone;
	}
	public String getFmobile() {
		return fmobile;
	}
    
	public void setFmobile(String fmobile) {		     
         this.fmobile = fmobile;
	}
	public String getFaddress() {
		return faddress;
	}
    
	public void setFaddress(String faddress) {		     
         this.faddress = faddress;
	}
	public String getFzipcode() {
		return fzipcode;
	}
    
	public void setFzipcode(String fzipcode) {		     
         this.fzipcode = fzipcode;
	}
	public Integer getFsex() {
		return fsex;
	}
    
	public void setFsex(Integer fsex) {		     
         this.fsex = fsex;
	}
	public java.sql.Timestamp getFbirthday() {
		return fbirthday;
	}
    
	public void setFbirthday(java.sql.Timestamp fbirthday) {		     
         this.fbirthday = fbirthday;
	}
	public Integer getFweight() {
		return fweight;
	}
    
	public void setFweight(Integer fweight) {		     
         this.fweight = fweight;
	}
	public Integer getFheight() {
		return fheight;
	}
    
	public void setFheight(Integer fheight) {		     
         this.fheight = fheight;
	}
	public String getFremark() {
		return fremark;
	}
    
	public void setFremark(String fremark) {		     
         this.fremark = fremark;
	}
	public String getFpicture() {
		return fpicture;
	}
    
	public void setFpicture(String fpicture) {		     
         this.fpicture = fpicture;
	}
	public String getFrelativeurl() {
		return frelativeurl;
	}
    
	public void setFrelativeurl(String frelativeurl) {		     
         this.frelativeurl = frelativeurl;
	}
	public Integer getFrank() {
		return frank;
	}
    
	public void setFrank(Integer frank) {		     
         this.frank = frank;
	}
	public Integer getForder() {
		return forder;
	}
    
	public void setForder(Integer forder) {		     
         this.forder = forder;
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
