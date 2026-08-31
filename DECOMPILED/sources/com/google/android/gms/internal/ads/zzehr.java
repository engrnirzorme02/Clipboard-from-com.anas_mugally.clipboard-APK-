package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzehr implements zzgob {
    private final zzfhh zza;
    private final zzcvu zzb;
    private final zzfjr zzc;
    private final zzfjv zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcqv zzg;
    private final zzehk zzh;
    private final zzeee zzi;
    private final Context zzj;
    private final zzfib zzk;
    private final zzegu zzl;
    private final zzdsg zzm;

    zzehr(Context context, zzfhh zzfhhVar, zzehk zzehkVar, zzcvu zzcvuVar, zzfjr zzfjrVar, zzfjv zzfjvVar, zzcqv zzcqvVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeee zzeeeVar, zzfib zzfibVar, zzegu zzeguVar, zzdsg zzdsgVar) {
        this.zzj = context;
        this.zza = zzfhhVar;
        this.zzh = zzehkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzfjrVar;
        this.zzd = zzfjvVar;
        this.zzg = zzcqvVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzeeeVar;
        this.zzk = zzfibVar;
        this.zzl = zzeguVar;
        this.zzm = zzdsgVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    static String zzb(zzfcu zzfcuVar) {
        String string = "No fill.";
        String str = true != ((Boolean) C3250D.m17200c().zzd(zzbci.zzga)).booleanValue() ? "No ad config." : "No fill.";
        zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        int i7 = zzfcmVar.zzf;
        if (i7 == 0) {
            string = str;
        } else if (i7 >= 200 && i7 < 300) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfZ)).booleanValue()) {
                string = str;
            }
        } else if (i7 < 300 || i7 >= 400) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 35);
            sb.append("Received error HTTP response code: ");
            sb.append(i7);
            string = sb.toString();
        } else {
            string = "No location header to follow redirect or too many redirects.";
        }
        zzfcl zzfclVar = zzfcmVar.zzj;
        return zzfclVar != null ? zzfclVar.zza() : string;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
        int i7;
        Bundle bundle;
        final zzfcu zzfcuVar = (zzfcu) obj;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcr)).booleanValue() && (bundle = zzfcuVar.zzb.zzd) != null) {
            this.zzm.zze().putAll(bundle);
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcs)).booleanValue()) {
            this.zzm.zze().putLong(zzdru.RENDERING_START.zza(), C7351t.m32357o().mo18159a());
        }
        String strZzb = zzb(zzfcuVar);
        zzeee zzeeeVar = this.zzi;
        zzfct zzfctVar = zzfcuVar.zzb;
        zzfcm zzfcmVar = zzfctVar.zzb;
        zzeeeVar.zza(zzfcmVar);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjb)).booleanValue() && (i7 = zzfcmVar.zzf) != 0 && (i7 < 200 || i7 >= 300)) {
            return zzgot.zzc(new zzeho(3, strZzb));
        }
        String str = zzfcmVar.zzq;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdZ)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfcj zzfcjVar : zzfctVar.zza) {
                zzeeeVar.zzb(zzfcjVar);
                Iterator it = zzfcjVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeeeVar.zze(zzfcjVar, 0L, zzfee.zzd(1, null, null));
                        break;
                    }
                    zzedz zzedzVarZza = this.zzg.zza(zzfcjVar.zzb, (String) it.next());
                    if (zzedzVarZza != null && zzedzVarZza.zza(zzfcuVar, zzfcjVar)) {
                        break;
                    }
                }
            }
        } else {
            zzeeeVar.zzc(str, zzfctVar.zza);
        }
        zzcvu zzcvuVar = this.zzb;
        zzcmm zzcmmVar = new zzcmm(zzfcuVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzcvuVar.zzq(zzcmmVar, executor);
        if (zzfcmVar.zzr > 1) {
            return this.zzl.zza(zzfcuVar);
        }
        String strZzb2 = zzb(zzfcuVar);
        zzfhh zzfhhVar = this.zza;
        zzfhb zzfhbVar = zzfhb.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfhhVar);
        zzfgo zzfgoVarZzi = zzfgs.zza(zzgot.zzc(new zzeho(3, strZzb2)), zzfhbVar, zzfhhVar).zzi();
        final zzehk zzehkVar = this.zzh;
        zzehkVar.zza();
        int i8 = 0;
        for (final zzfcj zzfcjVar2 : zzfctVar.zza) {
            for (String str2 : zzfcjVar2.zza) {
                final zzedz zzedzVarZza2 = this.zzg.zza(zzfcjVar2.zzb, str2);
                if (zzedzVarZza2 != null && zzedzVarZza2.zza(zzfcuVar, zzfcjVar2)) {
                    zzfgy zzfgyVarZza = zzfhhVar.zza(zzfhb.RENDER_CONFIG_WATERFALL, zzfgoVarZzi);
                    StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i8);
                    sb.append("-");
                    sb.append(str2);
                    zzfgoVarZzi = zzfgyVarZza.zza(sb.toString()).zzg(Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzehq
                        @Override // com.google.android.gms.internal.ads.zzgob
                        public final /* synthetic */ InterfaceFutureC1673e zza(Object obj2) {
                            return this.zza.zzc(zzfcjVar2, zzfcuVar, zzedzVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i8++;
        }
        zzfgoVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzehkVar.zzb();
            }
        }, executor);
        return zzfgoVarZzi;
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(zzfcj zzfcjVar, zzfcu zzfcuVar, zzedz zzedzVar, Throwable th) {
        zzfhr zzfhrVarZzn = zzfhr.zzn(this.zzj, 12);
        zzfhrVarZzn.zzi(zzfcjVar.zzE);
        zzfhrVarZzn.zza();
        InterfaceFutureC1673e interfaceFutureC1673eZzi = zzgot.zzi(zzedzVar.zzb(zzfcuVar, zzfcjVar), zzfcjVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfcuVar, zzfcjVar, interfaceFutureC1673eZzi, this.zzc);
        zzfia.zzd(interfaceFutureC1673eZzi, this.zzk, zzfhrVarZzn);
        return interfaceFutureC1673eZzi;
    }
}
