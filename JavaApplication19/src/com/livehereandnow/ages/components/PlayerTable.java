/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.ages.components;

import static com.livehereandnow.ages.components.CardType.內政;
import static com.livehereandnow.ages.components.CardType.棕色;
import static com.livehereandnow.ages.components.CardType.灰色;
import static com.livehereandnow.ages.components.CardType.科技;
import static com.livehereandnow.ages.components.CardType.紅色;

/**
 *
 * @author mark
 */
public class PlayerTable extends Object {

    private Card[] cards政府;
    private Card[] cards實驗室;
    private Card[] cards神廟;
    private Card[] cards農場;
    private Card[] cards礦山;
    private Card[] cards步兵;
    private Card[][] cards;

    public Card getCard(int type, int age) {
        return cards[type][age];
    }

    /**
     *
     * @param card Card的物件
     * @param type
     * <br>1=>實驗室
     * <br>2=>神廟
     * <br>3=>農場
     * <br>4=>礦山
     * <br>5=>步兵
     *
     * @param age
     * <br>0=>A
     * <br>1=>I
     * <br>2=>II
     * <br>3=>III
     */
    public void setCard(Card card, int type, int age) {
        this.cards[type][age] = card;
    }

    /**
     *
     * @param type
     * <br>1=>實驗室
     * <br>2=>神廟
     * <br>3=>農場
     * <br>4=>礦山
     * <br>5=>步兵
     *
     * @param age
     * <br>0=>A
     * <br>1=>I
     * <br>2=>II
     * <br>3=>III
     *
     *
     * @param point
     */
    public void add黃點(int type, int age, int point) {
        cards[type][age].getYellowPoints().addPoints(point);
    }
//      public void upgrade黃點(int type, int ageFrom, int ageTo){筆記

    public void upgrade黃點(int type, int ageFrom, int ageTo) {
        add黃點(type, ageFrom,-1);
        add黃點(type, ageTo,1);
    }

    public PlayerTable() {
        cards = new Card[6][];

        cards政府 = new Card[4];
        cards實驗室 = new Card[4];
        cards神廟 = new Card[4];
        cards農場 = new Card[4];
        cards礦山 = new Card[4];
        cards步兵 = new Card[4];
        cards[0] = cards政府;
        cards[1] = cards實驗室;
        cards[2] = cards神廟;
        cards[3] = cards農場;
        cards[4] = cards礦山;
        cards[5] = cards步兵;

        cards實驗室[0] = new Card(13, "哲學", 0, 內政, 科技, 灰色, "實驗室", "科技生產+1", "3");
        cards神廟[0] = new Card(11, "宗教", 0, 內政, 科技, 灰色, "神廟", "笑臉+1，文化生產+1", "3");
        cards農場[0] = new Card(12, "農業", 0, 內政, 科技, 棕色, "農場", "食物生產+1", "2");
        cards礦山[0] = new Card(15, "青銅", 0, 內政, 科技, 棕色, "礦山", "資源生產+1", "2");
        cards步兵[0] = new Card(14, "戰士", 0, 內政, 科技, 紅色, "步兵", "軍力+1", "2");

    }

    public void showAgesX5() {
        showAgesX5("  實驗室", cards實驗室);
        showAgesX5("  神廟", cards神廟);
        showAgesX5("  農場", cards農場);
        showAgesX5("  礦山", cards礦山);
        showAgesX5("  步兵", cards步兵);

    }

    public void showAgesX5(String title, Card[] ages) {
        System.out.print("  " + title);
        for (int k = 0; k < 4; k++) {
            try {
                System.out.print(" " + ages[k].toString(6));
            } catch (Exception e) {
            }
        }
        System.out.println("  ");

    }

    public void show(String title) {
        System.out.println(title);
        showAgesX5();
    }

    public void show() {
        showAgesX5();
    }
}
