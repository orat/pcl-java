package de.i3mainz.pcl.io;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.jupiter.api.Test;

import de.i3mainz.pcl.ExampleGenerator;
import de.i3mainz.pcl.PointCloud3D;

class Cloud3DWriterTest {

	static {	
		System.loadLibrary("PCL_JAVA");
	}

	@Test
	void testWritePCD() {
		ExampleGenerator generator = new ExampleGenerator();
		PointCloud3D pointCloud = generator.generatePointCloud3D();
		Cloud3DWriter exporter = new Cloud3DWriter(pointCloud);
		
		exporter.write("cloud-export-test.pcd");
		
		File file = new File("cloud-export-test.pcd");
		
		assertTrue(file.exists());
		
		file.delete();
	}
	
	@Test
	void testWritePLY() {
		ExampleGenerator generator = new ExampleGenerator();
		PointCloud3D pointCloud = generator.generatePointCloud3D();
		Cloud3DWriter exporter = new Cloud3DWriter(pointCloud);
		
		exporter.write("cloud-export-test.ply");
		
		File file = new File("cloud-export-test.ply");
		
		assertTrue(file.exists());
		
		file.delete();
	}

}