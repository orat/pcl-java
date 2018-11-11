package com.movlad.pcl;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.movlad.pcl.Normal;
import com.movlad.pcl.math.Comparison;
import com.movlad.pcl.nat.NativeLibraryLoader;

class NormalTest {
	
	private static final float EX_X = 3;
	private static final float EX_Y = 4;
	private static final float EX_Z = 5;

	static {	
		try {
			NativeLibraryLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void test() {
		Normal normal = new Normal();
		
		normal.create();
		
		normal.setComponents(EX_X, EX_Y, EX_Z);
		
		assertTrue(Comparison.areEqualFloat(normal.getX(), EX_X, 0.5f));
		assertTrue(Comparison.areEqualFloat(normal.getY(), EX_Y, 0.5f));
		assertTrue(Comparison.areEqualFloat(normal.getZ(), EX_Z, 0.5f));
	}

}
