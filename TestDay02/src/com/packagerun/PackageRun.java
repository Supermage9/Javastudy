package com.packagerun;

import com.packageexample.PackageExample; // import 구문을 통해 다른 패키지에서 클래스, 메소드 호출

public class PackageRun {

	public static void main(String[] args) {
		
		PackageExample pe = new PackageExample();
		
		pe.testPackage();
		
	}

}
