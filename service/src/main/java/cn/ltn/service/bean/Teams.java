package cn.ltn.service.bean;

import java.io.Serializable;

public class Teams implements Serializable {

    int teamid;

    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public int getCapid() {
        return capid;
    }

    public void setCapid(int capid) {
        this.capid = capid;
    }

    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    String teamname;
    int capid;
    int areaid;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teamid=" + teamid +
                ", teamname='" + teamname + '\'' +
                ", capid=" + capid +
                ", areaid=" + areaid +
                ", users=" + users +
                '}';
    }

    Users users;
}
