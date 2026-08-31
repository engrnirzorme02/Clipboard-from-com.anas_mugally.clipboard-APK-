package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p170W2.C1841f;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfie implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final C7584a zzf;
    private int zzi;
    private final zzdpz zzj;
    private final List zzk;
    private final zzcgj zzl;
    private final zzbvd zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfii zzg = zzfil.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfie(Context context, C7584a c7584a, zzdpz zzdpzVar, zzeau zzeauVar, zzbvd zzbvdVar, zzcgj zzcgjVar) {
        this.zze = context;
        this.zzf = c7584a;
        this.zzj = zzdpzVar;
        this.zzn = zzbvdVar;
        this.zzl = zzcgjVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjD)).booleanValue()) {
            this.zzk = C3431F0.m17397U();
        } else {
            this.zzk = zzgjz.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbeb.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbeb.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfii zzfiiVar = this.zzg;
                            bArrZzaN = ((zzfil) zzfiiVar.zzbu()).zzaN();
                            zzfiiVar.zzc();
                        }
                        new zzeat(this.zze, this.zzf.f30226a, this.zzn, Binder.getCallingUid()).zza(new zzear((String) C3250D.m17200c().zzd(zzbci.zzjx), 60000, new HashMap(), bArrZzaN, "application/x-protobuf", false));
                    } catch (Exception e7) {
                        if ((e7 instanceof zzdwz) && ((zzdwz) e7).zza() == 3) {
                            return;
                        }
                        C7351t.m32354l().zzh(e7, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(final zzfhu zzfhuVar) {
        zzbzh.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfid
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfhuVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfhu zzfhuVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            C7351t.m32349g();
                            this.zzh = C3431F0.m17407d0(this.zze);
                        } catch (RemoteException | RuntimeException e7) {
                            C7351t.m32354l().zzg(e7, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = C1841f.m7623f().m7624a(this.zze);
                        int iIntValue = ((Integer) C3250D.m17200c().zzd(zzbci.zzjy)).intValue();
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmH)).booleanValue()) {
                            long j7 = iIntValue;
                            zzbzh.zzd.scheduleWithFixedDelay(this, j7, j7, TimeUnit.MILLISECONDS);
                        } else {
                            long j8 = iIntValue;
                            zzbzh.zzd.scheduleAtFixedRate(this, j8, j8, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjE)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zza() && zzfhuVar != null) {
            synchronized (zzc) {
                try {
                    zzfii zzfiiVar = this.zzg;
                    if (zzfiiVar.zza() >= ((Integer) C3250D.m17200c().zzd(zzbci.zzjz)).intValue()) {
                        return;
                    }
                    zzfif zzfifVarZza = zzfih.zza();
                    zzfifVarZza.zzv(zzfhuVar.zzm());
                    zzfifVarZza.zza(zzfhuVar.zzb());
                    zzfifVarZza.zzb(zzfhuVar.zza());
                    zzfifVarZza.zzw(3);
                    zzfifVarZza.zzd(this.zzf.f30226a);
                    zzfifVarZza.zze(this.zzh);
                    zzfifVarZza.zzf(Build.VERSION.RELEASE);
                    zzfifVarZza.zzg(Build.VERSION.SDK_INT);
                    zzfifVarZza.zzx(zzfhuVar.zzo());
                    zzfifVarZza.zzi(zzfhuVar.zzc());
                    zzfifVarZza.zzj(this.zzi);
                    zzfifVarZza.zzy(zzfhuVar.zzn());
                    zzfifVarZza.zzk(zzfhuVar.zzd());
                    zzfifVarZza.zzl(zzfhuVar.zze());
                    zzfifVarZza.zzm(zzfhuVar.zzf());
                    zzfifVarZza.zzn(this.zzj.zzd(zzfhuVar.zzf()));
                    zzfifVarZza.zzo(zzfhuVar.zzg());
                    zzfifVarZza.zzs(zzfhuVar.zzh());
                    zzfifVarZza.zzr(zzfhuVar.zzk());
                    zzfifVarZza.zzp(zzfhuVar.zzi());
                    zzfifVarZza.zzq(zzfhuVar.zzj());
                    zzfifVarZza.zzc(zzfhuVar.zzl());
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjD)).booleanValue()) {
                        zzfifVarZza.zzh(this.zzk);
                    }
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjE)).booleanValue()) {
                        zzcgj zzcgjVar = this.zzl;
                        zzhlz zzhlzVarZzc = zzcgjVar.zzc();
                        String strZzb = zzcgjVar.zzb();
                        if (zzhlzVarZzc != null) {
                            zzfifVarZza.zzt(zzhlzVarZzc);
                        }
                        if (strZzb != null) {
                            zzfifVarZza.zzu(strZzb);
                        }
                    }
                    zzfij zzfijVarZza = zzfik.zza();
                    zzfijVarZza.zza(zzfifVarZza);
                    zzfiiVar.zzb(zzfijVarZza);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
