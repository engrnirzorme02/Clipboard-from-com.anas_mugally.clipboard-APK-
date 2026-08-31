package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzby;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzdj;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p403z1.C7559a;
import p403z1.C7567i;
import p403z1.C7580v;
import p403z1.InterfaceC7560b;
import p403z1.InterfaceC7562d;
import p403z1.InterfaceC7564f;
import p403z1.InterfaceC7565g;
import p403z1.InterfaceC7566h;
import p403z1.InterfaceC7571m;
import p403z1.InterfaceC7578t;

/* JADX INFO: renamed from: com.android.billingclient.api.b */
/* JADX INFO: loaded from: classes.dex */
class C3176b extends AbstractC3175a {

    /* JADX INFO: renamed from: A */
    private boolean f13507A;

    /* JADX INFO: renamed from: B */
    private boolean f13508B;

    /* JADX INFO: renamed from: C */
    private boolean f13509C;

    /* JADX INFO: renamed from: D */
    private C3179e f13510D;

    /* JADX INFO: renamed from: E */
    private boolean f13511E;

    /* JADX INFO: renamed from: F */
    private boolean f13512F;

    /* JADX INFO: renamed from: G */
    private volatile InterfaceC7562d f13513G;

    /* JADX INFO: renamed from: H */
    private ExecutorService f13514H;

    /* JADX INFO: renamed from: I */
    private final Long f13515I;

    /* JADX INFO: renamed from: J */
    private zzbl f13516J;

    /* JADX INFO: renamed from: a */
    private final Object f13517a;

    /* JADX INFO: renamed from: b */
    private volatile int f13518b;

    /* JADX INFO: renamed from: c */
    private final String f13519c;

    /* JADX INFO: renamed from: d */
    private final String f13520d;

    /* JADX INFO: renamed from: e */
    private final Handler f13521e;

    /* JADX INFO: renamed from: f */
    private volatile C3171T f13522f;

    /* JADX INFO: renamed from: g */
    private Context f13523g;

    /* JADX INFO: renamed from: h */
    private InterfaceC3162J f13524h;

    /* JADX INFO: renamed from: i */
    private volatile zzam f13525i;

    /* JADX INFO: renamed from: j */
    private volatile ServiceConnectionC3197w f13526j;

    /* JADX INFO: renamed from: k */
    private boolean f13527k;

    /* JADX INFO: renamed from: l */
    private boolean f13528l;

    /* JADX INFO: renamed from: m */
    private int f13529m;

    /* JADX INFO: renamed from: n */
    private boolean f13530n;

    /* JADX INFO: renamed from: o */
    private boolean f13531o;

    /* JADX INFO: renamed from: p */
    private boolean f13532p;

    /* JADX INFO: renamed from: q */
    private boolean f13533q;

    /* JADX INFO: renamed from: r */
    private boolean f13534r;

    /* JADX INFO: renamed from: s */
    private boolean f13535s;

    /* JADX INFO: renamed from: t */
    private boolean f13536t;

    /* JADX INFO: renamed from: u */
    private boolean f13537u;

    /* JADX INFO: renamed from: v */
    private boolean f13538v;

    /* JADX INFO: renamed from: w */
    private boolean f13539w;

    /* JADX INFO: renamed from: x */
    private boolean f13540x;

    /* JADX INFO: renamed from: y */
    private boolean f13541y;

    /* JADX INFO: renamed from: z */
    private boolean f13542z;

    C3176b(String str, Context context, InterfaceC3162J interfaceC3162J, ExecutorService executorService, AbstractC3175a.a aVar) {
        this.f13517a = new Object();
        this.f13518b = 0;
        this.f13521e = new Handler(Looper.getMainLooper());
        this.f13529m = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f13515I = lValueOf;
        this.f13516J = zzaz.zza();
        this.f13519c = "8.0.0";
        String strM16837a0 = m16837a0();
        this.f13520d = strM16837a0;
        this.f13523g = context.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strM16837a0 != null) {
            zziqVarZzc.zzt(strM16837a0);
        }
        zziqVarZzc.zzq(this.f13523g.getPackageName());
        zziqVarZzc.zzn(lValueOf.longValue());
        zziqVarZzc.zzr(aVar.f13506f);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f13523g.getPackageManager().getPackageInfo(this.f13523g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.f13524h = new C3164L(this.f13523g, (zzis) zziqVarZzc.zze());
        this.f13523g.getPackageName();
        this.f13511E = aVar.f13506f;
    }

    /* JADX INFO: renamed from: A */
    private final void m16809A(InterfaceC7562d interfaceC7562d, int i7) {
        zzie zzieVar;
        C3178d c3178dM16832V;
        C3178d c3178d;
        synchronized (this.f13517a) {
            try {
                if (m16816E()) {
                    c3178dM16832V = m16832V(i7);
                } else {
                    if (this.f13518b == 1) {
                        zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzie zzieVar2 = zzie.BILLING_CLIENT_CONNECTING;
                        c3178d = AbstractC3163K.f13436d;
                        m16874y(zzieVar2, c3178d, i7);
                    } else if (this.f13518b == 3) {
                        zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzie zzieVar3 = zzie.BILLING_CLIENT_CLOSED;
                        c3178d = AbstractC3163K.f13442j;
                        m16874y(zzieVar3, c3178d, i7);
                    } else {
                        m16876z(1);
                        if (i7 == 0) {
                            this.f13513G = interfaceC7562d;
                            i7 = 0;
                        }
                        m16811B();
                        zzc.zzm("BillingClient", "Starting in-app billing setup.");
                        this.f13526j = new ServiceConnectionC3197w(this, interfaceC7562d, i7, null);
                        this.f13526j.m16979c();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f13523g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                    zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f13519c);
                                    synchronized (this.f13517a) {
                                        try {
                                            if (this.f13518b == 2) {
                                                c3178dM16832V = m16832V(i7);
                                            } else if (this.f13518b != 1) {
                                                zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzie zzieVar4 = zzie.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                c3178d = AbstractC3163K.f13442j;
                                                m16874y(zzieVar4, c3178d, i7);
                                            } else {
                                                ServiceConnectionC3197w serviceConnectionC3197w = this.f13526j;
                                                if ((i7 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f13523g.bindService(intent2, serviceConnectionC3197w, 1) : this.f13523g.bindService(intent2, 1, m16879i(), serviceConnectionC3197w)) {
                                                    zzc.zzm("BillingClient", "Service was bonded successfully.");
                                                    c3178dM16832V = null;
                                                } else {
                                                    zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                                    zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                zzieVar = zzie.INVALID_PHONESKY_PACKAGE;
                                zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        m16876z(0);
                        zzc.zzm("BillingClient", "Billing service unavailable on device.");
                        C3178d c3178d2 = AbstractC3163K.f13434b;
                        m16874y(zzieVar, c3178d2, i7);
                        c3178dM16832V = c3178d2;
                    }
                    c3178dM16832V = c3178d;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c3178dM16832V != null) {
            interfaceC7562d.mo15840G(c3178dM16832V);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final void m16811B() {
        synchronized (this.f13517a) {
            if (this.f13526j != null) {
                try {
                    this.f13523g.unbindService(this.f13526j);
                    this.f13525i = null;
                    this.f13526j = null;
                } catch (Throwable th) {
                    try {
                        zzc.zzo("BillingClient", "There was an exception while unbinding service!", th);
                        this.f13525i = null;
                        this.f13526j = null;
                    } catch (Throwable th2) {
                        this.f13525i = null;
                        this.f13526j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    private final boolean m16813C(long j7) {
        try {
            C3178d c3178d = (C3178d) m16834X(1).get(Build.VERSION.SDK_INT < 29 ? 0L : 3000L, TimeUnit.MILLISECONDS);
            if (c3178d.m16929c() == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + c3178d.m16929c());
            } else {
                zzc.zzn("BillingClient", "Reconnection failed with result: " + c3178d.m16929c());
            }
        } catch (Exception e7) {
            if (e7 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzc.zzo("BillingClient", "Error during reconnection attempt: ", e7);
        }
        return m16816E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final boolean m16815D(long j7) {
        zzbi zzbiVarZzb = zzbi.zzb(this.f13516J);
        long jZza = 30000;
        for (int i7 = 1; i7 <= 3; i7++) {
            try {
                long jMax = Math.max(0L, jZza);
                if (jMax <= 0) {
                    zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                    return m16816E();
                }
                C3178d c3178d = (C3178d) m16834X(i7).get(jMax, TimeUnit.MILLISECONDS);
                if (c3178d.m16929c() == 0) {
                    zzc.zzm("BillingClient", "Reconnection succeeded with result: " + c3178d.m16929c());
                    return m16816E();
                }
                zzc.zzn("BillingClient", "Reconnection failed with result: " + c3178d.m16929c());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jZza = 30000 - zzbiVarZzb.zza(timeUnit);
                long jPow = ((long) Math.pow(2.0d, i7 - 1)) * 1000;
                if (jZza < jPow) {
                    zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return m16816E();
                }
                if (i7 < 3 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jZza = 30000 - zzbiVarZzb.zza(timeUnit);
                    } catch (InterruptedException e7) {
                        Thread.currentThread().interrupt();
                        zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e7);
                    }
                }
            } catch (Exception e8) {
                if (e8 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzo("BillingClient", "Error during reconnection attempt: ", e8);
            }
        }
        zzc.zzn("BillingClient", "Max retries reached.");
        return m16816E();
    }

    /* JADX INFO: renamed from: E */
    private final boolean m16816E() {
        boolean z7;
        synchronized (this.f13517a) {
            try {
                z7 = false;
                if (this.f13518b == 2 && this.f13525i != null && this.f13526j != null) {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: F */
    private static final String m16817F(int i7) {
        if (i7 == 0) {
            return "DISCONNECTED";
        }
        if (i7 != 1) {
            return i7 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    /* JADX INFO: renamed from: I */
    static /* bridge */ /* synthetic */ void m16820I(C3176b c3176b, int i7) {
        c3176b.f13529m = i7;
        c3176b.f13509C = i7 >= 26;
        c3176b.f13508B = i7 >= 24;
        c3176b.f13507A = i7 >= 23;
        c3176b.f13542z = i7 >= 22;
        c3176b.f13541y = i7 >= 21;
        c3176b.f13540x = i7 >= 20;
        c3176b.f13539w = i7 >= 19;
        c3176b.f13538v = i7 >= 18;
        c3176b.f13537u = i7 >= 17;
        c3176b.f13536t = i7 >= 16;
        c3176b.f13535s = i7 >= 15;
        c3176b.f13534r = i7 >= 14;
        c3176b.f13533q = i7 >= 12;
        c3176b.f13532p = i7 >= 9;
        c3176b.f13531o = i7 >= 8;
        c3176b.f13530n = i7 >= 6;
    }

    /* JADX INFO: renamed from: K */
    static /* bridge */ /* synthetic */ void m16822K(C3176b c3176b, int i7) {
        if (i7 != 0) {
            c3176b.m16876z(0);
            return;
        }
        synchronized (c3176b.f13517a) {
            try {
                if (c3176b.f13518b == 3) {
                    return;
                }
                c3176b.m16876z(2);
                C3171T c3171t = c3176b.f13522f != null ? c3176b.f13522f : null;
                if (c3171t != null) {
                    c3171t.m16801f(c3176b.f13541y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    static /* bridge */ /* synthetic */ boolean m16825O(C3176b c3176b) {
        boolean z7;
        synchronized (c3176b.f13517a) {
            z7 = true;
            if (c3176b.f13518b != 1) {
                z7 = false;
            }
        }
        return z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ Bundle m16828R(int i7, String str, String str2, C3177c c3177c, Bundle bundle) {
        zzam zzamVar;
        try {
            synchronized (this.f13517a) {
                zzamVar = this.f13525i;
            }
            return zzamVar == null ? zzc.zzd(AbstractC3163K.f13442j, zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzg(i7, this.f13523g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e7) {
            return zzc.zze(AbstractC3163K.f13442j, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, AbstractC3161I.m16761a(e7));
        } catch (Exception e8) {
            return zzc.zze(AbstractC3163K.f13440h, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, AbstractC3161I.m16761a(e8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final /* synthetic */ Bundle m16829S(String str, String str2) {
        zzam zzamVar;
        try {
            synchronized (this.f13517a) {
                zzamVar = this.f13525i;
            }
            return zzamVar == null ? zzc.zzd(AbstractC3163K.f13442j, zzie.SERVICE_RESET_TO_NULL) : zzamVar.zzf(3, this.f13523g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e7) {
            return zzc.zze(AbstractC3163K.f13442j, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, AbstractC3161I.m16761a(e7));
        } catch (Exception e8) {
            return zzc.zze(AbstractC3163K.f13440h, zzie.LAUNCH_BILLING_FLOW_EXCEPTION, AbstractC3161I.m16761a(e8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public final Handler m16830T() {
        return Looper.myLooper() == null ? this.f13521e : new Handler(Looper.myLooper());
    }

    /* JADX INFO: renamed from: U */
    private final C3198x m16831U(C3178d c3178d, zzie zzieVar, String str, Exception exc) {
        zzc.zzo("BillingClient", str, exc);
        m16843g0(zzieVar, 7, c3178d, AbstractC3161I.m16761a(exc));
        return new C3198x(c3178d.m16929c(), c3178d.m16927a(), new ArrayList(), new ArrayList());
    }

    /* JADX INFO: renamed from: V */
    private final C3178d m16832V(int i7) {
        zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzhz zzhzVarZzc = zzib.zzc();
        zzhzVarZzc.zzo(6);
        zzjt zzjtVarZzc = zzjv.zzc();
        zzjtVarZzc.zzn(true);
        zzjtVarZzc.zza(i7 > 0);
        zzjtVarZzc.zzl(i7);
        zzhzVarZzc.zzn(zzjtVarZzc);
        m16872x((zzib) zzhzVarZzc.zze());
        return AbstractC3163K.f13441i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public final C3178d m16833W() {
        int[] iArr = {0, 3};
        synchronized (this.f13517a) {
            for (int i7 = 0; i7 < 2; i7++) {
                if (this.f13518b == iArr[i7]) {
                    return AbstractC3163K.f13442j;
                }
            }
            return AbstractC3163K.f13440h;
        }
    }

    /* JADX INFO: renamed from: X */
    private final zzcz m16834X(final int i7) {
        if (this.f13511E && !m16816E()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.U
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    return C3176b.m16873x0(this.f13490a, i7, zzpVar);
                }
            });
        }
        zzc.zzm("BillingClient", "Already connected or not opted into auto reconnection.");
        return zzcu.zza(AbstractC3163K.f13441i);
    }

    /* JADX INFO: renamed from: Y */
    private final /* synthetic */ Object m16835Y(InterfaceC7560b interfaceC7560b, C7559a c7559a) {
        zzam zzamVar;
        try {
            if (!m16815D(30000L)) {
                zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
                C3178d c3178d = AbstractC3163K.f13442j;
                m16841e0(zzieVar, 3, c3178d);
                interfaceC7560b.mo16408a(c3178d);
            } else if (TextUtils.isEmpty(c7559a.m33259a())) {
                zzc.zzn("BillingClient", "Please provide a valid purchase token.");
                zzie zzieVar2 = zzie.EMPTY_PURCHASE_TOKEN;
                C3178d c3178d2 = AbstractC3163K.f13439g;
                m16841e0(zzieVar2, 3, c3178d2);
                interfaceC7560b.mo16408a(c3178d2);
            } else if (this.f13532p) {
                synchronized (this.f13517a) {
                    zzamVar = this.f13525i;
                }
                if (zzamVar != null) {
                    String packageName = this.f13523g.getPackageName();
                    String strM33259a = c7559a.m33259a();
                    String str = this.f13519c;
                    String str2 = this.f13520d;
                    long jLongValue = this.f13515I.longValue();
                    int i7 = zzc.zza;
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, str, str2, jLongValue);
                    Bundle bundleZzd = zzamVar.zzd(9, packageName, strM33259a, bundle);
                    interfaceC7560b.mo16408a(AbstractC3163K.m16775a(zzc.zzb(bundleZzd, "BillingClient"), zzc.zzj(bundleZzd, "BillingClient")));
                    return null;
                }
                m16866u(interfaceC7560b, AbstractC3163K.f13442j, zzie.SERVICE_RESET_TO_NULL, null);
            } else {
                zzie zzieVar3 = zzie.API_VERSION_NOT_V9;
                C3178d c3178d3 = AbstractC3163K.f13433a;
                m16841e0(zzieVar3, 3, c3178d3);
                interfaceC7560b.mo16408a(c3178d3);
            }
            return null;
        } catch (DeadObjectException e7) {
            m16866u(interfaceC7560b, AbstractC3163K.f13442j, zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e7);
            return null;
        } catch (Exception e8) {
            m16866u(interfaceC7560b, AbstractC3163K.f13440h, zzie.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e8);
            return null;
        }
    }

    /* JADX INFO: renamed from: Z */
    private final String m16836Z(C3181g c3181g) {
        if (TextUtils.isEmpty(null)) {
            return this.f13523g.getPackageName();
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    private static String m16837a0() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final C7580v m16839c0(int i7, C3178d c3178d, zzie zzieVar, String str, Exception exc) {
        m16843g0(zzieVar, 9, c3178d, AbstractC3161I.m16761a(exc));
        zzc.zzo("BillingClient", str, exc);
        return new C7580v(c3178d, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:67:0x018c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Code duplicated, block: B:96:0x0165 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d0 */
    public final C7580v m16840d0(String str, boolean z7, int i7) {
        zzam zzamVar;
        int i8;
        int i9;
        Bundle bundleZzi;
        C3178d c3178dM16930a;
        zzie zzieVar;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        int i10;
        boolean z8;
        Purchase purchase;
        C3176b c3176b = this;
        zzc.zzm("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z9 = c3176b.f13532p;
        boolean z10 = c3176b.f13539w;
        boolean zM16935a = c3176b.f13510D.m16935a();
        boolean zM16936b = c3176b.f13510D.m16936b();
        long jLongValue = c3176b.f13515I.longValue();
        Bundle bundle = new Bundle();
        zzc.zzc(bundle, c3176b.f13519c, c3176b.f13520d, jLongValue);
        if (z9 && zM16935a) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z10 && zM16936b) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        String string = null;
        do {
            try {
                synchronized (c3176b.f13517a) {
                    zzamVar = c3176b.f13525i;
                }
                if (zzamVar == null) {
                    return c3176b.m16839c0(9, AbstractC3163K.f13442j, zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (c3176b.f13532p) {
                    if (c3176b.f13509C) {
                        i9 = 26;
                    } else if (c3176b.f13508B) {
                        i9 = 24;
                    } else {
                        if (c3176b.f13539w) {
                            i9 = 19;
                        } else {
                            i8 = 9;
                        }
                        bundleZzi = zzamVar.zzi(i8, c3176b.f13523g.getPackageName(), str, string, bundle);
                    }
                    i8 = i9;
                    bundleZzi = zzamVar.zzi(i8, c3176b.f13523g.getPackageName(), str, string, bundle);
                } else {
                    bundleZzi = zzamVar.zzh(3, c3176b.f13523g.getPackageName(), str, string);
                }
                C3178d c3178d = AbstractC3163K.f13440h;
                if (bundleZzi == null) {
                    zzc.zzn("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                    zzieVar = zzie.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iZzb = zzc.zzb(bundleZzi, "BillingClient");
                    String strZzj = zzc.zzj(bundleZzi, "BillingClient");
                    C3178d.a aVarM16923d = C3178d.m16923d();
                    aVarM16923d.m16933d(iZzb);
                    aVarM16923d.m16931b(strZzj);
                    c3178dM16930a = aVarM16923d.m16930a();
                    if (iZzb != 0) {
                        zzc.zzn("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iZzb)));
                        zzieVar = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    } else if (bundleZzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzi.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList4 = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList5 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList6 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList4 == null) {
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                            zzieVar = zzie.NULL_SKUS_LIST;
                        } else if (stringArrayList5 == null) {
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                            zzieVar = zzie.NULL_PURCHASES_LIST;
                        } else if (stringArrayList6 == null) {
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                            zzieVar = zzie.NULL_SIGNATURES_LIST;
                        } else {
                            c3178dM16930a = AbstractC3163K.f13441i;
                            zzieVar = zzie.REASON_UNSPECIFIED;
                        }
                    } else {
                        zzc.zzn("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                        zzieVar = zzie.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (c3178dM16930a != AbstractC3163K.f13441i) {
                        return c3176b.m16839c0(9, c3178dM16930a, zzieVar, "Purchase bundle invalid", null);
                    }
                    stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    z8 = false;
                    for (i10 = 0; i10 < stringArrayList2.size(); i10++) {
                        String str2 = stringArrayList2.get(i10);
                        String str3 = stringArrayList3.get(i10);
                        zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i10))));
                        try {
                            purchase = new Purchase(str2, str3);
                            if (TextUtils.isEmpty(purchase.m16790d())) {
                                zzc.zzn("BillingClient", "BUG: empty/null token!");
                                z8 = true;
                            }
                            arrayList.add(purchase);
                        } catch (JSONException e7) {
                            return m16839c0(9, AbstractC3163K.f13440h, zzie.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e7);
                        }
                    }
                    c3176b = this;
                    if (z8) {
                        c3176b.m16841e0(zzie.EMPTY_PURCHASE_TOKEN, 9, c3178d);
                    }
                    string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                    zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                }
                c3178dM16930a = c3178d;
                if (c3178dM16930a != AbstractC3163K.f13441i) {
                    return c3176b.m16839c0(9, c3178dM16930a, zzieVar, "Purchase bundle invalid", null);
                }
                stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                z8 = false;
                while (i10 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i10);
                    String str5 = stringArrayList3.get(i10);
                    zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i10))));
                    purchase = new Purchase(str4, str5);
                    if (TextUtils.isEmpty(purchase.m16790d())) {
                        zzc.zzn("BillingClient", "BUG: empty/null token!");
                        z8 = true;
                    }
                    arrayList.add(purchase);
                }
                c3176b = this;
                if (z8) {
                    c3176b.m16841e0(zzie.EMPTY_PURCHASE_TOKEN, 9, c3178d);
                }
                string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e8) {
                return m16839c0(9, AbstractC3163K.f13442j, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e8);
            } catch (Exception e9) {
                return c3176b.m16839c0(9, AbstractC3163K.f13440h, zzie.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e9);
            }
        } while (!TextUtils.isEmpty(string));
        return new C7580v(AbstractC3163K.f13441i, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m16841e0(zzie zzieVar, int i7, C3178d c3178d) {
        try {
            int i8 = AbstractC3161I.f13425a;
            m16868v(AbstractC3161I.m16762b(zzieVar, i7, c3178d, null, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final void m16842f0(zzie zzieVar, int i7, C3178d c3178d, long j7) {
        try {
            int i8 = AbstractC3161I.f13425a;
            try {
                this.f13524h.mo16773j(AbstractC3161I.m16762b(zzieVar, 2, c3178d, null, zzil.BROADCAST_ACTION_UNSPECIFIED), this.f13529m, j7);
            } catch (Throwable th) {
                zzc.zzo("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private final void m16843g0(zzie zzieVar, int i7, C3178d c3178d, String str) {
        try {
            int i8 = AbstractC3161I.f13425a;
            m16868v(AbstractC3161I.m16762b(zzieVar, i7, c3178d, str, zzil.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m16844h(Context context, InterfaceC7566h interfaceC7566h, C3179e c3179e, InterfaceC7571m interfaceC7571m, String str, InterfaceC3162J interfaceC3162J, AbstractC3175a.a aVar) {
        this.f13523g = context.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs(str);
        String str2 = this.f13520d;
        if (str2 != null) {
            zziqVarZzc.zzt(str2);
        }
        zziqVarZzc.zzq(this.f13523g.getPackageName());
        zziqVarZzc.zzn(this.f13515I.longValue());
        zziqVarZzc.zzr(aVar.f13506f);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f13523g.getPackageManager().getPackageInfo(this.f13523g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        if (interfaceC3162J != null) {
            this.f13524h = interfaceC3162J;
        } else {
            this.f13524h = new C3164L(this.f13523g, (zzis) zziqVarZzc.zze());
        }
        if (interfaceC7566h == null) {
            zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f13522f = new C3171T(this.f13523g, interfaceC7566h, null, interfaceC7571m, null, this.f13524h);
        this.f13510D = c3179e;
        this.f13512F = interfaceC7571m != null;
        this.f13523g.getPackageName();
        this.f13511E = aVar.f13506f;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m16845h0(zzie zzieVar, int i7, C3178d c3178d, long j7, boolean z7) {
        try {
            int i8 = AbstractC3161I.f13425a;
            m16870w(AbstractC3161I.m16762b(zzieVar, 2, c3178d, null, zzil.BROADCAST_ACTION_UNSPECIFIED), j7, z7);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: i0 */
    private final void m16846i0(zzie zzieVar, int i7, C3178d c3178d, String str, long j7, boolean z7) {
        try {
            int i8 = AbstractC3161I.f13425a;
            m16870w(AbstractC3161I.m16762b(zzieVar, 2, c3178d, str, zzil.BROADCAST_ACTION_UNSPECIFIED), j7, z7);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: j */
    static Future m16847j(Callable callable, long j7, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: z1.l
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j7 * 0.95d));
            return futureSubmit;
        } catch (Exception e7) {
            zzc.zzo("BillingClient", "Async task throws exception!", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m16849k(C3176b c3176b, InterfaceC7565g interfaceC7565g) {
        zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
        C3178d c3178d = AbstractC3163K.f13443k;
        c3176b.m16841e0(zzieVar, 9, c3178d);
        interfaceC7565g.mo27214a(c3178d, zzbt.zzk());
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m16851l(C3176b c3176b, InterfaceC7560b interfaceC7560b) {
        zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
        C3178d c3178d = AbstractC3163K.f13443k;
        c3176b.m16841e0(zzieVar, 3, c3178d);
        interfaceC7560b.mo16408a(c3178d);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m16853m(C3176b c3176b, InterfaceC7564f interfaceC7564f) {
        zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
        C3178d c3178d = AbstractC3163K.f13443k;
        c3176b.m16841e0(zzieVar, 7, c3178d);
        interfaceC7564f.mo24531a(c3178d, new C3182h(zzbt.zzk(), zzbt.zzk()));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m16855n(C3176b c3176b, C3178d c3178d) {
        if (c3176b.f13522f.m16800d() != null) {
            c3176b.f13522f.m16800d().mo15839D(c3178d, null);
        } else {
            zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    /* JADX INFO: renamed from: s0 */
    static /* bridge */ /* synthetic */ C3178d m16864s0(Exception exc) {
        return exc instanceof DeadObjectException ? AbstractC3163K.f13442j : AbstractC3163K.f13440h;
    }

    /* JADX INFO: renamed from: u */
    private final void m16866u(InterfaceC7560b interfaceC7560b, C3178d c3178d, zzie zzieVar, Exception exc) {
        zzc.zzo("BillingClient", "Error in acknowledge purchase!", exc);
        m16843g0(zzieVar, 3, c3178d, AbstractC3161I.m16761a(exc));
        interfaceC7560b.mo16408a(c3178d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final void m16868v(zzhx zzhxVar) {
        try {
            this.f13524h.mo16774k(zzhxVar, this.f13529m);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m16870w(zzhx zzhxVar, long j7, boolean z7) {
        try {
            this.f13524h.mo16764a(zzhxVar, this.f13529m, j7, z7);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final void m16872x(zzib zzibVar) {
        try {
            this.f13524h.mo16767d(zzibVar, this.f13529m);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ Object m16873x0(C3176b c3176b, int i7, zzp zzpVar) {
        c3176b.m16809A(new C3194t(c3176b, zzpVar), i7);
        return "reconnectIfNeeded";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m16874y(zzie zzieVar, C3178d c3178d, int i7) {
        try {
            int i8 = AbstractC3161I.f13425a;
            zzhv zzhvVar = (zzhv) AbstractC3161I.m16762b(zzieVar, 6, c3178d, null, zzil.BROADCAST_ACTION_UNSPECIFIED).zzm();
            zzjt zzjtVarZzc = zzjv.zzc();
            zzjtVarZzc.zza(i7 > 0);
            zzjtVarZzc.zzl(i7);
            zzhvVar.zzo(zzjtVarZzc);
            m16868v((zzhx) zzhvVar.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ Object m16875y0(C3176b c3176b, InterfaceC7564f interfaceC7564f, C3181g c3181g) {
        if (!c3176b.m16815D(30000L)) {
            zzie zzieVar = zzie.SERVICE_CONNECTION_NOT_READY;
            C3178d c3178d = AbstractC3163K.f13442j;
            c3176b.m16841e0(zzieVar, 7, c3178d);
            interfaceC7564f.mo24531a(c3178d, new C3182h(zzbt.zzk(), zzbt.zzk()));
            return null;
        }
        if (c3176b.f13537u) {
            C3198x c3198xM16880n0 = c3176b.m16880n0(c3181g);
            interfaceC7564f.mo24531a(AbstractC3163K.m16775a(c3198xM16880n0.m16981a(), c3198xM16880n0.m16982b()), new C3182h(c3198xM16880n0.m16983c(), c3198xM16880n0.m16984d()));
            return null;
        }
        zzc.zzn("BillingClient", "Querying product details is not supported.");
        zzie zzieVar2 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
        C3178d c3178d2 = AbstractC3163K.f13450r;
        c3176b.m16841e0(zzieVar2, 7, c3178d2);
        interfaceC7564f.mo24531a(c3178d2, new C3182h(zzbt.zzk(), zzbt.zzk()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final void m16876z(int i7) {
        synchronized (this.f13517a) {
            try {
                if (this.f13518b == 3) {
                    return;
                }
                zzc.zzm("BillingClient", "Setting clientState from " + m16817F(this.f13518b) + " to " + m16817F(i7));
                this.f13518b = i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ Object m16877z0(C3176b c3176b, InterfaceC7560b interfaceC7560b, C7559a c7559a) {
        c3176b.m16835Y(interfaceC7560b, c7559a);
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m16878M(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f13521e.post(runnable);
        }
    }

    @Override // com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: a */
    public void mo16757a(final C7559a c7559a, final InterfaceC7560b interfaceC7560b) {
        if (m16847j(new Callable() { // from class: com.android.billingclient.api.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3176b.m16877z0(this.f13641a, interfaceC7560b, c7559a);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.k
            @Override // java.lang.Runnable
            public final void run() {
                C3176b.m16851l(this.f13644a, interfaceC7560b);
            }
        }, m16830T(), m16879i()) == null) {
            C3178d c3178dM16833W = m16833W();
            m16841e0(zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, c3178dM16833W);
            interfaceC7560b.mo16408a(c3178dM16833W);
        }
    }

    @Override // com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: b */
    public final int mo16803b() {
        int i7;
        synchronized (this.f13517a) {
            i7 = this.f13518b;
        }
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.android.billingclient.api.b] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [long] */
    @Override // com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: c */
    public C3178d mo16758c(Activity activity, C3177c c3177c) {
        boolean zM16980d;
        long j7;
        Future futureM16847j;
        ?? r7;
        ?? r8;
        ?? r9;
        zzie zzieVarZzb;
        Object obj;
        String str;
        boolean z7;
        boolean z8;
        long j8;
        boolean z9;
        int i7;
        long jNextLong = new Random().nextLong();
        if (this.f13522f == null || this.f13522f.m16800d() == null) {
            zzie zzieVar = zzie.MISSING_LISTENER;
            C3178d c3178d = AbstractC3163K.f13431E;
            m16842f0(zzieVar, 2, c3178d, jNextLong);
            return c3178d;
        }
        if (!m16813C(3000L)) {
            zzie zzieVar2 = zzie.SERVICE_CONNECTION_NOT_READY;
            C3178d c3178d2 = AbstractC3163K.f13442j;
            m16842f0(zzieVar2, 2, c3178d2, jNextLong);
            m16882t0(c3178d2);
            return c3178d2;
        }
        synchronized (this.f13517a) {
            try {
                zM16980d = this.f13526j != null ? this.f13526j.m16980d() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayListM16900k = c3177c.m16900k();
        List listM16901l = c3177c.m16901l();
        String string = null;
        AbstractC2263x.m9328a(zzby.zza(arrayListM16900k, null));
        C3177c.b bVar = (C3177c.b) zzby.zza(listM16901l, null);
        final String strM16942c = bVar.m16907b().m16942c();
        final String strM16943d = bVar.m16907b().m16943d();
        if (strM16943d.equals("subs") && !this.f13527k) {
            zzc.zzn("BillingClient", "Current client doesn't support subscriptions.");
            zzie zzieVar3 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
            C3178d c3178d3 = AbstractC3163K.f13444l;
            m16845h0(zzieVar3, 2, c3178d3, jNextLong, zM16980d);
            m16882t0(c3178d3);
            return c3178d3;
        }
        if (c3177c.m16903u() && !this.f13530n) {
            zzc.zzn("BillingClient", "Current client doesn't support extra params for buy intent.");
            zzie zzieVar4 = zzie.EXTRA_PARAMS_NOT_SUPPORTED;
            C3178d c3178d4 = AbstractC3163K.f13438f;
            m16845h0(zzieVar4, 2, c3178d4, jNextLong, zM16980d);
            m16882t0(c3178d4);
            return c3178d4;
        }
        if (arrayListM16900k.size() > 1 && !this.f13536t) {
            zzc.zzn("BillingClient", "Current client doesn't support multi-item purchases.");
            zzie zzieVar5 = zzie.MULTI_ITEM_NOT_SUPPORTED;
            C3178d c3178d5 = AbstractC3163K.f13448p;
            m16845h0(zzieVar5, 2, c3178d5, jNextLong, zM16980d);
            m16882t0(c3178d5);
            return c3178d5;
        }
        if (!listM16901l.isEmpty() && !this.f13537u) {
            zzc.zzn("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzie zzieVar6 = zzie.PRODUCT_DETAILS_NOT_SUPPORTED;
            C3178d c3178d6 = AbstractC3163K.f13450r;
            m16845h0(zzieVar6, 2, c3178d6, jNextLong, zM16980d);
            m16882t0(c3178d6);
            return c3178d6;
        }
        C3178d c3178dM16894e = c3177c.m16894e();
        if (c3178dM16894e != AbstractC3163K.f13441i) {
            m16845h0(zzie.INVALID_BILLING_FLOW_PARAMS, 2, c3178dM16894e, jNextLong, zM16980d);
            m16882t0(c3178dM16894e);
            return c3178dM16894e;
        }
        if (this.f13530n) {
            boolean z10 = this.f13532p;
            boolean z11 = this.f13539w;
            boolean zM16935a = this.f13510D.m16935a();
            boolean zM16936b = this.f13510D.m16936b();
            boolean z12 = this.f13512F;
            String str2 = this.f13519c;
            String str3 = this.f13520d;
            boolean z13 = zM16980d;
            long jLongValue = this.f13515I.longValue();
            this.f13523g.getPackageName();
            int i8 = zzc.zza;
            final Bundle bundle = new Bundle();
            zzc.zzc(bundle, str2, str3, jLongValue);
            bundle.putLong("billingClientTransactionId", jNextLong);
            if (c3177c.m16892c() != 0) {
                bundle.putInt("prorationMode", c3177c.m16892c());
            }
            if (!TextUtils.isEmpty(c3177c.m16895f())) {
                bundle.putString("accountId", c3177c.m16895f());
            }
            if (!TextUtils.isEmpty(c3177c.m16896g())) {
                bundle.putString("obfuscatedProfileId", c3177c.m16896g());
            }
            if (c3177c.m16902t()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
            }
            if (!TextUtils.isEmpty(c3177c.m16898i())) {
                bundle.putString("oldSkuPurchaseToken", c3177c.m16898i());
            }
            c3177c.m16897h();
            if (TextUtils.isEmpty(null)) {
                str = null;
            } else {
                c3177c.m16897h();
                str = null;
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!TextUtils.isEmpty(c3177c.m16899j())) {
                bundle.putString("originalExternalTransactionId", c3177c.m16899j());
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("paymentsPurchaseParams", str);
            }
            if (z10 && zM16935a) {
                z7 = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z7 = true;
            }
            if (z11 && zM16936b) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z7);
            }
            if (z12) {
                bundle.putBoolean("enableAlternativeBilling", z7);
            }
            c3177c.m16893d();
            c3177c.m16891b();
            ArrayList arrayList = new ArrayList();
            for (C3177c.b bVar2 : c3177c.m16901l()) {
            }
            if (!arrayList.isEmpty()) {
                zzdj zzdjVarZza = zzdk.zza();
                zzdjVarZza.zza(arrayList);
                bundle.putByteArray("subscriptionProductReplacementParamsList", ((zzdk) zzdjVarZza.zze()).zzM());
            }
            if (arrayListM16900k.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<>(listM16901l.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>(listM16901l.size() - 1);
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<String> arrayList6 = new ArrayList<>();
                ArrayList<Integer> arrayList7 = new ArrayList<>();
                int i9 = 0;
                long j9 = jNextLong;
                while (i9 < listM16901l.size()) {
                    C3177c.b bVar3 = (C3177c.b) listM16901l.get(i9);
                    C3180f c3180fM16907b = bVar3.m16907b();
                    long j10 = j9;
                    if (!c3180fM16907b.m16946g().isEmpty()) {
                        arrayList4.add(c3180fM16907b.m16946g());
                    }
                    arrayList5.add(bVar3.m16908c());
                    String strM16947h = c3180fM16907b.m16947h();
                    if (c3180fM16907b.m16948i() != null && !c3180fM16907b.m16948i().isEmpty()) {
                        for (C3180f.b bVar4 : c3180fM16907b.m16948i()) {
                            if (!TextUtils.isEmpty(bVar4.m16953e())) {
                                strM16947h = bVar4.m16953e();
                                break;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strM16947h)) {
                        arrayList6.add(strM16947h);
                    }
                    if (i9 > 0) {
                        arrayList2.add(((C3177c.b) listM16901l.get(i9)).m16907b().m16942c());
                        arrayList3.add(((C3177c.b) listM16901l.get(i9)).m16907b().m16943d());
                    }
                    i9++;
                    j9 = j10;
                }
                long j11 = j9;
                z8 = true;
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                if (!arrayList7.isEmpty()) {
                    bundle.putIntegerArrayList("autoPayBalanceThresholdList", arrayList7);
                }
                if (!arrayList4.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                }
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                }
                j8 = j11;
                if (!arrayList2.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList2);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                    j8 = j11;
                }
            } else {
                ArrayList<String> arrayList8 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it = arrayListM16900k.iterator();
                if (it.hasNext()) {
                    AbstractC2263x.m9328a(it.next());
                    throw null;
                }
                if (!arrayList8.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (arrayListM16900k.size() > 1) {
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListM16900k.size() - 1);
                    ArrayList<String> arrayList10 = new ArrayList<>(arrayListM16900k.size() - 1);
                    if (1 < arrayListM16900k.size()) {
                        AbstractC2263x.m9328a(arrayListM16900k.get(1));
                        throw null;
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList9);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList10);
                }
                z8 = true;
                j8 = jNextLong;
            }
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f13534r) {
                zzie zzieVar7 = zzie.OFFER_ID_TOKEN_NOT_SUPPORTED;
                C3178d c3178d7 = AbstractC3163K.f13449q;
                m16845h0(zzieVar7, 2, c3178d7, j8, z13);
                m16882t0(c3178d7);
                return c3178d7;
            }
            zM16980d = z13;
            if (bVar == null || TextUtils.isEmpty(bVar.m16907b().m16945f())) {
                z9 = false;
            } else {
                bundle.putString("skuPackageName", bVar.m16907b().m16945f());
                z9 = z8;
            }
            string = null;
            if (!TextUtils.isEmpty(null)) {
                bundle.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzc.zzn("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", stringExtra);
                try {
                    bundle.putString("proxyPackageVersion", this.f13523g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f13537u && !listM16901l.isEmpty()) {
                i7 = 17;
            } else if (this.f13535s && z9) {
                i7 = 15;
            } else {
                i7 = this.f13532p ? 9 : 6;
            }
            final int i10 = i7;
            final C3177c c3177c2 = c3177c;
            futureM16847j = m16847j(new Callable() { // from class: com.android.billingclient.api.V
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f13492a.m16828R(i10, strM16942c, strM16943d, c3177c2, bundle);
                }
            }, 5000L, null, this.f13521e, m16879i());
            r7 = c3177c2;
            j7 = j8;
        } else {
            j7 = jNextLong;
            futureM16847j = m16847j(new Callable() { // from class: com.android.billingclient.api.W
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f13498a.m16829S(strM16942c, strM16943d);
                }
            }, 5000L, null, this.f13521e, m16879i());
            r7 = jNextLong;
        }
        try {
            if (futureM16847j != null) {
                long j12 = j7;
                Bundle bundle2 = (Bundle) futureM16847j.get(5000L, TimeUnit.MILLISECONDS);
                int iZzb = zzc.zzb(bundle2, "BillingClient");
                String strZzj = zzc.zzj(bundle2, "BillingClient");
                if (iZzb == 0) {
                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                    intent2.putExtra("billingClientTransactionId", j12);
                    intent2.putExtra("wasServiceAutoReconnected", zM16980d);
                    activity.startActivity(intent2);
                    return AbstractC3163K.f13441i;
                }
                zzc.zzn("BillingClient", "Unable to buy item, Error response code: " + iZzb);
                C3178d c3178dM16775a = AbstractC3163K.m16775a(iZzb, strZzj);
                try {
                    if (bundle2 == null || (obj = bundle2.get("LOG_REASON")) == null) {
                        zzieVarZzb = zzie.REASON_UNSPECIFIED;
                    } else if (obj instanceof Integer) {
                        zzieVarZzb = zzie.zzb(((Integer) obj).intValue());
                    } else {
                        zzc.zzn("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        zzieVarZzb = zzie.REASON_UNSPECIFIED;
                    }
                } catch (Throwable th2) {
                    zzc.zzn("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th2.getMessage())));
                    zzieVarZzb = zzie.REASON_UNSPECIFIED;
                }
                if (zzieVarZzb == zzie.REASON_UNSPECIFIED) {
                    zzieVarZzb = zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                }
                zzie zzieVar8 = zzieVarZzb;
                if (bundle2 != null) {
                    try {
                        string = bundle2.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (Throwable th3) {
                        zzc.zzn("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th3.getMessage())));
                    }
                }
                try {
                    m16846i0(zzieVar8, 2, c3178dM16775a, string, j12, zM16980d);
                    m16882t0(c3178dM16775a);
                    return c3178dM16775a;
                } catch (CancellationException e7) {
                    e = e7;
                    r9 = j12;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar9 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3178d c3178d8 = AbstractC3163K.f13443k;
                    m16846i0(zzieVar9, 2, c3178d8, AbstractC3161I.m16761a(e), r9, zM16980d);
                    m16882t0(c3178d8);
                    return c3178d8;
                } catch (TimeoutException e8) {
                    e = e8;
                    r9 = j12;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar10 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3178d c3178d9 = AbstractC3163K.f13443k;
                    m16846i0(zzieVar10, 2, c3178d9, AbstractC3161I.m16761a(e), r9, zM16980d);
                    m16882t0(c3178d9);
                    return c3178d9;
                } catch (Exception e9) {
                    e = e9;
                    r8 = j12;
                    zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzie zzieVar11 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                    C3178d c3178d10 = AbstractC3163K.f13442j;
                    m16846i0(zzieVar11, 2, c3178d10, AbstractC3161I.m16761a(e), r8, zM16980d);
                    m16882t0(c3178d10);
                    return c3178d10;
                }
            }
            try {
                zzie zzieVar12 = zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                C3178d c3178d11 = AbstractC3163K.f13435c;
                boolean z14 = zM16980d;
                long j13 = j7;
                try {
                    m16845h0(zzieVar12, 2, c3178d11, j13, z14);
                    m16882t0(c3178d11);
                    return c3178d11;
                } catch (CancellationException e10) {
                    e = e10;
                    zM16980d = z14;
                    r9 = j13;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar13 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3178d c3178d12 = AbstractC3163K.f13443k;
                    m16846i0(zzieVar13, 2, c3178d12, AbstractC3161I.m16761a(e), r9, zM16980d);
                    m16882t0(c3178d12);
                    return c3178d12;
                } catch (TimeoutException e11) {
                    e = e11;
                    zM16980d = z14;
                    r9 = j13;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzie zzieVar14 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                    C3178d c3178d13 = AbstractC3163K.f13443k;
                    m16846i0(zzieVar14, 2, c3178d13, AbstractC3161I.m16761a(e), r9, zM16980d);
                    m16882t0(c3178d13);
                    return c3178d13;
                } catch (Exception e12) {
                    e = e12;
                    zM16980d = z14;
                    r8 = j13;
                    zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzie zzieVar15 = zzie.LAUNCH_BILLING_FLOW_EXCEPTION;
                    C3178d c3178d14 = AbstractC3163K.f13442j;
                    m16846i0(zzieVar15, 2, c3178d14, AbstractC3161I.m16761a(e), r8, zM16980d);
                    m16882t0(c3178d14);
                    return c3178d14;
                }
            } catch (CancellationException e13) {
                e = e13;
                r9 = j7;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar16 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                C3178d c3178d15 = AbstractC3163K.f13443k;
                m16846i0(zzieVar16, 2, c3178d15, AbstractC3161I.m16761a(e), r9, zM16980d);
                m16882t0(c3178d15);
                return c3178d15;
            } catch (TimeoutException e14) {
                e = e14;
                r9 = j7;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzie zzieVar17 = zzie.LAUNCH_BILLING_FLOW_TIMEOUT;
                C3178d c3178d16 = AbstractC3163K.f13443k;
                m16846i0(zzieVar17, 2, c3178d16, AbstractC3161I.m16761a(e), r9, zM16980d);
                m16882t0(c3178d16);
                return c3178d16;
            } catch (Exception e15) {
                e = e15;
                r8 = j7;
            }
        } catch (CancellationException e16) {
            e = e16;
            r9 = r7;
        } catch (TimeoutException e17) {
            e = e17;
            r9 = r7;
        } catch (Exception e18) {
            e = e18;
            r8 = r7;
        }
    }

    @Override // com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: e */
    public void mo16759e(final C3181g c3181g, final InterfaceC7564f interfaceC7564f) {
        if (m16847j(new Callable() { // from class: com.android.billingclient.api.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3176b.m16875y0(this.f13648a, interfaceC7564f, c3181g);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.n
            @Override // java.lang.Runnable
            public final void run() {
                C3176b.m16853m(this.f13651a, interfaceC7564f);
            }
        }, m16830T(), m16879i()) == null) {
            C3178d c3178dM16833W = m16833W();
            m16841e0(zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, c3178dM16833W);
            interfaceC7564f.mo24531a(c3178dM16833W, new C3182h(zzbt.zzk(), zzbt.zzk()));
        }
    }

    @Override // com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: f */
    public final void mo16804f(C7567i c7567i, final InterfaceC7565g interfaceC7565g) {
        if (m16847j(new CallableC3191q(this, interfaceC7565g, c7567i.m33264b(), false), 30000L, new Runnable() { // from class: com.android.billingclient.api.o
            @Override // java.lang.Runnable
            public final void run() {
                C3176b.m16849k(this.f13653a, interfaceC7565g);
            }
        }, m16830T(), m16879i()) == null) {
            C3178d c3178dM16833W = m16833W();
            m16841e0(zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, c3178dM16833W);
            interfaceC7565g.mo27214a(c3178dM16833W, zzbt.zzk());
        }
    }

    @Override // com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: g */
    public void mo16760g(InterfaceC7562d interfaceC7562d) {
        m16809A(interfaceC7562d, 0);
    }

    /* JADX INFO: renamed from: i */
    final synchronized ExecutorService m16879i() {
        try {
            if (this.f13514H == null) {
                this.f13514H = Executors.newFixedThreadPool(zzc.zza, new ThreadFactoryC3190p(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13514H;
    }

    /* JADX INFO: renamed from: n0 */
    final C3198x m16880n0(C3181g c3181g) {
        zzam zzamVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM16961c = c3181g.m16961c();
        zzbt zzbtVarM16960b = c3181g.m16960b();
        int size = zzbtVarM16960b.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 20;
            ArrayList<C3181g.b> arrayList3 = new ArrayList(zzbtVarM16960b.subList(i7, i8 > size ? size : i8));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i9 = 0; i9 < size2; i9++) {
                arrayList4.add(((C3181g.b) arrayList3.get(i9)).m16966b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.f13519c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.f13517a) {
                    zzamVar = this.f13525i;
                }
                if (zzamVar == null) {
                    return m16831U(AbstractC3163K.f13442j, zzie.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z7 = this.f13539w && this.f13510D.m16936b();
                m16836Z(c3181g);
                m16836Z(c3181g);
                m16836Z(c3181g);
                m16836Z(c3181g);
                Bundle bundleZzj = zzamVar.zzj(true != this.f13540x ? 17 : 20, this.f13523g.getPackageName(), strM16961c, bundle, zzc.zzf(str, this.f13520d, arrayList3, null, null, zza.zza(z7, true, false, true, false, true), this.f13515I.longValue()));
                if (bundleZzj == null) {
                    return m16831U(AbstractC3163K.f13428B, zzie.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleZzj.containsKey("DETAILS_LIST")) {
                    int iZzb = zzc.zzb(bundleZzj, "BillingClient");
                    String strZzj = zzc.zzj(bundleZzj, "BillingClient");
                    if (iZzb == 0) {
                        return m16831U(AbstractC3163K.m16775a(6, strZzj), zzie.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                    }
                    return m16831U(AbstractC3163K.m16775a(iZzb, strZzj), zzie.BILLING_RESULT_RECEIVED_FROM_PHONESKY, "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iZzb, null);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return m16831U(AbstractC3163K.f13428B, zzie.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    try {
                        C3180f c3180f = new C3180f(stringArrayList.get(i10));
                        zzc.zzm("BillingClient", "Got product details: ".concat(c3180f.toString()));
                        arrayList5.add(c3180f);
                    } catch (JSONException e7) {
                        return m16831U(AbstractC3163K.m16775a(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e7);
                    }
                }
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 == null) {
                        for (C3181g.b bVar : arrayList3) {
                            Iterator it = arrayList5.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList6.add(new C3183i(new JSONObject().put("productId", bVar.m16966b()).put("type", bVar.m16967c()).put("statusCode", 0).toString()));
                                    break;
                                }
                                C3180f c3180f2 = (C3180f) it.next();
                                if (bVar.m16966b().equals(c3180f2.m16942c()) && bVar.m16967c().equals(c3180f2.m16943d())) {
                                    break;
                                }
                            }
                        }
                    } else {
                        Iterator<String> it2 = stringArrayList2.iterator();
                        while (it2.hasNext()) {
                            C3183i c3183i = new C3183i(it2.next());
                            zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(c3183i.toString()));
                            arrayList6.add(c3183i);
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i7 = i8;
                } catch (JSONException e8) {
                    return m16831U(AbstractC3163K.m16775a(6, "Error trying to decode SkuDetails."), zzie.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e8);
                }
            } catch (DeadObjectException e9) {
                return m16831U(AbstractC3163K.f13442j, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e9);
            } catch (Exception e10) {
                return m16831U(AbstractC3163K.f13440h, zzie.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e10);
            }
        }
        return new C3198x(0, "", arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: q0 */
    final InterfaceC3162J m16881q0() {
        return this.f13524h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: t0 */
    public final C3178d m16882t0(final C3178d c3178d) {
        if (Thread.interrupted()) {
            return c3178d;
        }
        this.f13521e.post(new Runnable() { // from class: com.android.billingclient.api.l
            @Override // java.lang.Runnable
            public final void run() {
                C3176b.m16855n(this.f13646a, c3178d);
            }
        });
        return c3178d;
    }

    C3176b(String str, C3179e c3179e, Context context, InterfaceC7578t interfaceC7578t, InterfaceC3162J interfaceC3162J, ExecutorService executorService, AbstractC3175a.a aVar) {
        this.f13517a = new Object();
        this.f13518b = 0;
        this.f13521e = new Handler(Looper.getMainLooper());
        this.f13529m = 0;
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.f13515I = lValueOf;
        this.f13516J = zzaz.zza();
        this.f13519c = "8.0.0";
        String strM16837a0 = m16837a0();
        this.f13520d = strM16837a0;
        this.f13523g = context.getApplicationContext();
        zziq zziqVarZzc = zzis.zzc();
        zziqVarZzc.zzs("8.0.0");
        if (strM16837a0 != null) {
            zziqVarZzc.zzt(strM16837a0);
        }
        zziqVarZzc.zzq(this.f13523g.getPackageName());
        zziqVarZzc.zzn(lValueOf.longValue());
        zziqVarZzc.zzr(aVar.f13506f);
        zziqVarZzc.zza(Build.VERSION.SDK_INT);
        zziqVarZzc.zzp(772604006L);
        try {
            zziqVarZzc.zzl(this.f13523g.getPackageManager().getPackageInfo(this.f13523g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Error getting app version code.", th);
        }
        this.f13524h = new C3164L(this.f13523g, (zzis) zziqVarZzc.zze());
        zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f13522f = new C3171T(this.f13523g, null, null, null, null, this.f13524h);
        this.f13510D = c3179e;
        this.f13523g.getPackageName();
        this.f13511E = aVar.f13506f;
    }

    C3176b(String str, C3179e c3179e, Context context, InterfaceC7566h interfaceC7566h, InterfaceC7571m interfaceC7571m, InterfaceC3162J interfaceC3162J, ExecutorService executorService, AbstractC3175a.a aVar) {
        this.f13517a = new Object();
        this.f13518b = 0;
        this.f13521e = new Handler(Looper.getMainLooper());
        this.f13529m = 0;
        this.f13515I = Long.valueOf(new Random().nextLong());
        this.f13516J = zzaz.zza();
        this.f13519c = "8.0.0";
        this.f13520d = m16837a0();
        m16844h(context, interfaceC7566h, c3179e, null, "8.0.0", null, aVar);
    }
}
