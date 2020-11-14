package xkw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: xingjiacheng
 * @create: 2020-11-14 11:58
 **/

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String sex;
    private Float height;
    private Float weight;
}
