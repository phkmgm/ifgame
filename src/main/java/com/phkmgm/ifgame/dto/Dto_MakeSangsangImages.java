package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dto_MakeSangsangImages {
    private Long msiseq;
    private int msiusseq;
    private String msiimg;
    private String msimemo;
    private String msiidatetime;

    public Dto_MakeSangsangImages(Long msiseq, int msiusseq, String msiimg, String msimemo, String msiidatetime) {
        this.msiseq = msiseq;
        this.msiusseq = msiusseq;
        this.msiimg = msiimg;
        this.msimemo = msimemo;
        this.msiidatetime = msiidatetime;
    }
}
