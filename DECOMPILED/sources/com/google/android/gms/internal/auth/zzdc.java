package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;
    private static volatile zzda zze = null;
    private static volatile boolean zzf = false;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zza = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(zzcu.zza);
    private static final AtomicInteger zzi = new AtomicInteger();

    /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z7, zzdb zzdbVar) {
        if (zzczVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    public static void zzd(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        try {
                            zzda zzdaVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzdaVar == null || zzdaVar.zza() != context) {
                                zzcg.zzd();
                                zzdd.zzc();
                                zzco.zze();
                                zze = new zzcd(context, zzdo.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                    @Override // com.google.android.gms.internal.auth.zzdj
                                    public final Object zza() {
                                        Context context2 = context;
                                        int i7 = zzdc.zzd;
                                        return zzcp.zza(context2);
                                    }
                                }));
                                zzi.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r2
      0x003e: PHI (r2v1 com.google.android.gms.internal.auth.zzdh) = (r2v0 com.google.android.gms.internal.auth.zzdh), (r2v5 com.google.android.gms.internal.auth.zzdh) binds: [B:8:0x0016, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzb() {
        String strZza;
        zzcl zzclVarZza;
        Object objZzb;
        int i7 = zzi.get();
        if (this.zzk < i7) {
            synchronized (this) {
                try {
                    if (this.zzk < i7) {
                        zzda zzdaVar = zze;
                        zzdh zzdhVarZzc = zzdh.zzc();
                        Object objZza = null;
                        if (zzdaVar != null) {
                            zzdhVarZzc = (zzdh) zzdaVar.zzb().zza();
                            if (zzdhVarZzc.zzb()) {
                                zzci zzciVar = (zzci) zzdhVarZzc.zza();
                                zzcz zzczVar = this.zzb;
                                strZza = zzciVar.zza(zzczVar.zza, null, zzczVar.zzc, this.zzc);
                            } else {
                                strZza = null;
                            }
                        } else {
                            strZza = null;
                        }
                        if (zzdaVar == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        Uri uri = this.zzb.zza;
                        if (uri != null) {
                            zzclVarZza = zzcq.zza(zzdaVar.zza(), uri) ? zzcg.zza(zzdaVar.zza().getContentResolver(), this.zzb.zza, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzdc.zzc();
                                }
                            }) : null;
                        } else {
                            zzclVarZza = zzdd.zza(zzdaVar.zza(), null, new Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzdc.zzc();
                                }
                            });
                        }
                        Object objZza2 = (zzclVarZza == null || (objZzb = zzclVarZza.zzb(this.zzc)) == null) ? null : zza(objZzb);
                        if (objZza2 == null) {
                            if (!this.zzb.zzd) {
                                String strZzc = zzco.zza(zzdaVar.zza()).zzb(this.zzb.zzd ? null : this.zzc);
                                if (strZzc != null) {
                                    objZza = zza(strZzc);
                                }
                            }
                            objZza2 = objZza == null ? this.zzj : objZza;
                        }
                        if (zzdhVarZzc.zzb()) {
                            objZza2 = strZza == null ? this.zzj : zza(strZza);
                        }
                        this.zzl = objZza2;
                        this.zzk = i7;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzl;
    }
}
