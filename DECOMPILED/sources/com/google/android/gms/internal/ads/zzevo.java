package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p356t2.C7073a;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevo implements zzeup {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbyn zzg;

    zzevo(zzbyn zzbynVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i7, boolean z7, boolean z8) {
        this.zzg = zzbynVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i7;
        this.zze = z7;
        this.zzf = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        zzgol zzgolVarZzw = zzgol.zzw(this.zzg.zza(this.zza, this.zzd));
        zzggr zzggrVar = new zzggr() { // from class: com.google.android.gms.internal.ads.zzevn
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((C7073a.a) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgol) zzgot.zzg((zzgol) zzgot.zzi((zzgol) zzgot.zzk(zzgolVarZzw, zzggrVar, executor), ((Long) C3250D.m17200c().zzd(zzbci.zzbj)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ zzevp zzc(C7073a.a aVar) {
        zzfti zzftiVar = new zzfti();
        if (this.zze) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdB)).booleanValue()) {
                Context context = this.zza;
                zzftm zzftmVarZzh = zzftm.zzh(context);
                Objects.requireNonNull(aVar);
                String strM31190a = aVar.m31190a();
                Objects.requireNonNull(strM31190a);
                zzftiVar = zzftmVarZzh.zzj(strM31190a, context.getPackageName(), ((Long) C3250D.m17200c().zzd(zzbci.zzdG)).longValue(), this.zzf);
            }
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdA)).booleanValue()) {
                try {
                    Context context2 = this.zza;
                    zzftm zzftmVarZzh2 = zzftm.zzh(context2);
                    Objects.requireNonNull(aVar);
                    String strM31190a2 = aVar.m31190a();
                    Objects.requireNonNull(strM31190a2);
                    zzftiVar = zzftmVarZzh2.zzj(strM31190a2, context2.getPackageName(), ((Long) C3250D.m17200c().zzd(zzbci.zzdG)).longValue(), this.zzf);
                } catch (IOException | IllegalArgumentException e7) {
                    C7351t.m32354l().zzg(e7, "AdIdInfoSignalSource.getPaidV1");
                    zzftiVar = new zzfti();
                }
            }
        }
        return new zzevp(aVar, null, zzftiVar);
    }

    final /* synthetic */ zzevp zzd(Throwable th) {
        C3244B.m17190a();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzevp(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfti());
    }
}
