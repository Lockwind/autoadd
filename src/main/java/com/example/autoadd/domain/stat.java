package com.example.autoadd.domain;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.util.Random;

@Alias("stat")
public class stat {
    private Integer sId;
    private Float  s1;
    private Float  s2;
    private Float  s3;
    private Float  s4;
    private Float  s5;
    private Float  s6;
    private Float  s7;
    private Float  s8;
    private Float  s9;
    private LocalDateTime sTime;

    @Override
    public String toString() {
        return "station{" +
                "sId=" + sId +
                ", s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                ", s4=" + s4 +
                ", s5=" + s5 +
                ", s6=" + s6 +
                ", s7=" + s7 +
                ", s8=" + s8 +
                ", s9=" + s9 +
                ", sTime=" + sTime +
                '}';
    }

    public stat() {
        sTime=LocalDateTime.now();
        s1= new Random().nextFloat()*(10f-1f);
        s2= new Random().nextFloat()*(10f-1f);
        s3= new Random().nextFloat()*(10f-1f);
        s4= new Random().nextFloat()*(10f-1f);
        s5= new Random().nextFloat()*(10f-1f);
        s6= new Random().nextFloat()*(10f-1f);
        s7= new Random().nextFloat()*(10f-1f);
        s8= new Random().nextFloat()*(10f-1f);
        s9= new Random().nextFloat()*(10f-1f);
    }

    public stat(LocalDateTime sTime) {
        this.sTime = sTime;
    }

    public stat(Integer sId, Float s1, Float s2, Float s3, Float s4, Float s5, Float s6, Float s7, Float s8, Float s9, LocalDateTime sTime) {
        this.sId = sId;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.sTime = sTime;
    }

    public stat(Float s1, Float s2, Float s3, Float s4, Float s5, Float s6, Float s7, Float s8, Float s9, LocalDateTime sTime) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
        this.s7 = s7;
        this.s8 = s8;
        this.s9 = s9;
        this.sTime = sTime;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Float getS1() {
        return s1;
    }

    public void setS1(Float s1) {
        this.s1 = s1;
    }

    public Float getS2() {
        return s2;
    }

    public void setS2(Float s2) {
        this.s2 = s2;
    }

    public Float getS3() {
        return s3;
    }

    public void setS3(Float s3) {
        this.s3 = s3;
    }

    public Float getS4() {
        return s4;
    }

    public void setS4(Float s4) {
        this.s4 = s4;
    }

    public Float getS5() {
        return s5;
    }

    public void setS5(Float s5) {
        this.s5 = s5;
    }

    public Float getS6() {
        return s6;
    }

    public void setS6(Float s6) {
        this.s6 = s6;
    }

    public Float getS7() {
        return s7;
    }

    public void setS7(Float s7) {
        this.s7 = s7;
    }

    public Float getS8() {
        return s8;
    }

    public void setS8(Float s8) {
        this.s8 = s8;
    }

    public Float getS9() {
        return s9;
    }

    public void setS9(Float s9) {
        this.s9 = s9;
    }

    public LocalDateTime getsTime() {
        return sTime;
    }

    public void setsTime(LocalDateTime sTime) {
        this.sTime = sTime;
    }
}
