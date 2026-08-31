package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.C2381d;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p396y2.C7524l;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzefm implements zzedz {
    private final Context zza;
    private final zzdgh zzb;
    private final Executor zzc;
    private final zzfci zzd;
    private final zzdsm zze;

    public zzefm(Context context, Executor executor, zzdgh zzdghVar, zzfci zzfciVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdghVar;
        this.zzc = executor;
        this.zzd = zzfciVar;
        this.zze = zzdsmVar;
    }

    private static String zze(zzfcj zzfcjVar) {
        try {
            return zzfcjVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final boolean zza(zzfcu zzfcuVar, zzfcj zzfcjVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbdj.zza(context) && !TextUtils.isEmpty(zze(zzfcjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzedz
    public final InterfaceFutureC1673e zzb(final zzfcu zzfcuVar, final zzfcj zzfcjVar) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznT)).booleanValue()) {
            zzdsl zzdslVarZza = this.zze.zza();
            zzdslVarZza.zzc("action", "cstm_tbs_rndr");
            zzdslVarZza.zzd();
        }
        String strZze = zze(zzfcjVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfcm zzfcmVar = zzfcuVar.zzb.zzb;
        return zzgot.zzj(zzgot.zza(null), new zzgob() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ InterfaceFutureC1673e zza(Object obj) {
                return this.zza.zzc(uri, zzfcuVar, zzfcjVar, zzfcmVar, obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ InterfaceFutureC1673e zzc(Uri uri, zzfcu zzfcuVar, zzfcj zzfcjVar, zzfcm zzfcmVar, Object obj) {
        try {
            C2381d c2381dM10208a = new C2381d.d().m10208a();
            c2381dM10208a.f8406a.setData(uri);
            C7524l c7524l = new C7524l(c2381dM10208a.f8406a, null);
            zzbzm zzbzmVar = new zzbzm();
            zzdfb zzdfbVarZzd = this.zzb.zzd(new zzcri(zzfcuVar, zzfcjVar, null), new zzdfe(new zzefk(this, zzbzmVar, zzfcjVar), null));
            zzbzmVar.zzc(new AdOverlayInfoParcel(c7524l, null, zzdfbVarZzd.zzi(), null, new C7584a(0, 0, false), null, null, zzfcmVar.zzb));
            this.zzd.zzd();
            return zzgot.zza(zzdfbVarZzd.zzh());
        } catch (Throwable th) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    final /* synthetic */ zzdsm zzd() {
        return this.zze;
    }
}
