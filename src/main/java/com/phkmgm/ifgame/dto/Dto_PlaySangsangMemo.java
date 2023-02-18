package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
public class Dto_PlaySangsangMemo {
    private Long psmseq;
    private Long psmpsseq;
    private String psmmemo;
    private String psmpos;
    private String psmidatetime;
    private String psmudatetime;

    public Dto_PlaySangsangMemo(Long psmseq, Long psmpsseq, String psmmemo, String psmpos, String psmidatetime, String psmudatetime) {
        this.psmseq = psmseq;
        this.psmpsseq = psmpsseq;
        this.psmmemo = psmmemo;
        this.psmpos = psmpos;
        this.psmidatetime = psmidatetime;
        this.psmudatetime = psmudatetime;
    }
}
