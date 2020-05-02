package com.zdxc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Zdxc implements Serializable {
    private Long id;
    private String code;
    private String createTime;
    private String updateTime;
    private String status;
}
