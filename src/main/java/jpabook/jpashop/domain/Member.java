package jpabook.jpashop.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {


    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Embedded // 둘 중에 하나만 있어도 됨
    private Address address;

    @OneToMany(mappedBy = "member",
            fetch = FetchType.LAZY) //읽기전용
    private List<Order> orders = new ArrayList<>();
}
