package p329q;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC2632Y;
import androidx.lifecycle.AbstractC2664z;
import androidx.lifecycle.C2611C;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: loaded from: classes.dex */
public class C6787g extends AbstractC2632Y {

    /* JADX INFO: renamed from: b */
    private Executor f27295b;

    /* JADX INFO: renamed from: c */
    private C6786f.a f27296c;

    /* JADX INFO: renamed from: d */
    private C6786f.d f27297d;

    /* JADX INFO: renamed from: e */
    private C6786f.c f27298e;

    /* JADX INFO: renamed from: f */
    private C6781a f27299f;

    /* JADX INFO: renamed from: g */
    private C6788h f27300g;

    /* JADX INFO: renamed from: h */
    private DialogInterface.OnClickListener f27301h;

    /* JADX INFO: renamed from: i */
    private CharSequence f27302i;

    /* JADX INFO: renamed from: k */
    private boolean f27304k;

    /* JADX INFO: renamed from: l */
    private boolean f27305l;

    /* JADX INFO: renamed from: m */
    private boolean f27306m;

    /* JADX INFO: renamed from: n */
    private boolean f27307n;

    /* JADX INFO: renamed from: o */
    private boolean f27308o;

    /* JADX INFO: renamed from: p */
    private C2611C f27309p;

    /* JADX INFO: renamed from: q */
    private C2611C f27310q;

    /* JADX INFO: renamed from: r */
    private C2611C f27311r;

    /* JADX INFO: renamed from: s */
    private C2611C f27312s;

    /* JADX INFO: renamed from: t */
    private C2611C f27313t;

    /* JADX INFO: renamed from: v */
    private C2611C f27315v;

    /* JADX INFO: renamed from: x */
    private C2611C f27317x;

    /* JADX INFO: renamed from: y */
    private C2611C f27318y;

    /* JADX INFO: renamed from: j */
    private int f27303j = 0;

    /* JADX INFO: renamed from: u */
    private boolean f27314u = true;

    /* JADX INFO: renamed from: w */
    private int f27316w = 0;

    /* JADX INFO: renamed from: q.g$a */
    class a extends C6786f.a {
        a() {
        }
    }

    /* JADX INFO: renamed from: q.g$b */
    private static final class b extends C6781a.d {

        /* JADX INFO: renamed from: a */
        private final WeakReference f27320a;

        b(C6787g c6787g) {
            this.f27320a = new WeakReference(c6787g);
        }

        @Override // p329q.C6781a.d
        /* JADX INFO: renamed from: a */
        void mo29628a(int i7, CharSequence charSequence) {
            if (this.f27320a.get() == null || ((C6787g) this.f27320a.get()).m29736A() || !((C6787g) this.f27320a.get()).m29784y()) {
                return;
            }
            ((C6787g) this.f27320a.get()).m29743H(new C6783c(i7, charSequence));
        }

        @Override // p329q.C6781a.d
        /* JADX INFO: renamed from: b */
        void mo29629b() {
            if (this.f27320a.get() == null || !((C6787g) this.f27320a.get()).m29784y()) {
                return;
            }
            ((C6787g) this.f27320a.get()).m29744I(true);
        }

        @Override // p329q.C6781a.d
        /* JADX INFO: renamed from: c */
        void mo29630c(CharSequence charSequence) {
            if (this.f27320a.get() != null) {
                ((C6787g) this.f27320a.get()).m29745J(charSequence);
            }
        }

        @Override // p329q.C6781a.d
        /* JADX INFO: renamed from: d */
        void mo29631d(C6786f.b bVar) {
            if (this.f27320a.get() == null || !((C6787g) this.f27320a.get()).m29784y()) {
                return;
            }
            if (bVar.m29718a() == -1) {
                bVar = new C6786f.b(bVar.m29719b(), ((C6787g) this.f27320a.get()).m29778s());
            }
            ((C6787g) this.f27320a.get()).m29746K(bVar);
        }
    }

    /* JADX INFO: renamed from: q.g$c */
    private static class c implements Executor {

        /* JADX INFO: renamed from: a */
        private final Handler f27321a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f27321a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: q.g$d */
    private static class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        private final WeakReference f27322a;

        d(C6787g c6787g) {
            this.f27322a = new WeakReference(c6787g);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            if (this.f27322a.get() != null) {
                ((C6787g) this.f27322a.get()).m29760Y(true);
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    private static void m29735c0(C2611C c2611c, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            c2611c.mo12526q(obj);
        } else {
            c2611c.mo12525o(obj);
        }
    }

    /* JADX INFO: renamed from: A */
    boolean m29736A() {
        return this.f27306m;
    }

    /* JADX INFO: renamed from: B */
    boolean m29737B() {
        return this.f27307n;
    }

    /* JADX INFO: renamed from: C */
    AbstractC2664z m29738C() {
        if (this.f27315v == null) {
            this.f27315v = new C2611C();
        }
        return this.f27315v;
    }

    /* JADX INFO: renamed from: D */
    boolean m29739D() {
        return this.f27314u;
    }

    /* JADX INFO: renamed from: E */
    boolean m29740E() {
        return this.f27308o;
    }

    /* JADX INFO: renamed from: F */
    AbstractC2664z m29741F() {
        if (this.f27313t == null) {
            this.f27313t = new C2611C();
        }
        return this.f27313t;
    }

    /* JADX INFO: renamed from: G */
    boolean m29742G() {
        return this.f27304k;
    }

    /* JADX INFO: renamed from: H */
    void m29743H(C6783c c6783c) {
        if (this.f27310q == null) {
            this.f27310q = new C2611C();
        }
        m29735c0(this.f27310q, c6783c);
    }

    /* JADX INFO: renamed from: I */
    void m29744I(boolean z7) {
        if (this.f27312s == null) {
            this.f27312s = new C2611C();
        }
        m29735c0(this.f27312s, Boolean.valueOf(z7));
    }

    /* JADX INFO: renamed from: J */
    void m29745J(CharSequence charSequence) {
        if (this.f27311r == null) {
            this.f27311r = new C2611C();
        }
        m29735c0(this.f27311r, charSequence);
    }

    /* JADX INFO: renamed from: K */
    void m29746K(C6786f.b bVar) {
        if (this.f27309p == null) {
            this.f27309p = new C2611C();
        }
        m29735c0(this.f27309p, bVar);
    }

    /* JADX INFO: renamed from: L */
    void m29747L(boolean z7) {
        this.f27305l = z7;
    }

    /* JADX INFO: renamed from: M */
    void m29748M(int i7) {
        this.f27303j = i7;
    }

    /* JADX INFO: renamed from: N */
    void m29749N(C6786f.a aVar) {
        this.f27296c = aVar;
    }

    /* JADX INFO: renamed from: O */
    void m29750O(Executor executor) {
        this.f27295b = executor;
    }

    /* JADX INFO: renamed from: P */
    void m29751P(boolean z7) {
        this.f27306m = z7;
    }

    /* JADX INFO: renamed from: Q */
    void m29752Q(C6786f.c cVar) {
        this.f27298e = cVar;
    }

    /* JADX INFO: renamed from: R */
    void m29753R(boolean z7) {
        this.f27307n = z7;
    }

    /* JADX INFO: renamed from: S */
    void m29754S(boolean z7) {
        if (this.f27315v == null) {
            this.f27315v = new C2611C();
        }
        m29735c0(this.f27315v, Boolean.valueOf(z7));
    }

    /* JADX INFO: renamed from: T */
    void m29755T(boolean z7) {
        this.f27314u = z7;
    }

    /* JADX INFO: renamed from: U */
    void m29756U(CharSequence charSequence) {
        if (this.f27318y == null) {
            this.f27318y = new C2611C();
        }
        m29735c0(this.f27318y, charSequence);
    }

    /* JADX INFO: renamed from: V */
    void m29757V(int i7) {
        this.f27316w = i7;
    }

    /* JADX INFO: renamed from: W */
    void m29758W(int i7) {
        if (this.f27317x == null) {
            this.f27317x = new C2611C();
        }
        m29735c0(this.f27317x, Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: X */
    void m29759X(boolean z7) {
        this.f27308o = z7;
    }

    /* JADX INFO: renamed from: Y */
    void m29760Y(boolean z7) {
        if (this.f27313t == null) {
            this.f27313t = new C2611C();
        }
        m29735c0(this.f27313t, Boolean.valueOf(z7));
    }

    /* JADX INFO: renamed from: Z */
    void m29761Z(CharSequence charSequence) {
        this.f27302i = charSequence;
    }

    /* JADX INFO: renamed from: a0 */
    void m29762a0(C6786f.d dVar) {
        this.f27297d = dVar;
    }

    /* JADX INFO: renamed from: b0 */
    void m29763b0(boolean z7) {
        this.f27304k = z7;
    }

    /* JADX INFO: renamed from: e */
    int m29764e() {
        C6786f.d dVar = this.f27297d;
        if (dVar != null) {
            return AbstractC6782b.m29633b(dVar, this.f27298e);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    C6781a m29765f() {
        if (this.f27299f == null) {
            this.f27299f = new C6781a(new b(this));
        }
        return this.f27299f;
    }

    /* JADX INFO: renamed from: g */
    C2611C m29766g() {
        if (this.f27310q == null) {
            this.f27310q = new C2611C();
        }
        return this.f27310q;
    }

    /* JADX INFO: renamed from: h */
    AbstractC2664z m29767h() {
        if (this.f27311r == null) {
            this.f27311r = new C2611C();
        }
        return this.f27311r;
    }

    /* JADX INFO: renamed from: i */
    AbstractC2664z m29768i() {
        if (this.f27309p == null) {
            this.f27309p = new C2611C();
        }
        return this.f27309p;
    }

    /* JADX INFO: renamed from: j */
    int m29769j() {
        return this.f27303j;
    }

    /* JADX INFO: renamed from: k */
    C6788h m29770k() {
        if (this.f27300g == null) {
            this.f27300g = new C6788h();
        }
        return this.f27300g;
    }

    /* JADX INFO: renamed from: l */
    C6786f.a m29771l() {
        if (this.f27296c == null) {
            this.f27296c = new a();
        }
        return this.f27296c;
    }

    /* JADX INFO: renamed from: m */
    Executor m29772m() {
        Executor executor = this.f27295b;
        return executor != null ? executor : new c();
    }

    /* JADX INFO: renamed from: n */
    C6786f.c m29773n() {
        return this.f27298e;
    }

    /* JADX INFO: renamed from: o */
    CharSequence m29774o() {
        C6786f.d dVar = this.f27297d;
        if (dVar != null) {
            return dVar.m29725b();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    AbstractC2664z m29775p() {
        if (this.f27318y == null) {
            this.f27318y = new C2611C();
        }
        return this.f27318y;
    }

    /* JADX INFO: renamed from: q */
    int m29776q() {
        return this.f27316w;
    }

    /* JADX INFO: renamed from: r */
    AbstractC2664z m29777r() {
        if (this.f27317x == null) {
            this.f27317x = new C2611C();
        }
        return this.f27317x;
    }

    /* JADX INFO: renamed from: s */
    int m29778s() {
        int iM29764e = m29764e();
        return (!AbstractC6782b.m29635d(iM29764e) || AbstractC6782b.m29634c(iM29764e)) ? -1 : 2;
    }

    /* JADX INFO: renamed from: t */
    DialogInterface.OnClickListener m29779t() {
        if (this.f27301h == null) {
            this.f27301h = new d(this);
        }
        return this.f27301h;
    }

    /* JADX INFO: renamed from: u */
    CharSequence m29780u() {
        CharSequence charSequence = this.f27302i;
        if (charSequence != null) {
            return charSequence;
        }
        C6786f.d dVar = this.f27297d;
        if (dVar != null) {
            return dVar.m29726c();
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    CharSequence m29781v() {
        C6786f.d dVar = this.f27297d;
        if (dVar != null) {
            return dVar.m29727d();
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    CharSequence m29782w() {
        C6786f.d dVar = this.f27297d;
        if (dVar != null) {
            return dVar.m29728e();
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    AbstractC2664z m29783x() {
        if (this.f27312s == null) {
            this.f27312s = new C2611C();
        }
        return this.f27312s;
    }

    /* JADX INFO: renamed from: y */
    boolean m29784y() {
        return this.f27305l;
    }

    /* JADX INFO: renamed from: z */
    boolean m29785z() {
        C6786f.d dVar = this.f27297d;
        return dVar == null || dVar.m29729f();
    }
}
