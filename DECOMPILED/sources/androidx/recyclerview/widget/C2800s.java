package androidx.recyclerview.widget;

import androidx.collection.C2397h;
import androidx.collection.C2400k;
import p104N.C0908e;
import p104N.InterfaceC0907d;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s */
/* JADX INFO: loaded from: classes.dex */
class C2800s {

    /* JADX INFO: renamed from: a */
    final C2400k f11256a = new C2400k();

    /* JADX INFO: renamed from: b */
    final C2397h f11257b = new C2397h();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$a */
    static class a {

        /* JADX INFO: renamed from: d */
        static InterfaceC0907d f11258d = new C0908e(20);

        /* JADX INFO: renamed from: a */
        int f11259a;

        /* JADX INFO: renamed from: b */
        RecyclerView.AbstractC2762m.c f11260b;

        /* JADX INFO: renamed from: c */
        RecyclerView.AbstractC2762m.c f11261c;

        private a() {
        }

        /* JADX INFO: renamed from: a */
        static void m13923a() {
            while (f11258d.mo4131b() != null) {
            }
        }

        /* JADX INFO: renamed from: b */
        static a m13924b() {
            a aVar = (a) f11258d.mo4131b();
            return aVar == null ? new a() : aVar;
        }

        /* JADX INFO: renamed from: c */
        static void m13925c(a aVar) {
            aVar.f11259a = 0;
            aVar.f11260b = null;
            aVar.f11261c = null;
            f11258d.mo4130a(aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$b */
    interface b {
        /* JADX INFO: renamed from: a */
        void mo13291a(RecyclerView.AbstractC2749E abstractC2749E);

        /* JADX INFO: renamed from: b */
        void mo13292b(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar, RecyclerView.AbstractC2762m.c cVar2);

        /* JADX INFO: renamed from: c */
        void mo13293c(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar, RecyclerView.AbstractC2762m.c cVar2);

        /* JADX INFO: renamed from: d */
        void mo13294d(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar, RecyclerView.AbstractC2762m.c cVar2);
    }

    C2800s() {
    }

    /* JADX INFO: renamed from: l */
    private RecyclerView.AbstractC2762m.c m13906l(RecyclerView.AbstractC2749E abstractC2749E, int i7) {
        a aVar;
        RecyclerView.AbstractC2762m.c cVar;
        int iM10299d = this.f11256a.m10299d(abstractC2749E);
        if (iM10299d >= 0 && (aVar = (a) this.f11256a.m10301k(iM10299d)) != null) {
            int i8 = aVar.f11259a;
            if ((i8 & i7) != 0) {
                int i9 = (~i7) & i8;
                aVar.f11259a = i9;
                if (i7 == 4) {
                    cVar = aVar.f11260b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVar.f11261c;
                }
                if ((i9 & 12) == 0) {
                    this.f11256a.mo8381h(iM10299d);
                    a.m13925c(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    void m13907a(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar) {
        a aVarM13924b = (a) this.f11256a.get(abstractC2749E);
        if (aVarM13924b == null) {
            aVarM13924b = a.m13924b();
            this.f11256a.put(abstractC2749E, aVarM13924b);
        }
        aVarM13924b.f11259a |= 2;
        aVarM13924b.f11260b = cVar;
    }

    /* JADX INFO: renamed from: b */
    void m13908b(RecyclerView.AbstractC2749E abstractC2749E) {
        a aVarM13924b = (a) this.f11256a.get(abstractC2749E);
        if (aVarM13924b == null) {
            aVarM13924b = a.m13924b();
            this.f11256a.put(abstractC2749E, aVarM13924b);
        }
        aVarM13924b.f11259a |= 1;
    }

    /* JADX INFO: renamed from: c */
    void m13909c(long j7, RecyclerView.AbstractC2749E abstractC2749E) {
        this.f11257b.m10288h(j7, abstractC2749E);
    }

    /* JADX INFO: renamed from: d */
    void m13910d(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar) {
        a aVarM13924b = (a) this.f11256a.get(abstractC2749E);
        if (aVarM13924b == null) {
            aVarM13924b = a.m13924b();
            this.f11256a.put(abstractC2749E, aVarM13924b);
        }
        aVarM13924b.f11261c = cVar;
        aVarM13924b.f11259a |= 8;
    }

    /* JADX INFO: renamed from: e */
    void m13911e(RecyclerView.AbstractC2749E abstractC2749E, RecyclerView.AbstractC2762m.c cVar) {
        a aVarM13924b = (a) this.f11256a.get(abstractC2749E);
        if (aVarM13924b == null) {
            aVarM13924b = a.m13924b();
            this.f11256a.put(abstractC2749E, aVarM13924b);
        }
        aVarM13924b.f11260b = cVar;
        aVarM13924b.f11259a |= 4;
    }

    /* JADX INFO: renamed from: f */
    void m13912f() {
        this.f11256a.clear();
        this.f11257b.m10281a();
    }

    /* JADX INFO: renamed from: g */
    RecyclerView.AbstractC2749E m13913g(long j7) {
        return (RecyclerView.AbstractC2749E) this.f11257b.m10284d(j7);
    }

    /* JADX INFO: renamed from: h */
    boolean m13914h(RecyclerView.AbstractC2749E abstractC2749E) {
        a aVar = (a) this.f11256a.get(abstractC2749E);
        return (aVar == null || (aVar.f11259a & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    boolean m13915i(RecyclerView.AbstractC2749E abstractC2749E) {
        a aVar = (a) this.f11256a.get(abstractC2749E);
        return (aVar == null || (aVar.f11259a & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    void m13916j() {
        a.m13923a();
    }

    /* JADX INFO: renamed from: k */
    public void m13917k(RecyclerView.AbstractC2749E abstractC2749E) {
        m13921p(abstractC2749E);
    }

    /* JADX INFO: renamed from: m */
    RecyclerView.AbstractC2762m.c m13918m(RecyclerView.AbstractC2749E abstractC2749E) {
        return m13906l(abstractC2749E, 8);
    }

    /* JADX INFO: renamed from: n */
    RecyclerView.AbstractC2762m.c m13919n(RecyclerView.AbstractC2749E abstractC2749E) {
        return m13906l(abstractC2749E, 4);
    }

    /* JADX INFO: renamed from: o */
    void m13920o(b bVar) {
        for (int size = this.f11256a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC2749E abstractC2749E = (RecyclerView.AbstractC2749E) this.f11256a.m10300f(size);
            a aVar = (a) this.f11256a.mo8381h(size);
            int i7 = aVar.f11259a;
            if ((i7 & 3) == 3) {
                bVar.mo13291a(abstractC2749E);
            } else if ((i7 & 1) != 0) {
                RecyclerView.AbstractC2762m.c cVar = aVar.f11260b;
                if (cVar == null) {
                    bVar.mo13291a(abstractC2749E);
                } else {
                    bVar.mo13293c(abstractC2749E, cVar, aVar.f11261c);
                }
            } else if ((i7 & 14) == 14) {
                bVar.mo13292b(abstractC2749E, aVar.f11260b, aVar.f11261c);
            } else if ((i7 & 12) == 12) {
                bVar.mo13294d(abstractC2749E, aVar.f11260b, aVar.f11261c);
            } else if ((i7 & 4) != 0) {
                bVar.mo13293c(abstractC2749E, aVar.f11260b, null);
            } else if ((i7 & 8) != 0) {
                bVar.mo13292b(abstractC2749E, aVar.f11260b, aVar.f11261c);
            }
            a.m13925c(aVar);
        }
    }

    /* JADX INFO: renamed from: p */
    void m13921p(RecyclerView.AbstractC2749E abstractC2749E) {
        a aVar = (a) this.f11256a.get(abstractC2749E);
        if (aVar == null) {
            return;
        }
        aVar.f11259a &= -2;
    }

    /* JADX INFO: renamed from: q */
    void m13922q(RecyclerView.AbstractC2749E abstractC2749E) {
        for (int iM10291k = this.f11257b.m10291k() - 1; iM10291k >= 0; iM10291k--) {
            if (abstractC2749E == this.f11257b.m10292l(iM10291k)) {
                this.f11257b.m10290j(iM10291k);
                break;
            }
        }
        a aVar = (a) this.f11256a.remove(abstractC2749E);
        if (aVar != null) {
            a.m13925c(aVar);
        }
    }
}
