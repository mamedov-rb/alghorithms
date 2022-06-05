package graph;

import enums.NodeEnum;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DepthFirstTraversal {

    public static Set<NodeEnum> process(Map<NodeEnum, Set<NodeEnum>> graphMap, NodeEnum head) {
        if (graphMap.isEmpty() || head == null) return Set.of();

        Stack<NodeEnum> stack = new Stack<>();
        Set<NodeEnum> traversedSet = new LinkedHashSet<>();

        stack.push(head);

        while (!stack.isEmpty()) {
            NodeEnum current = stack.pop();
            traversedSet.add(current);

            for (NodeEnum neighbor : graphMap.get(current)) {
                stack.push(neighbor);
            }
        }
        return traversedSet;
    }
}
