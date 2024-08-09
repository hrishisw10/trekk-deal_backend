package com.trek.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Trip {
    public String tripTitle;
    public String days;
    public int price;
    public String whatsappConnectUrl;
    public String viewDetails;

}
