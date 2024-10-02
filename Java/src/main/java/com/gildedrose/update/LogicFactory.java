package com.gildedrose.update;

import com.gildedrose.Item;

public class LogicFactory {
    public static Logic getLogic(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrie();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePass();
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras();
            case "Conjured Mana Cake":
                return new Conjured();
            default:
                return new NormalItem();
        }
    }
}