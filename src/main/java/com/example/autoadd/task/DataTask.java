package com.example.autoadd.task;

import com.example.autoadd.DataService;
import com.example.autoadd.dao.DataDao;
import com.example.autoadd.domain.buoy;
import com.example.autoadd.domain.stat;
import com.example.autoadd.domain.viru;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataTask {

    @Autowired
    private DataService service;

    private int count=0;

    @Scheduled(cron = "0/10 * * * * ? ")
    public void add(){
        count++;
        service.doAdd();
        System.out.println("插入"+count+"次");
    }
}
