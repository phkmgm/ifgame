package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
public class Dto_PlaySangsangImages {
    private Long psiseq;
    private Long psipsseq;
    private Long psimsiseq;
    private String psiimagepos;
    private String psimemo;
    private String psiidatetime;
    private String psiudatetime;

    public Dto_PlaySangsangImages(Long psiseq, Long psipsseq, Long psimsiseq, String psiimagepos, String psimemo, String psiidatetime, String psiudatetime) {
        this.psiseq = psiseq;
        this.psipsseq = psipsseq;
        this.psimsiseq = psimsiseq;
        this.psiimagepos = psiimagepos;
        this.psimemo = psimemo;
        this.psiidatetime = psiidatetime;
        this.psiudatetime = psiudatetime;
    }
}
