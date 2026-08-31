package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class zzauo {
    protected volatile Boolean zzb;
    private final zzavx zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfqd zza = null;
    private static volatile Random zze = null;

    public zzauo(zzavx zzavxVar) {
        this.zzc = zzavxVar;
        zzavxVar.zzd().execute(new zzaun(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzauo.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i7, int i8, long j7, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzarc zzarcVarZza = zzarg.zza();
            zzarcVarZza.zza(this.zzc.zza.getPackageName());
            zzarcVarZza.zzb(j7);
            if (str != null) {
                zzarcVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzarcVarZza.zzc(stringWriter.toString());
                zzarcVarZza.zzd(exc.getClass().getName());
            }
            zzfqc zzfqcVarZza = zza.zza(((zzarg) zzarcVarZza.zzbu()).zzaN());
            zzfqcVarZza.zzc(i7);
            if (i8 != -1) {
                zzfqcVarZza.zzb(i8);
            }
            zzfqcVarZza.zza();
        } catch (Exception unused) {
        }
    }

    final /* synthetic */ zzavx zzb() {
        return this.zzc;
    }
}
