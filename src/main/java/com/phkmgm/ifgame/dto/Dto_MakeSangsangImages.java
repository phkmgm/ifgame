package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dto_MakeSangsangImages {
    private Long msiseq;
    private int msimsseq;
    private String msiimg;
    private String msimemo;
    private String msiidatetime;

    public Dto_MakeSangsangImages(Long msiseq, int msimsseq, String msiimg, String msimemo, String msiidatetime) {
        this.msiseq = msiseq;
        this.msimsseq = msimsseq;
        this.msiimg = msiimg;
        this.msimemo = msimemo;
        this.msiidatetime = msiidatetime;
    }
}
