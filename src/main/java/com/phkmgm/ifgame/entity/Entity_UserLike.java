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
@Table(name = "user_like")
public class Entity_UserLike {

    /*
    * ul_seq
    * ul_ms_seq
    * ul_ui_id
    * ul_idatetime
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ul_seq", nullable = false)
    private Long ulseq;

    @Column(name = "ul_ms_seq", nullable = false)
    private Long ulmsseq;

    @Column(name = "ul_ui_id", nullable = false)
    private String uluiid;

    @Column(name = "ul_idatetime", nullable = false)
    private String ulidatetime;

    @Builder
    public Entity_UserLike(Long ulseq, Long ulmsseq, String uluiid, String ulidatetime) {
        this.ulseq = ulseq;
        this.ulmsseq = ulmsseq;
        this.uluiid = uluiid;
        this.ulidatetime = ulidatetime;
    }
}