package cn.ltn.service.bean;

import java.io.Serializable;

public class Areas implements Serializable {
    int areaid;

    public int getAreaid() {
        return areaid;
    }

    public void setAreaid(int areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "areaid=" + areaid +
                ", areaname='" + areaname + '\'' +
                ", pid=" + pid +
                '}';
    }

    String areaname;
    int pid;
}
