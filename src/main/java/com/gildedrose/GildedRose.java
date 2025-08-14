package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            // Update the quality and sellIn values for each item
            switch (items[i].name) {
                case "Sulfuras, Hand of Ragnaros":
                    break;
                case "Aged Brie":
                    if (items[i].quality < 50) {
                        items[i].quality++;
                    }

                    items[i].sellIn--;

                    if (items[i].sellIn < 0 && items[i].quality < 50) {
                        items[i].quality++;
                    }

                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    if (items[i].quality < 50) {
                        items[i].quality++;

                        if (items[i].sellIn < 11) {
                                items[i].quality++;
                        }
                        if (items[i].sellIn < 6) {
                                items[i].quality++;
                        }
                    }

                    items[i].sellIn--;

                    if (items[i].sellIn < 0) {
                        items[i].quality--;
                    }

                    break;
                default:
                    // All other items
                    if (items[i].quality > 0) {
                        items[i].quality--;
                    }

                    items[i].sellIn--;

            }
        }
    }
}