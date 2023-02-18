package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dto_PlaySangsang {
    private Long psseq;
    private Long psusseq;
    private String psuiid;
    private String psidatetime;
    private String psudatetime;

    public Dto_PlaySangsang(Long psseq, Long psusseq, String psuiid, String psidatetime, String psudatetime) {
        this.psseq = psseq;
        this.psusseq = psusseq;
        this.psuiid = psuiid;
        this.psidatetime = psidatetime;
        this.psudatetime = psudatetime;
    }
}
