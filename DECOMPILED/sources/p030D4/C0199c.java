package p030D4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p350s4.AbstractC7009c;
import p350s4.InterfaceC7014h;
import p374v4.C7245j;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.c */
/* JADX INFO: loaded from: classes.dex */
public class C0199c implements InterfaceC0210n {

    /* JADX INFO: renamed from: d */
    public static Comparator f879d = new a();

    /* JADX INFO: renamed from: a */
    private final AbstractC7009c f880a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0210n f881b;

    /* JADX INFO: renamed from: c */
    private String f882c;

    /* JADX INFO: renamed from: D4.c$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0198b c0198b, C0198b c0198b2) {
            return c0198b.compareTo(c0198b2);
        }
    }

    /* JADX INFO: renamed from: D4.c$b */
    class b extends InterfaceC7014h.b {

        /* JADX INFO: renamed from: a */
        boolean f883a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ c f884b;

        b(c cVar) {
            this.f884b = cVar;
        }

        @Override // p350s4.InterfaceC7014h.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo1017a(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
            if (!this.f883a && c0198b.compareTo(C0198b.m991n()) > 0) {
                this.f883a = true;
                this.f884b.mo1019b(C0198b.m991n(), C0199c.this.mo1006i());
            }
            this.f884b.mo1019b(c0198b, interfaceC0210n);
        }
    }

    /* JADX INFO: renamed from: D4.c$c */
    public static abstract class c extends InterfaceC7014h.b {
        /* JADX INFO: renamed from: b */
        public abstract void mo1019b(C0198b c0198b, InterfaceC0210n interfaceC0210n);

        @Override // p350s4.InterfaceC7014h.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo1017a(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
            mo1019b(c0198b, interfaceC0210n);
        }
    }

    /* JADX INFO: renamed from: D4.c$d */
    private static class d implements Iterator {

        /* JADX INFO: renamed from: a */
        private final Iterator f886a;

        public d(Iterator it) {
            this.f886a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0209m next() {
            Map.Entry entry = (Map.Entry) this.f886a.next();
            return new C0209m((C0198b) entry.getKey(), (InterfaceC0210n) entry.getValue());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f886a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f886a.remove();
        }
    }

    protected C0199c() {
        this.f882c = null;
        this.f880a = AbstractC7009c.a.m30612c(f879d);
        this.f881b = AbstractC0214r.m1091a();
    }

    /* JADX INFO: renamed from: j */
    private static void m997j(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: v */
    private void m998v(StringBuilder sb, int i7) {
        if (this.f880a.isEmpty() && this.f881b.isEmpty()) {
            sb.append("{ }");
            return;
        }
        sb.append("{\n");
        for (Map.Entry entry : this.f880a) {
            int i8 = i7 + 2;
            m997j(sb, i8);
            sb.append(((C0198b) entry.getKey()).m992d());
            sb.append("=");
            if (entry.getValue() instanceof C0199c) {
                ((C0199c) entry.getValue()).m998v(sb, i8);
            } else {
                sb.append(((InterfaceC0210n) entry.getValue()).toString());
            }
            sb.append("\n");
        }
        if (!this.f881b.isEmpty()) {
            m997j(sb, i7 + 2);
            sb.append(".priority=");
            sb.append(this.f881b.toString());
            sb.append("\n");
        }
        m997j(sb, i7);
        sb.append("}");
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: E */
    public InterfaceC0210n mo999E(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        if (c0198b.m996q()) {
            return mo981G(interfaceC0210n);
        }
        AbstractC7009c abstractC7009cMo30605n = this.f880a;
        if (abstractC7009cMo30605n.mo30598a(c0198b)) {
            abstractC7009cMo30605n = abstractC7009cMo30605n.mo30607q(c0198b);
        }
        if (!interfaceC0210n.isEmpty()) {
            abstractC7009cMo30605n = abstractC7009cMo30605n.mo30605n(c0198b, interfaceC0210n);
        }
        return abstractC7009cMo30605n.isEmpty() ? C0203g.m1050w() : new C0199c(abstractC7009cMo30605n, this.f881b);
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: G */
    public InterfaceC0210n mo981G(InterfaceC0210n interfaceC0210n) {
        return this.f880a.isEmpty() ? C0203g.m1050w() : new C0199c(this.f880a, interfaceC0210n);
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: H */
    public boolean mo1000H() {
        return false;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: L */
    public String mo982L(InterfaceC0210n.b bVar) {
        boolean z7;
        InterfaceC0210n.b bVar2 = InterfaceC0210n.b.V1;
        if (bVar != bVar2) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f881b.isEmpty()) {
            sb.append("priority:");
            sb.append(this.f881b.mo982L(bVar2));
            sb.append(":");
        }
        ArrayList<C0209m> arrayList = new ArrayList();
        Iterator it = iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C0209m c0209m = (C0209m) it.next();
                arrayList.add(c0209m);
                z7 = z7 || !c0209m.m1083d().mo1006i().isEmpty();
            }
        }
        if (z7) {
            Collections.sort(arrayList, C0213q.m1089j());
        }
        for (C0209m c0209m2 : arrayList) {
            String strMo1004S = c0209m2.m1083d().mo1004S();
            if (!strMo1004S.equals("")) {
                sb.append(":");
                sb.append(c0209m2.m1082c().m992d());
                sb.append(":");
                sb.append(strMo1004S);
            }
        }
        return sb.toString();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: N */
    public Object mo1001N(boolean z7) {
        Integer numM33238k;
        if (isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        boolean z8 = true;
        int i7 = 0;
        int iIntValue = 0;
        for (Map.Entry entry : this.f880a) {
            String strM992d = ((C0198b) entry.getKey()).m992d();
            map.put(strM992d, ((InterfaceC0210n) entry.getValue()).mo1001N(z7));
            i7++;
            if (z8) {
                if ((strM992d.length() > 1 && strM992d.charAt(0) == '0') || (numM33238k = AbstractC7551l.m33238k(strM992d)) == null || numM33238k.intValue() < 0) {
                    z8 = false;
                } else if (numM33238k.intValue() > iIntValue) {
                    iIntValue = numM33238k.intValue();
                }
            }
        }
        if (z7 || !z8 || iIntValue >= i7 * 2) {
            if (z7 && !this.f881b.isEmpty()) {
                map.put(".priority", this.f881b.getValue());
            }
            return map;
        }
        ArrayList arrayList = new ArrayList(iIntValue + 1);
        for (int i8 = 0; i8 <= iIntValue; i8++) {
            arrayList.add(map.get("" + i8));
        }
        return arrayList;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: Q */
    public Iterator mo1002Q() {
        return new d(this.f880a.mo30597Q());
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: R */
    public boolean mo1003R(C0198b c0198b) {
        return !mo1008l(c0198b).isEmpty();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: S */
    public String mo1004S() {
        if (this.f882c == null) {
            String strMo982L = mo982L(InterfaceC0210n.b.V1);
            this.f882c = strMo982L.isEmpty() ? "" : AbstractC7551l.m33236i(strMo982L);
        }
        return this.f882c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0199c)) {
            return false;
        }
        C0199c c0199c = (C0199c) obj;
        if (!mo1006i().equals(c0199c.mo1006i()) || this.f880a.size() != c0199c.f880a.size()) {
            return false;
        }
        Iterator it = this.f880a.iterator();
        Iterator it2 = c0199c.f880a.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (!((C0198b) entry.getKey()).equals(entry2.getKey()) || !((InterfaceC0210n) entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            throw new IllegalStateException("Something went wrong internally.");
        }
        return true;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: f */
    public int mo1005f() {
        return this.f880a.size();
    }

    @Override // p030D4.InterfaceC0210n
    public Object getValue() {
        return mo1001N(false);
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            C0209m c0209m = (C0209m) it.next();
            iHashCode = (((iHashCode * 31) + c0209m.m1082c().hashCode()) * 17) + c0209m.m1083d().hashCode();
        }
        return iHashCode;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: i */
    public InterfaceC0210n mo1006i() {
        return this.f881b;
    }

    @Override // p030D4.InterfaceC0210n
    public boolean isEmpty() {
        return this.f880a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d(this.f880a.iterator());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(InterfaceC0210n interfaceC0210n) {
        if (isEmpty()) {
            return interfaceC0210n.isEmpty() ? 0 : -1;
        }
        if (interfaceC0210n.mo1000H() || interfaceC0210n.isEmpty()) {
            return 1;
        }
        return interfaceC0210n == InterfaceC0210n.f920g ? -1 : 0;
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: l */
    public InterfaceC0210n mo1008l(C0198b c0198b) {
        if (!c0198b.m996q() || this.f881b.isEmpty()) {
            return this.f880a.mo30598a(c0198b) ? (InterfaceC0210n) this.f880a.mo30599b(c0198b) : C0203g.m1050w();
        }
        return this.f881b;
    }

    /* JADX INFO: renamed from: m */
    public void m1009m(c cVar) {
        m1010n(cVar, false);
    }

    /* JADX INFO: renamed from: n */
    public void m1010n(c cVar, boolean z7) {
        if (!z7 || mo1006i().isEmpty()) {
            this.f880a.mo30604m(cVar);
        } else {
            this.f880a.mo30604m(new b(cVar));
        }
    }

    /* JADX INFO: renamed from: p */
    public C0198b m1011p() {
        return (C0198b) this.f880a.mo30602j();
    }

    /* JADX INFO: renamed from: q */
    public C0198b m1012q() {
        return (C0198b) this.f880a.mo30601g();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: r */
    public InterfaceC0210n mo1013r(C7245j c7245j) {
        C0198b c0198bM32004z = c7245j.m32004z();
        return c0198bM32004z == null ? this : mo1008l(c0198bM32004z).mo1013r(c7245j.m31996C());
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: s */
    public C0198b mo1014s(C0198b c0198b) {
        return (C0198b) this.f880a.mo30603k(c0198b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m998v(sb, 0);
        return sb.toString();
    }

    @Override // p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: u */
    public InterfaceC0210n mo1015u(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        C0198b c0198bM32004z = c7245j.m32004z();
        if (c0198bM32004z == null) {
            return interfaceC0210n;
        }
        if (!c0198bM32004z.m996q()) {
            return mo999E(c0198bM32004z, mo1008l(c0198bM32004z).mo1015u(c7245j.m31996C(), interfaceC0210n));
        }
        AbstractC7551l.m33233f(AbstractC0214r.m1092b(interfaceC0210n));
        return mo981G(interfaceC0210n);
    }

    protected C0199c(AbstractC7009c abstractC7009c, InterfaceC0210n interfaceC0210n) {
        this.f882c = null;
        if (abstractC7009c.isEmpty() && !interfaceC0210n.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.f881b = interfaceC0210n;
        this.f880a = abstractC7009c;
    }
}
