package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.dto.ApplicationDto;
import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.service.CampaignService;
import com.patika.kredinbizdeservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/campaigns")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Campaign create(@RequestBody Campaign campaign) {
        return campaignService.save(campaign);
    }

    @GetMapping
    public List<Campaign> getAll() {
        return campaignService.getAll();
    }
}
