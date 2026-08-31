package p137R4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p158U4.InterfaceC1684h;

/* JADX INFO: renamed from: R4.k */
/* JADX INFO: loaded from: classes.dex */
public class C1364k extends AbstractC1370q {

    /* JADX INFO: renamed from: a */
    private final List f4794a;

    /* JADX INFO: renamed from: b */
    private final a f4795b;

    /* JADX INFO: renamed from: c */
    private List f4796c;

    /* JADX INFO: renamed from: R4.k$a */
    public enum a {
        AND("and"),
        OR("or");


        /* JADX INFO: renamed from: a */
        private final String f4800a;

        a(String str) {
            this.f4800a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f4800a;
        }
    }

    public C1364k(List list, a aVar) {
        this.f4794a = new ArrayList(list);
        this.f4795b = aVar;
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: a */
    public String mo5890a() {
        StringBuilder sb = new StringBuilder();
        if (m5897i()) {
            Iterator it = this.f4794a.iterator();
            while (it.hasNext()) {
                sb.append(((AbstractC1370q) it.next()).mo5890a());
            }
            return sb.toString();
        }
        sb.append(this.f4795b.toString() + "(");
        sb.append(TextUtils.join(",", this.f4794a));
        sb.append(")");
        return sb.toString();
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: b */
    public List mo5891b() {
        return Collections.unmodifiableList(this.f4794a);
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: c */
    public List mo5892c() {
        List list = this.f4796c;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        this.f4796c = new ArrayList();
        Iterator it = this.f4794a.iterator();
        while (it.hasNext()) {
            this.f4796c.addAll(((AbstractC1370q) it.next()).mo5892c());
        }
        return Collections.unmodifiableList(this.f4796c);
    }

    @Override // p137R4.AbstractC1370q
    /* JADX INFO: renamed from: d */
    public boolean mo5717d(InterfaceC1684h interfaceC1684h) {
        if (m5894f()) {
            Iterator it = this.f4794a.iterator();
            while (it.hasNext()) {
                if (!((AbstractC1370q) it.next()).mo5717d(interfaceC1684h)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = this.f4794a.iterator();
        while (it2.hasNext()) {
            if (((AbstractC1370q) it2.next()).mo5717d(interfaceC1684h)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public a m5893e() {
        return this.f4795b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1364k)) {
            C1364k c1364k = (C1364k) obj;
            if (this.f4795b == c1364k.f4795b && this.f4794a.equals(c1364k.f4794a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m5894f() {
        return this.f4795b == a.AND;
    }

    /* JADX INFO: renamed from: g */
    public boolean m5895g() {
        return this.f4795b == a.OR;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5896h() {
        Iterator it = this.f4794a.iterator();
        while (it.hasNext()) {
            if (((AbstractC1370q) it.next()) instanceof C1364k) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1147 + this.f4795b.hashCode()) * 31) + this.f4794a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public boolean m5897i() {
        return m5896h() && m5894f();
    }

    /* JADX INFO: renamed from: j */
    public C1364k m5898j(List list) {
        ArrayList arrayList = new ArrayList(this.f4794a);
        arrayList.addAll(list);
        return new C1364k(arrayList, this.f4795b);
    }

    public String toString() {
        return mo5890a();
    }
}
