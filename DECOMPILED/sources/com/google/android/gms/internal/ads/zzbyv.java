package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3500t0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p157U3.InterfaceFutureC1673e;
import p227d3.C5228d;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.AbstractC7603t;
import p404z2.C7584a;
import p404z2.C7602s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyv {
    private final Object zza = new Object();
    private final C3500t0 zzb;
    private final zzbyz zzc;
    private boolean zzd;
    private Context zze;
    private C7584a zzf;
    private String zzg;
    private zzbcn zzh;
    private zzdsm zzi;
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzbyu zzm;
    private final Object zzn;
    private InterfaceFutureC1673e zzo;
    private final AtomicBoolean zzp;

    public zzbyv() {
        C3500t0 c3500t0 = new C3500t0();
        this.zzb = c3500t0;
        this.zzc = new zzbyz(C3244B.m17192c(), c3500t0);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzbyu(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
    }

    final /* synthetic */ zzbcn zzA() {
        return this.zzh;
    }

    final /* synthetic */ AtomicBoolean zzB() {
        return this.zzp;
    }

    public final zzbcn zza() {
        zzbcn zzbcnVar;
        synchronized (this.zza) {
            zzbcnVar = this.zzh;
        }
        return zzbcnVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final void zze(Context context, C7584a c7584a, zzdsm zzdsmVar) {
        zzbcn zzbcnVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = c7584a;
                    C7351t.m32353k().zzb(this.zzc);
                    this.zzb.zza(this.zze);
                    zzbtt.zzb(this.zze, this.zzf);
                    this.zzi = zzdsmVar;
                    C7351t.m32359q();
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzck)).booleanValue()) {
                        zzbcnVar = new zzbcn();
                    } else {
                        AbstractC3490o0.m17545k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbcnVar = null;
                    }
                    this.zzh = zzbcnVar;
                    if (zzbcnVar != null) {
                        zzbzk.zza(new zzbyr(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (AbstractC3760o.m18199g()) {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjg)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbys(this));
                            } catch (RuntimeException e7) {
                                int i7 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33332g("Failed to register network callback", e7);
                                this.zzp.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C7351t.m32349g().m17439O(context, c7584a.f30226a);
    }

    public final Resources zzf() {
        if (this.zzf.f30229d) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlI)).booleanValue()) {
                return AbstractC7603t.m33338b(this.zze).getResources();
            }
            AbstractC7603t.m33338b(this.zze).getResources();
            return null;
        } catch (C7602s e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Cannot load resource from dynamite apk or local jar", e7);
            return null;
        }
    }

    public final void zzg(Throwable th, String str) {
        zzbtt.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzh(Throwable th, String str) {
        zzbtt.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzber.zzf.zze()).floatValue());
    }

    public final void zzi(Throwable th, String str) {
        zzbtt.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final InterfaceC3494q0 zzo() {
        C3500t0 c3500t0;
        synchronized (this.zza) {
            c3500t0 = this.zzb;
        }
        return c3500t0;
    }

    public final Context zzp() {
        return this.zze;
    }

    public final InterfaceFutureC1673e zzq() {
        if (this.zze != null) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdn)).booleanValue()) {
                synchronized (this.zzn) {
                    try {
                        InterfaceFutureC1673e interfaceFutureC1673e = this.zzo;
                        if (interfaceFutureC1673e != null) {
                            return interfaceFutureC1673e;
                        }
                        InterfaceFutureC1673e interfaceFutureC1673eSubmit = zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyt
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzw();
                            }
                        });
                        this.zzo = interfaceFutureC1673eSubmit;
                        return interfaceFutureC1673eSubmit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgot.zza(new ArrayList());
    }

    public final zzbyz zzr() {
        return this.zzc;
    }

    public final boolean zzs(Context context) {
        if (AbstractC3760o.m18199g()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjg)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzt(String str) {
        this.zzg = str;
    }

    public final String zzu() {
        return this.zzg;
    }

    public final zzdsm zzv() {
        return this.zzi;
    }

    final /* synthetic */ ArrayList zzw() {
        Context contextZza = zzbvf.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoM24152f = C5228d.m24155a(contextZza).m24152f(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfoM24152f.requestedPermissions != null && packageInfoM24152f.requestedPermissionsFlags != null) {
                int i7 = 0;
                while (true) {
                    String[] strArr = packageInfoM24152f.requestedPermissions;
                    if (i7 >= strArr.length) {
                        break;
                    }
                    if ((packageInfoM24152f.requestedPermissionsFlags[i7] & 2) != 0) {
                        arrayList.add(strArr[i7]);
                    }
                    i7++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    final /* synthetic */ Object zzx() {
        return this.zza;
    }

    final /* synthetic */ Context zzy() {
        return this.zze;
    }

    final /* synthetic */ C7584a zzz() {
        return this.zzf;
    }
}
