package sem3hw;

import java.util.List;

public class Research {
    public static void showResult(String name, Tree tree){
        List<Link> links = tree.getLinks();
        for (Link l:links) {
            if (l.getFirstPerson().getName().equals(name) &&
            l.getLink() == Relation.PARENT) {
                System.out.println(l.getSecondPerson());
            }
        }
    }

    public static void showResult(Tree tree) {
        List<Link> links = tree.getLinks();
        for (Link el:links) {
            if(el.getLink() == Relation.BROTHER){
                System.out.println(el.getSecondPerson());
            }
        }
    }
    public static void showTree(Tree tree){
        System.out.println(tree);
        }
    }
