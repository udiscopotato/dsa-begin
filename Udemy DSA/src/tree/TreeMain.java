package tree;

class TreeMain {

	public static void main(String[] args) {
		TreeNode drinks = new TreeNode("Drinks");
		TreeNode hot = new TreeNode("Hot Drinks");
		TreeNode cold = new TreeNode("Cold Drinks");
		TreeNode tea = new TreeNode("Tea");
		TreeNode coffe = new TreeNode("Coffee");
		TreeNode chai = new TreeNode("Indian Chai");
		TreeNode green = new TreeNode("Green Tea");
		TreeNode black = new TreeNode("Black Tea");
		TreeNode normal = new TreeNode("Normal Coffee");
		TreeNode americano = new TreeNode("Americano");
		TreeNode capu = new TreeNode("Capuchino");
		TreeNode soft = new TreeNode("Soft Drinks");
		TreeNode hard = new TreeNode("Hard Drinks");
		drinks.addChild(hot);
		drinks.addChild(cold);
		hot.addChild(tea);
		tea.addChild(chai);
		tea.addChild(green);
		tea.addChild(black);
		coffe.addChild(normal);
		coffe.addChild(americano);
		coffe.addChild(capu);
		hot.addChild(coffe);
		cold.addChild(soft);
		soft.addChild(new TreeNode("Fanta"));
		soft.addChild(new TreeNode("Others"));
		cold.addChild(hard);
		hard.addChild(new TreeNode("Wine"));
		hard.addChild(new TreeNode("Beer"));
		hard.addChild(new TreeNode("Whisky"));
		hard.addChild(new TreeNode("Rum"));
		hard.addChild(new TreeNode("Others"));
		drinks.printTree(0);
	}

}
