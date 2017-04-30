package com.example.user_pc.myapplication;

/**
 * Created by User_pc on 2017/4/30.
 */

public class NBAItem {
    private int hostid;
    private String hostname;
    private String hostscore;
    private int guestid;
    private String guestname;
    private String guestscore;
    NBAItem(int id1,String name1,String score1,int id2,String name2,String score2)
    {
        this.hostid=id1;
        this.guestid=id2;
        this.hostname=name1;
        this.guestname=name2;
        this.hostscore=score1;
        this.guestscore=score2;
    }
    public int getHostid() {
        return hostid;
    }

    public void setHostid(int hostid) {
        this.hostid = hostid;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getHostscore() {
        return hostscore;
    }

    public void setHostscore(String hostscore) {
        this.hostscore = hostscore;
    }

    public int getGuestid() {
        return guestid;
    }

    public void setGuestid(int guestid) {
        this.guestid = guestid;
    }

    public String getGuestname() {
        return guestname;
    }

    public void setGuestname(String guestname) {
        this.guestname = guestname;
    }

    public String getGuestscore() {
        return guestscore;
    }

    public void setGuestscore(String guestscore) {
        this.guestscore = guestscore;
    }

}
