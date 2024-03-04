package com.luntek.address.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * 类或方法的功能描述 :mongodb 实体类
 *
 * @author: yangz
 * @date: 2024-02-26 12:06
 */
@Data
public class MongoShopAddress implements Serializable {
    @Id
    private String id;

    private Integer orderId;

    private String email;

    private String firstName;

    private String lastName;

    private String postcode;

    private String fax;

    private String telephone;

    private Integer countryId;

    private Integer regionId;

    private String city;

    private String address1;

    private String address2;

    private Date createDate;

    private Integer createBy;

    private Date updateDate;

    private Integer updateBy;
} 

