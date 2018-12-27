package com.cp.naruto.pojo;

import javax.persistence.*;
import java.util.List;

/**
 * @description:
 * @author: chenpeng
 */
@Entity(name = "t_shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany(mappedBy = "shop", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Card> cards;//拥有卡牌
    @OneToMany(mappedBy = "shop", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Weapon> weapons;//拥有武器

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
}
