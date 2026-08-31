package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p157U3.InterfaceFutureC1673e;
import p314o2.C6570v;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevj implements zzeup {
    private final InterfaceC3494q0 zza;
    private final Context zzb;
    private final zzgpd zzc;
    private final ScheduledExecutorService zzd;
    private final zzedx zze;
    private final zzfdc zzf;
    private final C7584a zzg;

    zzevj(InterfaceC3494q0 interfaceC3494q0, Context context, zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzedx zzedxVar, zzfdc zzfdcVar, C7584a c7584a) {
        this.zza = interfaceC3494q0;
        this.zzb = context;
        this.zzc = zzgpdVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzedxVar;
        this.zzf = zzfdcVar;
        this.zzg = c7584a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzeup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceFutureC1673e zza() {
        InterfaceFutureC1673e interfaceFutureC1673eZzc;
        String str;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlj)).booleanValue() && this.zza.zzz()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzln)).booleanValue()) {
                if (this.zzf.zzd.f13945J != C6570v.b.DISABLED.m27860c()) {
                    if (this.zzg.f30228c >= ((Integer) C3250D.m17200c().zzd(zzbci.zzlh)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) C3250D.m17200c().zzd(zzbci.zzli)).intValue()) {
                            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlf)).booleanValue()) {
                                str = (String) C3250D.m17200c().zzd(zzbci.zzlg);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                interfaceFutureC1673eZzc = zzgot.zzi(this.zze.zza(false), ((Integer) C3250D.m17200c().zzd(zzbci.zzll)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                            } catch (Exception e7) {
                                interfaceFutureC1673eZzc = zzgot.zzc(e7);
                            }
                            zzgpd zzgpdVar = this.zzc;
                            return zzgot.zzi((zzgol) zzgot.zzh((zzgol) zzgot.zzj(zzgol.zzw(interfaceFutureC1673eZzc), zzevi.zza, zzgpdVar), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzevg
                                @Override // com.google.android.gms.internal.ads.zzgob
                                public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                                    return this.zza.zzc((Throwable) obj);
                                }
                            }, zzgpdVar), ((Integer) C3250D.m17200c().zzd(zzbci.zzll)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                        }
                    }
                }
            } else {
                if (this.zzg.f30228c >= ((Integer) C3250D.m17200c().zzd(zzbci.zzlh)).intValue()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) C3250D.m17200c().zzd(zzbci.zzli)).intValue()) {
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlf)).booleanValue()) {
                            str = (String) C3250D.m17200c().zzd(zzbci.zzlg);
                            if (!TextUtils.isEmpty(str)) {
                            }
                        }
                        interfaceFutureC1673eZzc = zzgot.zzi(this.zze.zza(false), ((Integer) C3250D.m17200c().zzd(zzbci.zzll)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                        zzgpd zzgpdVar2 = this.zzc;
                        return zzgot.zzi((zzgol) zzgot.zzh((zzgol) zzgot.zzj(zzgol.zzw(interfaceFutureC1673eZzc), zzevi.zza, zzgpdVar2), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzevg
                            @Override // com.google.android.gms.internal.ads.zzgob
                            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                                return this.zza.zzc((Throwable) obj);
                            }
                        }, zzgpdVar2), ((Integer) C3250D.m17200c().zzd(zzbci.zzll)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                    }
                }
            }
        }
        return zzgot.zza(new zzevk("", -1, null));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(final Throwable th) {
        zzevk zzevkVar;
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzlk)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    C7351t.m32354l().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    C7351t.m32354l().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzevkVar = new zzevk("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzevkVar = new zzevk("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzevkVar = new zzevk("", 4, null);
        } else {
            zzevkVar = th instanceof TimeoutException ? new zzevk("", 5, null) : new zzevk("", 0, null);
        }
        return zzgot.zza(zzevkVar);
    }
}
