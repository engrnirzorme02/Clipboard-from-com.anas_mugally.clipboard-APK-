package p398y4;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p030D4.C0198b;
import p350s4.AbstractC7009c;
import p350s4.C7018l;
import p374v4.C7245j;

/* JADX INFO: renamed from: y4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7543d implements Iterable {

    /* JADX INFO: renamed from: c */
    private static final AbstractC7009c f30181c;

    /* JADX INFO: renamed from: d */
    private static final C7543d f30182d;

    /* JADX INFO: renamed from: a */
    private final Object f30183a;

    /* JADX INFO: renamed from: b */
    private final AbstractC7009c f30184b;

    /* JADX INFO: renamed from: y4.d$a */
    class a implements c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f30185a;

        a(ArrayList arrayList) {
            this.f30185a = arrayList;
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo30316a(C7245j c7245j, Object obj, Void r7) {
            this.f30185a.add(obj);
            return null;
        }
    }

    /* JADX INFO: renamed from: y4.d$b */
    class b implements c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f30187a;

        b(List list) {
            this.f30187a = list;
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void mo30316a(C7245j c7245j, Object obj, Void r7) {
            this.f30187a.add(new AbstractMap.SimpleImmutableEntry(c7245j, obj));
            return null;
        }
    }

    /* JADX INFO: renamed from: y4.d$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Object mo30316a(C7245j c7245j, Object obj, Object obj2);
    }

    static {
        AbstractC7009c abstractC7009cM30612c = AbstractC7009c.a.m30612c(C7018l.m30656b(C0198b.class));
        f30181c = abstractC7009cM30612c;
        f30182d = new C7543d(null, abstractC7009cM30612c);
    }

    public C7543d(Object obj, AbstractC7009c abstractC7009c) {
        this.f30183a = obj;
        this.f30184b = abstractC7009c;
    }

    /* JADX INFO: renamed from: b */
    public static C7543d m33187b() {
        return f30182d;
    }

    /* JADX INFO: renamed from: k */
    private Object m33188k(C7245j c7245j, c cVar, Object obj) {
        for (Map.Entry entry : this.f30184b) {
            obj = ((C7543d) entry.getValue()).m33188k(c7245j.m31999p((C0198b) entry.getKey()), cVar, obj);
        }
        Object obj2 = this.f30183a;
        return obj2 != null ? cVar.mo30316a(c7245j, obj2, obj) : obj;
    }

    /* JADX INFO: renamed from: A */
    public C7543d m33189A(C7245j c7245j, C7543d c7543d) {
        if (c7245j.isEmpty()) {
            return c7543d;
        }
        C0198b c0198bM32004z = c7245j.m32004z();
        C7543d c7543dM33187b = (C7543d) this.f30184b.mo30599b(c0198bM32004z);
        if (c7543dM33187b == null) {
            c7543dM33187b = m33187b();
        }
        C7543d c7543dM33189A = c7543dM33187b.m33189A(c7245j.m31996C(), c7543d);
        return new C7543d(this.f30183a, c7543dM33189A.isEmpty() ? this.f30184b.mo30607q(c0198bM32004z) : this.f30184b.mo30605n(c0198bM32004z, c7543dM33189A));
    }

    /* JADX INFO: renamed from: B */
    public C7543d m33190B(C7245j c7245j) {
        if (c7245j.isEmpty()) {
            return this;
        }
        C7543d c7543d = (C7543d) this.f30184b.mo30599b(c7245j.m32004z());
        return c7543d != null ? c7543d.m33190B(c7245j.m31996C()) : m33187b();
    }

    /* JADX INFO: renamed from: C */
    public Collection m33191C() {
        ArrayList arrayList = new ArrayList();
        m33196m(new a(arrayList));
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public boolean m33192a(InterfaceC7548i interfaceC7548i) {
        Object obj = this.f30183a;
        if (obj != null && interfaceC7548i.mo31917a(obj)) {
            return true;
        }
        Iterator it = this.f30184b.iterator();
        while (it.hasNext()) {
            if (((C7543d) ((Map.Entry) it.next()).getValue()).m33192a(interfaceC7548i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public C7245j m33193e(C7245j c7245j, InterfaceC7548i interfaceC7548i) {
        C7245j c7245jM33193e;
        Object obj = this.f30183a;
        if (obj != null && interfaceC7548i.mo31917a(obj)) {
            return C7245j.m31994y();
        }
        if (c7245j.isEmpty()) {
            return null;
        }
        C0198b c0198bM32004z = c7245j.m32004z();
        C7543d c7543d = (C7543d) this.f30184b.mo30599b(c0198bM32004z);
        if (c7543d == null || (c7245jM33193e = c7543d.m33193e(c7245j.m31996C(), interfaceC7548i)) == null) {
            return null;
        }
        return new C7245j(c0198bM32004z).m32000q(c7245jM33193e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7543d.class != obj.getClass()) {
            return false;
        }
        C7543d c7543d = (C7543d) obj;
        AbstractC7009c abstractC7009c = this.f30184b;
        if (abstractC7009c == null ? c7543d.f30184b != null : !abstractC7009c.equals(c7543d.f30184b)) {
            return false;
        }
        Object obj2 = this.f30183a;
        Object obj3 = c7543d.f30183a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    /* JADX INFO: renamed from: g */
    public C7245j m33194g(C7245j c7245j) {
        return m33193e(c7245j, InterfaceC7548i.f30195a);
    }

    public Object getValue() {
        return this.f30183a;
    }

    public int hashCode() {
        Object obj = this.f30183a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        AbstractC7009c abstractC7009c = this.f30184b;
        return iHashCode + (abstractC7009c != null ? abstractC7009c.hashCode() : 0);
    }

    public boolean isEmpty() {
        return this.f30183a == null && this.f30184b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        m33196m(new b(arrayList));
        return arrayList.iterator();
    }

    /* JADX INFO: renamed from: j */
    public Object m33195j(Object obj, c cVar) {
        return m33188k(C7245j.m31994y(), cVar, obj);
    }

    /* JADX INFO: renamed from: m */
    public void m33196m(c cVar) {
        m33188k(C7245j.m31994y(), cVar, null);
    }

    /* JADX INFO: renamed from: n */
    public Object m33197n(C7245j c7245j) {
        if (c7245j.isEmpty()) {
            return this.f30183a;
        }
        C7543d c7543d = (C7543d) this.f30184b.mo30599b(c7245j.m32004z());
        if (c7543d != null) {
            return c7543d.m33197n(c7245j.m31996C());
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public C7543d m33198p(C0198b c0198b) {
        C7543d c7543d = (C7543d) this.f30184b.mo30599b(c0198b);
        return c7543d != null ? c7543d : m33187b();
    }

    /* JADX INFO: renamed from: q */
    public AbstractC7009c m33199q() {
        return this.f30184b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(getValue());
        sb.append(", children={");
        for (Map.Entry entry : this.f30184b) {
            sb.append(((C0198b) entry.getKey()).m992d());
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public Object m33200v(C7245j c7245j) {
        return m33201w(c7245j, InterfaceC7548i.f30195a);
    }

    /* JADX INFO: renamed from: w */
    public Object m33201w(C7245j c7245j, InterfaceC7548i interfaceC7548i) {
        Object obj = this.f30183a;
        Object obj2 = (obj == null || !interfaceC7548i.mo31917a(obj)) ? null : this.f30183a;
        Iterator it = c7245j.iterator();
        C7543d c7543d = this;
        while (it.hasNext()) {
            c7543d = (C7543d) c7543d.f30184b.mo30599b((C0198b) it.next());
            if (c7543d == null) {
                break;
            }
            Object obj3 = c7543d.f30183a;
            if (obj3 != null && interfaceC7548i.mo31917a(obj3)) {
                obj2 = c7543d.f30183a;
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: x */
    public C7543d m33202x(C7245j c7245j) {
        if (c7245j.isEmpty()) {
            return this.f30184b.isEmpty() ? m33187b() : new C7543d(null, this.f30184b);
        }
        C0198b c0198bM32004z = c7245j.m32004z();
        C7543d c7543d = (C7543d) this.f30184b.mo30599b(c0198bM32004z);
        if (c7543d == null) {
            return this;
        }
        C7543d c7543dM33202x = c7543d.m33202x(c7245j.m31996C());
        AbstractC7009c abstractC7009cMo30607q = c7543dM33202x.isEmpty() ? this.f30184b.mo30607q(c0198bM32004z) : this.f30184b.mo30605n(c0198bM32004z, c7543dM33202x);
        return (this.f30183a == null && abstractC7009cMo30607q.isEmpty()) ? m33187b() : new C7543d(this.f30183a, abstractC7009cMo30607q);
    }

    /* JADX INFO: renamed from: y */
    public Object m33203y(C7245j c7245j, InterfaceC7548i interfaceC7548i) {
        Object obj = this.f30183a;
        if (obj != null && interfaceC7548i.mo31917a(obj)) {
            return this.f30183a;
        }
        Iterator it = c7245j.iterator();
        C7543d c7543d = this;
        while (it.hasNext()) {
            c7543d = (C7543d) c7543d.f30184b.mo30599b((C0198b) it.next());
            if (c7543d == null) {
                return null;
            }
            Object obj2 = c7543d.f30183a;
            if (obj2 != null && interfaceC7548i.mo31917a(obj2)) {
                return c7543d.f30183a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public C7543d m33204z(C7245j c7245j, Object obj) {
        if (c7245j.isEmpty()) {
            return new C7543d(obj, this.f30184b);
        }
        C0198b c0198bM32004z = c7245j.m32004z();
        C7543d c7543dM33187b = (C7543d) this.f30184b.mo30599b(c0198bM32004z);
        if (c7543dM33187b == null) {
            c7543dM33187b = m33187b();
        }
        return new C7543d(this.f30183a, this.f30184b.mo30605n(c0198bM32004z, c7543dM33187b.m33204z(c7245j.m31996C(), obj)));
    }

    public C7543d(Object obj) {
        this(obj, f30181c);
    }
}
