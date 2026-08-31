package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC2263x;
import androidx.core.content.InterfaceC2437c;
import androidx.core.content.InterfaceC2438d;
import androidx.fragment.app.AbstractC2599q;
import androidx.lifecycle.AbstractC2650l;
import androidx.lifecycle.C2637b0;
import androidx.lifecycle.InterfaceC2639c0;
import androidx.lifecycle.InterfaceC2657s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p010B0.C0047f;
import p010B0.InterfaceC0050i;
import p017C.C0108i;
import p017C.C0118s;
import p017C.InterfaceC0115p;
import p017C.InterfaceC0116q;
import p104N.InterfaceC0904a;
import p111O.InterfaceC1080w;
import p111O.InterfaceC1086z;
import p223d.AbstractC5158A;
import p223d.C5165H;
import p223d.InterfaceC5167J;
import p239f.AbstractC5382c;
import p239f.AbstractC5385f;
import p239f.C5380a;
import p239f.C5387h;
import p239f.InterfaceC5381b;
import p239f.InterfaceC5386g;
import p247g.AbstractC5447a;
import p247g.C5448b;
import p247g.C5449c;
import p248g0.AbstractC5452b;
import p256h0.AbstractC5540k;
import p256h0.InterfaceC5546q;
import p264i0.C5662c;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2599q {

    /* JADX INFO: renamed from: S */
    private static boolean f10237S = false;

    /* JADX INFO: renamed from: D */
    private AbstractC5382c f10241D;

    /* JADX INFO: renamed from: E */
    private AbstractC5382c f10242E;

    /* JADX INFO: renamed from: F */
    private AbstractC5382c f10243F;

    /* JADX INFO: renamed from: H */
    private boolean f10245H;

    /* JADX INFO: renamed from: I */
    private boolean f10246I;

    /* JADX INFO: renamed from: J */
    private boolean f10247J;

    /* JADX INFO: renamed from: K */
    private boolean f10248K;

    /* JADX INFO: renamed from: L */
    private boolean f10249L;

    /* JADX INFO: renamed from: M */
    private ArrayList f10250M;

    /* JADX INFO: renamed from: N */
    private ArrayList f10251N;

    /* JADX INFO: renamed from: O */
    private ArrayList f10252O;

    /* JADX INFO: renamed from: P */
    private C2602t f10253P;

    /* JADX INFO: renamed from: Q */
    private C5662c.c f10254Q;

    /* JADX INFO: renamed from: b */
    private boolean f10257b;

    /* JADX INFO: renamed from: d */
    ArrayList f10259d;

    /* JADX INFO: renamed from: e */
    private ArrayList f10260e;

    /* JADX INFO: renamed from: g */
    private C5165H f10262g;

    /* JADX INFO: renamed from: m */
    private ArrayList f10268m;

    /* JADX INFO: renamed from: v */
    private AbstractC2596n f10277v;

    /* JADX INFO: renamed from: w */
    private AbstractC5540k f10278w;

    /* JADX INFO: renamed from: x */
    private AbstractComponentCallbacksC2591i f10279x;

    /* JADX INFO: renamed from: y */
    AbstractComponentCallbacksC2591i f10280y;

    /* JADX INFO: renamed from: a */
    private final ArrayList f10256a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final C2605w f10258c = new C2605w();

    /* JADX INFO: renamed from: f */
    private final LayoutInflaterFactory2C2597o f10261f = new LayoutInflaterFactory2C2597o(this);

    /* JADX INFO: renamed from: h */
    private final AbstractC5158A f10263h = new b(false);

    /* JADX INFO: renamed from: i */
    private final AtomicInteger f10264i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    private final Map f10265j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    private final Map f10266k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l */
    private final Map f10267l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    private final C2598p f10269n = new C2598p(this);

    /* JADX INFO: renamed from: o */
    private final CopyOnWriteArrayList f10270o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p */
    private final InterfaceC0904a f10271p = new InterfaceC0904a() { // from class: h0.l
        @Override // p104N.InterfaceC0904a
        public final void accept(Object obj) {
            AbstractC2599q.m12305e(this.f21373a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: q */
    private final InterfaceC0904a f10272q = new InterfaceC0904a() { // from class: h0.m
        @Override // p104N.InterfaceC0904a
        public final void accept(Object obj) {
            AbstractC2599q.m12298a(this.f21374a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: r */
    private final InterfaceC0904a f10273r = new InterfaceC0904a() { // from class: h0.n
        @Override // p104N.InterfaceC0904a
        public final void accept(Object obj) {
            AbstractC2599q.m12303d(this.f21375a, (C0108i) obj);
        }
    };

    /* JADX INFO: renamed from: s */
    private final InterfaceC0904a f10274s = new InterfaceC0904a() { // from class: h0.o
        @Override // p104N.InterfaceC0904a
        public final void accept(Object obj) {
            AbstractC2599q.m12301c(this.f21376a, (C0118s) obj);
        }
    };

    /* JADX INFO: renamed from: t */
    private final InterfaceC1086z f10275t = new c();

    /* JADX INFO: renamed from: u */
    int f10276u = -1;

    /* JADX INFO: renamed from: z */
    private AbstractC2595m f10281z = null;

    /* JADX INFO: renamed from: A */
    private AbstractC2595m f10238A = new d();

    /* JADX INFO: renamed from: B */
    private InterfaceC2581G f10239B = null;

    /* JADX INFO: renamed from: C */
    private InterfaceC2581G f10240C = new e();

    /* JADX INFO: renamed from: G */
    ArrayDeque f10244G = new ArrayDeque();

    /* JADX INFO: renamed from: R */
    private Runnable f10255R = new f();

    /* JADX INFO: renamed from: androidx.fragment.app.q$a */
    class a implements InterfaceC5381b {
        a() {
        }

        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo12412a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            l lVar = (l) AbstractC2599q.this.f10244G.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f10292a;
            int i8 = lVar.f10293b;
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12487i = AbstractC2599q.this.f10258c.m12487i(str);
            if (abstractComponentCallbacksC2591iM12487i != null) {
                abstractComponentCallbacksC2591iM12487i.mo679P0(i8, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$b */
    class b extends AbstractC5158A {
        b(boolean z7) {
            super(z7);
        }

        @Override // p223d.AbstractC5158A
        /* JADX INFO: renamed from: d */
        public void mo363d() {
            AbstractC2599q.this.m12334E0();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$c */
    class c implements InterfaceC1086z {
        c() {
        }

        @Override // p111O.InterfaceC1086z
        /* JADX INFO: renamed from: a */
        public boolean mo4806a(MenuItem menuItem) {
            return AbstractC2599q.this.m12341I(menuItem);
        }

        @Override // p111O.InterfaceC1086z
        /* JADX INFO: renamed from: b */
        public void mo4807b(Menu menu) {
            AbstractC2599q.this.m12342J(menu);
        }

        @Override // p111O.InterfaceC1086z
        /* JADX INFO: renamed from: c */
        public void mo4808c(Menu menu, MenuInflater menuInflater) {
            AbstractC2599q.this.m12328B(menu, menuInflater);
        }

        @Override // p111O.InterfaceC1086z
        /* JADX INFO: renamed from: d */
        public void mo4809d(Menu menu) {
            AbstractC2599q.this.m12347N(menu);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$d */
    class d extends AbstractC2595m {
        d() {
        }

        @Override // androidx.fragment.app.AbstractC2595m
        /* JADX INFO: renamed from: a */
        public AbstractComponentCallbacksC2591i mo12267a(ClassLoader classLoader, String str) {
            return AbstractC2599q.this.m12403v0().m24930c(AbstractC2599q.this.m12403v0().m12269j(), str, null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$e */
    class e implements InterfaceC2581G {
        e() {
        }

        @Override // androidx.fragment.app.InterfaceC2581G
        /* JADX INFO: renamed from: a */
        public AbstractC2579F mo12011a(ViewGroup viewGroup) {
            return new C2588f(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$f */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2599q.this.m12366Z(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$g */
    class g implements InterfaceC5546q {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractComponentCallbacksC2591i f10288a;

        g(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
            this.f10288a = abstractComponentCallbacksC2591i;
        }

        @Override // p256h0.InterfaceC5546q
        /* JADX INFO: renamed from: a */
        public void mo12237a(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
            this.f10288a.m12202t0(abstractComponentCallbacksC2591i);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$h */
    class h implements InterfaceC5381b {
        h() {
        }

        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo12412a(C5380a c5380a) {
            l lVar = (l) AbstractC2599q.this.f10244G.pollLast();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f10292a;
            int i7 = lVar.f10293b;
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12487i = AbstractC2599q.this.f10258c.m12487i(str);
            if (abstractComponentCallbacksC2591iM12487i != null) {
                abstractComponentCallbacksC2591iM12487i.mo12194q0(i7, c5380a.m24390b(), c5380a.m24389a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$i */
    class i implements InterfaceC5381b {
        i() {
        }

        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo12412a(C5380a c5380a) {
            l lVar = (l) AbstractC2599q.this.f10244G.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f10292a;
            int i7 = lVar.f10293b;
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12487i = AbstractC2599q.this.f10258c.m12487i(str);
            if (abstractComponentCallbacksC2591iM12487i != null) {
                abstractComponentCallbacksC2591iM12487i.mo12194q0(i7, c5380a.m24390b(), c5380a.m24389a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$j */
    static class j extends AbstractC5447a {
        j() {
        }

        @Override // p247g.AbstractC5447a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent mo12416a(Context context, C5387h c5387h) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentM24416a = c5387h.m24416a();
            if (intentM24416a != null && (bundleExtra = intentM24416a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentM24416a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentM24416a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c5387h = new C5387h.a(c5387h.m24419d()).m24421b(null).m24422c(c5387h.m24418c(), c5387h.m24417b()).m24420a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c5387h);
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // p247g.AbstractC5447a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C5380a mo12417c(int i7, Intent intent) {
            return new C5380a(i7, intent);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$k */
    public static abstract class k {
        /* JADX INFO: renamed from: a */
        public void m12420a(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle) {
        }

        /* JADX INFO: renamed from: b */
        public void m12421b(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Context context) {
        }

        /* JADX INFO: renamed from: c */
        public void m12422c(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle) {
        }

        /* JADX INFO: renamed from: d */
        public void m12423d(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        }

        /* JADX INFO: renamed from: e */
        public void m12424e(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        }

        /* JADX INFO: renamed from: f */
        public void m12425f(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        }

        /* JADX INFO: renamed from: g */
        public void m12426g(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Context context) {
        }

        /* JADX INFO: renamed from: h */
        public void m12427h(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle) {
        }

        /* JADX INFO: renamed from: i */
        public void m12428i(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        }

        /* JADX INFO: renamed from: j */
        public void m12429j(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Bundle bundle) {
        }

        /* JADX INFO: renamed from: k */
        public void m12430k(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        }

        /* JADX INFO: renamed from: l */
        public void m12431l(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        }

        /* JADX INFO: renamed from: m */
        public abstract void mo3688m(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, View view, Bundle bundle);

        /* JADX INFO: renamed from: n */
        public void m12432n(AbstractC2599q abstractC2599q, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$m */
    interface m {
        /* JADX INFO: renamed from: a */
        boolean mo12015a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$n */
    private class n implements m {

        /* JADX INFO: renamed from: a */
        final String f10294a;

        /* JADX INFO: renamed from: b */
        final int f10295b;

        /* JADX INFO: renamed from: c */
        final int f10296c;

        n(String str, int i7, int i8) {
            this.f10294a = str;
            this.f10295b = i7;
            this.f10296c = i8;
        }

        @Override // androidx.fragment.app.AbstractC2599q.m
        /* JADX INFO: renamed from: a */
        public boolean mo12015a(ArrayList arrayList, ArrayList arrayList2) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = AbstractC2599q.this.f10280y;
            if (abstractComponentCallbacksC2591i == null || this.f10295b >= 0 || this.f10294a != null || !abstractComponentCallbacksC2591i.m12201t().m12363W0()) {
                return AbstractC2599q.this.m12367Z0(arrayList, arrayList2, this.f10294a, this.f10295b, this.f10296c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: C0 */
    static AbstractComponentCallbacksC2591i m12288C0(View view) {
        Object tag = view.getTag(AbstractC5452b.f20750a);
        if (tag instanceof AbstractComponentCallbacksC2591i) {
            return (AbstractComponentCallbacksC2591i) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public static boolean m12289I0(int i7) {
        return f10237S || Log.isLoggable("FragmentManager", i7);
    }

    /* JADX INFO: renamed from: J0 */
    private boolean m12290J0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        return (abstractComponentCallbacksC2591i.f10134P && abstractComponentCallbacksC2591i.f10135Q) || abstractComponentCallbacksC2591i.f10125G.m12393o();
    }

    /* JADX INFO: renamed from: K */
    private void m12291K(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i == null || !abstractComponentCallbacksC2591i.equals(m12373e0(abstractComponentCallbacksC2591i.f10155f))) {
            return;
        }
        abstractComponentCallbacksC2591i.m12192o1();
    }

    /* JADX INFO: renamed from: K0 */
    private boolean m12292K0() {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10279x;
        if (abstractComponentCallbacksC2591i == null) {
            return true;
        }
        return abstractComponentCallbacksC2591i.m12169g0() && this.f10279x.m12132K().m12292K0();
    }

    /* JADX INFO: renamed from: R */
    private void m12293R(int i7) {
        try {
            this.f10257b = true;
            this.f10258c.m12482d(i7);
            m12355R0(i7, false);
            Iterator it = m12322s().iterator();
            while (it.hasNext()) {
                ((AbstractC2579F) it.next()).m11981n();
            }
            this.f10257b = false;
            m12366Z(true);
        } catch (Throwable th) {
            this.f10257b = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: U */
    private void m12294U() {
        if (this.f10249L) {
            this.f10249L = false;
            m12319q1();
        }
    }

    /* JADX INFO: renamed from: W */
    private void m12295W() {
        Iterator it = m12322s().iterator();
        while (it.hasNext()) {
            ((AbstractC2579F) it.next()).m11981n();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m12296Y(boolean z7) {
        if (this.f10257b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f10277v == null) {
            if (!this.f10248K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f10277v.m12270k().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7) {
            m12316p();
        }
        if (this.f10250M == null) {
            this.f10250M = new ArrayList();
            this.f10251N = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    private boolean m12297Y0(String str, int i7, int i8) {
        m12366Z(false);
        m12296Y(true);
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10280y;
        if (abstractComponentCallbacksC2591i != null && i7 < 0 && str == null && abstractComponentCallbacksC2591i.m12201t().m12363W0()) {
            return true;
        }
        boolean zM12367Z0 = m12367Z0(this.f10250M, this.f10251N, str, i7, i8);
        if (zM12367Z0) {
            this.f10257b = true;
            try {
                m12304d1(this.f10250M, this.f10251N);
                m12318q();
            } catch (Throwable th) {
                m12318q();
                throw th;
            }
        }
        m12325t1();
        m12294U();
        this.f10258c.m12480b();
        return zM12367Z0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12298a(AbstractC2599q abstractC2599q, Integer num) {
        if (abstractC2599q.m12292K0() && num.intValue() == 80) {
            abstractC2599q.m12333E(false);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private static void m12300b0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        while (i7 < i8) {
            C2583a c2583a = (C2583a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                c2583a.m12025t(-1);
                c2583a.m12030y();
            } else {
                c2583a.m12025t(1);
                c2583a.m12029x();
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12301c(AbstractC2599q abstractC2599q, C0118s c0118s) {
        if (abstractC2599q.m12292K0()) {
            abstractC2599q.m12345M(c0118s.m565a(), false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m12302c0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        ArrayList arrayList3;
        boolean z7 = ((C2583a) arrayList.get(i7)).f10357r;
        ArrayList arrayList4 = this.f10252O;
        if (arrayList4 == null) {
            this.f10252O = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f10252O.addAll(this.f10258c.m12493o());
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12411z0 = m12411z0();
        boolean z8 = false;
        for (int i9 = i7; i9 < i8; i9++) {
            C2583a c2583a = (C2583a) arrayList.get(i9);
            abstractComponentCallbacksC2591iM12411z0 = !((Boolean) arrayList2.get(i9)).booleanValue() ? c2583a.m12031z(this.f10252O, abstractComponentCallbacksC2591iM12411z0) : c2583a.m12014C(this.f10252O, abstractComponentCallbacksC2591iM12411z0);
            z8 = z8 || c2583a.f10348i;
        }
        this.f10252O.clear();
        if (!z7 && this.f10276u >= 1) {
            for (int i10 = i7; i10 < i8; i10++) {
                Iterator it = ((C2583a) arrayList.get(i10)).f10342c.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = ((AbstractC2606x.a) it.next()).f10360b;
                    if (abstractComponentCallbacksC2591i != null && abstractComponentCallbacksC2591i.f10123E != null) {
                        this.f10258c.m12496r(m12400u(abstractComponentCallbacksC2591i));
                    }
                }
            }
        }
        m12300b0(arrayList, arrayList2, i7, i8);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
        if (z8 && (arrayList3 = this.f10268m) != null && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m12313m0((C2583a) it2.next()));
            }
            Iterator it3 = this.f10268m.iterator();
            while (it3.hasNext()) {
                AbstractC2263x.m9328a(it3.next());
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
            Iterator it5 = this.f10268m.iterator();
            while (it5.hasNext()) {
                AbstractC2263x.m9328a(it5.next());
                Iterator it6 = linkedHashSet.iterator();
                if (it6.hasNext()) {
                    throw null;
                }
            }
        }
        for (int i11 = i7; i11 < i8; i11++) {
            C2583a c2583a2 = (C2583a) arrayList.get(i11);
            if (zBooleanValue) {
                for (int size = c2583a2.f10342c.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = ((AbstractC2606x.a) c2583a2.f10342c.get(size)).f10360b;
                    if (abstractComponentCallbacksC2591i2 != null) {
                        m12400u(abstractComponentCallbacksC2591i2).m12467m();
                    }
                }
            } else {
                Iterator it7 = c2583a2.f10342c.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i3 = ((AbstractC2606x.a) it7.next()).f10360b;
                    if (abstractComponentCallbacksC2591i3 != null) {
                        m12400u(abstractComponentCallbacksC2591i3).m12467m();
                    }
                }
            }
        }
        m12355R0(this.f10276u, true);
        for (AbstractC2579F abstractC2579F : m12324t(arrayList, i7, i8)) {
            abstractC2579F.m11986v(zBooleanValue);
            abstractC2579F.m11985t();
            abstractC2579F.m11980k();
        }
        while (i7 < i8) {
            C2583a c2583a3 = (C2583a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue() && c2583a3.f10051v >= 0) {
                c2583a3.f10051v = -1;
            }
            c2583a3.m12013B();
            i7++;
        }
        if (z8) {
            m12308f1();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m12303d(AbstractC2599q abstractC2599q, C0108i c0108i) {
        if (abstractC2599q.m12292K0()) {
            abstractC2599q.m12335F(c0108i.m424a(), false);
        }
    }

    /* JADX INFO: renamed from: d1 */
    private void m12304d1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!((C2583a) arrayList.get(i7)).f10357r) {
                if (i8 != i7) {
                    m12302c0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C2583a) arrayList.get(i8)).f10357r) {
                        i8++;
                    }
                }
                m12302c0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            m12302c0(arrayList, arrayList2, i8, size);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12305e(AbstractC2599q abstractC2599q, Configuration configuration) {
        if (abstractC2599q.m12292K0()) {
            abstractC2599q.m12408y(configuration, false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private int m12307f0(String str, int i7, boolean z7) {
        ArrayList arrayList = this.f10259d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i7 < 0) {
            if (z7) {
                return 0;
            }
            return this.f10259d.size() - 1;
        }
        int size = this.f10259d.size() - 1;
        while (size >= 0) {
            C2583a c2583a = (C2583a) this.f10259d.get(size);
            if ((str != null && str.equals(c2583a.m12012A())) || (i7 >= 0 && i7 == c2583a.f10051v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z7) {
            if (size == this.f10259d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C2583a c2583a2 = (C2583a) this.f10259d.get(size - 1);
            if ((str == null || !str.equals(c2583a2.m12012A())) && (i7 < 0 || i7 != c2583a2.f10051v)) {
                break;
            }
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: f1 */
    private void m12308f1() {
        ArrayList arrayList = this.f10268m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        AbstractC2263x.m9328a(this.f10268m.get(0));
        throw null;
    }

    /* JADX INFO: renamed from: h1 */
    static int m12309h1(int i7) {
        if (i7 == 4097) {
            return 8194;
        }
        if (i7 == 8194) {
            return 4097;
        }
        if (i7 == 8197) {
            return 4100;
        }
        if (i7 != 4099) {
            return i7 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    /* JADX INFO: renamed from: j0 */
    static AbstractC2599q m12310j0(View view) {
        AbstractActivityC2592j abstractActivityC2592j;
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12311k0 = m12311k0(view);
        if (abstractComponentCallbacksC2591iM12311k0 != null) {
            if (abstractComponentCallbacksC2591iM12311k0.m12169g0()) {
                return abstractComponentCallbacksC2591iM12311k0.m12201t();
            }
            throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC2591iM12311k0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                abstractActivityC2592j = null;
                break;
            }
            if (context instanceof AbstractActivityC2592j) {
                abstractActivityC2592j = (AbstractActivityC2592j) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (abstractActivityC2592j != null) {
            return abstractActivityC2592j.m12232H0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    /* JADX INFO: renamed from: k0 */
    static AbstractComponentCallbacksC2591i m12311k0(View view) {
        while (view != null) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12288C0 = m12288C0(view);
            if (abstractComponentCallbacksC2591iM12288C0 != null) {
                return abstractComponentCallbacksC2591iM12288C0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    private void m12312l0() {
        Iterator it = m12322s().iterator();
        while (it.hasNext()) {
            ((AbstractC2579F) it.next()).m11982o();
        }
    }

    /* JADX INFO: renamed from: m0 */
    private Set m12313m0(C2583a c2583a) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c2583a.f10342c.size(); i7++) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = ((AbstractC2606x.a) c2583a.f10342c.get(i7)).f10360b;
            if (abstractComponentCallbacksC2591i != null && c2583a.f10348i) {
                hashSet.add(abstractComponentCallbacksC2591i);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: n0 */
    private boolean m12314n0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f10256a) {
            if (this.f10256a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f10256a.size();
                boolean zMo12015a = false;
                for (int i7 = 0; i7 < size; i7++) {
                    zMo12015a |= ((m) this.f10256a.get(i7)).mo12015a(arrayList, arrayList2);
                }
                this.f10256a.clear();
                this.f10277v.m12270k().removeCallbacks(this.f10255R);
                return zMo12015a;
            } catch (Throwable th) {
                this.f10256a.clear();
                this.f10277v.m12270k().removeCallbacks(this.f10255R);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o1 */
    private void m12315o1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        ViewGroup viewGroupM12323s0 = m12323s0(abstractComponentCallbacksC2591i);
        if (viewGroupM12323s0 == null || abstractComponentCallbacksC2591i.m12207w() + abstractComponentCallbacksC2591i.m12215z() + abstractComponentCallbacksC2591i.m12137M() + abstractComponentCallbacksC2591i.m12140N() <= 0) {
            return;
        }
        int i7 = AbstractC5452b.f20752c;
        if (viewGroupM12323s0.getTag(i7) == null) {
            viewGroupM12323s0.setTag(i7, abstractComponentCallbacksC2591i);
        }
        ((AbstractComponentCallbacksC2591i) viewGroupM12323s0.getTag(i7)).m12131J1(abstractComponentCallbacksC2591i.m12135L());
    }

    /* JADX INFO: renamed from: p */
    private void m12316p() {
        if (m12352P0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: renamed from: p0 */
    private C2602t m12317p0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        return this.f10253P.m12444j(abstractComponentCallbacksC2591i);
    }

    /* JADX INFO: renamed from: q */
    private void m12318q() {
        this.f10257b = false;
        this.f10251N.clear();
        this.f10250M.clear();
    }

    /* JADX INFO: renamed from: q1 */
    private void m12319q1() {
        Iterator it = this.f10258c.m12489k().iterator();
        while (it.hasNext()) {
            m12360U0((C2604v) it.next());
        }
    }

    /* JADX INFO: renamed from: r */
    private void m12320r() {
        boolean zM12447n;
        AbstractC2596n abstractC2596n = this.f10277v;
        if (abstractC2596n instanceof InterfaceC2639c0) {
            zM12447n = this.f10258c.m12494p().m12447n();
        } else {
            zM12447n = abstractC2596n.m12269j() instanceof Activity ? !((Activity) this.f10277v.m12269j()).isChangingConfigurations() : true;
        }
        if (zM12447n) {
            Iterator it = this.f10265j.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C2585c) it.next()).f10067a.iterator();
                while (it2.hasNext()) {
                    this.f10258c.m12494p().m12442g((String) it2.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    private void m12321r1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C2576C("FragmentManager"));
        AbstractC2596n abstractC2596n = this.f10277v;
        if (abstractC2596n != null) {
            try {
                abstractC2596n.mo12239m("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw runtimeException;
            }
        }
        try {
            m12361V("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: s */
    private Set m12322s() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f10258c.m12489k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C2604v) it.next()).m12466k().f10137S;
            if (viewGroup != null) {
                hashSet.add(AbstractC2579F.m11973s(viewGroup, m12327A0()));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: s0 */
    private ViewGroup m12323s0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        ViewGroup viewGroup = abstractComponentCallbacksC2591i.f10137S;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC2591i.f10128J > 0 && this.f10278w.mo12099f()) {
            View viewMo12098d = this.f10278w.mo12098d(abstractComponentCallbacksC2591i.f10128J);
            if (viewMo12098d instanceof ViewGroup) {
                return (ViewGroup) viewMo12098d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    private Set m12324t(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C2583a) arrayList.get(i7)).f10342c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = ((AbstractC2606x.a) it.next()).f10360b;
                if (abstractComponentCallbacksC2591i != null && (viewGroup = abstractComponentCallbacksC2591i.f10137S) != null) {
                    hashSet.add(AbstractC2579F.m11972r(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: t1 */
    private void m12325t1() {
        synchronized (this.f10256a) {
            try {
                if (this.f10256a.isEmpty()) {
                    this.f10263h.m23915j(m12394o0() > 0 && m12348N0(this.f10279x));
                } else {
                    this.f10263h.m23915j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    void m12326A() {
        this.f10246I = false;
        this.f10247J = false;
        this.f10253P.m12449p(false);
        m12293R(1);
    }

    /* JADX INFO: renamed from: A0 */
    InterfaceC2581G m12327A0() {
        InterfaceC2581G interfaceC2581G = this.f10239B;
        if (interfaceC2581G != null) {
            return interfaceC2581G;
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10279x;
        return abstractComponentCallbacksC2591i != null ? abstractComponentCallbacksC2591i.f10123E.m12327A0() : this.f10240C;
    }

    /* JADX INFO: renamed from: B */
    boolean m12328B(Menu menu, MenuInflater menuInflater) {
        if (this.f10276u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z7 = false;
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null && m12346M0(abstractComponentCallbacksC2591i) && abstractComponentCallbacksC2591i.m12162b1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC2591i);
                z7 = true;
            }
        }
        if (this.f10260e != null) {
            for (int i7 = 0; i7 < this.f10260e.size(); i7++) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = (AbstractComponentCallbacksC2591i) this.f10260e.get(i7);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC2591i2)) {
                    abstractComponentCallbacksC2591i2.m12111B0();
                }
            }
        }
        this.f10260e = arrayList;
        return z7;
    }

    /* JADX INFO: renamed from: B0 */
    public C5662c.c m12329B0() {
        return this.f10254Q;
    }

    /* JADX INFO: renamed from: C */
    void m12330C() {
        this.f10248K = true;
        m12366Z(true);
        m12295W();
        m12320r();
        m12293R(-1);
        Object obj = this.f10277v;
        if (obj instanceof InterfaceC2438d) {
            ((InterfaceC2438d) obj).mo10597H(this.f10272q);
        }
        Object obj2 = this.f10277v;
        if (obj2 instanceof InterfaceC2437c) {
            ((InterfaceC2437c) obj2).mo10596w(this.f10271p);
        }
        Object obj3 = this.f10277v;
        if (obj3 instanceof InterfaceC0115p) {
            ((InterfaceC0115p) obj3).mo559J(this.f10273r);
        }
        Object obj4 = this.f10277v;
        if (obj4 instanceof InterfaceC0116q) {
            ((InterfaceC0116q) obj4).mo561h(this.f10274s);
        }
        Object obj5 = this.f10277v;
        if ((obj5 instanceof InterfaceC1080w) && this.f10279x == null) {
            ((InterfaceC1080w) obj5).mo4782e(this.f10275t);
        }
        this.f10277v = null;
        this.f10278w = null;
        this.f10279x = null;
        if (this.f10262g != null) {
            this.f10263h.m23913h();
            this.f10262g = null;
        }
        AbstractC5382c abstractC5382c = this.f10241D;
        if (abstractC5382c != null) {
            abstractC5382c.mo12218c();
            this.f10242E.mo12218c();
            this.f10243F.mo12218c();
        }
    }

    /* JADX INFO: renamed from: D */
    void m12331D() {
        m12293R(1);
    }

    /* JADX INFO: renamed from: D0 */
    C2637b0 m12332D0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        return this.f10253P.m12446m(abstractComponentCallbacksC2591i);
    }

    /* JADX INFO: renamed from: E */
    void m12333E(boolean z7) {
        if (z7 && (this.f10277v instanceof InterfaceC2438d)) {
            m12321r1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.m12172h1();
                if (z7) {
                    abstractComponentCallbacksC2591i.f10125G.m12333E(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    void m12334E0() {
        m12366Z(true);
        if (this.f10263h.m23912g()) {
            m12363W0();
        } else {
            this.f10262g.m23939s();
        }
    }

    /* JADX INFO: renamed from: F */
    void m12335F(boolean z7, boolean z8) {
        if (z8 && (this.f10277v instanceof InterfaceC0115p)) {
            m12321r1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.m12175i1(z7);
                if (z8) {
                    abstractComponentCallbacksC2591i.f10125G.m12335F(z7, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    void m12336F0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (m12289I0(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2591i);
        }
        if (abstractComponentCallbacksC2591i.f10130L) {
            return;
        }
        abstractComponentCallbacksC2591i.f10130L = true;
        abstractComponentCallbacksC2591i.f10144Z = true ^ abstractComponentCallbacksC2591i.f10144Z;
        m12315o1(abstractComponentCallbacksC2591i);
    }

    /* JADX INFO: renamed from: G */
    void m12337G(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        Iterator it = this.f10270o.iterator();
        while (it.hasNext()) {
            ((InterfaceC5546q) it.next()).mo12237a(this, abstractComponentCallbacksC2591i);
        }
    }

    /* JADX INFO: renamed from: G0 */
    void m12338G0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i.f10169w && m12290J0(abstractComponentCallbacksC2591i)) {
            this.f10245H = true;
        }
    }

    /* JADX INFO: renamed from: H */
    void m12339H() {
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12490l()) {
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.m12119F0(abstractComponentCallbacksC2591i.m12171h0());
                abstractComponentCallbacksC2591i.f10125G.m12339H();
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m12340H0() {
        return this.f10248K;
    }

    /* JADX INFO: renamed from: I */
    boolean m12341I(MenuItem menuItem) {
        if (this.f10276u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null && abstractComponentCallbacksC2591i.m12177j1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    void m12342J(Menu menu) {
        if (this.f10276u < 1) {
            return;
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.m12180k1(menu);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    void m12343L() {
        m12293R(5);
    }

    /* JADX INFO: renamed from: L0 */
    boolean m12344L0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i == null) {
            return false;
        }
        return abstractComponentCallbacksC2591i.m12171h0();
    }

    /* JADX INFO: renamed from: M */
    void m12345M(boolean z7, boolean z8) {
        if (z8 && (this.f10277v instanceof InterfaceC0116q)) {
            m12321r1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.m12186m1(z7);
                if (z8) {
                    abstractComponentCallbacksC2591i.f10125G.m12345M(z7, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    boolean m12346M0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i == null) {
            return true;
        }
        return abstractComponentCallbacksC2591i.m12176j0();
    }

    /* JADX INFO: renamed from: N */
    boolean m12347N(Menu menu) {
        boolean z7 = false;
        if (this.f10276u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null && m12346M0(abstractComponentCallbacksC2591i) && abstractComponentCallbacksC2591i.m12189n1(menu)) {
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: N0 */
    boolean m12348N0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i == null) {
            return true;
        }
        AbstractC2599q abstractC2599q = abstractComponentCallbacksC2591i.f10123E;
        return abstractComponentCallbacksC2591i.equals(abstractC2599q.m12411z0()) && m12348N0(abstractC2599q.f10279x);
    }

    /* JADX INFO: renamed from: O */
    void m12349O() {
        m12325t1();
        m12291K(this.f10280y);
    }

    /* JADX INFO: renamed from: O0 */
    boolean m12350O0(int i7) {
        return this.f10276u >= i7;
    }

    /* JADX INFO: renamed from: P */
    void m12351P() {
        this.f10246I = false;
        this.f10247J = false;
        this.f10253P.m12449p(false);
        m12293R(7);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m12352P0() {
        return this.f10246I || this.f10247J;
    }

    /* JADX INFO: renamed from: Q */
    void m12353Q() {
        this.f10246I = false;
        this.f10247J = false;
        this.f10253P.m12449p(false);
        m12293R(5);
    }

    /* JADX INFO: renamed from: Q0 */
    void m12354Q0(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, Intent intent, int i7, Bundle bundle) {
        if (this.f10241D == null) {
            this.f10277v.m12271p(abstractComponentCallbacksC2591i, intent, i7, bundle);
            return;
        }
        this.f10244G.addLast(new l(abstractComponentCallbacksC2591i.f10155f, i7));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f10241D.m24394a(intent);
    }

    /* JADX INFO: renamed from: R0 */
    void m12355R0(int i7, boolean z7) {
        AbstractC2596n abstractC2596n;
        if (this.f10277v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z7 || i7 != this.f10276u) {
            this.f10276u = i7;
            this.f10258c.m12498t();
            m12319q1();
            if (this.f10245H && (abstractC2596n = this.f10277v) != null && this.f10276u == 7) {
                abstractC2596n.mo12242q();
                this.f10245H = false;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    void m12356S() {
        this.f10247J = true;
        this.f10253P.m12449p(true);
        m12293R(4);
    }

    /* JADX INFO: renamed from: S0 */
    void m12357S0() {
        if (this.f10277v == null) {
            return;
        }
        this.f10246I = false;
        this.f10247J = false;
        this.f10253P.m12449p(false);
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.m12191o0();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    void m12358T() {
        m12293R(2);
    }

    /* JADX INFO: renamed from: T0 */
    void m12359T0(FragmentContainerView fragmentContainerView) {
        View view;
        for (C2604v c2604v : this.f10258c.m12489k()) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
            if (abstractComponentCallbacksC2591iM12466k.f10128J == fragmentContainerView.getId() && (view = abstractComponentCallbacksC2591iM12466k.f10138T) != null && view.getParent() == null) {
                abstractComponentCallbacksC2591iM12466k.f10137S = fragmentContainerView;
                c2604v.m12457b();
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    void m12360U0(C2604v c2604v) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
        if (abstractComponentCallbacksC2591iM12466k.f10139U) {
            if (this.f10257b) {
                this.f10249L = true;
            } else {
                abstractComponentCallbacksC2591iM12466k.f10139U = false;
                c2604v.m12467m();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m12361V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f10258c.m12483e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f10260e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) this.f10260e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2591i.toString());
            }
        }
        ArrayList arrayList2 = this.f10259d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                C2583a c2583a = (C2583a) this.f10259d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(c2583a.toString());
                c2583a.m12027v(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f10264i.get());
        synchronized (this.f10256a) {
            try {
                int size3 = this.f10256a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size3; i9++) {
                        m mVar = (m) this.f10256a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f10277v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f10278w);
        if (this.f10279x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f10279x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f10276u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f10246I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f10247J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f10248K);
        if (this.f10245H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f10245H);
        }
    }

    /* JADX INFO: renamed from: V0 */
    void m12362V0(int i7, int i8, boolean z7) {
        if (i7 >= 0) {
            m12364X(new n(null, i7, i8), z7);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    /* JADX INFO: renamed from: W0 */
    public boolean m12363W0() {
        return m12297Y0(null, -1, 0);
    }

    /* JADX INFO: renamed from: X */
    void m12364X(m mVar, boolean z7) {
        if (!z7) {
            if (this.f10277v == null) {
                if (!this.f10248K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m12316p();
        }
        synchronized (this.f10256a) {
            try {
                if (this.f10277v == null) {
                    if (!z7) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f10256a.add(mVar);
                    m12386k1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: X0 */
    public boolean m12365X0(int i7, int i8) {
        if (i7 >= 0) {
            return m12297Y0(null, i7, i8);
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    /* JADX INFO: renamed from: Z */
    boolean m12366Z(boolean z7) {
        m12296Y(z7);
        boolean z8 = false;
        while (m12314n0(this.f10250M, this.f10251N)) {
            z8 = true;
            this.f10257b = true;
            try {
                m12304d1(this.f10250M, this.f10251N);
                m12318q();
            } catch (Throwable th) {
                m12318q();
                throw th;
            }
        }
        m12325t1();
        m12294U();
        this.f10258c.m12480b();
        return z8;
    }

    /* JADX INFO: renamed from: Z0 */
    boolean m12367Z0(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i8) {
        int iM12307f0 = m12307f0(str, i7, (i8 & 1) != 0);
        if (iM12307f0 < 0) {
            return false;
        }
        for (int size = this.f10259d.size() - 1; size >= iM12307f0; size--) {
            arrayList.add((C2583a) this.f10259d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    void m12368a0(m mVar, boolean z7) {
        if (z7 && (this.f10277v == null || this.f10248K)) {
            return;
        }
        m12296Y(z7);
        if (mVar.mo12015a(this.f10250M, this.f10251N)) {
            this.f10257b = true;
            try {
                m12304d1(this.f10250M, this.f10251N);
                m12318q();
            } catch (Throwable th) {
                m12318q();
                throw th;
            }
        }
        m12325t1();
        m12294U();
        this.f10258c.m12480b();
    }

    /* JADX INFO: renamed from: a1 */
    public void m12369a1(Bundle bundle, String str, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i.f10123E != this) {
            m12321r1(new IllegalStateException("Fragment " + abstractComponentCallbacksC2591i + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, abstractComponentCallbacksC2591i.f10155f);
    }

    /* JADX INFO: renamed from: b1 */
    public void m12370b1(k kVar, boolean z7) {
        this.f10269n.m12286o(kVar, z7);
    }

    /* JADX INFO: renamed from: c1 */
    void m12371c1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (m12289I0(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2591i + " nesting=" + abstractComponentCallbacksC2591i.f10122D);
        }
        boolean zM12174i0 = abstractComponentCallbacksC2591i.m12174i0();
        if (abstractComponentCallbacksC2591i.f10131M && zM12174i0) {
            return;
        }
        this.f10258c.m12499u(abstractComponentCallbacksC2591i);
        if (m12290J0(abstractComponentCallbacksC2591i)) {
            this.f10245H = true;
        }
        abstractComponentCallbacksC2591i.f10170x = true;
        m12315o1(abstractComponentCallbacksC2591i);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m12372d0() {
        boolean zM12366Z = m12366Z(true);
        m12312l0();
        return zM12366Z;
    }

    /* JADX INFO: renamed from: e0 */
    AbstractComponentCallbacksC2591i m12373e0(String str) {
        return this.f10258c.m12484f(str);
    }

    /* JADX INFO: renamed from: e1 */
    void m12374e1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        this.f10253P.m12448o(abstractComponentCallbacksC2591i);
    }

    /* JADX INFO: renamed from: g */
    void m12375g(C2583a c2583a) {
        if (this.f10259d == null) {
            this.f10259d = new ArrayList();
        }
        this.f10259d.add(c2583a);
    }

    /* JADX INFO: renamed from: g0 */
    public AbstractComponentCallbacksC2591i m12376g0(int i7) {
        return this.f10258c.m12485g(i7);
    }

    /* JADX INFO: renamed from: g1 */
    void m12377g1(Parcelable parcelable) {
        C2604v c2604v;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f10277v.m12269j().getClassLoader());
                this.f10266k.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f10277v.m12269j().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f10258c.m12502x(map);
        C2601s c2601s = (C2601s) bundle3.getParcelable("state");
        if (c2601s == null) {
            return;
        }
        this.f10258c.m12500v();
        Iterator it = c2601s.f10298a.iterator();
        while (it.hasNext()) {
            Bundle bundleM12478B = this.f10258c.m12478B((String) it.next(), null);
            if (bundleM12478B != null) {
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12443i = this.f10253P.m12443i(((C2603u) bundleM12478B.getParcelable("state")).f10315b);
                if (abstractComponentCallbacksC2591iM12443i != null) {
                    if (m12289I0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC2591iM12443i);
                    }
                    c2604v = new C2604v(this.f10269n, this.f10258c, abstractComponentCallbacksC2591iM12443i, bundleM12478B);
                } else {
                    c2604v = new C2604v(this.f10269n, this.f10258c, this.f10277v.m12269j().getClassLoader(), m12399t0(), bundleM12478B);
                }
                AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12466k = c2604v.m12466k();
                abstractComponentCallbacksC2591iM12466k.f10147b = bundleM12478B;
                abstractComponentCallbacksC2591iM12466k.f10123E = this;
                if (m12289I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC2591iM12466k.f10155f + "): " + abstractComponentCallbacksC2591iM12466k);
                }
                c2604v.m12469o(this.f10277v.m12269j().getClassLoader());
                this.f10258c.m12496r(c2604v);
                c2604v.m12474t(this.f10276u);
            }
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10253P.m12445l()) {
            if (!this.f10258c.m12481c(abstractComponentCallbacksC2591i.f10155f)) {
                if (m12289I0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC2591i + " that was not found in the set of active Fragments " + c2601s.f10298a);
                }
                this.f10253P.m12448o(abstractComponentCallbacksC2591i);
                abstractComponentCallbacksC2591i.f10123E = this;
                C2604v c2604v2 = new C2604v(this.f10269n, this.f10258c, abstractComponentCallbacksC2591i);
                c2604v2.m12474t(1);
                c2604v2.m12467m();
                abstractComponentCallbacksC2591i.f10170x = true;
                c2604v2.m12467m();
            }
        }
        this.f10258c.m12501w(c2601s.f10299b);
        if (c2601s.f10300c != null) {
            this.f10259d = new ArrayList(c2601s.f10300c.length);
            int i7 = 0;
            while (true) {
                C2584b[] c2584bArr = c2601s.f10300c;
                if (i7 >= c2584bArr.length) {
                    break;
                }
                C2583a c2583aM12033b = c2584bArr[i7].m12033b(this);
                if (m12289I0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + c2583aM12033b.f10051v + "): " + c2583aM12033b);
                    PrintWriter printWriter = new PrintWriter(new C2576C("FragmentManager"));
                    c2583aM12033b.m12028w("  ", printWriter, false);
                    printWriter.close();
                }
                this.f10259d.add(c2583aM12033b);
                i7++;
            }
        } else {
            this.f10259d = null;
        }
        this.f10264i.set(c2601s.f10301d);
        String str3 = c2601s.f10302e;
        if (str3 != null) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12373e0 = m12373e0(str3);
            this.f10280y = abstractComponentCallbacksC2591iM12373e0;
            m12291K(abstractComponentCallbacksC2591iM12373e0);
        }
        ArrayList arrayList = c2601s.f10303f;
        if (arrayList != null) {
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                this.f10265j.put((String) arrayList.get(i8), (C2585c) c2601s.f10304r.get(i8));
            }
        }
        this.f10244G = new ArrayDeque(c2601s.f10305s);
    }

    /* JADX INFO: renamed from: h */
    C2604v m12378h(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        String str = abstractComponentCallbacksC2591i.f10150c0;
        if (str != null) {
            C5662c.m25181f(abstractComponentCallbacksC2591i, str);
        }
        if (m12289I0(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2591i);
        }
        C2604v c2604vM12400u = m12400u(abstractComponentCallbacksC2591i);
        abstractComponentCallbacksC2591i.f10123E = this;
        this.f10258c.m12496r(c2604vM12400u);
        if (!abstractComponentCallbacksC2591i.f10131M) {
            this.f10258c.m12479a(abstractComponentCallbacksC2591i);
            abstractComponentCallbacksC2591i.f10170x = false;
            if (abstractComponentCallbacksC2591i.f10138T == null) {
                abstractComponentCallbacksC2591i.f10144Z = false;
            }
            if (m12290J0(abstractComponentCallbacksC2591i)) {
                this.f10245H = true;
            }
        }
        return c2604vM12400u;
    }

    /* JADX INFO: renamed from: h0 */
    public AbstractComponentCallbacksC2591i m12379h0(String str) {
        return this.f10258c.m12486h(str);
    }

    /* JADX INFO: renamed from: i */
    public void m12380i(InterfaceC5546q interfaceC5546q) {
        this.f10270o.add(interfaceC5546q);
    }

    /* JADX INFO: renamed from: i0 */
    AbstractComponentCallbacksC2591i m12381i0(String str) {
        return this.f10258c.m12487i(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: i1 */
    public Bundle m12382i1() {
        C2584b[] c2584bArr;
        int size;
        Bundle bundle = new Bundle();
        m12312l0();
        m12295W();
        m12366Z(true);
        this.f10246I = true;
        this.f10253P.m12449p(true);
        ArrayList arrayListM12503y = this.f10258c.m12503y();
        HashMap mapM12491m = this.f10258c.m12491m();
        if (!mapM12491m.isEmpty()) {
            ArrayList arrayListM12504z = this.f10258c.m12504z();
            ArrayList arrayList = this.f10259d;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c2584bArr = null;
            } else {
                c2584bArr = new C2584b[size];
                for (int i7 = 0; i7 < size; i7++) {
                    c2584bArr[i7] = new C2584b((C2583a) this.f10259d.get(i7));
                    if (m12289I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i7 + ": " + this.f10259d.get(i7));
                    }
                }
            }
            C2601s c2601s = new C2601s();
            c2601s.f10298a = arrayListM12503y;
            c2601s.f10299b = arrayListM12504z;
            c2601s.f10300c = c2584bArr;
            c2601s.f10301d = this.f10264i.get();
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10280y;
            if (abstractComponentCallbacksC2591i != null) {
                c2601s.f10302e = abstractComponentCallbacksC2591i.f10155f;
            }
            c2601s.f10303f.addAll(this.f10265j.keySet());
            c2601s.f10304r.addAll(this.f10265j.values());
            c2601s.f10305s = new ArrayList(this.f10244G);
            bundle.putParcelable("state", c2601s);
            for (String str : this.f10266k.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f10266k.get(str));
            }
            for (String str2 : mapM12491m.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM12491m.get(str2));
            }
        } else if (m12289I0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: j */
    void m12383j(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        this.f10253P.m12440e(abstractComponentCallbacksC2591i);
    }

    /* JADX INFO: renamed from: j1 */
    public AbstractComponentCallbacksC2591i.n m12384j1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        C2604v c2604vM12492n = this.f10258c.m12492n(abstractComponentCallbacksC2591i.f10155f);
        if (c2604vM12492n == null || !c2604vM12492n.m12466k().equals(abstractComponentCallbacksC2591i)) {
            m12321r1(new IllegalStateException("Fragment " + abstractComponentCallbacksC2591i + " is not currently in the FragmentManager"));
        }
        return c2604vM12492n.m12471q();
    }

    /* JADX INFO: renamed from: k */
    int m12385k() {
        return this.f10264i.getAndIncrement();
    }

    /* JADX INFO: renamed from: k1 */
    void m12386k1() {
        synchronized (this.f10256a) {
            try {
                if (this.f10256a.size() == 1) {
                    this.f10277v.m12270k().removeCallbacks(this.f10255R);
                    this.f10277v.m12270k().post(this.f10255R);
                    m12325t1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    void m12387l(AbstractC2596n abstractC2596n, AbstractC5540k abstractC5540k, AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        String str;
        InterfaceC2657s interfaceC2657s;
        if (this.f10277v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f10277v = abstractC2596n;
        this.f10278w = abstractC5540k;
        this.f10279x = abstractComponentCallbacksC2591i;
        if (abstractComponentCallbacksC2591i != null) {
            m12380i(new g(abstractComponentCallbacksC2591i));
        } else if (abstractC2596n instanceof InterfaceC5546q) {
            m12380i((InterfaceC5546q) abstractC2596n);
        }
        if (this.f10279x != null) {
            m12325t1();
        }
        if (abstractC2596n instanceof InterfaceC5167J) {
            InterfaceC5167J interfaceC5167J = (InterfaceC5167J) abstractC2596n;
            C5165H c5165hMo12238b = interfaceC5167J.mo12238b();
            this.f10262g = c5165hMo12238b;
            if (abstractComponentCallbacksC2591i != null) {
                interfaceC2657s = interfaceC5167J;
                interfaceC2657s = abstractComponentCallbacksC2591i;
            }
            interfaceC2657s = interfaceC5167J;
            c5165hMo12238b.m23936o(interfaceC2657s, this.f10263h);
        }
        if (abstractComponentCallbacksC2591i != null) {
            this.f10253P = abstractComponentCallbacksC2591i.f10123E.m12317p0(abstractComponentCallbacksC2591i);
        } else if (abstractC2596n instanceof InterfaceC2639c0) {
            this.f10253P = C2602t.m12438k(((InterfaceC2639c0) abstractC2596n).mo11963v());
        } else {
            this.f10253P = new C2602t(false);
        }
        this.f10253P.m12449p(m12352P0());
        this.f10258c.m12477A(this.f10253P);
        Object obj = this.f10277v;
        if ((obj instanceof InterfaceC0050i) && abstractComponentCallbacksC2591i == null) {
            C0047f c0047fMo198A = ((InterfaceC0050i) obj).mo198A();
            c0047fMo198A.m187c("android:support:fragments", new C0047f.b() { // from class: h0.p
                @Override // p010B0.C0047f.b
                /* JADX INFO: renamed from: a */
                public final Bundle mo174a() {
                    return this.f21377a.m12382i1();
                }
            });
            Bundle bundleM185a = c0047fMo198A.m185a("android:support:fragments");
            if (bundleM185a != null) {
                m12377g1(bundleM185a);
            }
        }
        Object obj2 = this.f10277v;
        if (obj2 instanceof InterfaceC5386g) {
            AbstractC5385f abstractC5385fMo12243t = ((InterfaceC5386g) obj2).mo12243t();
            if (abstractComponentCallbacksC2591i != null) {
                str = abstractComponentCallbacksC2591i.f10155f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f10241D = abstractC5385fMo12243t.m24410o(str2 + "StartActivityForResult", new C5449c(), new h());
            this.f10242E = abstractC5385fMo12243t.m24410o(str2 + "StartIntentSenderForResult", new j(), new i());
            this.f10243F = abstractC5385fMo12243t.m24410o(str2 + "RequestPermissions", new C5448b(), new a());
        }
        Object obj3 = this.f10277v;
        if (obj3 instanceof InterfaceC2437c) {
            ((InterfaceC2437c) obj3).mo10595g(this.f10271p);
        }
        Object obj4 = this.f10277v;
        if (obj4 instanceof InterfaceC2438d) {
            ((InterfaceC2438d) obj4).mo10598K(this.f10272q);
        }
        Object obj5 = this.f10277v;
        if (obj5 instanceof InterfaceC0115p) {
            ((InterfaceC0115p) obj5).mo560r(this.f10273r);
        }
        Object obj6 = this.f10277v;
        if (obj6 instanceof InterfaceC0116q) {
            ((InterfaceC0116q) obj6).mo562l(this.f10274s);
        }
        Object obj7 = this.f10277v;
        if ((obj7 instanceof InterfaceC1080w) && abstractComponentCallbacksC2591i == null) {
            ((InterfaceC1080w) obj7).mo4783s(this.f10275t);
        }
    }

    /* JADX INFO: renamed from: l1 */
    void m12388l1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, boolean z7) {
        ViewGroup viewGroupM12323s0 = m12323s0(abstractComponentCallbacksC2591i);
        if (viewGroupM12323s0 == null || !(viewGroupM12323s0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM12323s0).setDrawDisappearingViewsLast(!z7);
    }

    /* JADX INFO: renamed from: m */
    void m12389m(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (m12289I0(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2591i);
        }
        if (abstractComponentCallbacksC2591i.f10131M) {
            abstractComponentCallbacksC2591i.f10131M = false;
            if (abstractComponentCallbacksC2591i.f10169w) {
                return;
            }
            this.f10258c.m12479a(abstractComponentCallbacksC2591i);
            if (m12289I0(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2591i);
            }
            if (m12290J0(abstractComponentCallbacksC2591i)) {
                this.f10245H = true;
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    void m12390m1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i, AbstractC2650l.b bVar) {
        if (abstractComponentCallbacksC2591i.equals(m12373e0(abstractComponentCallbacksC2591i.f10155f)) && (abstractComponentCallbacksC2591i.f10124F == null || abstractComponentCallbacksC2591i.f10123E == this)) {
            abstractComponentCallbacksC2591i.f10152d0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2591i + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: n */
    public AbstractC2606x m12391n() {
        return new C2583a(this);
    }

    /* JADX INFO: renamed from: n1 */
    void m12392n1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (abstractComponentCallbacksC2591i == null || (abstractComponentCallbacksC2591i.equals(m12373e0(abstractComponentCallbacksC2591i.f10155f)) && (abstractComponentCallbacksC2591i.f10124F == null || abstractComponentCallbacksC2591i.f10123E == this))) {
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i2 = this.f10280y;
            this.f10280y = abstractComponentCallbacksC2591i;
            m12291K(abstractComponentCallbacksC2591i2);
            m12291K(this.f10280y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2591i + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: o */
    boolean m12393o() {
        boolean zM12290J0 = false;
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12490l()) {
            if (abstractComponentCallbacksC2591i != null) {
                zM12290J0 = m12290J0(abstractComponentCallbacksC2591i);
            }
            if (zM12290J0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o0 */
    public int m12394o0() {
        ArrayList arrayList = this.f10259d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: p1 */
    void m12395p1(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (m12289I0(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2591i);
        }
        if (abstractComponentCallbacksC2591i.f10130L) {
            abstractComponentCallbacksC2591i.f10130L = false;
            abstractComponentCallbacksC2591i.f10144Z = !abstractComponentCallbacksC2591i.f10144Z;
        }
    }

    /* JADX INFO: renamed from: q0 */
    AbstractC5540k m12396q0() {
        return this.f10278w;
    }

    /* JADX INFO: renamed from: r0 */
    public AbstractComponentCallbacksC2591i m12397r0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12373e0 = m12373e0(string);
        if (abstractComponentCallbacksC2591iM12373e0 == null) {
            m12321r1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return abstractComponentCallbacksC2591iM12373e0;
    }

    /* JADX INFO: renamed from: s1 */
    public void m12398s1(k kVar) {
        this.f10269n.m12287p(kVar);
    }

    /* JADX INFO: renamed from: t0 */
    public AbstractC2595m m12399t0() {
        AbstractC2595m abstractC2595m = this.f10281z;
        if (abstractC2595m != null) {
            return abstractC2595m;
        }
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10279x;
        return abstractComponentCallbacksC2591i != null ? abstractComponentCallbacksC2591i.f10123E.m12399t0() : this.f10238A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = this.f10279x;
        if (abstractComponentCallbacksC2591i != null) {
            sb.append(abstractComponentCallbacksC2591i.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f10279x)));
            sb.append("}");
        } else {
            AbstractC2596n abstractC2596n = this.f10277v;
            if (abstractC2596n != null) {
                sb.append(abstractC2596n.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f10277v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    C2604v m12400u(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        C2604v c2604vM12492n = this.f10258c.m12492n(abstractComponentCallbacksC2591i.f10155f);
        if (c2604vM12492n != null) {
            return c2604vM12492n;
        }
        C2604v c2604v = new C2604v(this.f10269n, this.f10258c, abstractComponentCallbacksC2591i);
        c2604v.m12469o(this.f10277v.m12269j().getClassLoader());
        c2604v.m12474t(this.f10276u);
        return c2604v;
    }

    /* JADX INFO: renamed from: u0 */
    public List m12401u0() {
        return this.f10258c.m12493o();
    }

    /* JADX INFO: renamed from: v */
    void m12402v(AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i) {
        if (m12289I0(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2591i);
        }
        if (abstractComponentCallbacksC2591i.f10131M) {
            return;
        }
        abstractComponentCallbacksC2591i.f10131M = true;
        if (abstractComponentCallbacksC2591i.f10169w) {
            if (m12289I0(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2591i);
            }
            this.f10258c.m12499u(abstractComponentCallbacksC2591i);
            if (m12290J0(abstractComponentCallbacksC2591i)) {
                this.f10245H = true;
            }
            m12315o1(abstractComponentCallbacksC2591i);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public AbstractC2596n m12403v0() {
        return this.f10277v;
    }

    /* JADX INFO: renamed from: w */
    void m12404w() {
        this.f10246I = false;
        this.f10247J = false;
        this.f10253P.m12449p(false);
        m12293R(4);
    }

    /* JADX INFO: renamed from: w0 */
    LayoutInflater.Factory2 m12405w0() {
        return this.f10261f;
    }

    /* JADX INFO: renamed from: x */
    void m12406x() {
        this.f10246I = false;
        this.f10247J = false;
        this.f10253P.m12449p(false);
        m12293R(0);
    }

    /* JADX INFO: renamed from: x0 */
    C2598p m12407x0() {
        return this.f10269n;
    }

    /* JADX INFO: renamed from: y */
    void m12408y(Configuration configuration, boolean z7) {
        if (z7 && (this.f10277v instanceof InterfaceC2437c)) {
            m12321r1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null) {
                abstractComponentCallbacksC2591i.m12157Y0(configuration);
                if (z7) {
                    abstractComponentCallbacksC2591i.f10125G.m12408y(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    AbstractComponentCallbacksC2591i m12409y0() {
        return this.f10279x;
    }

    /* JADX INFO: renamed from: z */
    boolean m12410z(MenuItem menuItem) {
        if (this.f10276u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i : this.f10258c.m12493o()) {
            if (abstractComponentCallbacksC2591i != null && abstractComponentCallbacksC2591i.m12158Z0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public AbstractComponentCallbacksC2591i m12411z0() {
        return this.f10280y;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$l */
    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        String f10292a;

        /* JADX INFO: renamed from: b */
        int f10293b;

        /* JADX INFO: renamed from: androidx.fragment.app.q$l$a */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i7) {
                return new l[i7];
            }
        }

        l(String str, int i7) {
            this.f10292a = str;
            this.f10293b = i7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f10292a);
            parcel.writeInt(this.f10293b);
        }

        l(Parcel parcel) {
            this.f10292a = parcel.readString();
            this.f10293b = parcel.readInt();
        }
    }
}
