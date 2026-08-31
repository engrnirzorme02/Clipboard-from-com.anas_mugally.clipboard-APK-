package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaum implements zzaup {
    private static zzaum zzb;
    private final Context zzc;
    private final zzfpr zzd;
    private final zzfpy zze;
    private final zzfqa zzf;
    private final zzavr zzg;
    private final zzfoh zzh;
    private final Executor zzi;
    private final zzaxq zzj;
    private final zzfpx zzk;
    private final zzawg zzm;
    private final zzavy zzn;
    private final zzavp zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzaum(Context context, zzfoh zzfohVar, zzfpr zzfprVar, zzfpy zzfpyVar, zzfqa zzfqaVar, zzavr zzavrVar, Executor executor, zzfoc zzfocVar, zzaxq zzaxqVar, zzawg zzawgVar, zzavy zzavyVar, zzavp zzavpVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfohVar;
        this.zzd = zzfprVar;
        this.zze = zzfpyVar;
        this.zzf = zzfqaVar;
        this.zzg = zzavrVar;
        this.zzi = executor;
        this.zzj = zzaxqVar;
        this.zzm = zzawgVar;
        this.zzn = zzavyVar;
        this.zzo = zzavpVar;
        this.zzr = false;
        this.zzk = new zzauk(this, zzfocVar);
    }

    public static synchronized zzaum zza(Context context, zzaqy zzaqyVar, boolean z7) {
        zzfoi zzfoiVarZzh;
        zzfoiVarZzh = zzfoj.zzh();
        zzfoiVarZzh.zza(zzaqyVar.zza());
        zzfoiVarZzh.zzb(zzaqyVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfoiVarZzh.zzh(), z7);
    }

    private static synchronized zzaum zzs(Context context, Executor executor, zzfoj zzfojVar, boolean z7) {
        try {
            if (zzb == null) {
                zzfoh zzfohVarZza = zzfoh.zza(context, executor, z7);
                zzava zzavaVarZza = ((Boolean) C3250D.m17200c().zzd(zzbci.zzdN)).booleanValue() ? zzava.zza(context) : null;
                zzawg zzawgVarZza = ((Boolean) C3250D.m17200c().zzd(zzbci.zzdO)).booleanValue() ? zzawg.zza(context, executor) : null;
                zzavy zzavyVar = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcX)).booleanValue() ? new zzavy() : null;
                zzavp zzavpVar = ((Boolean) C3250D.m17200c().zzd(zzbci.zzdg)).booleanValue() ? new zzavp() : null;
                zzfox zzfoxVarZza = zzfox.zza(context, executor, zzfohVarZza, zzfojVar);
                zzavq zzavqVar = new zzavq(context);
                zzavr zzavrVar = new zzavr(zzfojVar, zzfoxVarZza, new zzawe(context, zzavqVar), zzavqVar, zzavaVarZza, zzawgVarZza, zzavyVar, zzavpVar);
                zzaxq zzaxqVarZzb = zzfpe.zzb(context, zzfohVarZza);
                zzfoc zzfocVar = new zzfoc();
                zzaum zzaumVar = new zzaum(context, zzfohVarZza, new zzfpr(context, zzaxqVarZzb), new zzfpy(context, zzaxqVarZzb, new zzauj(zzfohVarZza), ((Boolean) C3250D.m17200c().zzd(zzbci.zzcH)).booleanValue()), new zzfqa(context, zzavrVar, zzfohVarZza, zzfocVar, false), zzavrVar, executor, zzfocVar, zzaxqVarZzb, zzawgVarZza, zzavyVar, zzavpVar);
                zzb = zzaumVar;
                zzaumVar.zzc();
                zzb.zzm();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final void zzt() {
        zzawg zzawgVar = this.zzm;
        if (zzawgVar != null) {
            zzawgVar.zzb();
        }
    }

    private final zzfpq zzu(int i7) {
        if (zzfpe.zza(this.zzj)) {
            return ((Boolean) C3250D.m17200c().zzd(zzbci.zzcF)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfpq zzfpqVarZzu = zzu(1);
        if (zzfpqVarZzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfpqVarZzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(MotionEvent motionEvent) {
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb != null) {
            try {
                zzfokVarZzb.zzd(null, motionEvent);
            } catch (zzfpz e7) {
                this.zzh.zzc(e7.zza(), -1L, e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zze(int i7, int i8, int i9) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmM)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f7 = i7;
        float f8 = displayMetrics.density;
        float f9 = i8;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f7 * f8, f9 * f8, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f10 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f7 * f10, f9 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f11 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i9, 1, f7 * f11, f9 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfokVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzavp zzavpVar = this.zzo;
        if (zzavpVar != null) {
            zzavpVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfokVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcX)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfok zzfokVarZzb = this.zzf.zzb();
        if (zzfokVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfokVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfpq zzfpqVarZzc = this.zzf.zzc();
                    if ((zzfpqVarZzc == null || zzfpqVarZzc.zze(3600L)) && zzfpe.zza(this.zzj)) {
                        this.zzi.execute(new zzaul(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d7 A[Catch: all -> 0x009f, zzhiw -> 0x00a2, TryCatch #0 {zzhiw -> 0x00a2, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:34:0x00a5, B:38:0x00be, B:44:0x00d7, B:45:0x00e4, B:47:0x00ea, B:49:0x00f2, B:50:0x00f4, B:41:0x00c8, B:42:0x00cf, B:23:0x0074, B:25:0x007a, B:27:0x008c, B:51:0x00fe, B:52:0x010b, B:53:0x0118), top: B:60:0x0021, outer: #2 }] */
    final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfpq zzfpqVarZzu;
        zzaxw zzaxwVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfpq zzfpqVarZzu2 = zzu(1);
        if (zzfpqVarZzu2 != null) {
            String strZza = zzfpqVarZzu2.zza().zza();
            strZzb = zzfpqVarZzu2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzaxq zzaxqVar = this.zzj;
                zzfoh zzfohVar = this.zzh;
                zzfpv zzfpvVarZza = zzfoq.zza(context, 1, zzaxqVar, str, strZzb, "1", zzfohVar);
                byte[] bArr = zzfpvVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfohVar.zzb(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzaxs zzaxsVarZzd = zzaxs.zzd(zzhhb.zzr(bArr, 0, length), zzhhr.zza());
                        if (zzaxsVarZzd.zza().zza().isEmpty() || zzaxsVarZzd.zza().zzb().isEmpty() || zzaxsVarZzd.zzc().zzv().length == 0 || ((zzfpqVarZzu = zzu(1)) != null && (zzaxwVarZza = zzfpqVarZzu.zza()) != null && zzaxsVarZzd.zza().zza().equals(zzaxwVarZza.zza()) && zzaxsVarZzd.zza().zzb().equals(zzaxwVarZza.zzb()))) {
                            this.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfpx zzfpxVar = this.zzk;
                            int i7 = zzfpvVarZza.zzc;
                            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcF)).booleanValue()) {
                                zZza = this.zzd.zza(zzaxsVarZzd, zzfpxVar);
                            } else if (i7 == 3) {
                                zZza = this.zze.zzb(zzaxsVarZzd);
                            } else if (i7 == 4) {
                                zZza = this.zze.zza(zzaxsVarZzd, zzfpxVar);
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfpq zzfpqVarZzu3 = zzu(1);
                                if (zzfpqVarZzu3 != null) {
                                    if (this.zzf.zza(zzfpqVarZzu3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzhiw e7) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e7);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ zzfoh zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z7) {
        this.zzq = z7;
    }
}
