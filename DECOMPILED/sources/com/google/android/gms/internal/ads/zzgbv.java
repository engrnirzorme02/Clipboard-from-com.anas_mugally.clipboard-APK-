package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbv implements zzgbn {
    private final zzfqa zza;
    private final zzgcg zzb;
    private final zzgcu zzc;
    private final File zzd;
    private final zzgea zze;
    private final ExecutorService zzf;
    private final AtomicReference zzg = new AtomicReference("3.-1");

    zzgbv(zzfqa zzfqaVar, zzgcg zzgcgVar, zzgcu zzgcuVar, zzgea zzgeaVar, ExecutorService executorService, File file) {
        this.zza = zzfqaVar;
        this.zzb = zzgcgVar;
        this.zzc = zzgcuVar;
        this.zze = zzgeaVar;
        this.zzd = file;
        this.zzf = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final String zza() {
        return (String) this.zzg.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final InterfaceFutureC1673e zzb() {
        return (zzgol) zzgot.zzk((zzgol) zzgot.zzg(zzgol.zzw(this.zzb.zza()), Throwable.class, zzgbu.zza, zzgpk.zza()), new zzggr() { // from class: com.google.android.gms.internal.ads.zzgbp
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzh((zzfwm) obj);
                return null;
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final InterfaceFutureC1673e zzc(final Context context) {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgbq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzi(context);
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final InterfaceFutureC1673e zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgot.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgbr
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzj(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final InterfaceFutureC1673e zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgot.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgbs
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final void zzf(InputEvent inputEvent) {
        zzfok zzfokVarZzb = this.zza.zzb();
        if (zzfokVarZzb == null) {
            this.zze.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzfokVarZzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzfpz e7) {
                this.zze.zzd(15005, e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbn
    public final int zzg() {
        return 3;
    }

    final /* synthetic */ Void zzh(final zzfwm zzfwmVar) {
        if (!this.zzc.zzb(zzfwmVar) || zzfwmVar == null) {
            this.zze.zzb(15003);
            throw new zzgbo(1);
        }
        zzgcg zzgcgVar = this.zzb;
        File fileZzf = zzgcgVar.zzf();
        if (Build.VERSION.SDK_INT >= 34) {
            fileZzf.setReadOnly();
        }
        final zzfpq zzfpqVar = new zzfpq(zzfwmVar.zza(), fileZzf, zzgcgVar.zzd(), this.zzd);
        zzgea zzgeaVar = this.zze;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzl(zzfpqVar, zzfwmVar);
            }
        };
        zzgdy zzgdyVarZza = zzgeaVar.zza(15002);
        try {
            zzgdyVarZza.zza();
            runnable.run();
            zzgdyVarZza.zzc();
            return null;
        } catch (Throwable th) {
            try {
                zzgdyVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgdyVarZza.zzc();
                throw th2;
            }
        }
    }

    final /* synthetic */ String zzi(Context context) {
        zzfok zzfokVarZzb = this.zza.zzb();
        if (zzfokVarZzb != null) {
            return zzfokVarZzb.zza(context, null);
        }
        this.zze.zzb(15004);
        return "";
    }

    final /* synthetic */ String zzj(Context context, String str, View view, Activity activity) {
        zzfok zzfokVarZzb = this.zza.zzb();
        if (zzfokVarZzb != null) {
            return zzfokVarZzb.zzb(context, null, view, activity);
        }
        this.zze.zzb(15004);
        return "";
    }

    final /* synthetic */ String zzk(Context context, String str, View view, Activity activity) {
        zzfok zzfokVarZzb = this.zza.zzb();
        if (zzfokVarZzb != null) {
            return zzfokVarZzb.zzc(context, null, str, view, null);
        }
        this.zze.zzb(15004);
        return "";
    }

    final /* synthetic */ void zzl(zzfpq zzfpqVar, zzfwm zzfwmVar) {
        if (!this.zza.zza(zzfpqVar)) {
            throw new zzgbo(2);
        }
        this.zzg.set("2.".concat(String.valueOf(zzfwmVar.zza().zza())));
    }
}
