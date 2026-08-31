package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p081K.AbstractC0723o;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC2786e implements Runnable {

    /* JADX INFO: renamed from: e */
    static final ThreadLocal f11141e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    static Comparator f11142f = new a();

    /* JADX INFO: renamed from: b */
    long f11144b;

    /* JADX INFO: renamed from: c */
    long f11145c;

    /* JADX INFO: renamed from: a */
    ArrayList f11143a = new ArrayList();

    /* JADX INFO: renamed from: d */
    private ArrayList f11146d = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f11154d;
            if ((recyclerView == null) != (cVar2.f11154d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z7 = cVar.f11151a;
            if (z7 != cVar2.f11151a) {
                return z7 ? -1 : 1;
            }
            int i7 = cVar2.f11152b - cVar.f11152b;
            if (i7 != 0) {
                return i7;
            }
            int i8 = cVar.f11153c - cVar2.f11153c;
            if (i8 != 0) {
                return i8;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$b */
    static class b implements RecyclerView.AbstractC2765p.c {

        /* JADX INFO: renamed from: a */
        int f11147a;

        /* JADX INFO: renamed from: b */
        int f11148b;

        /* JADX INFO: renamed from: c */
        int[] f11149c;

        /* JADX INFO: renamed from: d */
        int f11150d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2765p.c
        /* JADX INFO: renamed from: a */
        public void mo13477a(int i7, int i8) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i8 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i9 = this.f11150d;
            int i10 = i9 * 2;
            int[] iArr = this.f11149c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f11149c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[i9 * 4];
                this.f11149c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f11149c;
            iArr4[i10] = i7;
            iArr4[i10 + 1] = i8;
            this.f11150d++;
        }

        /* JADX INFO: renamed from: b */
        void m13751b() {
            int[] iArr = this.f11149c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11150d = 0;
        }

        /* JADX INFO: renamed from: c */
        void m13752c(RecyclerView recyclerView, boolean z7) {
            this.f11150d = 0;
            int[] iArr = this.f11149c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC2765p abstractC2765p = recyclerView.f10848x;
            if (recyclerView.f10846w == null || abstractC2765p == null || !abstractC2765p.m13470z0()) {
                return;
            }
            if (z7) {
                if (!recyclerView.f10819d.m13670p()) {
                    abstractC2765p.mo13066v(recyclerView.f10846w.mo8548g(), this);
                }
            } else if (!recyclerView.m13186n0()) {
                abstractC2765p.mo13065u(this.f11147a, this.f11148b, recyclerView.f10839s0, this);
            }
            int i7 = this.f11150d;
            if (i7 > abstractC2765p.f10949m) {
                abstractC2765p.f10949m = i7;
                abstractC2765p.f10950n = z7;
                recyclerView.f10815b.m13515K();
            }
        }

        /* JADX INFO: renamed from: d */
        boolean m13753d(int i7) {
            if (this.f11149c != null) {
                int i8 = this.f11150d * 2;
                for (int i9 = 0; i9 < i8; i9 += 2) {
                    if (this.f11149c[i9] == i7) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        void m13754e(int i7, int i8) {
            this.f11147a = i7;
            this.f11148b = i8;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$c */
    static class c {

        /* JADX INFO: renamed from: a */
        public boolean f11151a;

        /* JADX INFO: renamed from: b */
        public int f11152b;

        /* JADX INFO: renamed from: c */
        public int f11153c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f11154d;

        /* JADX INFO: renamed from: e */
        public int f11155e;

        c() {
        }

        /* JADX INFO: renamed from: a */
        public void m13755a() {
            this.f11151a = false;
            this.f11152b = 0;
            this.f11153c = 0;
            this.f11154d = null;
            this.f11155e = 0;
        }
    }

    RunnableC2786e() {
    }

    /* JADX INFO: renamed from: b */
    private void m13740b() {
        c cVar;
        int size = this.f11143a.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView = (RecyclerView) this.f11143a.get(i8);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f10837r0.m13752c(recyclerView, false);
                i7 += recyclerView.f10837r0.f11150d;
            }
        }
        this.f11146d.ensureCapacity(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f11143a.get(i10);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f10837r0;
                int iAbs = Math.abs(bVar.f11147a) + Math.abs(bVar.f11148b);
                for (int i11 = 0; i11 < bVar.f11150d * 2; i11 += 2) {
                    if (i9 >= this.f11146d.size()) {
                        cVar = new c();
                        this.f11146d.add(cVar);
                    } else {
                        cVar = (c) this.f11146d.get(i9);
                    }
                    int[] iArr = bVar.f11149c;
                    int i12 = iArr[i11 + 1];
                    cVar.f11151a = i12 <= iAbs;
                    cVar.f11152b = iAbs;
                    cVar.f11153c = i12;
                    cVar.f11154d = recyclerView2;
                    cVar.f11155e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(this.f11146d, f11142f);
    }

    /* JADX INFO: renamed from: c */
    private void m13741c(c cVar, long j7) {
        RecyclerView.AbstractC2749E abstractC2749EM13745i = m13745i(cVar.f11154d, cVar.f11155e, cVar.f11151a ? Long.MAX_VALUE : j7);
        if (abstractC2749EM13745i == null || abstractC2749EM13745i.f10895b == null || !abstractC2749EM13745i.m13287w() || abstractC2749EM13745i.m13288x()) {
            return;
        }
        m13744h((RecyclerView) abstractC2749EM13745i.f10895b.get(), j7);
    }

    /* JADX INFO: renamed from: d */
    private void m13742d(long j7) {
        for (int i7 = 0; i7 < this.f11146d.size(); i7++) {
            c cVar = (c) this.f11146d.get(i7);
            if (cVar.f11154d == null) {
                return;
            }
            m13741c(cVar, j7);
            cVar.m13755a();
        }
    }

    /* JADX INFO: renamed from: e */
    static boolean m13743e(RecyclerView recyclerView, int i7) {
        int iM13689j = recyclerView.f10821e.m13689j();
        for (int i8 = 0; i8 < iM13689j; i8++) {
            RecyclerView.AbstractC2749E abstractC2749EM13111h0 = RecyclerView.m13111h0(recyclerView.f10821e.m13688i(i8));
            if (abstractC2749EM13111h0.f10896c == i7 && !abstractC2749EM13111h0.m13288x()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    private void m13744h(RecyclerView recyclerView, long j7) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f10804O && recyclerView.f10821e.m13689j() != 0) {
            recyclerView.m13158W0();
        }
        b bVar = recyclerView.f10837r0;
        bVar.m13752c(recyclerView, true);
        if (bVar.f11150d != 0) {
            try {
                AbstractC0723o.m3486a("RV Nested Prefetch");
                recyclerView.f10839s0.m13243f(recyclerView.f10846w);
                for (int i7 = 0; i7 < bVar.f11150d * 2; i7 += 2) {
                    m13745i(recyclerView, bVar.f11149c[i7], j7);
                }
                AbstractC0723o.m3487b();
            } catch (Throwable th) {
                AbstractC0723o.m3487b();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private RecyclerView.AbstractC2749E m13745i(RecyclerView recyclerView, int i7, long j7) {
        if (m13743e(recyclerView, i7)) {
            return null;
        }
        RecyclerView.C2772w c2772w = recyclerView.f10815b;
        try {
            recyclerView.m13139I0();
            RecyclerView.AbstractC2749E abstractC2749EM13513I = c2772w.m13513I(i7, false, j7);
            if (abstractC2749EM13513I != null) {
                if (!abstractC2749EM13513I.m13287w() || abstractC2749EM13513I.m13288x()) {
                    c2772w.m13518a(abstractC2749EM13513I, false);
                } else {
                    c2772w.m13507B(abstractC2749EM13513I.f10894a);
                }
            }
            return abstractC2749EM13513I;
        } finally {
            recyclerView.m13143K0(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m13746a(RecyclerView recyclerView) {
        this.f11143a.add(recyclerView);
    }

    /* JADX INFO: renamed from: f */
    void m13747f(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.isAttachedToWindow() && this.f11144b == 0) {
            this.f11144b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f10837r0.m13754e(i7, i8);
    }

    /* JADX INFO: renamed from: g */
    void m13748g(long j7) {
        m13740b();
        m13742d(j7);
    }

    /* JADX INFO: renamed from: j */
    public void m13749j(RecyclerView recyclerView) {
        this.f11143a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AbstractC0723o.m3486a("RV Prefetch");
            if (!this.f11143a.isEmpty()) {
                int size = this.f11143a.size();
                long jMax = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = (RecyclerView) this.f11143a.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m13748g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f11145c);
                }
            }
        } finally {
            this.f11144b = 0L;
            AbstractC0723o.m3487b();
        }
    }
}
