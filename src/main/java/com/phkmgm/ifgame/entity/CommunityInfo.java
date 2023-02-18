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
@Table(name = "community_info")
public class CommunityInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ci_seq", nullable = false)
    private Long ciseq;

    @Column(name = "ci_name", nullable = false)
    private String ciname;

    @Column(name = "ci_idatetime", nullable = false)
    private String ciidatetime;

    @Column(name = "ci_udatetime", nullable = false)
    private String ciudatetime;

    @Builder
    public CommunityInfo(Long ciseq, String ciname, String ciidatetime, String ciudatetime) {
        this.ciseq = ciseq;
        this.ciname = ciname;
        this.ciidatetime = ciidatetime;
        this.ciudatetime = ciudatetime;
    }
}