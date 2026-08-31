package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p036E2.C0318M;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzctd implements zzcyy, zzdel {
    private zzbup zza;
    private final Context zzc;
    private final zzfie zzd;
    private final C7584a zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    zzctd(Context context, zzfie zzfieVar, C7584a c7584a, Executor executor) {
        this.zzc = context;
        this.zzd = zzfieVar;
        this.zze = c7584a;
        this.zzf = executor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzc() {
        zzbup zzbupVar;
        int i7;
        zzbod zzbodVarZzb;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbei.zzl.zze()).booleanValue()) {
                i7 = 2;
            } else {
                i7 = 3;
                if (!((Boolean) zzbei.zzm.zze()).booleanValue()) {
                    if (((Boolean) zzbei.zzk.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(C7351t.m32354l().zzo().zzi().zzd()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i7 = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                                i7 = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i7 = 1;
                    }
                }
            }
            int i8 = i7 - 1;
            if (i8 == 1) {
                zzbodVarZzb = C7351t.m32364v().zzb(this.zzc, C7584a.m33270T(), this.zzd);
            } else if (i8 == 2) {
                zzbodVarZzb = C7351t.m32364v().zza(this.zzc, C7584a.m33270T(), this.zzd);
            }
            zzbnx zzbnxVar = zzboa.zza;
            this.zza = new zzbur(this.zzc, zzbodVarZzb.zza("google.afma.sdkConstants.getSdkConstants", zzbnxVar, zzbnxVar), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbupVar = this.zza) != null) {
            InterfaceFutureC1673e interfaceFutureC1673eZza = zzbupVar.zza();
            if (!this.zzh && ((Boolean) zzbea.zzi.zze()).booleanValue()) {
                interfaceFutureC1673eZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf();
                    }
                }, this.zzf);
            }
            zzbzk.zza(interfaceFutureC1673eZza, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzd(C0318M c0318m) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdT(zzbuv zzbuvVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzdU(zzfcu zzfcuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zze(String str) {
        zzc();
    }

    final /* synthetic */ void zzf() {
        zzbbt.zze(this.zzc);
        this.zzh = true;
    }
}
