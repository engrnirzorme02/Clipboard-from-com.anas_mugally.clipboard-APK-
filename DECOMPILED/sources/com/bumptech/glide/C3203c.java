package com.bumptech.glide;

import android.content.Context;
import androidx.collection.C2390a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p035E1.C0290k;
import p043F1.C0407e;
import p043F1.C0411i;
import p043F1.C0412j;
import p043F1.InterfaceC0404b;
import p043F1.InterfaceC0406d;
import p051G1.C0475f;
import p051G1.C0476g;
import p051G1.C0478i;
import p051G1.InterfaceC0470a;
import p051G1.InterfaceC0477h;
import p059H1.ExecutorServiceC0494a;
import p134R1.C1312e;
import p134R1.C1322o;
import p134R1.InterfaceC1310c;
import p141S1.AbstractC1386a;
import p155U1.C1663f;

/* JADX INFO: renamed from: com.bumptech.glide.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3203c {

    /* JADX INFO: renamed from: c */
    private C0290k f13694c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0406d f13695d;

    /* JADX INFO: renamed from: e */
    private InterfaceC0404b f13696e;

    /* JADX INFO: renamed from: f */
    private InterfaceC0477h f13697f;

    /* JADX INFO: renamed from: g */
    private ExecutorServiceC0494a f13698g;

    /* JADX INFO: renamed from: h */
    private ExecutorServiceC0494a f13699h;

    /* JADX INFO: renamed from: i */
    private InterfaceC0470a.a f13700i;

    /* JADX INFO: renamed from: j */
    private C0478i f13701j;

    /* JADX INFO: renamed from: k */
    private InterfaceC1310c f13702k;

    /* JADX INFO: renamed from: n */
    private C1322o.b f13705n;

    /* JADX INFO: renamed from: o */
    private ExecutorServiceC0494a f13706o;

    /* JADX INFO: renamed from: p */
    private boolean f13707p;

    /* JADX INFO: renamed from: q */
    private List f13708q;

    /* JADX INFO: renamed from: a */
    private final Map f13692a = new C2390a();

    /* JADX INFO: renamed from: b */
    private final C3205e.a f13693b = new C3205e.a();

    /* JADX INFO: renamed from: l */
    private int f13703l = 4;

    /* JADX INFO: renamed from: m */
    private ComponentCallbacks2C3202b.a f13704m = new a();

    /* JADX INFO: renamed from: com.bumptech.glide.c$a */
    class a implements ComponentCallbacks2C3202b.a {
        a() {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C3202b.a
        /* JADX INFO: renamed from: a */
        public C1663f mo17008a() {
            return new C1663f();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$b */
    static final class b {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$c */
    public static final class c {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$d */
    public static final class d {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.c$e */
    public static final class e {
    }

    /* JADX INFO: renamed from: a */
    ComponentCallbacks2C3202b m17009a(Context context, List list, AbstractC1386a abstractC1386a) {
        if (this.f13698g == null) {
            this.f13698g = ExecutorServiceC0494a.m2099o0();
        }
        if (this.f13699h == null) {
            this.f13699h = ExecutorServiceC0494a.m2095d0();
        }
        if (this.f13706o == null) {
            this.f13706o = ExecutorServiceC0494a.m2093J();
        }
        if (this.f13701j == null) {
            this.f13701j = new C0478i.a(context).m2056a();
        }
        if (this.f13702k == null) {
            this.f13702k = new C1312e();
        }
        if (this.f13695d == null) {
            int iM2054b = this.f13701j.m2054b();
            if (iM2054b > 0) {
                this.f13695d = new C0412j(iM2054b);
            } else {
                this.f13695d = new C0407e();
            }
        }
        if (this.f13696e == null) {
            this.f13696e = new C0411i(this.f13701j.m2053a());
        }
        if (this.f13697f == null) {
            this.f13697f = new C0476g(this.f13701j.m2055d());
        }
        if (this.f13700i == null) {
            this.f13700i = new C0475f(context);
        }
        if (this.f13694c == null) {
            this.f13694c = new C0290k(this.f13697f, this.f13700i, this.f13699h, this.f13698g, ExecutorServiceC0494a.m2100p0(), this.f13706o, this.f13707p);
        }
        List list2 = this.f13708q;
        if (list2 == null) {
            this.f13708q = Collections.EMPTY_LIST;
        } else {
            this.f13708q = Collections.unmodifiableList(list2);
        }
        return new ComponentCallbacks2C3202b(context, this.f13694c, this.f13697f, this.f13695d, this.f13696e, new C1322o(this.f13705n), this.f13702k, this.f13703l, this.f13704m, this.f13692a, this.f13708q, list, abstractC1386a, this.f13693b.m17022b());
    }

    /* JADX INFO: renamed from: b */
    void m17010b(C1322o.b bVar) {
        this.f13705n = bVar;
    }
}
