package fr.unilim.iut.gildedRose;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class InnTest {

	
	Inn inn = new Inn();
	
	@Test
	public void should_Return_List() {
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
	
	
	@Test
	public void should_Update_Quality() {
		inn.updateQuality();
		assertThat(inn.getItems()).extracting("name").containsExactly("+5 Dexterity Vest",
				"Aged Brie",
				"Elixir of the Mongoose",
				"Sulfuras, Hand of Ragnaros", 
				"Backstage passes to a TAFKAL80ETC concert" ,
				"Conjured Mana Cake" 
				);
		
		assertThat(inn.getItems()).extracting("sellIn").containsExactly(9,1,4,0,14,2);
		assertThat(inn.getItems()).extracting("quality").containsExactly(19,1,6,80,21,5);
	}
	
	@Test
	public void should_Update_Quality_Twice() {
		inn.updateQuality();
		inn.updateQuality();
		assertThat(inn.getItems()).extracting("name").containsExactly("+5 Dexterity Vest",
				"Aged Brie",
				"Elixir of the Mongoose",
				"Sulfuras, Hand of Ragnaros", 
				"Backstage passes to a TAFKAL80ETC concert" ,
				"Conjured Mana Cake" 
				);
		
		assertThat(inn.getItems()).extracting("sellIn").containsExactly(8,0,3,0,13,1);
		assertThat(inn.getItems()).extracting("quality").containsExactly(18,2,5,80,22,4);
	}
	
	@Test
	public void should_Update_Quality_100() {
		for(int i = 0;i<100;i++) {
			inn.updateQuality();
		}
		
		assertThat(inn.getItems()).extracting("name").containsExactly("+5 Dexterity Vest",
				"Aged Brie",
				"Elixir of the Mongoose",
				"Sulfuras, Hand of Ragnaros", 
				"Backstage passes to a TAFKAL80ETC concert" ,
				"Conjured Mana Cake" 
				);
		
		assertThat(inn.getItems()).extracting("sellIn").containsExactly(-90,-98,-95,0,-85,-97);
		assertThat(inn.getItems()).extracting("quality").containsExactly(0,50,0,80,0,0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
