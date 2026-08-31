package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzayx;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbot;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p314o2.AbstractC6543C;
import p314o2.AbstractC6552d;
import p314o2.C6556h;
import p314o2.C6571w;
import p314o2.C6573y;
import p314o2.C6574z;
import p314o2.InterfaceC6565q;
import p324p2.InterfaceC6738e;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3380p1 {

    /* JADX INFO: renamed from: a */
    private final zzbot f14058a;

    /* JADX INFO: renamed from: b */
    private final C3365l2 f14059b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f14060c;

    /* JADX INFO: renamed from: d */
    private final C6573y f14061d;

    /* JADX INFO: renamed from: e */
    final AbstractC3247C f14062e;

    /* JADX INFO: renamed from: f */
    private InterfaceC3318a f14063f;

    /* JADX INFO: renamed from: g */
    private AbstractC6552d f14064g;

    /* JADX INFO: renamed from: h */
    private C6556h[] f14065h;

    /* JADX INFO: renamed from: i */
    private InterfaceC6738e f14066i;

    /* JADX INFO: renamed from: j */
    private InterfaceC3312Y f14067j;

    /* JADX INFO: renamed from: k */
    private C6574z f14068k;

    /* JADX INFO: renamed from: l */
    private String f14069l;

    /* JADX INFO: renamed from: m */
    private final ViewGroup f14070m;

    /* JADX INFO: renamed from: n */
    private int f14071n;

    /* JADX INFO: renamed from: o */
    private boolean f14072o;

    /* JADX INFO: renamed from: p */
    private final AtomicLong f14073p;

    public C3380p1(ViewGroup viewGroup, int i7) {
        this(viewGroup, null, false, C3365l2.f14001a, null, i7);
    }

    /* JADX INFO: renamed from: f */
    private static C3369m2 m17293f(Context context, C6556h[] c6556hArr, int i7) {
        for (C6556h c6556h : c6556hArr) {
            if (c6556h.equals(C6556h.f24748q)) {
                return new C3369m2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        C3369m2 c3369m2 = new C3369m2(context, c6556hArr);
        c3369m2.f14031u = m17294g(i7);
        return c3369m2;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m17294g(int i7) {
        return i7 == 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m17295A(long j7) {
        this.f14073p.set(j7);
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzT(j7);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC6565q m17296B() {
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final C6573y m17297C() {
        return this.f14061d;
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC3340f1 m17298D() {
        InterfaceC3312Y interfaceC3312Y = this.f14067j;
        if (interfaceC3312Y != null) {
            try {
                return interfaceC3312Y.zzF();
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m17299a(C6574z c6574z) {
        this.f14068k = c6574z;
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzG(c6574z == null ? null : new C3321a2(c6574z));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C6574z m17300b() {
        return this.f14068k;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17301c(InterfaceC3312Y interfaceC3312Y) {
        try {
            InterfaceC3772a interfaceC3772aZzb = interfaceC3312Y.zzb();
            if (interfaceC3772aZzb == null || ((View) BinderC3773b.m18220M0(interfaceC3772aZzb)).getParent() != null) {
                return false;
            }
            this.f14070m.addView((View) BinderC3773b.m18220M0(interfaceC3772aZzb));
            this.f14067j = interfaceC3312Y;
            return true;
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ void m17302d(InterfaceC3772a interfaceC3772a) {
        this.f14070m.addView((View) BinderC3773b.m18220M0(interfaceC3772a));
    }

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C6573y m17303e() {
        return this.f14061d;
    }

    /* JADX INFO: renamed from: h */
    public final void m17304h() {
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzc();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC6552d m17305i() {
        return this.f14064g;
    }

    /* JADX INFO: renamed from: j */
    public final C6556h m17306j() {
        C3369m2 c3369m2Zzn;
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null && (c3369m2Zzn = interfaceC3312Y.zzn()) != null) {
                return AbstractC6543C.m27789a(c3369m2Zzn.f14026e, c3369m2Zzn.f14023b, c3369m2Zzn.f14022a);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        C6556h[] c6556hArr = this.f14065h;
        if (c6556hArr != null) {
            return c6556hArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C6556h[] m17307k() {
        return this.f14065h;
    }

    /* JADX INFO: renamed from: l */
    public final String m17308l() {
        InterfaceC3312Y interfaceC3312Y;
        if (this.f14069l == null && (interfaceC3312Y = this.f14067j) != null) {
            try {
                this.f14069l = interfaceC3312Y.zzu();
            } catch (RemoteException e7) {
                AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
            }
        }
        return this.f14069l;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC6738e m17309m() {
        return this.f14066i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d6 A[Catch: RemoteException -> 0x00d4, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d4, blocks: (B:27:0x00a3, B:29:0x00a9, B:31:0x00b7, B:33:0x00c9, B:36:0x00d6), top: B:56:0x00a3, outer: #0 }] */
    /* JADX INFO: renamed from: n */
    public final void m17310n(C3368m1 c3368m1) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f14067j == null) {
                if (this.f14065h == null || this.f14069l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup = this.f14070m;
                Context context = viewGroup.getContext();
                C3369m2 c3369m2M17293f = m17293f(context, this.f14065h, this.f14071n);
                InterfaceC3312Y interfaceC3312Y = "search_v2".equals(c3369m2M17293f.f14022a) ? (InterfaceC3312Y) new C3374o(C3244B.m17191b(), context, c3369m2M17293f, this.f14069l).m17188d(context, false) : (InterfaceC3312Y) new C3366m(C3244B.m17191b(), context, c3369m2M17293f, this.f14069l, this.f14058a).m17188d(context, false);
                this.f14067j = interfaceC3312Y;
                interfaceC3312Y.zzdW(new BinderC3317Z1(this.f14062e));
                InterfaceC3318a interfaceC3318a = this.f14063f;
                if (interfaceC3318a != null) {
                    this.f14067j.zzy(new BinderC3414z(interfaceC3318a));
                }
                InterfaceC6738e interfaceC6738e = this.f14066i;
                if (interfaceC6738e != null) {
                    this.f14067j.zzi(new zzayx(interfaceC6738e));
                }
                if (this.f14068k != null) {
                    this.f14067j.zzG(new C3321a2(this.f14068k));
                }
                this.f14067j.zzP(new BinderC3293R1(null));
                this.f14067j.zzz(this.f14072o);
                InterfaceC3312Y interfaceC3312Y2 = this.f14067j;
                if (interfaceC3312Y2 != null) {
                    try {
                        final InterfaceC3772a interfaceC3772aZzb = interfaceC3312Y2.zzb();
                        if (interfaceC3772aZzb != null) {
                            if (((Boolean) zzbeg.zzf.zze()).booleanValue()) {
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlX)).booleanValue()) {
                                    C7590g.f30239b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.o1
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f14047a.m17302d(interfaceC3772aZzb);
                                        }
                                    });
                                } else {
                                    viewGroup.addView((View) BinderC3773b.m18220M0(interfaceC3772aZzb));
                                }
                            } else {
                                viewGroup.addView((View) BinderC3773b.m18220M0(interfaceC3772aZzb));
                            }
                        }
                    } catch (RemoteException e7) {
                        AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                    }
                }
            }
            c3368m1.m17284o(jCurrentTimeMillis);
            if (c3368m1.m17286q() != 0) {
                this.f14073p.set(c3368m1.m17286q());
            }
            InterfaceC3312Y interfaceC3312Y3 = this.f14067j;
            if (interfaceC3312Y3 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.f14073p;
            if (atomicLong.get() != 0) {
                interfaceC3312Y3.zzT(atomicLong.get());
            }
            interfaceC3312Y3.zze(this.f14059b.m17269a(this.f14070m.getContext(), c3368m1));
        } catch (RemoteException e8) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e8);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m17311o() {
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzf();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m17312p() {
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzg();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m17313q(AbstractC6552d abstractC6552d) {
        this.f14064g = abstractC6552d;
        this.f14062e.m17195d(abstractC6552d);
    }

    /* JADX INFO: renamed from: r */
    public final void m17314r(InterfaceC3318a interfaceC3318a) {
        try {
            this.f14063f = interfaceC3318a;
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzy(interfaceC3318a != null ? new BinderC3414z(interfaceC3318a) : null);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m17315s(C6556h... c6556hArr) {
        if (this.f14065h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m17316t(c6556hArr);
    }

    /* JADX INFO: renamed from: t */
    public final void m17316t(C6556h... c6556hArr) {
        this.f14065h = c6556hArr;
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzo(m17293f(this.f14070m.getContext(), this.f14065h, this.f14071n));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        this.f14070m.requestLayout();
    }

    /* JADX INFO: renamed from: u */
    public final void m17317u(String str) {
        if (this.f14069l != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f14069l = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m17318v(InterfaceC6738e interfaceC6738e) {
        try {
            this.f14066i = interfaceC6738e;
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzi(interfaceC6738e != null ? new zzayx(interfaceC6738e) : null);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m17319w(boolean z7) {
        this.f14072o = z7;
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzz(z7);
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: x */
    public final C6571w m17320x() {
        InterfaceC3328c1 interfaceC3328c1Zzt = null;
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3328c1Zzt = interfaceC3312Y.zzt();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        return C6571w.m27861e(interfaceC3328c1Zzt);
    }

    /* JADX INFO: renamed from: y */
    public final void m17321y(InterfaceC6565q interfaceC6565q) {
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                interfaceC3312Y.zzP(new BinderC3293R1(interfaceC6565q));
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    /* JADX INFO: renamed from: z */
    public final long m17322z() {
        AtomicLong atomicLong = this.f14073p;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            InterfaceC3312Y interfaceC3312Y = this.f14067j;
            if (interfaceC3312Y != null) {
                atomicLong.set(interfaceC3312Y.zzU());
                return atomicLong.get();
            }
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
        return 0L;
    }

    C3380p1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z7, C3365l2 c3365l2, InterfaceC3312Y interfaceC3312Y, int i7) {
        C3369m2 c3369m2;
        this.f14058a = new zzbot();
        this.f14061d = new C6573y();
        this.f14062e = new C3372n1(this);
        this.f14073p = new AtomicLong();
        this.f14070m = viewGroup;
        this.f14059b = c3365l2;
        this.f14067j = null;
        this.f14060c = new AtomicBoolean(false);
        this.f14071n = i7;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                C3401u2 c3401u2 = new C3401u2(context, attributeSet);
                this.f14065h = c3401u2.m17324a(z7);
                this.f14069l = c3401u2.m17325b();
                if (viewGroup.isInEditMode()) {
                    C7590g c7590gM17190a = C3244B.m17190a();
                    C6556h c6556h = this.f14065h[0];
                    int i8 = this.f14071n;
                    if (c6556h.equals(C6556h.f24748q)) {
                        c3369m2 = new C3369m2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        c3369m2 = new C3369m2(context, c6556h);
                        c3369m2.f14031u = m17294g(i8);
                    }
                    c7590gM17190a.m33294l(viewGroup, c3369m2, "Ads by Google");
                }
            } catch (IllegalArgumentException e7) {
                C3244B.m17190a().m33293k(viewGroup, new C3369m2(context, C6556h.f24740i), e7.getMessage(), e7.getMessage());
            }
        }
    }
}
