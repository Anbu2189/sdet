package Groovy_Project


class Activity_1b {
	public static main(def arg) {
				
		File file = new File("filepath");
		file.createNewFile();
	
		file.write("A quick brown Fox jumped over the lazy Cow\n")
		file.append("John Jimbo jingeled happily ever after\n")
		file.append("Th1\$ 1\$ v3ry c0nfus1ng")
		
		file.eachLine { 
			if(it =~ /Cow$/)
			{
				println it
			}
			if(it =~ /^J/)
			{
				println it
			}
			if(it =~ /\d{2}/) {
				println it
			}
			
		}
		def ermatch = file.text =~ /\S+er/
		println ermatch.findAll()
		
		def numwordmatch = file.text =~ /\S*\d\W/
		println numwordmatch.findAll()
				
	}
}
