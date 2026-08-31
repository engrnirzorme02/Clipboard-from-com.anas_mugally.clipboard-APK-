package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p036E2.AbstractC0335c;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetv implements zzeup {
    public static final /* synthetic */ int zzb = 0;
    private static final zzetw zzc = new zzetw(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzgpd zzd;
    private final ScheduledExecutorService zze;
    private final zzekd zzf;
    private final Context zzg;
    private final zzfdc zzh;
    private final zzejy zzi;
    private final zzdqc zzj;
    private final zzduz zzk;
    private final int zzl;

    zzetv(zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, String str, zzekd zzekdVar, Context context, zzfdc zzfdcVar, zzejy zzejyVar, zzdqc zzdqcVar, zzduz zzduzVar, int i7) {
        this.zzd = zzgpdVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzekdVar;
        this.zzg = context;
        this.zzh = zzfdcVar;
        this.zzi = zzejyVar;
        this.zzj = zzdqcVar;
        this.zzk = zzduzVar;
        this.zzl = i7;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzekh zzekhVar = (zzekh) ((Map.Entry) it.next()).getValue();
            String str = zzekhVar.zza;
            list.add(zzh(str, Collections.singletonList(zzekhVar.zze), zzg(str), zzekhVar.zzb, zzekhVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.f13961x;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgol zzh(final String str, final List list, final Bundle bundle, final boolean z7, final boolean z8) {
        zzgoa zzgoaVar = new zzgoa() { // from class: com.google.android.gms.internal.ads.zzetq
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final /* synthetic */ InterfaceFutureC1673e zza() {
                return this.zza.zzd(str, list, bundle, z7, z8);
            }
        };
        zzgpd zzgpdVar = this.zzd;
        zzgol zzgolVarZzw = zzgol.zzw(zzgot.zzf(zzgoaVar, zzgpdVar));
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzbM)).booleanValue()) {
            zzgolVarZzw = (zzgol) zzgot.zzi(zzgolVarZzw, ((Long) C3250D.m17200c().zzd(zzbci.zzbF)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgol) zzgot.zzg(zzgolVarZzw, Throwable.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzetr
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i7 = zzetv.zzb;
                String str2 = str;
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33328c("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zznR)).booleanValue()) {
                    C7351t.m32354l().zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                C7351t.m32354l().zzg(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgpdVar);
    }

    private final void zzi(zzbqw zzbqwVar, Bundle bundle, List list, zzekg zzekgVar) {
        zzbqwVar.zze(BinderC3773b.m18221N0(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzekgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        if (this.zzl == 2) {
            return zzgot.zza(zzc);
        }
        zzfdc zzfdcVar = this.zzh;
        if (zzfdcVar.zzs) {
            if (!Arrays.asList(((String) C3250D.m17200c().zzd(zzbci.zzbS)).split(",")).contains(AbstractC0335c.m1520b(AbstractC0335c.m1521c(zzfdcVar.zzd)))) {
                return zzgot.zza(zzc);
            }
        }
        return zzgot.zzf(new zzgoa() { // from class: com.google.android.gms.internal.ads.zzett
            @Override // com.google.android.gms.internal.ads.zzgoa
            public final /* synthetic */ InterfaceFutureC1673e zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 32;
    }

    final /* synthetic */ InterfaceFutureC1673e zzc() {
        final String str;
        zzetv zzetvVar;
        String lowerCase = ((Boolean) C3250D.m17200c().zzd(zzbci.zzlJ)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) C3250D.m17200c().zzd(zzbci.zzbQ)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeG)).booleanValue()) {
            int iZzk = C7351t.m32354l().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbZ)).booleanValue()) {
            zzetvVar = this;
            zzf(arrayList, zzetvVar.zzf.zzd(zzetvVar.zza, lowerCase));
        } else {
            zzekd zzekdVar = this.zzf;
            for (Map.Entry entry : ((zzgkc) zzekdVar.zzc(this.zza, lowerCase)).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzetvVar = this;
            zzf(arrayList, zzekdVar.zzb());
        }
        return zzgot.zzo(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i7 = zzetv.zzb;
                JSONArray jSONArray = new JSONArray();
                for (InterfaceFutureC1673e interfaceFutureC1673e : arrayList) {
                    if (((JSONObject) interfaceFutureC1673e.get()) != null) {
                        jSONArray.put(interfaceFutureC1673e.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzetw(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzeG)).booleanValue()) {
                    return new zzetw(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, zzetvVar.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ InterfaceFutureC1673e zzd(String str, final List list, final Bundle bundle, boolean z7, boolean z8) {
        final zzbqw zzbqwVar;
        zzbqw zzbqwVarZzb;
        final zzbzm zzbzmVar = new zzbzm();
        if (z8) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbR)).booleanValue()) {
                try {
                    zzbqwVarZzb = this.zzj.zzb(str);
                } catch (RemoteException e7) {
                    AbstractC3490o0.m17546l("Couldn't create RTB adapter : ", e7);
                    zzbqwVar = null;
                }
            } else {
                zzejy zzejyVar = this.zzi;
                zzejyVar.zza(str);
                zzbqwVarZzb = zzejyVar.zzb(str);
            }
            zzbqwVar = zzbqwVarZzb;
        } else {
            zzbqwVarZzb = this.zzj.zzb(str);
            zzbqwVar = zzbqwVarZzb;
        }
        if (zzbqwVar == null) {
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzbH)).booleanValue()) {
                throw null;
            }
            zzekg.zzd(str, zzbzmVar);
            return zzbzmVar;
        }
        final zzekg zzekgVar = new zzekg(str, zzbqwVar, zzbzmVar, C7351t.m32357o().mo18161c());
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbM)).booleanValue()) {
            this.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzekgVar.zzc();
                }
            }, ((Long) C3250D.m17200c().zzd(zzbci.zzbF)).longValue(), TimeUnit.MILLISECONDS);
        }
        if (!z7) {
            zzekgVar.zzb();
            return zzbzmVar;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbT)).booleanValue()) {
            this.zzd.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzets
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzbqwVar, bundle, list, zzekgVar, zzbzmVar);
                }
            });
            return zzbzmVar;
        }
        zzi(zzbqwVar, bundle, list, zzekgVar);
        return zzbzmVar;
    }

    final /* synthetic */ void zze(zzbqw zzbqwVar, Bundle bundle, List list, zzekg zzekgVar, zzbzm zzbzmVar) {
        try {
            zzi(zzbqwVar, bundle, list, zzekgVar);
        } catch (RemoteException e7) {
            zzbzmVar.zzd(e7);
        }
    }
}
