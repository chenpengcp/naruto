package com.cp.naruto.pojo;


import javax.persistence.*;
import java.util.List;

/**
 * @description: 卡牌
 * @author: chenpeng
 */
@Entity(name = "t_card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//卡牌id
    @Column
    private String name;//卡牌名称
    @Column
    private String title;//称号
    @Column
    private String level;//等级
    @Column
    private Integer cost;//费用
    @Column
    private Integer magic;//魔量
    @Column
    private Integer life;//生命值
    @Column
    private Integer armor;//护甲
    @Column
    private Integer speed;//速度
    @Column
    private Integer attack_b;//攻击下限
    @Column
    private Integer attack_t;//攻击上限
    @Column
    private Integer miss;//闪避
    @Column
    private Integer defiance;//魔法抗性
    @Column
    private String nature;//属性
    @Column
    private String describ;//描述
    @Column
    private Integer price;//价格
    @Column
    private String img;//图片
    @ManyToMany
    @JoinTable(name = "card_weapon", joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "weapon_id"))
    private List<Weapon> weapons;//拥有武器
    @ManyToMany
    @JoinTable(name = "card_skill", joinColumns = @JoinColumn(name = "card_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id"))
    private List<Skill> skills;//技能数
    @Column
    private Integer relation;//羁绊
    @Column
    private Integer status;//状态
    @ManyToMany(mappedBy = "cards")
    private List<User> userList;
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "shop_id")
    private Shop shop;
    @ManyToMany(mappedBy = "cards")
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(Integer magic) {
        this.magic = magic;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getAttack_b() {
        return attack_b;
    }

    public void setAttack_b(Integer attack_b) {
        this.attack_b = attack_b;
    }

    public Integer getAttack_t() {
        return attack_t;
    }

    public void setAttack_t(Integer attack_t) {
        this.attack_t = attack_t;
    }

    public Integer getMiss() {
        return miss;
    }

    public void setMiss(Integer miss) {
        this.miss = miss;
    }

    public Integer getDefiance() {
        return defiance;
    }

    public void setDefiance(Integer defiance) {
        this.defiance = defiance;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
