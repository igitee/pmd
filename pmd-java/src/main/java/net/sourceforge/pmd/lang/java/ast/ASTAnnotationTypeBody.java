/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTAnnotationTypeBody.java */

package net.sourceforge.pmd.lang.java.ast;

public class ASTAnnotationTypeBody extends AbstractJavaNode {
    public ASTAnnotationTypeBody(int id) {
        super(id);
    }

    public ASTAnnotationTypeBody(JavaParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
