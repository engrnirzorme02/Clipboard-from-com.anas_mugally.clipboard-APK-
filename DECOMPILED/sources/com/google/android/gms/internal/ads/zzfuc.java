package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfuc {
    private final zzfvx zza;
    private final zzfwv zzb;
    private final zzgcx zzc;
    private final zzgea zzd;
    private final long zze;
    private final zzhpr zzf;
    private final long zzg;
    private final long zzh = System.currentTimeMillis();
    private final boolean zzi;
    private final long zzj;

    zzfuc(zzfvx zzfvxVar, zzfwv zzfwvVar, zzgcx zzgcxVar, zzgea zzgeaVar, zzhpr zzhprVar, zzfui zzfuiVar) {
        this.zza = zzfvxVar;
        this.zzb = zzfwvVar;
        this.zzc = zzgcxVar;
        this.zzd = zzgeaVar;
        this.zze = zzfuiVar.zzh();
        this.zzf = zzhprVar;
        this.zzg = zzfuiVar.zzg();
        this.zzi = zzfuiVar.zzq();
        this.zzj = zzfuiVar.zzp();
    }

    public final InterfaceFutureC1673e zza() {
        return this.zza.zza();
    }

    public final String zzb(Context context) {
        String string;
        boolean z7 = false;
        if (this.zzi) {
            if (System.currentTimeMillis() - this.zzh <= this.zzj) {
                z7 = true;
            }
        }
        zzgdy zzgdyVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    try {
                        zzgdyVarZza.zza();
                        string = (String) zzgot.zzj(this.zza.zzb(), new zzftz(this, context), zzgpk.zza()).get(z7 ? this.zzg : this.zze, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e7) {
                        zzgdyVarZza.zzb(e7);
                        string = z7 ? ((zzfzx) this.zzf.zzb()).zza(true, this.zzh) : Integer.toString(17);
                    }
                } catch (InterruptedException e8) {
                    Thread.currentThread().interrupt();
                    zzgdyVarZza.zzb(e8);
                    string = "";
                }
            } catch (ExecutionException e9) {
                e = e9;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                zzgdyVarZza.zzb(e);
                string = Integer.toString(3);
            } catch (Throwable th) {
                zzgdyVarZza.zzb(th);
                throw th;
            }
            zzgdyVarZza.zzc();
            return string;
        } catch (Throwable th2) {
            zzgdyVarZza.zzc();
            throw th2;
        }
    }

    public final String zzc(Context context, String str, View view, Activity activity) {
        String string;
        zzgdy zzgdyVarZza = this.zzd.zza(4);
        try {
            try {
                zzgdyVarZza.zza();
                try {
                    string = (String) zzgot.zzj(this.zza.zzb(), new zzfua(this, context, null, view, activity), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e7) {
                    e = e7;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgdyVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e8) {
                    e = e8;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgdyVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException e9) {
                    e = e9;
                    zzgdyVarZza.zzb(e);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgdyVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgdyVarZza.zzc();
                throw th4;
            }
        } catch (InterruptedException e10) {
            e = e10;
        } catch (ExecutionException e11) {
            e = e11;
        } catch (TimeoutException e12) {
            e = e12;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgdyVarZza.zzc();
        return string;
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        String string;
        zzgdy zzgdyVarZza = this.zzd.zza(5);
        try {
            try {
                zzgdyVarZza.zza();
                try {
                    string = (String) zzgot.zzj(this.zza.zzb(), new zzfub(this, context, str, view, null), zzgpk.zza()).get(this.zze, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e7) {
                    e = e7;
                    InterruptedException interruptedException = e;
                    Thread.currentThread().interrupt();
                    zzgdyVarZza.zzb(interruptedException);
                    string = "";
                } catch (ExecutionException e8) {
                    e = e8;
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    zzgdyVarZza.zzb(th);
                    string = Integer.toString(3);
                } catch (TimeoutException e9) {
                    e = e9;
                    zzgdyVarZza.zzb(e);
                    string = Integer.toString(17);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    zzgdyVarZza.zzb(th3);
                    throw th3;
                }
            } catch (Throwable th4) {
                zzgdyVarZza.zzc();
                throw th4;
            }
        } catch (InterruptedException e10) {
            e = e10;
        } catch (ExecutionException e11) {
            e = e11;
        } catch (TimeoutException e12) {
            e = e12;
        } catch (Throwable th5) {
            th = th5;
        }
        zzgdyVarZza.zzc();
        return string;
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    final /* synthetic */ zzfwv zzg() {
        return this.zzb;
    }

    public final int zzh() {
        return this.zzb.zzh();
    }
}
