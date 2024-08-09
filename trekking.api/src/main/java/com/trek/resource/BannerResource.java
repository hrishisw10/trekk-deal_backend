package com.trek.resource;

import com.trek.dto.Banner;
import com.trek.dto.detail.Banners;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/v1/dashboard")
public class BannerResource {

    @GetMapping("/banner")
    public ResponseEntity<Banners> getDashboardBanners() {
        return new ResponseEntity<Banners>(getBanners(), HttpStatus.OK);
    }

    private Banners getBanners() {
        Banners banners = new Banners();
        ArrayList<Banner> bannerList = new ArrayList<Banner>();
        bannerList.add(new Banner("https://mybackendimage.s3.ap-south-1.amazonaws.com/Ratangadh+Fort+Trek/Ratangadh+Fort+Trek_3.jpeg", "Ratangarh Flower Festival", "20", "1999"));
        bannerList.add(new Banner("https://mybackendimage.s3.ap-south-1.amazonaws.com/Kalsubai+Trek/Kalsubai+Trek_1.jpeg", "Kalsubai Highest Peak", "25", "1499"));
        bannerList.add(new Banner("https://mybackendimage.s3.ap-south-1.amazonaws.com/Dudhsagar+Waterfall+Trek/WhatsApp+Image+2023-04-25+at+12.25.14+AM.jpeg", "Dudhsagar Milky Waterfall", "15", "2499"));
        bannerList.add(new Banner("https://mybackendimage.s3.ap-south-1.amazonaws.com/KedarnathTrek/Kedarnath+Trek_1.jpeg", "Kedarnath-The god's land", "5", "11999"));
        bannerList.add(new Banner("https://mybackendimage.s3.ap-south-1.amazonaws.com/ManaliShimla+Trip/Shimla+Manali+trip_8.jpeg", "Shimla-Manali-Kasol", "7", "13999"));

        banners.setBanners(bannerList);
        return banners;
    }
}