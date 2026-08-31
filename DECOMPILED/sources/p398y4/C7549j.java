package p398y4;

import java.util.Map;
import p030D4.C0198b;
import p374v4.C7245j;

/* JADX INFO: renamed from: y4.j */
/* JADX INFO: loaded from: classes.dex */
public class C7549j {

    /* JADX INFO: renamed from: a */
    private C0198b f30196a;

    /* JADX INFO: renamed from: b */
    private C7549j f30197b;

    /* JADX INFO: renamed from: c */
    private C7550k f30198c;

    /* JADX INFO: renamed from: y4.j$a */
    class a implements c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ c f30199a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f30200b;

        a(c cVar, boolean z7) {
            this.f30199a = cVar;
            this.f30200b = z7;
        }

        @Override // p398y4.C7549j.c
        /* JADX INFO: renamed from: a */
        public void mo32058a(C7549j c7549j) {
            c7549j.m33219e(this.f30199a, true, this.f30200b);
        }
    }

    /* JADX INFO: renamed from: y4.j$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo32059a(C7549j c7549j);
    }

    /* JADX INFO: renamed from: y4.j$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo32058a(C7549j c7549j);
    }

    public C7549j(C0198b c0198b, C7549j c7549j, C7550k c7550k) {
        this.f30196a = c0198b;
        this.f30197b = c7549j;
        this.f30198c = c7550k;
    }

    /* JADX INFO: renamed from: m */
    private void m33213m(C0198b c0198b, C7549j c7549j) {
        boolean zM33223i = c7549j.m33223i();
        boolean zContainsKey = this.f30198c.f30202a.containsKey(c0198b);
        if (zM33223i && zContainsKey) {
            this.f30198c.f30202a.remove(c0198b);
            m33214n();
        } else {
            if (zM33223i || zContainsKey) {
                return;
            }
            this.f30198c.f30202a.put(c0198b, c7549j.f30198c);
            m33214n();
        }
    }

    /* JADX INFO: renamed from: n */
    private void m33214n() {
        C7549j c7549j = this.f30197b;
        if (c7549j != null) {
            c7549j.m33213m(this.f30196a, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m33215a(b bVar) {
        return m33216b(bVar, false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m33216b(b bVar, boolean z7) {
        for (C7549j c7549j = z7 ? this : this.f30197b; c7549j != null; c7549j = c7549j.f30197b) {
            if (bVar.mo32059a(c7549j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m33217c(c cVar) {
        for (Object obj : this.f30198c.f30202a.entrySet().toArray()) {
            Map.Entry entry = (Map.Entry) obj;
            cVar.mo32058a(new C7549j((C0198b) entry.getKey(), this, (C7550k) entry.getValue()));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m33218d(c cVar) {
        m33219e(cVar, false, false);
    }

    /* JADX INFO: renamed from: e */
    public void m33219e(c cVar, boolean z7, boolean z8) {
        if (z7 && !z8) {
            cVar.mo32058a(this);
        }
        m33217c(new a(cVar, z8));
        if (z7 && z8) {
            cVar.mo32058a(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public C7245j m33220f() {
        if (this.f30197b == null) {
            return this.f30196a != null ? new C7245j(this.f30196a) : C7245j.m31994y();
        }
        AbstractC7551l.m33233f(this.f30196a != null);
        return this.f30197b.m33220f().m31999p(this.f30196a);
    }

    /* JADX INFO: renamed from: g */
    public Object m33221g() {
        return this.f30198c.f30203b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m33222h() {
        return !this.f30198c.f30202a.isEmpty();
    }

    /* JADX INFO: renamed from: i */
    public boolean m33223i() {
        C7550k c7550k = this.f30198c;
        return c7550k.f30203b == null && c7550k.f30202a.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public void m33224j(Object obj) {
        this.f30198c.f30203b = obj;
        m33214n();
    }

    /* JADX INFO: renamed from: k */
    public C7549j m33225k(C7245j c7245j) {
        C0198b c0198bM32004z = c7245j.m32004z();
        C7549j c7549j = this;
        while (c0198bM32004z != null) {
            C7549j c7549j2 = new C7549j(c0198bM32004z, c7549j, c7549j.f30198c.f30202a.containsKey(c0198bM32004z) ? (C7550k) c7549j.f30198c.f30202a.get(c0198bM32004z) : new C7550k());
            c7245j = c7245j.m31996C();
            c0198bM32004z = c7245j.m32004z();
            c7549j = c7549j2;
        }
        return c7549j;
    }

    /* JADX INFO: renamed from: l */
    String m33226l(String str) {
        C0198b c0198b = this.f30196a;
        String strM992d = c0198b == null ? "<anon>" : c0198b.m992d();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(strM992d);
        sb.append("\n");
        sb.append(this.f30198c.m33227a(str + "\t"));
        return sb.toString();
    }

    public String toString() {
        return m33226l("");
    }

    public C7549j() {
        this(null, null, new C7550k());
    }
}
