package org.samuelsmal.tree.BinaryFunctions;

import org.samuelsmal.tree.INode;

/**
 * Functional Node
 * Created by samuel on 27/07/14.
 */
public class AddOperationNode extends BinaryOperationNode {
    public AddOperationNode() {
        operationSign = "+";
    }

    @Override
    public INode getCopy() {
        return new AddOperationNode();
    }

    @Override
    protected long doOperation(long leftValue, long rightValue) {
        return leftValue + rightValue;
    }
}
