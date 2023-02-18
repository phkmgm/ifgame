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
@Table(name = "play_sangsang")
public class Entity_PlaySangsang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ps_seq", nullable = false)
    private Long psseq;

    @Column(name = "ps_us_seq", nullable = false)
    private Long psusseq;

    @Column(name = "ps_ui_id", nullable = false)
    private String psuiid;

    @Column(name = "ps_idatetime", nullable = false)
    private String psidatetime;

    @Column(name = "ps_udatetime", nullable = false)
    private String psudatetime;

    @Builder
    public Entity_PlaySangsang(Long psseq, Long psusseq, String psuiid, String psidatetime, String psudatetime) {
        this.psseq = psseq;
        this.psusseq = psusseq;
        this.psuiid = psuiid;
        this.psidatetime = psidatetime;
        this.psudatetime = psudatetime;
    }
}