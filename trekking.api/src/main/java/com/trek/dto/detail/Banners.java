package com.trek.dto.detail;

import com.trek.dto.Banner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Banners {
    public ArrayList<Banner> banners = new ArrayList<>();
}
