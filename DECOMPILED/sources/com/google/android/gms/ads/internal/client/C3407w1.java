package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzbot;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import p314o2.C6570v;
import p314o2.EnumC6551c;
import p372v2.EnumC7224a;
import p372v2.InterfaceC7225b;
import p372v2.InterfaceC7226c;
import p404z2.AbstractC7586c;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3407w1 {

    /* JADX INFO: renamed from: l */
    public static final Set f14102l = new HashSet(Arrays.asList(EnumC6551c.APP_OPEN_AD, EnumC6551c.INTERSTITIAL, EnumC6551c.REWARDED));

    /* JADX INFO: renamed from: m */
    private static C3407w1 f14103m;

    /* JADX INFO: renamed from: a */
    private C3388r1 f14104a;

    /* JADX INFO: renamed from: b */
    private C3246B1 f14105b;

    /* JADX INFO: renamed from: c */
    private C3384q1 f14106c;

    /* JADX INFO: renamed from: j */
    private InterfaceC3248C0 f14113j;

    /* JADX INFO: renamed from: d */
    private final Object f14107d = new Object();

    /* JADX INFO: renamed from: e */
    private final Object f14108e = new Object();

    /* JADX INFO: renamed from: g */
    private boolean f14110g = false;

    /* JADX INFO: renamed from: h */
    private boolean f14111h = false;

    /* JADX INFO: renamed from: i */
    private final Object f14112i = new Object();

    /* JADX INFO: renamed from: k */
    private C6570v f14114k = new C6570v.a().m27859a();

    /* JADX INFO: renamed from: f */
    private final ArrayList f14109f = new ArrayList();

    private C3407w1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static InterfaceC7225b m17326a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzblk zzblkVar = (zzblk) it.next();
            map.put(zzblkVar.zza, new zzbls(zzblkVar.zzb ? EnumC7224a.READY : EnumC7224a.NOT_READY, zzblkVar.zzd, zzblkVar.zzc));
        }
        return new zzblt(map);
    }

    /* JADX INFO: renamed from: b */
    private final void m17327b(C6570v c6570v) {
        try {
            this.f14113j.zzr(new C3302U1(c6570v));
        } catch (RemoteException e7) {
            AbstractC7599p.m33329d("Unable to set request configuration parcel.", e7);
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m17328c(Context context) {
        if (this.f14113j == null) {
            this.f14113j = (InterfaceC3248C0) new C3402v(C3244B.m17191b(), context).m17188d(context, false);
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m17329d(String str) {
        try {
            this.f14113j.zze();
            this.f14113j.zzj(null, BinderC3773b.m18221N0(null));
        } catch (RemoteException e7) {
            AbstractC7599p.m33332g("MobileAdsSettingManager initialization failed", e7);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C3407w1 m17330e() {
        C3407w1 c3407w1;
        synchronized (C3407w1.class) {
            try {
                if (f14103m == null) {
                    f14103m = new C3407w1();
                }
                c3407w1 = f14103m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3407w1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:50:0x00e8, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:58:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:50:0x00e8, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:58:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:50:0x00e8, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:58:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:50:0x00e8, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:58:0x0034, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m17332f(Context context, String str, InterfaceC7226c interfaceC7226c) {
        synchronized (this.f14107d) {
            try {
                if (this.f14110g) {
                    if (interfaceC7226c != null) {
                        this.f14109f.add(interfaceC7226c);
                    }
                    return;
                }
                if (this.f14111h) {
                    if (interfaceC7226c != null) {
                        interfaceC7226c.mo29535a(m17335i());
                    }
                    return;
                }
                this.f14110g = true;
                if (interfaceC7226c != null) {
                    this.f14109f.add(interfaceC7226c);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.f14112i) {
                    byte[] bArr = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    try {
                        try {
                            m17328c(context);
                            this.f14113j.zzp(new BinderC3404v1(this, bArr));
                            this.f14113j.zzo(new zzbot());
                            if (this.f14114k.m27856c() != -1 || this.f14114k.m27857d() != -1) {
                                m17327b(this.f14114k);
                            }
                        } catch (RemoteException e7) {
                            AbstractC7599p.m33332g("MobileAdsSettingManager initialization failed", e7);
                        }
                        zzbci.zza(context);
                        if (((Boolean) zzbeg.zza.zze()).booleanValue()) {
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlW)).booleanValue()) {
                                AbstractC7599p.m33326a("Initializing on bg thread");
                                ThreadPoolExecutor threadPoolExecutor = AbstractC7586c.f30233a;
                                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                threadPoolExecutor.execute(new Runnable(objArr3) { // from class: com.google.android.gms.ads.internal.client.u1
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f14095a.m17338l(null);
                                    }
                                });
                            } else if (((Boolean) zzbeg.zzb.zze()).booleanValue()) {
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlW)).booleanValue()) {
                                    ExecutorService executorService = AbstractC7586c.f30234b;
                                    final Object[] objArr4 = objArr == true ? 1 : 0;
                                    executorService.execute(new Runnable(objArr4) { // from class: com.google.android.gms.ads.internal.client.s1
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f14088a.m17339m(null);
                                        }
                                    });
                                } else {
                                    AbstractC7599p.m33326a("Initializing on calling thread");
                                    m17329d(null);
                                }
                            } else {
                                AbstractC7599p.m33326a("Initializing on calling thread");
                                m17329d(null);
                            }
                        } else if (((Boolean) zzbeg.zzb.zze()).booleanValue()) {
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlW)).booleanValue()) {
                                ExecutorService executorService2 = AbstractC7586c.f30234b;
                                final String objArr5 = objArr == true ? 1 : 0;
                                executorService2.execute(new Runnable(objArr5) { // from class: com.google.android.gms.ads.internal.client.s1
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.f14088a.m17339m(null);
                                    }
                                });
                            } else {
                                AbstractC7599p.m33326a("Initializing on calling thread");
                                m17329d(null);
                            }
                        } else {
                            AbstractC7599p.m33326a("Initializing on calling thread");
                            m17329d(null);
                        }
                        this.f14104a = new C3388r1(context);
                        this.f14105b = new C3246B1(context);
                        this.f14106c = new C3384q1(context);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final float m17333g() {
        synchronized (this.f14112i) {
            InterfaceC3248C0 interfaceC3248C0 = this.f14113j;
            float fZzk = 1.0f;
            if (interfaceC3248C0 == null) {
                return 1.0f;
            }
            try {
                fZzk = interfaceC3248C0.zzk();
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("Unable to get app volume.", e7);
            }
            return fZzk;
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17334h() {
        synchronized (this.f14112i) {
            InterfaceC3248C0 interfaceC3248C0 = this.f14113j;
            boolean zZzl = false;
            if (interfaceC3248C0 == null) {
                return false;
            }
            try {
                zZzl = interfaceC3248C0.zzl();
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("Unable to get app mute state.", e7);
            }
            return zZzl;
        }
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC7225b m17335i() {
        InterfaceC7225b interfaceC7225bM17326a;
        synchronized (this.f14112i) {
            try {
                AbstractC3718s.m18087p(this.f14113j != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    interfaceC7225bM17326a = m17326a(this.f14113j.zzq());
                } catch (RemoteException unused) {
                    AbstractC7599p.m33328c("Unable to get Initialization status.");
                    return new InterfaceC7225b() { // from class: com.google.android.gms.ads.internal.client.t1
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC7225bM17326a;
    }

    /* JADX INFO: renamed from: j */
    public final C6570v m17336j() {
        return this.f14114k;
    }

    /* JADX INFO: renamed from: k */
    public final void m17337k(String str) {
        synchronized (this.f14112i) {
            AbstractC3718s.m18087p(this.f14113j != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f14113j.zzv(str);
            } catch (RemoteException e7) {
                AbstractC7599p.m33329d("Unable to set plugin.", e7);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    final /* synthetic */ void m17338l(String str) {
        synchronized (this.f14112i) {
            m17329d(null);
        }
    }

    /* JADX INFO: renamed from: m */
    final /* synthetic */ void m17339m(String str) {
        synchronized (this.f14112i) {
            m17329d(null);
        }
    }

    /* JADX INFO: renamed from: o */
    final /* synthetic */ Object m17340o() {
        return this.f14107d;
    }

    /* JADX INFO: renamed from: p */
    final /* synthetic */ ArrayList m17341p() {
        return this.f14109f;
    }

    /* JADX INFO: renamed from: q */
    final /* synthetic */ void m17342q(boolean z7) {
        this.f14110g = false;
    }

    /* JADX INFO: renamed from: r */
    final /* synthetic */ void m17343r(boolean z7) {
        this.f14111h = true;
    }
}
