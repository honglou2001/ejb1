package com.users.ejb;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * <p>Title: ejb title </p>
 * <p>Description: t_serialnumber_weight MODEL 处理类</p>
 * @author yangqinxu 电话：137****5317
 * @version 1.0 时间  2015-11-30 22:41:24
 */
@SuppressWarnings("serial")  
@Entity
@Table(name = "t_serialnumber_weight")
public class SerialnumberWeight   implements Serializable {
    private static final long serialVersionUID = 1L;    
    @Id
	@Column(name = "FWUniqueID")
	private String fwuniqueid;
    
	@Column(name = "FIncreaseID")
	private Integer fincreaseid;
    
	@Column(name = "FSndusrid")
	private String fsndusrid;
    
	@Column(name = "FSerialnumid")
	private String fserialnumid;
    
	@Column(name = "FAppcountid")
	private String fappcountid;
    
	@Column(name = "FIsDelete")
	private Integer fisdelete;
    
	@Column(name = "FIsLock")
	private Integer fislock;
    
	@Column(name = "Fweight")
	private java.math.BigDecimal fweight;
    
	@Column(name = "FHeight")
	private java.math.BigDecimal fheight;
    
	@Column(name = "FBMI")
	private java.math.BigDecimal fbmi;
    
	@Column(name = "FCalorie")
	private java.math.BigDecimal fcalorie;
    
	@Column(name = "FFatContent")
	private java.math.BigDecimal ffatcontent;
    
	@Column(name = "FBoneContent")
	private java.math.BigDecimal fbonecontent;
    
	@Column(name = "FMuscleContent")
	private java.math.BigDecimal fmusclecontent;
    
	@Column(name = "FWaterContent")
	private java.math.BigDecimal fwatercontent;
    
	@Column(name = "FVisceralFatContent")
	private java.math.BigDecimal fvisceralfatcontent;
    
	@Column(name = "FDataStatus")
	private Integer fdatastatus;
    
	@Column(name = "FRemark")
	private String fremark;
    
	@Column(name = "FAddTime")
	private java.sql.Timestamp faddtime;
    
	@Column(name = "FUpdateTime")
	private java.sql.Timestamp fupdatetime;
	
	@Transient
	private String fcallname;
	
	@Transient
	private String frelation;
	
	@Transient
	private String frealname;
	
    

	public String getFwuniqueid() {
		return fwuniqueid;
	}
    
	public void setFwuniqueid(String fwuniqueid) {		     
         this.fwuniqueid = fwuniqueid;
	}
	public Integer getFincreaseid() {
		return fincreaseid;
	}
    
	public void setFincreaseid(Integer fincreaseid) {		     
         this.fincreaseid = fincreaseid;
	}
	public String getFsndusrid() {
		return fsndusrid;
	}
    
	public void setFsndusrid(String fsndusrid) {		     
         this.fsndusrid = fsndusrid;
	}
	public String getFserialnumid() {
		return fserialnumid;
	}
    
	public void setFserialnumid(String fserialnumid) {		     
         this.fserialnumid = fserialnumid;
	}
	public String getFappcountid() {
		return fappcountid;
	}
    
	public void setFappcountid(String fappcountid) {		     
         this.fappcountid = fappcountid;
	}
	public Integer getFisdelete() {
		return fisdelete;
	}
    
	public void setFisdelete(Integer fisdelete) {		     
         this.fisdelete = fisdelete;
	}
	public Integer getFislock() {
		return fislock;
	}
    
	public void setFislock(Integer fislock) {		     
         this.fislock = fislock;
	}
	public java.math.BigDecimal getFweight() {
		return fweight;
	}
    
	public void setFweight(java.math.BigDecimal fweight) {		     
         this.fweight = fweight;
	}
	public java.math.BigDecimal getFheight() {
		return fheight;
	}
    
	public void setFheight(java.math.BigDecimal fheight) {		     
         this.fheight = fheight;
	}
	public java.math.BigDecimal getFbmi() {
		return fbmi;
	}
    
	public void setFbmi(java.math.BigDecimal fbmi) {		     
         this.fbmi = fbmi;
	}
	public java.math.BigDecimal getFcalorie() {
		return fcalorie;
	}
    
	public void setFcalorie(java.math.BigDecimal fcalorie) {		     
         this.fcalorie = fcalorie;
	}
	public java.math.BigDecimal getFfatcontent() {
		return ffatcontent;
	}
    
	public void setFfatcontent(java.math.BigDecimal ffatcontent) {		     
         this.ffatcontent = ffatcontent;
	}
	public java.math.BigDecimal getFbonecontent() {
		return fbonecontent;
	}
    
	public void setFbonecontent(java.math.BigDecimal fbonecontent) {		     
         this.fbonecontent = fbonecontent;
	}
	public java.math.BigDecimal getFmusclecontent() {
		return fmusclecontent;
	}
    
	public void setFmusclecontent(java.math.BigDecimal fmusclecontent) {		     
         this.fmusclecontent = fmusclecontent;
	}
	public java.math.BigDecimal getFwatercontent() {
		return fwatercontent;
	}
    
	public void setFwatercontent(java.math.BigDecimal fwatercontent) {		     
         this.fwatercontent = fwatercontent;
	}
	public java.math.BigDecimal getFvisceralfatcontent() {
		return fvisceralfatcontent;
	}
    
	public void setFvisceralfatcontent(java.math.BigDecimal fvisceralfatcontent) {		     
         this.fvisceralfatcontent = fvisceralfatcontent;
	}
	public Integer getFdatastatus() {
		return fdatastatus;
	}
    
	public void setFdatastatus(Integer fdatastatus) {		     
         this.fdatastatus = fdatastatus;
	}
	public String getFremark() {
		return fremark;
	}
    
	public void setFremark(String fremark) {		     
         this.fremark = fremark;
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
	
	public String getFcallname() {
		return fcallname;
	}

	public void setFcallname(String fcallname) {
		this.fcallname = fcallname;
	}

	public String getFrelation() {
		return frelation;
	}

	public void setFrelation(String frelation) {
		this.frelation = frelation;
	}

	public String getFrealname() {
		return frealname;
	}

	public void setFrealname(String frealname) {
		this.frealname = frealname;
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