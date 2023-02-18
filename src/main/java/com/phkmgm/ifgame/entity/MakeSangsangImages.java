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
@Table(name = "make_sangsang_images")
public class MakeSangsangImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "msi_seq", nullable = false)
    private Long msiseq;

    @Column(name = "msi_us_seq", nullable = false)
    private int msiusseq;

    @Column(name = "msi_img", nullable = false)
    private String msiimg;

    @Column(name = "msi_memo", nullable = false)
    private String msimemo;

    @Column(name = "msi_idatetime", nullable = false)
    private String msiidatetime;

    @Builder
    public MakeSangsangImages(Long msiseq, int msiusseq, String msiimg, String msimemo, String msiidatetime) {
        this.msiseq = msiseq;
        this.msiusseq = msiusseq;
        this.msiimg = msiimg;
        this.msimemo = msimemo;
        this.msiidatetime = msiidatetime;
    }
}