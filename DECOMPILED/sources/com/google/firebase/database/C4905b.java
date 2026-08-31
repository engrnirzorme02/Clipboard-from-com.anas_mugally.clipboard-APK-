package com.google.firebase.database;

import com.google.android.gms.tasks.Task;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import p030D4.AbstractC0211o;
import p030D4.AbstractC0214r;
import p030D4.InterfaceC0210n;
import p334q4.C6834a;
import p334q4.C6835b;
import p374v4.C7231B;
import p374v4.C7245j;
import p374v4.C7247l;
import p398y4.AbstractC7551l;
import p398y4.AbstractC7552m;
import p398y4.C7546g;
import p406z4.AbstractC7613a;

/* JADX INFO: renamed from: com.google.firebase.database.b */
/* JADX INFO: loaded from: classes.dex */
public class C4905b extends AbstractC4910g {

    /* JADX INFO: renamed from: com.google.firebase.database.b$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0210n f18623a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C7546g f18624b;

        a(InterfaceC0210n interfaceC0210n, C7546g c7546g) {
            this.f18623a = interfaceC0210n;
            this.f18624b = c7546g;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4905b c4905b = C4905b.this;
            c4905b.f18636a.m32056c0(c4905b.m22125b(), this.f18623a, (b) this.f18624b.m33212b());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.database.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo22112a(C6834a c6834a, C4905b c4905b);
    }

    C4905b(C7247l c7247l, C7245j c7245j) {
        super(c7247l, c7245j);
    }

    /* JADX INFO: renamed from: i */
    private Task m22107i(Object obj, InterfaceC0210n interfaceC0210n, b bVar) {
        AbstractC7552m.m33248i(m22125b());
        C7231B.m31893g(m22125b(), obj);
        Object objM33372b = AbstractC7613a.m33372b(obj);
        AbstractC7552m.m33247h(objM33372b);
        InterfaceC0210n interfaceC0210nM1086b = AbstractC0211o.m1086b(objM33372b, interfaceC0210n);
        C7546g c7546gM33239l = AbstractC7551l.m33239l(bVar);
        this.f18636a.m32055Y(new a(interfaceC0210nM1086b, c7546gM33239l));
        return (Task) c7546gM33239l.m33211a();
    }

    /* JADX INFO: renamed from: e */
    public C4905b m22108e(String str) {
        if (str == null) {
            throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
        }
        if (m22125b().isEmpty()) {
            AbstractC7552m.m33245f(str);
        } else {
            AbstractC7552m.m33244e(str);
        }
        return new C4905b(this.f18636a, m22125b().m32000q(new C7245j(str)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4905b) && toString().equals(obj.toString());
    }

    /* JADX INFO: renamed from: f */
    public String m22109f() {
        if (m22125b().isEmpty()) {
            return null;
        }
        return m22125b().m32003x().m992d();
    }

    /* JADX INFO: renamed from: g */
    public C4905b m22110g() {
        C7245j c7245jM31995A = m22125b().m31995A();
        if (c7245jM31995A != null) {
            return new C4905b(this.f18636a, c7245jM31995A);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Task m22111h(Object obj) {
        return m22107i(obj, AbstractC0214r.m1094d(this.f18637b, null), null);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        C4905b c4905bM22110g = m22110g();
        if (c4905bM22110g == null) {
            return this.f18636a.toString();
        }
        try {
            return c4905bM22110g.toString() + "/" + URLEncoder.encode(m22109f(), "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e7) {
            throw new C6835b("Failed to URLEncode key: " + m22109f(), e7);
        }
    }
}
