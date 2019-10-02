package com.adneom.service;

import java.util.ArrayList;

public class ListPartition {
 
	public ArrayList<ArrayList<Integer>> partition (ArrayList<Integer> entree, Integer taille){
 
		ArrayList<ArrayList<Integer>> sortie = new ArrayList<ArrayList<Integer>>();
		int i=0;
		
		while (i < entree.size())
		{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < taille; j++) 
			{
				if((j+i) < entree.size())
					list.add(entree.get(i+j));
			}
			sortie.add(list);
			i+=taille;
		}
 
		return sortie;
	}
 
}
