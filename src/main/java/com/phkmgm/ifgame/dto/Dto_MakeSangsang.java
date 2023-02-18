package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dto_MakeSangsang {
    private Long msseq;
    private String msuiid;
    private String mstitle;
    private String mstag;
    private String msciseq;
    private String mscontents;
    private String msimgbackground;
    private String msidatetime;
    private String msudatetime;

    public Dto_MakeSangsang(Long msseq, String msuiid, String mstitle, String mstag, String msciseq, String mscontents, String msimgbackground, String msidatetime, String msudatetime) {
        this.msseq = msseq;
        this.msuiid = msuiid;
        this.mstitle = mstitle;
        this.mstag = mstag;
        this.msciseq = msciseq;
        this.mscontents = mscontents;
        this.msimgbackground = msimgbackground;
        this.msidatetime = msidatetime;
        this.msudatetime = msudatetime;
    }
}
