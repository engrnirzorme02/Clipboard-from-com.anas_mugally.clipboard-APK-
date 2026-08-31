package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzal;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzbi;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zzjm;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjt;
import com.google.android.gms.internal.play_billing.zzjv;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p403z1.AbstractC7572n;
import p403z1.InterfaceC7562d;

/* JADX INFO: renamed from: com.android.billingclient.api.w */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC3197w implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7562d f13667a;

    /* JADX INFO: renamed from: b */
    private final zzbi f13668b;

    /* JADX INFO: renamed from: c */
    private final zzbi f13669c;

    /* JADX INFO: renamed from: d */
    private final int f13670d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3176b f13671e;

    /* synthetic */ ServiceConnectionC3197w(C3176b c3176b, InterfaceC7562d interfaceC7562d, int i7, AbstractC7572n abstractC7572n) {
        Objects.requireNonNull(c3176b);
        this.f13671e = c3176b;
        this.f13668b = zzbi.zzc(c3176b.f13516J);
        this.f13669c = zzbi.zzc(c3176b.f13516J);
        this.f13667a = interfaceC7562d;
        this.f13670d = i7;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m16974a(ServiceConnectionC3197w serviceConnectionC3197w) {
        Bundle bundle;
        zzam zzamVar;
        zzie zzieVar;
        C3176b c3176b = serviceConnectionC3197w.f13671e;
        synchronized (c3176b.f13517a) {
            try {
                if (c3176b.f13518b != 3) {
                    boolean z7 = c3176b.f13518b == 1;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        zzc.zzc(bundle, c3176b.f13519c, c3176b.f13520d, c3176b.f13515I.longValue());
                    }
                    zzie zzieVar2 = zzie.REASON_UNSPECIFIED;
                    synchronized (c3176b.f13517a) {
                        zzamVar = c3176b.f13525i;
                    }
                    if (zzamVar == null) {
                        C3176b c3176b2 = serviceConnectionC3197w.f13671e;
                        c3176b2.m16876z(0);
                        int i7 = serviceConnectionC3197w.f13670d;
                        zzie zzieVar3 = zzie.SERVICE_RESET_TO_NULL;
                        C3178d c3178d = AbstractC3163K.f13442j;
                        c3176b2.m16874y(zzieVar3, c3178d, i7);
                        serviceConnectionC3197w.m16978g(c3178d);
                    } else {
                        C3176b c3176b3 = serviceConnectionC3197w.f13671e;
                        String packageName = c3176b3.f13523g.getPackageName();
                        int iZzw = 3;
                        int i8 = 25;
                        while (true) {
                            if (i8 < 3) {
                                i8 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    iZzw = zzamVar.zzw(i8, packageName, "subs");
                                } catch (Exception e7) {
                                    zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", e7);
                                    if (e7 instanceof DeadObjectException) {
                                        zzieVar = zzie.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                    } else if (e7 instanceof RemoteException) {
                                        zzieVar = zzie.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                    } else {
                                        zzieVar = e7 instanceof SecurityException ? zzie.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                    }
                                    String strM16761a = zzieVar.equals(zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? AbstractC3161I.m16761a(e7) : null;
                                    serviceConnectionC3197w.f13671e.m16876z(0);
                                    serviceConnectionC3197w.m16977f(C3176b.m16864s0(e7), zzieVar, strM16761a, z7);
                                    serviceConnectionC3197w.m16978g(C3176b.m16864s0(e7));
                                }
                            } else {
                                iZzw = zzamVar.zzc(i8, packageName, "subs", bundle);
                            }
                            if (iZzw == 0) {
                                zzc.zzm("BillingClient", "highestLevelSupportedForSubs: " + i8);
                                break;
                            }
                            i8--;
                        }
                        c3176b3.f13528l = i8 >= 5;
                        c3176b3.f13527k = i8 >= 3;
                        if (i8 < 3) {
                            zzieVar2 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
                            zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        for (int i9 = 25; i9 >= 3; i9--) {
                            iZzw = bundle == null ? zzamVar.zzw(i9, packageName, "inapp") : zzamVar.zzc(i9, packageName, "inapp", bundle);
                            if (iZzw == 0) {
                                c3176b3.f13529m = i9;
                                zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + c3176b3.f13529m);
                                break;
                            }
                        }
                        C3176b.m16820I(c3176b3, c3176b3.f13529m);
                        if (c3176b3.f13529m < 3) {
                            zzieVar2 = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                            zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        C3176b.m16822K(c3176b3, iZzw);
                        if (iZzw != 0) {
                            C3178d c3178d2 = AbstractC3163K.f13434b;
                            serviceConnectionC3197w.m16977f(c3178d2, zzieVar2, null, z7);
                            serviceConnectionC3197w.m16978g(c3178d2);
                        } else {
                            try {
                                Long lM16976e = serviceConnectionC3197w.m16976e(z7);
                                if (z7) {
                                    zzhz zzhzVarZzc = zzib.zzc();
                                    zzhzVarZzc.zzo(6);
                                    zzjt zzjtVarZzc = zzjv.zzc();
                                    int i10 = serviceConnectionC3197w.f13670d;
                                    zzjtVarZzc.zza(i10 > 0);
                                    zzjtVarZzc.zzl(i10);
                                    if (lM16976e != null) {
                                        zzjtVarZzc.zzm(lM16976e.longValue());
                                    }
                                    C3176b c3176b4 = serviceConnectionC3197w.f13671e;
                                    zzhzVarZzc.zzn(zzjtVarZzc);
                                    c3176b4.m16872x((zzib) zzhzVarZzc.zze());
                                } else {
                                    zzjm zzjmVarZzc = zzjo.zzc();
                                    zzic zzicVarZzc = zzig.zzc();
                                    zzicVarZzc.zzo(0);
                                    zzjmVarZzc.zza(zzicVarZzc);
                                    if (lM16976e != null) {
                                        zzjmVarZzc.zzl(lM16976e.longValue());
                                    }
                                    serviceConnectionC3197w.f13671e.f13524h.mo16768e((zzjo) zzjmVarZzc.zze());
                                }
                            } catch (Throwable th) {
                                zzc.zzo("BillingClient", "Unable to log.", th);
                            }
                            serviceConnectionC3197w.m16978g(AbstractC3163K.f13441i);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16975b(ServiceConnectionC3197w serviceConnectionC3197w) {
        C3176b c3176b = serviceConnectionC3197w.f13671e;
        c3176b.m16876z(0);
        zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
        C3178d c3178d = AbstractC3163K.f13443k;
        c3176b.m16874y(zzieVar, c3178d, serviceConnectionC3197w.f13670d);
        serviceConnectionC3197w.m16978g(c3178d);
    }

    /* JADX INFO: renamed from: e */
    private final Long m16976e(boolean z7) {
        if (z7) {
            zzbi zzbiVar = this.f13668b;
            if (!zzbiVar.zzg()) {
                return null;
            }
            zzbiVar.zzf();
            return Long.valueOf(zzbiVar.zza(TimeUnit.MILLISECONDS));
        }
        zzbi zzbiVar2 = this.f13669c;
        if (!zzbiVar2.zzg()) {
            return null;
        }
        zzbiVar2.zzf();
        return Long.valueOf(zzbiVar2.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: renamed from: f */
    private final void m16977f(C3178d c3178d, zzie zzieVar, String str, boolean z7) {
        try {
            zzic zzicVarZzc = zzig.zzc();
            zzicVarZzc.zzo(c3178d.m16929c());
            zzicVarZzc.zzl(c3178d.m16927a());
            zzicVarZzc.zzn(zzieVar);
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            Long lM16976e = m16976e(z7);
            if (!z7) {
                zzjm zzjmVarZzc = zzjo.zzc();
                zzjmVarZzc.zza(zzicVarZzc);
                if (lM16976e != null) {
                    zzjmVarZzc.zzl(lM16976e.longValue());
                }
                this.f13671e.f13524h.mo16768e((zzjo) zzjmVarZzc.zze());
                return;
            }
            zzjt zzjtVarZzc = zzjv.zzc();
            int i7 = this.f13670d;
            zzjtVarZzc.zza(i7 > 0);
            zzjtVarZzc.zzl(i7);
            if (lM16976e != null) {
                zzjtVarZzc.zzm(lM16976e.longValue());
            }
            C3176b c3176b = this.f13671e;
            zzhv zzhvVarZzc = zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(6);
            zzhvVarZzc.zzo(zzjtVarZzc);
            c3176b.m16868v((zzhx) zzhvVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m16978g(C3178d c3178d) {
        C3176b c3176b = this.f13671e;
        synchronized (c3176b.f13517a) {
            try {
                if (c3176b.f13518b == 3) {
                    return;
                }
                try {
                    this.f13667a.mo15840G(c3178d);
                } catch (Throwable th) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16979c() {
        zzbi zzbiVar = this.f13668b;
        zzbiVar.zzd();
        zzbiVar.zze();
    }

    /* JADX INFO: renamed from: d */
    final boolean m16980d() {
        return this.f13670d > 0;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        zzc.zzn("BillingClient", "Billing service died.");
        try {
            C3176b c3176b = this.f13671e;
            if (C3176b.m16825O(c3176b)) {
                InterfaceC3162J interfaceC3162J = c3176b.f13524h;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.BINDING_DIED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i7 = this.f13670d;
                zzjtVarZzc.zza(i7 > 0);
                zzjtVarZzc.zzl(i7);
                zzhvVarZzc.zzo(zzjtVarZzc);
                interfaceC3162J.mo16765b((zzhx) zzhvVarZzc.zze());
            } else {
                c3176b.f13524h.mo16766c(zzij.zzd());
            }
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
        C3176b c3176b2 = this.f13671e;
        synchronized (c3176b2.f13517a) {
            if (c3176b2.f13518b != 3 && c3176b2.f13518b != 0) {
                c3176b2.m16876z(0);
                c3176b2.m16811B();
                try {
                    this.f13667a.mo15841O();
                } catch (Throwable th2) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClient", "Billing service connected.");
        C3176b c3176b = this.f13671e;
        synchronized (c3176b.f13517a) {
            try {
                if (c3176b.f13518b == 3) {
                    return;
                }
                c3176b.f13525i = zzal.zzs(iBinder);
                if (C3176b.m16847j(new Callable() { // from class: com.android.billingclient.api.u
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ServiceConnectionC3197w.m16974a(this.f13665a);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC3197w.m16975b(this.f13666a);
                    }
                }, c3176b.m16830T(), c3176b.m16879i()) == null) {
                    int i7 = this.f13670d;
                    C3178d c3178dM16833W = c3176b.m16833W();
                    c3176b.m16874y(zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC, c3178dM16833W, i7);
                    m16978g(c3178dM16833W);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            C3176b c3176b = this.f13671e;
            if (C3176b.m16825O(c3176b)) {
                InterfaceC3162J interfaceC3162J = c3176b.f13524h;
                zzhv zzhvVarZzc = zzhx.zzc();
                zzhvVarZzc.zzp(6);
                zzic zzicVarZzc = zzig.zzc();
                zzicVarZzc.zzn(zzie.SERVICE_DISCONNECTED);
                zzhvVarZzc.zzl(zzicVarZzc);
                zzjt zzjtVarZzc = zzjv.zzc();
                int i7 = this.f13670d;
                zzjtVarZzc.zza(i7 > 0);
                zzjtVarZzc.zzl(i7);
                zzhvVarZzc.zzo(zzjtVarZzc);
                interfaceC3162J.mo16765b((zzhx) zzhvVarZzc.zze());
            } else {
                c3176b.f13524h.mo16772i(zzjs.zzd());
            }
        } catch (Throwable th) {
            zzc.zzo("BillingClient", "Unable to log.", th);
        }
        zzbi zzbiVar = this.f13669c;
        zzbiVar.zzd();
        zzbiVar.zze();
        C3176b c3176b2 = this.f13671e;
        synchronized (c3176b2.f13517a) {
            try {
                if (c3176b2.f13518b == 3) {
                    return;
                }
                c3176b2.m16876z(0);
                try {
                    this.f13667a.mo15841O();
                } catch (Throwable th2) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
