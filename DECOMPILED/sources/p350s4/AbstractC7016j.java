package p350s4;

import java.util.Comparator;

/* JADX INFO: renamed from: s4.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7016j implements InterfaceC7014h {

    /* JADX INFO: renamed from: a */
    private final Object f28032a;

    /* JADX INFO: renamed from: b */
    private final Object f28033b;

    /* JADX INFO: renamed from: c */
    private InterfaceC7014h f28034c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC7014h f28035d;

    AbstractC7016j(Object obj, Object obj2, InterfaceC7014h interfaceC7014h, InterfaceC7014h interfaceC7014h2) {
        this.f28032a = obj;
        this.f28033b = obj2;
        this.f28034c = interfaceC7014h == null ? C7013g.m30628j() : interfaceC7014h;
        this.f28035d = interfaceC7014h2 == null ? C7013g.m30628j() : interfaceC7014h2;
    }

    /* JADX INFO: renamed from: j */
    private AbstractC7016j m30637j() {
        InterfaceC7014h interfaceC7014h = this.f28034c;
        InterfaceC7014h interfaceC7014hMo30631c = interfaceC7014h.mo30631c(null, null, m30641q(interfaceC7014h), null, null);
        InterfaceC7014h interfaceC7014h2 = this.f28035d;
        return mo30631c(null, null, m30641q(this), interfaceC7014hMo30631c, interfaceC7014h2.mo30631c(null, null, m30641q(interfaceC7014h2), null, null));
    }

    /* JADX INFO: renamed from: m */
    private AbstractC7016j m30638m() {
        AbstractC7016j abstractC7016jM30643s = (!this.f28035d.mo30624f() || this.f28034c.mo30624f()) ? this : m30643s();
        if (abstractC7016jM30643s.f28034c.mo30624f() && ((AbstractC7016j) abstractC7016jM30643s.f28034c).f28034c.mo30624f()) {
            abstractC7016jM30643s = abstractC7016jM30643s.m30644t();
        }
        return (abstractC7016jM30643s.f28034c.mo30624f() && abstractC7016jM30643s.f28035d.mo30624f()) ? abstractC7016jM30643s.m30637j() : abstractC7016jM30643s;
    }

    /* JADX INFO: renamed from: o */
    private AbstractC7016j m30639o() {
        AbstractC7016j abstractC7016jM30637j = m30637j();
        return abstractC7016jM30637j.mo30634g().mo30629a().mo30624f() ? abstractC7016jM30637j.mo30625l(null, null, null, ((AbstractC7016j) abstractC7016jM30637j.mo30634g()).m30644t()).m30643s().m30637j() : abstractC7016jM30637j;
    }

    /* JADX INFO: renamed from: p */
    private AbstractC7016j m30640p() {
        AbstractC7016j abstractC7016jM30637j = m30637j();
        return abstractC7016jM30637j.mo30629a().mo30629a().mo30624f() ? abstractC7016jM30637j.m30644t().m30637j() : abstractC7016jM30637j;
    }

    /* JADX INFO: renamed from: q */
    private static InterfaceC7014h.a m30641q(InterfaceC7014h interfaceC7014h) {
        return interfaceC7014h.mo30624f() ? InterfaceC7014h.a.BLACK : InterfaceC7014h.a.RED;
    }

    /* JADX INFO: renamed from: r */
    private InterfaceC7014h m30642r() {
        if (this.f28034c.isEmpty()) {
            return C7013g.m30628j();
        }
        AbstractC7016j abstractC7016jM30639o = (mo30629a().mo30624f() || mo30629a().mo30629a().mo30624f()) ? this : m30639o();
        return abstractC7016jM30639o.mo30625l(null, null, ((AbstractC7016j) abstractC7016jM30639o.f28034c).m30642r(), null).m30638m();
    }

    /* JADX INFO: renamed from: s */
    private AbstractC7016j m30643s() {
        return (AbstractC7016j) this.f28035d.mo30631c(null, null, mo30626n(), mo30631c(null, null, InterfaceC7014h.a.RED, null, ((AbstractC7016j) this.f28035d).f28034c), null);
    }

    /* JADX INFO: renamed from: t */
    private AbstractC7016j m30644t() {
        return (AbstractC7016j) this.f28034c.mo30631c(null, null, mo30626n(), null, mo30631c(null, null, InterfaceC7014h.a.RED, ((AbstractC7016j) this.f28034c).f28035d, null));
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: a */
    public InterfaceC7014h mo30629a() {
        return this.f28034c;
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: b */
    public InterfaceC7014h mo30630b(Object obj, Object obj2, Comparator comparator) {
        AbstractC7016j abstractC7016jMo30625l;
        int iCompare = comparator.compare(obj, this.f28032a);
        if (iCompare < 0) {
            abstractC7016jMo30625l = mo30625l(null, null, this.f28034c.mo30630b(obj, obj2, comparator), null);
        } else {
            abstractC7016jMo30625l = iCompare == 0 ? mo30625l(obj, obj2, null, null) : mo30625l(null, null, null, this.f28035d.mo30630b(obj, obj2, comparator));
        }
        return abstractC7016jMo30625l.m30638m();
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: d */
    public InterfaceC7014h mo30632d(Object obj, Comparator comparator) {
        AbstractC7016j abstractC7016jMo30625l;
        if (comparator.compare(obj, this.f28032a) < 0) {
            AbstractC7016j abstractC7016jM30639o = (this.f28034c.isEmpty() || this.f28034c.mo30624f() || ((AbstractC7016j) this.f28034c).f28034c.mo30624f()) ? this : m30639o();
            abstractC7016jMo30625l = abstractC7016jM30639o.mo30625l(null, null, abstractC7016jM30639o.f28034c.mo30632d(obj, comparator), null);
        } else {
            AbstractC7016j abstractC7016jM30644t = this.f28034c.mo30624f() ? m30644t() : this;
            if (!abstractC7016jM30644t.f28035d.isEmpty() && !abstractC7016jM30644t.f28035d.mo30624f() && !((AbstractC7016j) abstractC7016jM30644t.f28035d).f28034c.mo30624f()) {
                abstractC7016jM30644t = abstractC7016jM30644t.m30640p();
            }
            if (comparator.compare(obj, abstractC7016jM30644t.f28032a) == 0) {
                if (abstractC7016jM30644t.f28035d.isEmpty()) {
                    return C7013g.m30628j();
                }
                InterfaceC7014h interfaceC7014hMo30635h = abstractC7016jM30644t.f28035d.mo30635h();
                abstractC7016jM30644t = abstractC7016jM30644t.mo30625l(interfaceC7014hMo30635h.getKey(), interfaceC7014hMo30635h.getValue(), null, ((AbstractC7016j) abstractC7016jM30644t.f28035d).m30642r());
            }
            abstractC7016jMo30625l = abstractC7016jM30644t.mo30625l(null, null, null, abstractC7016jM30644t.f28035d.mo30632d(obj, comparator));
        }
        return abstractC7016jMo30625l.m30638m();
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: e */
    public void mo30633e(InterfaceC7014h.b bVar) {
        this.f28034c.mo30633e(bVar);
        bVar.mo1017a(this.f28032a, this.f28033b);
        this.f28035d.mo30633e(bVar);
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: g */
    public InterfaceC7014h mo30634g() {
        return this.f28035d;
    }

    @Override // p350s4.InterfaceC7014h
    public Object getKey() {
        return this.f28032a;
    }

    @Override // p350s4.InterfaceC7014h
    public Object getValue() {
        return this.f28033b;
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: h */
    public InterfaceC7014h mo30635h() {
        return this.f28034c.isEmpty() ? this : this.f28034c.mo30635h();
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: i */
    public InterfaceC7014h mo30636i() {
        return this.f28035d.isEmpty() ? this : this.f28035d.mo30636i();
    }

    @Override // p350s4.InterfaceC7014h
    public boolean isEmpty() {
        return false;
    }

    @Override // p350s4.InterfaceC7014h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC7016j mo30631c(Object obj, Object obj2, InterfaceC7014h.a aVar, InterfaceC7014h interfaceC7014h, InterfaceC7014h interfaceC7014h2) {
        if (obj == null) {
            obj = this.f28032a;
        }
        if (obj2 == null) {
            obj2 = this.f28033b;
        }
        if (interfaceC7014h == null) {
            interfaceC7014h = this.f28034c;
        }
        if (interfaceC7014h2 == null) {
            interfaceC7014h2 = this.f28035d;
        }
        return aVar == InterfaceC7014h.a.RED ? new C7015i(obj, obj2, interfaceC7014h, interfaceC7014h2) : new C7012f(obj, obj2, interfaceC7014h, interfaceC7014h2);
    }

    /* JADX INFO: renamed from: l */
    protected abstract AbstractC7016j mo30625l(Object obj, Object obj2, InterfaceC7014h interfaceC7014h, InterfaceC7014h interfaceC7014h2);

    /* JADX INFO: renamed from: n */
    protected abstract InterfaceC7014h.a mo30626n();

    /* JADX INFO: renamed from: u */
    void mo30627u(InterfaceC7014h interfaceC7014h) {
        this.f28034c = interfaceC7014h;
    }
}
