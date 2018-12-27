package com.cp.naruto.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * @description:
 * @author: chenpeng
 */
@Entity(name = "t_weapon")
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String describ;//描述
    @Column
    private String img;//图片
    @ManyToMany(mappedBy = "weapons")
    private List<User> userList;
    @ManyToMany(mappedBy = "weapons")
    private List<Card> cardList;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "shop_id")
    private Shop shop;
    @ManyToMany(mappedBy = "weapons")
    private List<Store> store;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Store> getStore() {
        return store;
    }

    public void setStore(List<Store> store) {
        this.store = store;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
