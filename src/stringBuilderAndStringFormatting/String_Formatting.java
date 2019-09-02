package stringBuilderAndStringFormatting;

 class String_Formatting {
	
	private int id;
	private String name;
	
	public String_Formatting(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		// Le StringFormatting consiste à retourner un string de cette facon
		return String.format("%id : %s", id, name);
		
		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append(id).append(":").append(name);
		 * 
		 * return sb.toString();
		 */
		
	}
	
}

