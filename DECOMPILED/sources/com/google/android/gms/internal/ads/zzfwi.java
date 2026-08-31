package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwi implements zzfvz, zzfvv, zzfwo {
    private static final zzhlt zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final ExecutorService zzd;
    private final zzfve zze;
    private final boolean zzf;
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final double zzj;
    private final String zzk;
    private final long zzl;
    private final AtomicBoolean zzm = new AtomicBoolean(false);
    private final Object zzn = new Object();
    private final Object zzo = new Object();
    private final Object zzp = new Object();
    private final zzaqz zzq = zzara.zza();
    private final List zzr = new ArrayList();
    private boolean zzs = false;
    private final HashMap zzt = new HashMap();

    static {
        zzhls zzhlsVarZzc = zzhlt.zzc();
        zzhlsVarZzc.zza(17);
        zza = (zzhlt) zzhlsVarZzc.zzbu();
    }

    public zzfwi(Context context, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, zzfve zzfveVar, Random random, String str, long j7, long j8, double d7, String str2, long j9) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
        this.zzd = executorService;
        this.zze = zzfveVar;
        this.zzg = str;
        this.zzh = j7;
        this.zzi = j8;
        this.zzj = d7;
        this.zzk = str2;
        this.zzl = j9;
        this.zzf = random.nextDouble() < d7;
    }

    @Override // com.google.android.gms.internal.ads.zzfvv
    public final InterfaceFutureC1673e zza() {
        return zzgot.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final void zzb(int i7, long j7, Throwable th, String str) {
        long jLongValue;
        if (this.zzf) {
            synchronized (this.zzo) {
                try {
                    List list = this.zzr;
                    synchronized (this.zzp) {
                        try {
                            HashMap map = this.zzt;
                            Integer numValueOf = Integer.valueOf(i7);
                            Long l7 = (Long) map.get(numValueOf);
                            if (l7 == null) {
                                l7 = 0L;
                            }
                            jLongValue = 1 + l7.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    list.add(new zzfwf(i7, j7, th, str, jLongValue));
                    if (!this.zzs) {
                        this.zzs = true;
                        this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfwh
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzd();
                            }
                        }, this.zzi, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwo
    public final void zzc(zzfwn zzfwnVar) {
        synchronized (this.zzn) {
            this.zzq.zzj(zzfwnVar.zza());
        }
    }

    final void zzd() {
        zzaqz zzaqzVar;
        zzgjz zzgjzVarZzq;
        String string;
        synchronized (this.zzn) {
            zzaqzVar = (zzaqz) this.zzq.clone();
        }
        synchronized (this.zzo) {
            List list = this.zzr;
            zzgjzVarZzq = zzgjz.zzq(list);
            list.clear();
            this.zzs = false;
        }
        int size = zzgjzVarZzq.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            zzfwf zzfwfVar = (zzfwf) zzgjzVarZzq.get(i7);
            if (i8 >= this.zzh) {
                zze((zzara) zzaqzVar.zzbu());
                zzaqzVar.zzb();
                i8 = 0;
            }
            zzarr zzarrVarZza = zzars.zza();
            zzarrVarZza.zza(zzfwfVar.zza);
            zzarrVarZza.zzb(zzfwfVar.zzb);
            zzarrVarZza.zze(zzfwfVar.zze);
            String str = zzfwfVar.zzd;
            if (str != null) {
                zzarrVarZza.zzf(str);
            }
            Throwable th = zzfwfVar.zzc;
            zzarrVarZza.zzg(th == null ? 2 : 3);
            if (th != null) {
                zzarrVarZza.zzc(th.getClass().getName());
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th.printStackTrace(printWriter);
                            string = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th2) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (IOException unused) {
                    string = "";
                }
                zzarrVarZza.zzd(string);
            }
            zzaqzVar.zza((zzars) zzarrVarZza.zzbu());
            i7++;
            i8++;
        }
        if (i8 > 0) {
            zze((zzara) zzaqzVar.zzbu());
            zzaqzVar.zzb();
        }
    }

    protected final void zze(zzara zzaraVar) {
        try {
            zzfwd zzfwdVarZza = zzfwe.zza();
            zzfwdVarZza.zzb(zza);
            zzfwb zzfwbVarZza = zzfwc.zza();
            zzfwbVarZza.zza(zzaraVar);
            zzfwdVarZza.zza((zzfwc) zzfwbVarZza.zzbu());
            this.zze.zza(this.zzg, ((zzfwe) zzfwdVarZza.zzbu()).zzaN(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    final /* synthetic */ void zzf() {
        int i7;
        if (!this.zzf || this.zzm.getAndSet(true)) {
            return;
        }
        Context context = this.zzb;
        String str = this.zzk;
        double d7 = this.zzj;
        long j7 = this.zzl;
        Locale locale = Locale.getDefault();
        zzaqz zzaqzVarZza = zzara.zza();
        zzaqzVarZza.zzc(Build.VERSION.SDK_INT);
        zzaqzVarZza.zzd(Build.MODEL);
        zzaqzVarZza.zze(locale.getLanguage());
        zzaqzVarZza.zzf(locale.getCountry());
        zzaqzVarZza.zzi(str);
        zzaqzVarZza.zzg(context.getPackageName());
        zzaqzVarZza.zzl(j7);
        if (d7 > 0.0d) {
            zzaqzVarZza.zzk((int) (1.0d / d7));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            zzaqzVarZza.zzh(packageManager.getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i7 = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i7 = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i7 = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i7 = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            zzaqzVarZza.zzm(i7);
        } catch (RuntimeException unused2) {
        }
        zzara zzaraVar = (zzara) zzaqzVarZza.zzbu();
        synchronized (this.zzn) {
            this.zzq.zzbo(zzaraVar);
        }
    }
}
