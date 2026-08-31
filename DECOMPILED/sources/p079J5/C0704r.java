package p079J5;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import p072I6.C0648e;
import p095L5.InterfaceC0847c;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.r */
/* JADX INFO: loaded from: classes.dex */
class C0704r {

    /* JADX INFO: renamed from: a */
    private final d f2860a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0847c f2861b;

    /* JADX INFO: renamed from: c */
    private int f2862c = 65535;

    /* JADX INFO: renamed from: d */
    private final c f2863d = new c(0, 65535, null);

    /* JADX INFO: renamed from: J5.r$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        void m3418b(int i7);
    }

    /* JADX INFO: renamed from: J5.r$c */
    public final class c {

        /* JADX INFO: renamed from: b */
        private Runnable f2865b;

        /* JADX INFO: renamed from: c */
        private final int f2866c;

        /* JADX INFO: renamed from: d */
        private int f2867d;

        /* JADX INFO: renamed from: e */
        private int f2868e;

        /* JADX INFO: renamed from: f */
        private final b f2869f;

        /* JADX INFO: renamed from: a */
        private final C0648e f2864a = new C0648e();

        /* JADX INFO: renamed from: g */
        private boolean f2870g = false;

        c(int i7, int i8, b bVar) {
            this.f2866c = i7;
            this.f2867d = i8;
            this.f2869f = bVar;
        }

        /* JADX INFO: renamed from: a */
        void m3419a(int i7) {
            this.f2868e += i7;
        }

        /* JADX INFO: renamed from: b */
        int m3420b() {
            return this.f2868e;
        }

        /* JADX INFO: renamed from: c */
        void m3421c() {
            this.f2868e = 0;
        }

        /* JADX INFO: renamed from: d */
        void m3422d(C0648e c0648e, int i7, boolean z7) {
            this.f2864a.mo3003I(c0648e, i7);
            this.f2870g |= z7;
        }

        /* JADX INFO: renamed from: e */
        boolean m3423e() {
            return this.f2864a.m3046h1() > 0;
        }

        /* JADX INFO: renamed from: f */
        int m3424f(int i7) {
            if (i7 <= 0 || C3553a.e.API_PRIORITY_OTHER - i7 >= this.f2867d) {
                int i8 = this.f2867d + i7;
                this.f2867d = i8;
                return i8;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f2866c);
        }

        /* JADX INFO: renamed from: g */
        int m3425g() {
            return Math.max(0, Math.min(this.f2867d, (int) this.f2864a.m3046h1()));
        }

        /* JADX INFO: renamed from: h */
        int m3426h() {
            return m3425g() - this.f2868e;
        }

        /* JADX INFO: renamed from: i */
        int m3427i() {
            return this.f2867d;
        }

        /* JADX INFO: renamed from: j */
        int m3428j() {
            return Math.min(this.f2867d, C0704r.this.f2863d.m3427i());
        }

        /* JADX INFO: renamed from: k */
        void m3429k(C0648e c0648e, int i7, boolean z7) {
            do {
                int iMin = Math.min(i7, C0704r.this.f2861b.mo3220E0());
                int i8 = -iMin;
                C0704r.this.f2863d.m3424f(i8);
                m3424f(i8);
                try {
                    C0704r.this.f2861b.mo3226j0(c0648e.m3046h1() == ((long) iMin) && z7, this.f2866c, c0648e, iMin);
                    this.f2869f.m3418b(iMin);
                    i7 -= iMin;
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            } while (i7 > 0);
        }

        /* JADX INFO: renamed from: l */
        int m3430l(int i7, e eVar) {
            Runnable runnable;
            int iMin = Math.min(i7, m3428j());
            int iM3046h1 = 0;
            while (m3423e() && iMin > 0) {
                if (iMin >= this.f2864a.m3046h1()) {
                    iM3046h1 += (int) this.f2864a.m3046h1();
                    C0648e c0648e = this.f2864a;
                    m3429k(c0648e, (int) c0648e.m3046h1(), this.f2870g);
                } else {
                    iM3046h1 += iMin;
                    m3429k(this.f2864a, iMin, false);
                }
                eVar.m3432b();
                iMin = Math.min(i7 - iM3046h1, m3428j());
            }
            if (!m3423e() && (runnable = this.f2865b) != null) {
                runnable.run();
                this.f2865b = null;
            }
            return iM3046h1;
        }
    }

    /* JADX INFO: renamed from: J5.r$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        c[] mo3345a();
    }

    /* JADX INFO: renamed from: J5.r$e */
    private static final class e {

        /* JADX INFO: renamed from: a */
        int f2872a;

        private e() {
        }

        /* JADX INFO: renamed from: a */
        boolean m3431a() {
            return this.f2872a > 0;
        }

        /* JADX INFO: renamed from: b */
        void m3432b() {
            this.f2872a++;
        }
    }

    public C0704r(d dVar, InterfaceC0847c interfaceC0847c) {
        this.f2860a = (d) AbstractC1209m.m5303o(dVar, "transport");
        this.f2861b = (InterfaceC0847c) AbstractC1209m.m5303o(interfaceC0847c, "frameWriter");
    }

    /* JADX INFO: renamed from: c */
    public c m3412c(b bVar, int i7) {
        return new c(i7, this.f2862c, (b) AbstractC1209m.m5303o(bVar, "stream"));
    }

    /* JADX INFO: renamed from: d */
    public void m3413d(boolean z7, c cVar, C0648e c0648e, boolean z8) {
        AbstractC1209m.m5303o(c0648e, "source");
        int iM3428j = cVar.m3428j();
        boolean zM3423e = cVar.m3423e();
        int iM3046h1 = (int) c0648e.m3046h1();
        if (zM3423e || iM3428j < iM3046h1) {
            if (!zM3423e && iM3428j > 0) {
                cVar.m3429k(c0648e, iM3428j, false);
            }
            cVar.m3422d(c0648e, (int) c0648e.m3046h1(), z7);
        } else {
            cVar.m3429k(c0648e, iM3046h1, z7);
        }
        if (z8) {
            m3414e();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3414e() {
        try {
            this.f2861b.flush();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m3415f(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i7);
        }
        int i8 = i7 - this.f2862c;
        this.f2862c = i7;
        for (c cVar : this.f2860a.mo3345a()) {
            cVar.m3424f(i8);
        }
        return i8 > 0;
    }

    /* JADX INFO: renamed from: g */
    public int m3416g(c cVar, int i7) {
        if (cVar == null) {
            int iM3424f = this.f2863d.m3424f(i7);
            m3417h();
            return iM3424f;
        }
        int iM3424f2 = cVar.m3424f(i7);
        e eVar = new e();
        cVar.m3430l(cVar.m3428j(), eVar);
        if (eVar.m3431a()) {
            m3414e();
        }
        return iM3424f2;
    }

    /* JADX INFO: renamed from: h */
    public void m3417h() {
        int i7;
        c[] cVarArrMo3345a = this.f2860a.mo3345a();
        Collections.shuffle(Arrays.asList(cVarArrMo3345a));
        int iM3427i = this.f2863d.m3427i();
        int length = cVarArrMo3345a.length;
        while (true) {
            i7 = 0;
            if (length <= 0 || iM3427i <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(iM3427i / length);
            for (int i8 = 0; i8 < length && iM3427i > 0; i8++) {
                c cVar = cVarArrMo3345a[i8];
                int iMin = Math.min(iM3427i, Math.min(cVar.m3426h(), iCeil));
                if (iMin > 0) {
                    cVar.m3419a(iMin);
                    iM3427i -= iMin;
                }
                if (cVar.m3426h() > 0) {
                    cVarArrMo3345a[i7] = cVar;
                    i7++;
                }
            }
            length = i7;
        }
        e eVar = new e();
        c[] cVarArrMo3345a2 = this.f2860a.mo3345a();
        int length2 = cVarArrMo3345a2.length;
        while (i7 < length2) {
            c cVar2 = cVarArrMo3345a2[i7];
            cVar2.m3430l(cVar2.m3420b(), eVar);
            cVar2.m3421c();
            i7++;
        }
        if (eVar.m3431a()) {
            m3414e();
        }
    }
}
