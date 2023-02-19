package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dto_MakeSangsangMemo {
    private Long msmseq;
    private Long msmmsseq;
    private String msmmemo;
    private String msmpos;
    private String msmidatetime;

    public Dto_MakeSangsangMemo(Long msmseq, Long msmmsseq, String msmmemo, String msmpos, String msmidatetime) {
        this.msmseq = msmseq;
        this.msmmsseq = msmmsseq;
        this.msmmemo = msmmemo;
        this.msmpos = msmpos;
        this.msmidatetime = msmidatetime;
    }
}
