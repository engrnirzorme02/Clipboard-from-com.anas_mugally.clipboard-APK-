package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2276a implements InterfaceC2285j {

    /* JADX INFO: renamed from: a */
    protected Context f7606a;

    /* JADX INFO: renamed from: b */
    protected Context f7607b;

    /* JADX INFO: renamed from: c */
    protected C2280e f7608c;

    /* JADX INFO: renamed from: d */
    protected LayoutInflater f7609d;

    /* JADX INFO: renamed from: e */
    protected LayoutInflater f7610e;

    /* JADX INFO: renamed from: f */
    private InterfaceC2285j.a f7611f;

    /* JADX INFO: renamed from: r */
    private int f7612r;

    /* JADX INFO: renamed from: s */
    private int f7613s;

    /* JADX INFO: renamed from: t */
    protected InterfaceC2286k f7614t;

    /* JADX INFO: renamed from: u */
    private int f7615u;

    public AbstractC2276a(Context context, int i7, int i8) {
        this.f7606a = context;
        this.f7609d = LayoutInflater.from(context);
        this.f7612r = i7;
        this.f7613s = i8;
    }

    /* JADX INFO: renamed from: a */
    protected void m9430a(View view, int i7) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f7614t).addView(view, i7);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo9431b(C2282g c2282g, InterfaceC2286k.a aVar);

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: c */
    public void mo9432c(C2280e c2280e, boolean z7) {
        InterfaceC2285j.a aVar = this.f7611f;
        if (aVar != null) {
            aVar.mo9249c(c2280e, z7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: d */
    public void mo9433d(boolean z7) {
        ViewGroup viewGroup = (ViewGroup) this.f7614t;
        if (viewGroup == null) {
            return;
        }
        C2280e c2280e = this.f7608c;
        int i7 = 0;
        if (c2280e != null) {
            c2280e.m9535t();
            ArrayList arrayListM9496G = this.f7608c.m9496G();
            int size = arrayListM9496G.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                C2282g c2282g = (C2282g) arrayListM9496G.get(i9);
                if (mo9445s(i8, c2282g)) {
                    View childAt = viewGroup.getChildAt(i8);
                    C2282g itemData = childAt instanceof InterfaceC2286k.a ? ((InterfaceC2286k.a) childAt).getItemData() : null;
                    View viewMo9442p = mo9442p(c2282g, childAt, viewGroup);
                    if (c2282g != itemData) {
                        viewMo9442p.setPressed(false);
                        viewMo9442p.jumpDrawablesToCurrentState();
                    }
                    if (viewMo9442p != childAt) {
                        m9430a(viewMo9442p, i8);
                    }
                    i8++;
                }
            }
            i7 = i8;
        }
        while (i7 < viewGroup.getChildCount()) {
            if (!mo9440n(viewGroup, i7)) {
                i7++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: f */
    public boolean mo9434f(C2280e c2280e, C2282g c2282g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: g */
    public boolean mo9435g(C2280e c2280e, C2282g c2282g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    public int getId() {
        return this.f7615u;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: h */
    public void mo9436h(InterfaceC2285j.a aVar) {
        this.f7611f = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: i */
    public void mo9437i(Context context, C2280e c2280e) {
        this.f7607b = context;
        this.f7610e = LayoutInflater.from(context);
        this.f7608c = c2280e;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC2286k.a m9438k(ViewGroup viewGroup) {
        return (InterfaceC2286k.a) this.f7609d.inflate(this.f7613s, viewGroup, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.InterfaceC2285j
    /* JADX INFO: renamed from: l */
    public boolean mo9439l(SubMenuC2288m subMenuC2288m) {
        InterfaceC2285j.a aVar = this.f7611f;
        C2280e c2280e = subMenuC2288m;
        if (aVar == null) {
            return false;
        }
        if (subMenuC2288m == null) {
            c2280e = this.f7608c;
        }
        return aVar.mo9250d(c2280e);
    }

    /* JADX INFO: renamed from: n */
    protected boolean mo9440n(ViewGroup viewGroup, int i7) {
        viewGroup.removeViewAt(i7);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC2285j.a m9441o() {
        return this.f7611f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public View mo9442p(C2282g c2282g, View view, ViewGroup viewGroup) {
        InterfaceC2286k.a aVarM9438k = view instanceof InterfaceC2286k.a ? (InterfaceC2286k.a) view : m9438k(viewGroup);
        mo9431b(c2282g, aVarM9438k);
        return (View) aVarM9438k;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC2286k mo9443q(ViewGroup viewGroup) {
        if (this.f7614t == null) {
            InterfaceC2286k interfaceC2286k = (InterfaceC2286k) this.f7609d.inflate(this.f7612r, viewGroup, false);
            this.f7614t = interfaceC2286k;
            interfaceC2286k.mo9423b(this.f7608c);
            mo9433d(true);
        }
        return this.f7614t;
    }

    /* JADX INFO: renamed from: r */
    public void m9444r(int i7) {
        this.f7615u = i7;
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo9445s(int i7, C2282g c2282g);
}
