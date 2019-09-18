package com.example.autoadd;

import com.example.autoadd.dao.DataDao;
import com.example.autoadd.domain.buoy;
import com.example.autoadd.domain.stat;
import com.example.autoadd.domain.viru;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DataService {
    @Autowired
    private DataDao dataDao;

    @Transactional
    public void doAdd(){
        dataDao.saveviru(new viru());
        dataDao.savebuoy(new buoy());
        dataDao.savestat(new stat());
    }
}
