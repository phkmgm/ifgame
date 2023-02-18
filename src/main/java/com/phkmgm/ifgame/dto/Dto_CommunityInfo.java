package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Dto_CommunityInfo {
    private Long ciseq;
    private String ciname;
    private String ciidatetime;
    private String ciudatetime;

    public Dto_CommunityInfo(Long ciseq, String ciname, String ciidatetime, String ciudatetime) {
        this.ciseq = ciseq;
        this.ciname = ciname;
        this.ciidatetime = ciidatetime;
        this.ciudatetime = ciudatetime;
    }
}
