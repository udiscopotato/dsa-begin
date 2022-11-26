package tree;

import java.util.ArrayList;

class TreeNode {
	String data;
	ArrayList<TreeNode> tree;
	
	TreeNode(String value) {
		data=value;
		tree= new ArrayList<TreeNode>();
	}
	
	void addChild(TreeNode tn) {
		tree.add(tn);
	}
	
	String printTree(int level) {
		String ret="";
		ret="  ".repeat(level)+data+"/n";
		for( TreeNode t:tree) {
			ret+=t.printTree(level+1);
		}
		return ret;
	}
}
