package p393y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: y.f */
/* JADX INFO: loaded from: classes.dex */
public class C7435f implements InterfaceC7433d {

    /* JADX INFO: renamed from: d */
    AbstractC7445p f29786d;

    /* JADX INFO: renamed from: f */
    int f29788f;

    /* JADX INFO: renamed from: g */
    public int f29789g;

    /* JADX INFO: renamed from: a */
    public InterfaceC7433d f29783a = null;

    /* JADX INFO: renamed from: b */
    public boolean f29784b = false;

    /* JADX INFO: renamed from: c */
    public boolean f29785c = false;

    /* JADX INFO: renamed from: e */
    a f29787e = a.UNKNOWN;

    /* JADX INFO: renamed from: h */
    int f29790h = 1;

    /* JADX INFO: renamed from: i */
    C7436g f29791i = null;

    /* JADX INFO: renamed from: j */
    public boolean f29792j = false;

    /* JADX INFO: renamed from: k */
    List f29793k = new ArrayList();

    /* JADX INFO: renamed from: l */
    List f29794l = new ArrayList();

    /* JADX INFO: renamed from: y.f$a */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C7435f(AbstractC7445p abstractC7445p) {
        this.f29786d = abstractC7445p;
    }

    @Override // p393y.InterfaceC7433d
    /* JADX INFO: renamed from: a */
    public void mo32914a(InterfaceC7433d interfaceC7433d) {
        Iterator it = this.f29794l.iterator();
        while (it.hasNext()) {
            if (!((C7435f) it.next()).f29792j) {
                return;
            }
        }
        this.f29785c = true;
        InterfaceC7433d interfaceC7433d2 = this.f29783a;
        if (interfaceC7433d2 != null) {
            interfaceC7433d2.mo32914a(this);
        }
        if (this.f29784b) {
            this.f29786d.mo32914a(this);
            return;
        }
        C7435f c7435f = null;
        int i7 = 0;
        for (C7435f c7435f2 : this.f29794l) {
            if (!(c7435f2 instanceof C7436g)) {
                i7++;
                c7435f = c7435f2;
            }
        }
        if (c7435f != null && i7 == 1 && c7435f.f29792j) {
            C7436g c7436g = this.f29791i;
            if (c7436g != null) {
                if (!c7436g.f29792j) {
                    return;
                } else {
                    this.f29788f = this.f29790h * c7436g.f29789g;
                }
            }
            mo32936d(c7435f.f29789g + this.f29788f);
        }
        InterfaceC7433d interfaceC7433d3 = this.f29783a;
        if (interfaceC7433d3 != null) {
            interfaceC7433d3.mo32914a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m32934b(InterfaceC7433d interfaceC7433d) {
        this.f29793k.add(interfaceC7433d);
        if (this.f29792j) {
            interfaceC7433d.mo32914a(interfaceC7433d);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m32935c() {
        this.f29794l.clear();
        this.f29793k.clear();
        this.f29792j = false;
        this.f29789g = 0;
        this.f29785c = false;
        this.f29784b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo32936d(int i7) {
        if (this.f29792j) {
            return;
        }
        this.f29792j = true;
        this.f29789g = i7;
        for (InterfaceC7433d interfaceC7433d : this.f29793k) {
            interfaceC7433d.mo32914a(interfaceC7433d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29786d.f29836b.m32562t());
        sb.append(":");
        sb.append(this.f29787e);
        sb.append("(");
        sb.append(this.f29792j ? Integer.valueOf(this.f29789g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f29794l.size());
        sb.append(":d=");
        sb.append(this.f29793k.size());
        sb.append(">");
        return sb.toString();
    }
}
