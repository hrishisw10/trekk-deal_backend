package com.trek.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Banner {
    public String imageUrl;
    public String bannerTitle;
    public String noOfTours;
    public String priceStartingFrom;
}
