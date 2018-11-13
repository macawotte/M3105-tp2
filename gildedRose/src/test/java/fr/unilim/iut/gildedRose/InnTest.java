package fr.unilim.iut.gildedRose;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class InnTest {

	
	Inn inn = new Inn();
	
	@Test
	public void shouldReturnList() {
		assertThat(inn.getItems()).extracting("name").containsExactly("+5 Dexterity Vest",
				"Aged Brie",
				"Elixir of the Mongoose",
				"Sulfuras, Hand of Ragnaros", 
				"Backstage passes to a TAFKAL80ETC concert" ,
				"Conjured Mana Cake" 
				);
		
		assertThat(inn.getItems()).extracting("sellIn").containsExactly(10,2,5,0,15,3);
		assertThat(inn.getItems()).extracting("quality").containsExactly(20,0,7,80,20,6);
	}
	
	
	/*
	@Test
	public void getQualityNotAgedBrieOrBackstageAndQualitySupTo0() {
		Item Item = inn.getItems().get(0);
		inn.updateQuality();
		assertEquals(Item.getQuality(),19);
	}
	
	@Test
	public void getQualityNotAgedBrieOrBackstageAndQualityInfTo0() {
		Item Item = inn.getItems().get(3);
		inn.updateQuality();
		assertEquals(Item.getQuality(),80);
	}
	
	@Test
	public void getQualityAgedBrieQulatyInfTo50() {
		Item Item = inn.getItems().get(1);
		inn.updateQuality();
		assertEquals(Item.getQuality(),1);
	}
	
	@Test
	public void getQualityBackstageSellInninfTo11QulatyInfTo50() {
		Item Item = inn.getItems().get(4);
		Item.setSellIn(10);
		inn.updateQuality();
		assertEquals(Item.getQuality(),22);
	}
	
	@Test
	public void getQualityBackstageSellInninfTo6QulatyInfTo50() {
		Item Item = inn.getItems().get(4);
		Item.setSellIn(5);
		inn.updateQuality();
		assertEquals(Item.getQuality(),23);
	}
	
	@Test
	public void getQualityBackstageSellInnSupTo11QulatyInfTo50() {
		Item Item = inn.getItems().get(4);
		inn.updateQuality();
		assertEquals(Item.getQuality(),21);
	}
	
	
	@Test
	public void getQualityBackstageSellInninfTo11QulatySupTo50() {
		Item Item = inn.getItems().get(4);
		Item.setSellIn(10);
		Item.setQuality(60);
		inn.updateQuality();
		assertEquals(Item.getQuality(),60);
	}
	
	@Test
	public void getQualityBackstageSellInninfTo6QulatySupTo50() {
		Item Item = inn.getItems().get(4);
		Item.setSellIn(5);
		Item.setQuality(60);
		inn.updateQuality();
		assertEquals(Item.getQuality(),60);
	}
	
	@Test
	public void getQualityBackstageSellInnSupTo11QulatySupTo50() {
		Item Item = inn.getItems().get(4);
		Item.setQuality(60);
		inn.updateQuality();
		assertEquals(Item.getQuality(),60);
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
}
