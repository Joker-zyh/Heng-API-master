package com.heng.hengapicommon.common;

import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * @author yupi
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}