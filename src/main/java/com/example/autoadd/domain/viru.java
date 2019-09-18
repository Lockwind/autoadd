package com.example.autoadd.domain;

import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.util.Random;

@Alias("viru")
public class viru {
    private Integer vId;
    private Float vVirus;
    private LocalDateTime vTime;

    public viru(LocalDateTime vTime) {
        this.vTime = vTime;
    }

    public viru() {
        vTime=LocalDateTime.now();
        vVirus= new Random().nextFloat()*(10f-1f);
    }

    public viru(Float vVirus, LocalDateTime vTime) {
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    public viru(Integer vId, Float vVirus, LocalDateTime vTime) {
        this.vId = vId;
        this.vVirus = vVirus;
        this.vTime = vTime;
    }

    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Float getvVirus() {
        return vVirus;
    }

    public void setvVirus(Float vVirus) {
        this.vVirus = vVirus;
    }

    public LocalDateTime getvTime() {
        return vTime;
    }

    public void setvTime(LocalDateTime vTime) {
        this.vTime = vTime;
    }

    @Override
    public String toString() {
        return "virulence{" +
                "vId=" + vId +
                ", vVirus=" + vVirus +
                ", vTime=" + vTime +
                '}';
    }
}
