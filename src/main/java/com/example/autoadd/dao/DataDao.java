package com.example.autoadd.dao;

import com.example.autoadd.domain.buoy;
import com.example.autoadd.domain.stat;
import com.example.autoadd.domain.viru;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataDao {
      int savebuoy(buoy buoy);
      int savestat(stat stat);
      int saveviru(viru viru);
}
