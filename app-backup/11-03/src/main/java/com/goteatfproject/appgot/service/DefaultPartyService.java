package com.goteatfproject.appgot.service;

import com.goteatfproject.appgot.dao.PartyDao;
import com.goteatfproject.appgot.vo.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultPartyService implements PartyService {

  @Autowired
  PartyDao partyDao;

  @Override
  public List<Party> list() throws Exception {
    return partyDao.findAll();
  }

}
