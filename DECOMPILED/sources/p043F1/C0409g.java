package p043F1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: F1.g */
/* JADX INFO: loaded from: classes.dex */
class C0409g {

    /* JADX INFO: renamed from: a */
    private final a f1621a = new a();

    /* JADX INFO: renamed from: b */
    private final Map f1622b = new HashMap();

    /* JADX INFO: renamed from: F1.g$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        final Object f1623a;

        /* JADX INFO: renamed from: b */
        private List f1624b;

        /* JADX INFO: renamed from: c */
        a f1625c;

        /* JADX INFO: renamed from: d */
        a f1626d;

        a() {
            this(null);
        }

        /* JADX INFO: renamed from: a */
        public void m1757a(Object obj) {
            if (this.f1624b == null) {
                this.f1624b = new ArrayList();
            }
            this.f1624b.add(obj);
        }

        /* JADX INFO: renamed from: b */
        public Object m1758b() {
            int iM1759c = m1759c();
            if (iM1759c > 0) {
                return this.f1624b.remove(iM1759c - 1);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public int m1759c() {
            List list = this.f1624b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(Object obj) {
            this.f1626d = this;
            this.f1625c = this;
            this.f1623a = obj;
        }
    }

    C0409g() {
    }

    /* JADX INFO: renamed from: b */
    private void m1750b(a aVar) {
        m1752e(aVar);
        a aVar2 = this.f1621a;
        aVar.f1626d = aVar2;
        aVar.f1625c = aVar2.f1625c;
        m1753g(aVar);
    }

    /* JADX INFO: renamed from: c */
    private void m1751c(a aVar) {
        m1752e(aVar);
        a aVar2 = this.f1621a;
        aVar.f1626d = aVar2.f1626d;
        aVar.f1625c = aVar2;
        m1753g(aVar);
    }

    /* JADX INFO: renamed from: e */
    private static void m1752e(a aVar) {
        a aVar2 = aVar.f1626d;
        aVar2.f1625c = aVar.f1625c;
        aVar.f1625c.f1626d = aVar2;
    }

    /* JADX INFO: renamed from: g */
    private static void m1753g(a aVar) {
        aVar.f1625c.f1626d = aVar;
        aVar.f1626d.f1625c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public Object m1754a(InterfaceC0414l interfaceC0414l) {
        a aVar = (a) this.f1622b.get(interfaceC0414l);
        if (aVar == null) {
            aVar = new a(interfaceC0414l);
            this.f1622b.put(interfaceC0414l, aVar);
        } else {
            interfaceC0414l.mo1773a();
        }
        m1750b(aVar);
        return aVar.m1758b();
    }

    /* JADX INFO: renamed from: d */
    public void m1755d(InterfaceC0414l interfaceC0414l, Object obj) {
        a aVar = (a) this.f1622b.get(interfaceC0414l);
        if (aVar == null) {
            aVar = new a(interfaceC0414l);
            m1751c(aVar);
            this.f1622b.put(interfaceC0414l, aVar);
        } else {
            interfaceC0414l.mo1773a();
        }
        aVar.m1757a(obj);
    }

    /* JADX INFO: renamed from: f */
    public Object m1756f() {
        for (a aVar = this.f1621a.f1626d; !aVar.equals(this.f1621a); aVar = aVar.f1626d) {
            Object objM1758b = aVar.m1758b();
            if (objM1758b != null) {
                return objM1758b;
            }
            m1752e(aVar);
            this.f1622b.remove(aVar.f1623a);
            ((InterfaceC0414l) aVar.f1623a).mo1773a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f1621a.f1625c;
        boolean z7 = false;
        while (!aVar.equals(this.f1621a)) {
            sb.append('{');
            sb.append(aVar.f1623a);
            sb.append(':');
            sb.append(aVar.m1759c());
            sb.append("}, ");
            aVar = aVar.f1625c;
            z7 = true;
        }
        if (z7) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
