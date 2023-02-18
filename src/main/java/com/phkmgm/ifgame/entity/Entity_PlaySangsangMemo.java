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
@Table(name = "play_sangsang_memo")
public class Entity_PlaySangsangMemo {

    /*
    * psm_seq
    * psm_ps_seq
    * psm_memo
    * psm_pos
    * psm_idatetime
    * psm_udatetime
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psm_seq", nullable = false)
    private Long psmseq;

    @Column(name = "psm_ps_seq", nullable = false)
    private Long psmpsseq;

    @Column(name = "psm_memo", nullable = false)
    private String psmmemo;

    @Column(name = "psm_pos", nullable = false)
    private String psmpos;

    @Column(name = "psm_idatetime", nullable = false)
    private String psmidatetime;

    @Column(name = "psm_udatetime", nullable = false)
    private String psmudatetime;

    @Builder
    public Entity_PlaySangsangMemo(Long psmseq, Long psmpsseq, String psmmemo, String psmpos, String psmidatetime, String psmudatetime) {
        this.psmseq = psmseq;
        this.psmpsseq = psmpsseq;
        this.psmmemo = psmmemo;
        this.psmpos = psmpos;
        this.psmidatetime = psmidatetime;
        this.psmudatetime = psmudatetime;
    }
}