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
@Table(name = "play_sangsang_images")
public class Entity_PlaySangsangImages {

    /*
    * psi_seq
    * psi_ps_seq
    * psi_msi_seq
    * psi_image_pos
    * psi_memo
    * psi_idatetime
    * psi_udatetime
    * */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psi_seq", nullable = false)
    private Long psiseq;

    @Column(name = "psi_ps_seq", nullable = false)
    private Long psipsseq;

    @Column(name = "psi_msi_seq", nullable = false)
    private Long psimsiseq;

    @Column(name = "psi_image_pos", nullable = false)
    private String psiimagepos;

    @Column(name = "psi_memo", nullable = false)
    private String psimemo;

    @Column(name = "psi_idatetime", nullable = false)
    private String psiidatetime;

    @Column(name = "psi_udatetime", nullable = false)
    private String psiudatetime;

    @Builder
    public Entity_PlaySangsangImages(Long psiseq, Long psipsseq, Long psimsiseq, String psiimagepos, String psimemo, String psiidatetime, String psiudatetime) {
        this.psiseq = psiseq;
        this.psipsseq = psipsseq;
        this.psimsiseq = psimsiseq;
        this.psiimagepos = psiimagepos;
        this.psimemo = psimemo;
        this.psiidatetime = psiidatetime;
        this.psiudatetime = psiudatetime;
    }
}