package p030D4;

import java.util.Map;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.e */
/* JADX INFO: loaded from: classes.dex */
public class C0201e extends AbstractC0207k {

    /* JADX INFO: renamed from: c */
    private Map f899c;

    public C0201e(Map map, InterfaceC0210n interfaceC0210n) {
        super(interfaceC0210n);
        this.f899c = map;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: L */
    public String mo982L(InterfaceC0210n.b bVar) {
        return m1075p(bVar) + "deferredValue:" + this.f899c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0201e)) {
            return false;
        }
        C0201e c0201e = (C0201e) obj;
        return this.f899c.equals(c0201e.f899c) && this.f907a.equals(c0201e.f907a);
    }

    @Override // p030D4.InterfaceC0210n
    public Object getValue() {
        return this.f899c;
    }

    public int hashCode() {
        return this.f899c.hashCode() + this.f907a.hashCode();
    }

    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: n */
    protected AbstractC0207k.b mo984n() {
        return AbstractC0207k.b.DeferredValue;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p030D4.AbstractC0207k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo983j(C0201e c0201e) {
        return 0;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public C0201e mo981G(InterfaceC0210n interfaceC0210n) {
        AbstractC7551l.m33233f(AbstractC0214r.m1092b(interfaceC0210n));
        return new C0201e(this.f899c, interfaceC0210n);
    }
}
