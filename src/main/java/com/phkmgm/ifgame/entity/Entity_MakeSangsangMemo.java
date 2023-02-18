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
@Table(name = "make_sangsang_memo")
public class Entity_MakeSangsangMemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "msm_seq", nullable = false)
    private Long msmseq;

    @Column(name = "msm_memo", nullable = false)
    private String msmmemo;

    @Column(name = "msm_pos", nullable = false)
    private String msmpos;

    @Column(name = "msm_idatetime", nullable = false)
    private String msmidatetime;

    @Builder
    public Entity_MakeSangsangMemo(Long msmseq, String msmmemo, String msmpos, String msmidatetime) {
        this.msmseq = msmseq;
        this.msmmemo = msmmemo;
        this.msmpos = msmpos;
        this.msmidatetime = msmidatetime;
    }
}