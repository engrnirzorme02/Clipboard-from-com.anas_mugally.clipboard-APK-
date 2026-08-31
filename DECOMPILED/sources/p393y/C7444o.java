package p393y;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p361u.C7146d;
import p385x.AbstractC7367b;
import p385x.C7370e;
import p385x.C7371f;

/* JADX INFO: renamed from: y.o */
/* JADX INFO: loaded from: classes.dex */
public class C7444o {

    /* JADX INFO: renamed from: g */
    static int f29821g;

    /* JADX INFO: renamed from: b */
    int f29823b;

    /* JADX INFO: renamed from: d */
    int f29825d;

    /* JADX INFO: renamed from: a */
    ArrayList f29822a = new ArrayList();

    /* JADX INFO: renamed from: c */
    boolean f29824c = false;

    /* JADX INFO: renamed from: e */
    ArrayList f29826e = null;

    /* JADX INFO: renamed from: f */
    private int f29827f = -1;

    /* JADX INFO: renamed from: y.o$a */
    static class a {

        /* JADX INFO: renamed from: a */
        WeakReference f29828a;

        /* JADX INFO: renamed from: b */
        int f29829b;

        /* JADX INFO: renamed from: c */
        int f29830c;

        /* JADX INFO: renamed from: d */
        int f29831d;

        /* JADX INFO: renamed from: e */
        int f29832e;

        /* JADX INFO: renamed from: f */
        int f29833f;

        /* JADX INFO: renamed from: g */
        int f29834g;

        a(C7370e c7370e, C7146d c7146d, int i7) {
            this.f29828a = new WeakReference(c7370e);
            this.f29829b = c7146d.m31592y(c7370e.f29412O);
            this.f29830c = c7146d.m31592y(c7370e.f29413P);
            this.f29831d = c7146d.m31592y(c7370e.f29414Q);
            this.f29832e = c7146d.m31592y(c7370e.f29415R);
            this.f29833f = c7146d.m31592y(c7370e.f29416S);
            this.f29834g = i7;
        }
    }

    public C7444o(int i7) {
        int i8 = f29821g;
        f29821g = i8 + 1;
        this.f29823b = i8;
        this.f29825d = i7;
    }

    /* JADX INFO: renamed from: e */
    private String m32960e() {
        int i7 = this.f29825d;
        if (i7 == 0) {
            return "Horizontal";
        }
        if (i7 == 1) {
            return "Vertical";
        }
        return i7 == 2 ? "Both" : "Unknown";
    }

    /* JADX INFO: renamed from: j */
    private int m32961j(C7146d c7146d, ArrayList arrayList, int i7) {
        int iM31592y;
        int iM31592y2;
        C7371f c7371f = (C7371f) ((C7370e) arrayList.get(0)).m32486K();
        c7146d.m31573E();
        c7371f.mo32421g(c7146d, false);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ((C7370e) arrayList.get(i8)).mo32421g(c7146d, false);
        }
        if (i7 == 0 && c7371f.f29492W0 > 0) {
            AbstractC7367b.m32432b(c7371f, c7146d, arrayList, 0);
        }
        if (i7 == 1 && c7371f.f29493X0 > 0) {
            AbstractC7367b.m32432b(c7371f, c7146d, arrayList, 1);
        }
        try {
            c7146d.m31571A();
        } catch (Exception e7) {
            System.err.println(e7.toString() + "\n" + Arrays.toString(e7.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f29826e = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            this.f29826e.add(new a((C7370e) arrayList.get(i9), c7146d, i7));
        }
        if (i7 == 0) {
            iM31592y = c7146d.m31592y(c7371f.f29412O);
            iM31592y2 = c7146d.m31592y(c7371f.f29414Q);
            c7146d.m31573E();
        } else {
            iM31592y = c7146d.m31592y(c7371f.f29413P);
            iM31592y2 = c7146d.m31592y(c7371f.f29415R);
            c7146d.m31573E();
        }
        return iM31592y2 - iM31592y;
    }

    /* JADX INFO: renamed from: a */
    public boolean m32962a(C7370e c7370e) {
        if (this.f29822a.contains(c7370e)) {
            return false;
        }
        this.f29822a.add(c7370e);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m32963b(ArrayList arrayList) {
        int size = this.f29822a.size();
        if (this.f29827f != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                C7444o c7444o = (C7444o) arrayList.get(i7);
                if (this.f29827f == c7444o.f29823b) {
                    m32967g(this.f29825d, c7444o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m32964c() {
        return this.f29823b;
    }

    /* JADX INFO: renamed from: d */
    public int m32965d() {
        return this.f29825d;
    }

    /* JADX INFO: renamed from: f */
    public int m32966f(C7146d c7146d, int i7) {
        if (this.f29822a.size() == 0) {
            return 0;
        }
        return m32961j(c7146d, this.f29822a, i7);
    }

    /* JADX INFO: renamed from: g */
    public void m32967g(int i7, C7444o c7444o) {
        for (C7370e c7370e : this.f29822a) {
            c7444o.m32962a(c7370e);
            if (i7 == 0) {
                c7370e.f29405I0 = c7444o.m32964c();
            } else {
                c7370e.f29407J0 = c7444o.m32964c();
            }
        }
        this.f29827f = c7444o.f29823b;
    }

    /* JADX INFO: renamed from: h */
    public void m32968h(boolean z7) {
        this.f29824c = z7;
    }

    /* JADX INFO: renamed from: i */
    public void m32969i(int i7) {
        this.f29825d = i7;
    }

    public String toString() {
        String str = m32960e() + " [" + this.f29823b + "] <";
        Iterator it = this.f29822a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((C7370e) it.next()).m32562t();
        }
        return str + " >";
    }
}
