package Groovy_Project


class Activity_1a {
	public static main(def arg) {
			def list = [
			11,
			2,
			19,
			5,
			"Mango",
			"Apple",
			"Watermelon"
		]
				
		/*intlist = List.removeIf { it instanceof String }
		 println intlist.srt()
		 //stringlist = List.removeIf { it instanceof 1 }*/
		def intlist = list.minus(["Mango", "Apple", "Watermelon"])
		println intlist.sort()
		
		def stringlist = list.minus([11,2,19,5])
		println stringlist.sort()
				
	}
}
