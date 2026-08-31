package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p122P3.AbstractC1206j;
import p122P3.AbstractC1209m;
import p122P3.AbstractC1215s;
import p122P3.InterfaceC1214r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkm {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkh zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkg zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        AbstractC1209m.m5303o(zzkk.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    /* synthetic */ zzkm(zzkg zzkgVar, String str, Object obj, boolean z7, byte[] bArr) {
        if (zzkgVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkgVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    public static void zzb(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        try {
                            zzkh zzkhVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzkhVar == null || zzkhVar.zza() != context) {
                                if (zzkhVar != null) {
                                    zzjr.zzd();
                                    zzko.zzb();
                                    zzjy.zzc();
                                }
                                zze = new zzjn(context, AbstractC1215s.m5326a(new InterfaceC1214r() { // from class: com.google.android.gms.internal.measurement.zzkl
                                    @Override // p122P3.InterfaceC1214r
                                    public final /* synthetic */ Object get() {
                                        int i7 = zzkm.zzc;
                                        return zzjz.zza(context);
                                    }
                                }));
                                zzh.incrementAndGet();
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

    public static void zzc() {
        zzh.incrementAndGet();
    }

    abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 P3.j) = (r2v0 P3.j), (r2v0 P3.j), (r2v7 P3.j) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzd() {
        String strZza;
        zzjv zzjvVarZza;
        String strZzb;
        Object objZze;
        int i7 = zzh.get();
        if (this.zzi < i7) {
            synchronized (this) {
                try {
                    if (this.zzi < i7) {
                        zzkh zzkhVar = zze;
                        AbstractC1206j abstractC1206jM5284a = AbstractC1206j.m5284a();
                        Object objZza = null;
                        if (zzkhVar == null || zzkhVar.zzb() == null) {
                            strZza = null;
                        } else {
                            abstractC1206jM5284a = (AbstractC1206j) ((InterfaceC1214r) AbstractC1209m.m5302n(zzkhVar.zzb())).get();
                            if (abstractC1206jM5284a.mo5254c()) {
                                zzjt zzjtVar = (zzjt) abstractC1206jM5284a.mo5253b();
                                zzkg zzkgVar = this.zza;
                                strZza = zzjtVar.zza(zzkgVar.zza, null, zzkgVar.zzc, this.zzb);
                            } else {
                                strZza = null;
                            }
                        }
                        AbstractC1209m.m5309u(zzkhVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        zzkg zzkgVar2 = this.zza;
                        Uri uri = zzkgVar2.zza;
                        if (uri != null) {
                            zzjvVarZza = zzka.zza(zzkhVar.zza(), uri) ? zzjr.zza(zzkhVar.zza().getContentResolver(), uri, zzkj.zza) : null;
                        } else {
                            zzjvVarZza = zzko.zza(zzkhVar.zza(), (String) AbstractC1209m.m5302n(null), zzki.zza);
                        }
                        Object objZza2 = (zzjvVarZza == null || (objZze = zzjvVarZza.zze(this.zzb)) == null) ? null : zza(objZze);
                        if (objZza2 == null) {
                            if (!zzkgVar2.zzd && (strZzb = zzjy.zza(zzkhVar.zza()).zze(this.zzb)) != null) {
                                objZza = zza(strZzb);
                            }
                            objZza2 = objZza == null ? this.zzg : objZza;
                        }
                        if (abstractC1206jM5284a.mo5254c()) {
                            objZza2 = strZza == null ? this.zzg : zza(strZza);
                        }
                        this.zzj = objZza2;
                        this.zzi = i7;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzj;
    }
}
