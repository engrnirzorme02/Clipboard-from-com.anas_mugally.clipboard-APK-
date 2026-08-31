package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeus {
    private final Context zza;
    private final Set zzb;
    private final Executor zzc;
    private final zzfib zzd;
    private final zzdsm zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzeus(Context context, Executor executor, Set set, zzfib zzfibVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfibVar;
        this.zze = zzdsmVar;
    }

    public final InterfaceFutureC1673e zza(final Object obj, final Bundle bundle, final boolean z7) {
        zzfhr zzfhrVarZzn = zzfhr.zzn(this.zza, 8);
        zzfhrVarZzn.zza();
        Set<zzeup> set = this.zzb;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        zzbbz zzbbzVar = zzbci.zzmz;
        if (!((String) C3250D.m17200c().zzd(zzbbzVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) C3250D.m17200c().zzd(zzbbzVar)).split(","));
        }
        this.zzf = C7351t.m32357o().mo18161c();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue() && bundle != null) {
            long jMo18159a = C7351t.m32357o().mo18159a();
            if (obj instanceof zzcuu) {
                bundle.putLong(zzdru.CLIENT_SIGNALS_START.zza(), jMo18159a);
            } else {
                bundle.putLong(zzdru.GMS_SIGNALS_START.zza(), jMo18159a);
            }
        }
        for (final zzeup zzeupVar : set) {
            if (!arrayList2.contains(String.valueOf(zzeupVar.zzb()))) {
                final long jMo18161c = C7351t.m32357o().mo18161c();
                InterfaceFutureC1673e interfaceFutureC1673eZza = zzeupVar.zza();
                final Bundle bundle3 = bundle2;
                interfaceFutureC1673eZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb(jMo18161c, zzeupVar, bundle3);
                    }
                }, zzbzh.zzg);
                arrayList.add(interfaceFutureC1673eZza);
                bundle2 = bundle3;
            }
        }
        InterfaceFutureC1673e interfaceFutureC1673eZza2 = zzgot.zzo(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeur
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzeun zzeunVar = (zzeun) ((InterfaceFutureC1673e) it.next()).get();
                    if (zzeunVar != null) {
                        boolean z8 = z7;
                        zzeunVar.zza(obj2);
                        if (z8) {
                            zzeunVar.zzb(obj2);
                        }
                    }
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long jMo18159a2 = C7351t.m32357o().mo18159a();
                    if (obj2 instanceof zzcuu) {
                        bundle4.putLong(zzdru.CLIENT_SIGNALS_END.zza(), jMo18159a2);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(zzdru.GMS_SIGNALS_END.zza(), jMo18159a2);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.zzc);
        if (zzfie.zza()) {
            zzfia.zzd(interfaceFutureC1673eZza2, this.zzd, zzfhrVarZzn);
        }
        return interfaceFutureC1673eZza2;
    }

    final /* synthetic */ void zzb(long j7, zzeup zzeupVar, Bundle bundle) {
        long jMo18161c = C7351t.m32357o().mo18161c() - j7;
        if (((Boolean) zzbek.zza.zze()).booleanValue()) {
            String strZza = zzghs.zza(zzeupVar.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(strZza.length() + 25 + String.valueOf(jMo18161c).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(strZza);
            sb.append(" = ");
            sb.append(jMo18161c);
            AbstractC3490o0.m17545k(sb.toString());
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcx)).booleanValue()) {
                synchronized (this) {
                    int iZzb = zzeupVar.zzb();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 3);
                    sb2.append("sig");
                    sb2.append(iZzb);
                    bundle.putLong(sb2.toString(), jMo18161c);
                }
            }
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcp)).booleanValue()) {
            zzdsl zzdslVarZza = this.zze.zza();
            zzdslVarZza.zzc("action", "lat_ms");
            zzdslVarZza.zzc("lat_grp", "sig_lat_grp");
            zzdslVarZza.zzc("lat_id", String.valueOf(zzeupVar.zzb()));
            zzdslVarZza.zzc("clat_ms", String.valueOf(jMo18161c));
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcq)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdslVarZza.zzc("seq_num", C7351t.m32354l().zzr().zzm());
                synchronized (this) {
                    try {
                        if (this.zzg == this.zzb.size() && this.zzf != 0) {
                            this.zzg = 0;
                            String strValueOf = String.valueOf(C7351t.m32357o().mo18161c() - this.zzf);
                            if (zzeupVar.zzb() <= 39 || zzeupVar.zzb() >= 52) {
                                zzdslVarZza.zzc("lat_clsg", strValueOf);
                            } else {
                                zzdslVarZza.zzc("lat_gmssg", strValueOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzdslVarZza.zzh();
        }
    }
}
