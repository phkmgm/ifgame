package com.phkmgm.ifgame.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Setter
@Table(name = "make_sangsang")
public class MakeSangsang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ms_seq", nullable = false)
    private Long msseq;

    @Column(name = "ms_ui_id", nullable = false)
    private String msuiid;

    @Column(name = "ms_title", nullable = false)
    private String mstitle;

    @Column(name = "ms_tag", nullable = false)
    private String mstag;

    @Column(name = "ms_ci_seq", nullable = false)
    private String msciseq;

    @Column(name = "ms_contents", nullable = false)
    private String mscontents;

    @Column(name = "ms_img_background", nullable = false)
    private String msimgbackground;

    @Column(name = "ms_idatetime", nullable = false)
    private String msidatetime;

    @Column(name = "ms_udatetime", nullable = false)
    private String msudatetime;

    @Builder
    public MakeSangsang(Long msseq, String msuiid, String mstitle, String mstag, String msciseq, String mscontents, String msimgbackground, String msidatetime, String msudatetime) {
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