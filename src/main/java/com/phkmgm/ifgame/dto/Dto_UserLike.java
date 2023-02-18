package com.phkmgm.ifgame.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@NoArgsConstructor
public class Dto_UserLike {
    private Long ulseq;
    private Long ulmsseq;
    private String uluiid;
    private String ulidatetime;

    public Dto_UserLike(Long ulseq, Long ulmsseq, String uluiid, String ulidatetime) {
        this.ulseq = ulseq;
        this.ulmsseq = ulmsseq;
        this.uluiid = uluiid;
        this.ulidatetime = ulidatetime;
    }
}
