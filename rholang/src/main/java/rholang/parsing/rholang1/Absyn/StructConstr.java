package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class StructConstr extends Struct {
  public final String var_;
  public final ListExpr listexpr_;
  public StructConstr(String p1, ListExpr p2) { var_ = p1; listexpr_ = p2; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Struct.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.StructConstr) {
      rholang.parsing.rholang1.Absyn.StructConstr x = (rholang.parsing.rholang1.Absyn.StructConstr)o;
      return this.var_.equals(x.var_) && this.listexpr_.equals(x.listexpr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.var_.hashCode())+this.listexpr_.hashCode();
  }


}