package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dto_MakeSangsangMemo {
    private Long msmseq;
    private String msmmemo;
    private String msmpos;
    private String msmidatetime;

    public Dto_MakeSangsangMemo(Long msmseq, String msmmemo, String msmpos, String msmidatetime) {
        this.msmseq = msmseq;
        this.msmmemo = msmmemo;
        this.msmpos = msmpos;
        this.msmidatetime = msmidatetime;
    }
}
