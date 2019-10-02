package com.adneom.service.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.adneom.service.ListPartition;

public class ListPartitionTest {
	
	private ListPartition listPartition = new ListPartition();
	private ArrayList<Integer> liste = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> resultat = new ArrayList<ArrayList<Integer>>();
	
	@Before 
	public void init() {
		liste.add(1);
		liste.add(2);
		liste.add(3);
		liste.add(4);
		liste.add(5);
	}
	
	@Test
	public void listePartitionTest(){
		resultat.add(new ArrayList<Integer>(Arrays.asList((Integer)1,(Integer)2)));
		resultat.add(new ArrayList<Integer>(Arrays.asList((Integer)3,(Integer)4)));
		resultat.add(new ArrayList<Integer>(Arrays.asList((Integer)5)));
		assertEquals(resultat, listPartition.partition(liste, 2));
	}
	
	@After
    public void finalize() {
		resultat.clear();
		liste.clear();
	}
	
}
