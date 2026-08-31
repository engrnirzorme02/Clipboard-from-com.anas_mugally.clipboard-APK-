package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.common.api.C3553a;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p404z2.C7606w;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcmi {
    zzbtv zza;
    zzbtv zzb;
    private final Context zzc;
    private final InterfaceC3494q0 zzd;
    private final zzedv zze;
    private final zzdpn zzf;
    private final zzgpd zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcmi(Context context, InterfaceC3494q0 interfaceC3494q0, zzedv zzedvVar, zzdpn zzdpnVar, zzgpd zzgpdVar, zzgpd zzgpdVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = interfaceC3494q0;
        this.zze = zzedvVar;
        this.zzf = zzdpnVar;
        this.zzg = zzgpdVar;
        this.zzh = zzgpdVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) C3250D.m17200c().zzd(zzbci.zzkX));
    }

    private final InterfaceFutureC1673e zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) C3250D.m17200c().zzd(zzbci.zzkX)) || this.zzd.zzx()) {
                return zzgot.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) C3250D.m17200c().zzd(zzbci.zzkY), String.valueOf(random.nextInt(C3553a.e.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (zzgol) zzgot.zzh((zzgol) zzgot.zzj(zzgol.zzw(this.zze.zza()), new zzgob() { // from class: com.google.android.gms.internal.ads.zzcmc
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzcmd
                    @Override // com.google.android.gms.internal.ads.zzgob
                    public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) C3250D.m17200c().zzd(zzbci.zzkZ), "11");
            return zzgot.zza(builderBuildUpon.toString());
        } catch (Exception e7) {
            return zzgot.zzc(e7);
        }
    }

    public final void zza(String str, zzfjv zzfjvVar, Random random, C7606w c7606w) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgot.zzq(zzgot.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) C3250D.m17200c().zzd(zzbci.zzld)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmb(this, zzfjvVar, str, c7606w), this.zzg);
    }

    public final InterfaceFutureC1673e zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgot.zza(str) : zzgot.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzcmh
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    final /* synthetic */ InterfaceFutureC1673e zzd(String str, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th);
            }
        });
        return zzgot.zza(str);
    }

    final /* synthetic */ InterfaceFutureC1673e zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) C3250D.m17200c().zzd(zzbci.zzkZ), "10");
            return zzgot.zza(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) C3250D.m17200c().zzd(zzbci.zzla), "1");
        builderBuildUpon.appendQueryParameter((String) C3250D.m17200c().zzd(zzbci.zzkZ), "12");
        if (str.contains((CharSequence) C3250D.m17200c().zzd(zzbci.zzlb))) {
            builderBuildUpon.authority((String) C3250D.m17200c().zzd(zzbci.zzlc));
        }
        return (zzgol) zzgot.zzj(zzgol.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgob() { // from class: com.google.android.gms.internal.ads.zzcme
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                String str2 = (String) C3250D.m17200c().zzd(zzbci.zzkZ);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgot.zza(builder2.toString());
            }
        }, this.zzh);
    }

    final /* synthetic */ InterfaceFutureC1673e zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th);
            }
        });
        builder.appendQueryParameter((String) C3250D.m17200c().zzd(zzbci.zzkZ), "9");
        return zzgot.zza(builder.toString());
    }

    final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzle)).booleanValue()) {
            zzbtv zzbtvVarZzc = zzbtt.zzc(this.zzc);
            this.zzb = zzbtvVarZzc;
            zzbtvVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbtv zzbtvVarZza = zzbtt.zza(this.zzc);
            this.zza = zzbtvVarZza;
            zzbtvVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzle)).booleanValue()) {
            zzbtv zzbtvVarZzc = zzbtt.zzc(this.zzc);
            this.zzb = zzbtvVarZzc;
            zzbtvVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbtv zzbtvVarZza = zzbtt.zza(this.zzc);
            this.zza = zzbtvVarZza;
            zzbtvVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzgpd zzj() {
        return this.zzg;
    }
}
