package com.patika.kredinbizdeservice.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import com.patika.kredinbizdeservice.model.Campaign;

public class CampaignRepository {
	
	 private List<Campaign> list = new ArrayList<>();

	 public void save(Campaign campaign) {
		 list.add(campaign);
	    }

	 public List<Campaign> getAll() {
	     return list.stream().sorted(Comparator.comparing(Campaign::getCreateDate).reversed()).toList();
	 }

	 public void delete(Campaign campaign) {
		 list.remove(campaign);
	 }
}
