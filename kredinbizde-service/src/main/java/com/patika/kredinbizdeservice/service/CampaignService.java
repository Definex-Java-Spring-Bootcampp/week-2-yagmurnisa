package com.patika.kredinbizdeservice.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.repository.CampaignRepository;

@Service
public class CampaignService {
    private CampaignRepository campRepository = new CampaignRepository();

    public Campaign save(Campaign camp) {
    	campRepository.save(camp);
        return camp;
    }

    public List<Campaign> getAll() {
        return campRepository.getAll();
    }
    
}
