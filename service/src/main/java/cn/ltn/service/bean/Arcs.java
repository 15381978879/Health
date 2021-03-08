package cn.ltn.service.bean;

import java.io.Serializable;
import java.util.Date;

public class Arcs implements Serializable {
    public int getArcid() {
        return arcid;
    }

    public void setArcid(int arcid) {
        this.arcid = arcid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public int getHbp() {
        return hbp;
    }

    public void setHbp(int hbp) {
        this.hbp = hbp;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    private int arcid;

    private String pname;
    private int sex;
    private Date birthdate;
    private String personid;
    private int areaid;
    private int hbp;
    private int dm;
    private int uuid;


    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    private Date createtime;

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    private int teamid;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    private Users users;

    public int getOwnid() {
        return ownid;
    }

    public void setOwnid(int ownid) {
        this.ownid = ownid;
    }

    private int ownid;

    public String getCreater() {
        return creater;
    }

    @Override
    public String toString() {
        return "Arcs{" +
                "arcid=" + arcid +
                ", pname='" + pname + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", personid='" + personid + '\'' +
                ", areaid=" + areaid +
                ", hbp=" + hbp +
                ", dm=" + dm +
                ", uuid=" + uuid +
                ", createtime=" + createtime +
                ", teamid=" + teamid +
                ", users=" + users +
                ", ownid=" + ownid +
                ", creater='" + creater + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    private String creater;
    private String owner;
}
