package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdkh {
    private final zzdpi zza;
    private final zzdnx zzb;
    private final zzcnp zzc;
    private final zzdjc zzd;

    public zzdkh(zzdpi zzdpiVar, zzdnx zzdnxVar, zzcnp zzcnpVar, zzdjc zzdjcVar) {
        this.zza = zzdpiVar;
        this.zzb = zzdnxVar;
        this.zzc = zzcnpVar;
        this.zzd = zzdjcVar;
    }

    public final View zza() throws zzcez {
        zzcek zzcekVarZza = this.zza.zza(C3369m2.m17288U(), null, null);
        zzcekVarZza.zzE().setVisibility(8);
        zzcekVarZza.zzab("/sendMessageToSdk", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcek) obj, map);
            }
        });
        zzcekVarZza.zzab("/adMuted", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkb
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcek) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zzcekVarZza);
        zzbjl zzbjlVar = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcek zzcekVar = (zzcek) obj;
                zzcgi zzcgiVarZzP = zzcekVar.zzP();
                final zzdkh zzdkhVar = this.zza;
                zzcgiVarZzP.zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdkf
                    @Override // com.google.android.gms.internal.ads.zzcgg
                    public final /* synthetic */ void zza(boolean z7, int i7, String str, String str2) {
                        zzdkhVar.zzf(map, z7, i7, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcekVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcekVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdnx zzdnxVar = this.zzb;
        zzdnxVar.zzh(weakReference, "/loadHtml", zzbjlVar);
        zzdnxVar.zzh(new WeakReference(zzcekVarZza), "/showOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdkd
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd((zzcek) obj, map);
            }
        });
        zzdnxVar.zzh(new WeakReference(zzcekVarZza), "/hideOverlay", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zze((zzcek) obj, map);
            }
        });
        return zzcekVarZza.zzE();
    }

    final /* synthetic */ void zzb(zzcek zzcekVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcek zzcekVar, Map map) {
        this.zzd.zzt();
    }

    final /* synthetic */ void zzd(zzcek zzcekVar, Map map) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("Showing native ads overlay.");
        zzcekVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zze(zzcek zzcekVar, Map map) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33330e("Hiding native ads overlay.");
        zzcekVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    final /* synthetic */ void zzf(Map map, boolean z7, int i7, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", map2);
    }
}
