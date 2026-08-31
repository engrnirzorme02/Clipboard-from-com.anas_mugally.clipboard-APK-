package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3321a2;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesq implements zzeun {
    private final zzfdc zza;
    private final PackageInfo zzb;
    private final InterfaceC3494q0 zzc;

    public zzesq(zzfdc zzfdcVar, PackageInfo packageInfo, InterfaceC3494q0 interfaceC3494q0) {
        this.zza = zzfdcVar;
        this.zzb = packageInfo;
        this.zzc = interfaceC3494q0;
    }

    private final void zzc(Bundle bundle) {
        int i7;
        zzbfl zzbflVar = this.zza.zzj;
        if (zzbflVar == null || (i7 = zzbflVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbflVar.zzj);
        bundle.putInt("sccg_dir", i7);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e1  */
    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray jSONArrayOptJSONArray;
        String str;
        zzfdc zzfdcVar = this.zza;
        ArrayList<String> arrayList = zzfdcVar.zzh;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzcuuVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzcuuVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfdcVar.zzi);
        zzbfl zzbflVar = zzfdcVar.zzj;
        if (zzbflVar != null) {
            String str2 = "any";
            if (zzbflVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i7 = zzbflVar.zzh;
                if (i7 == 1) {
                    str = "any";
                } else if (i7 == 2) {
                    str = "landscape";
                } else if (i7 != 3) {
                    str = i7 != 4 ? "unknown" : "square";
                } else {
                    str = "portrait";
                }
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i8 = zzbflVar.zzc;
            if (i8 != 0) {
                if (i8 != 1) {
                    str2 = i8 != 2 ? "unknown" : "landscape";
                } else {
                    str2 = "portrait";
                }
            }
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbflVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbflVar.zzg);
            zzc(bundle);
        }
        PackageInfo packageInfo = this.zzb;
        int i9 = packageInfo != null ? packageInfo.versionCode : 0;
        InterfaceC3494q0 interfaceC3494q0 = this.zzc;
        if (i9 > interfaceC3494q0.zzg()) {
            interfaceC3494q0.zzt();
            interfaceC3494q0.zzf(i9);
        }
        JSONObject jSONObjectZzs = interfaceC3494q0.zzs();
        String string = null;
        if (jSONObjectZzs != null && (jSONArrayOptJSONArray = jSONObjectZzs.optJSONArray(zzfdcVar.zzg)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i10 = zzfdcVar.zzl;
        if (i10 > 1) {
            bundle.putInt("max_num_ads", i10);
        }
        zzblw zzblwVar = zzfdcVar.zzb;
        if (zzblwVar != null) {
            String str3 = zzblwVar.zzc;
            if (TextUtils.isEmpty(str3)) {
                String str4 = "p";
                if (zzblwVar.zza >= 2) {
                    int i11 = zzblwVar.zzd;
                    if (i11 == 2 || i11 != 3) {
                        str4 = "l";
                    }
                } else {
                    int i12 = zzblwVar.zzb;
                    if (i12 == 1) {
                        str4 = "l";
                    } else if (i12 != 2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 41);
                        sb.append("Instream ad video aspect ratio ");
                        sb.append(i12);
                        sb.append(" is wrong.");
                        AbstractC7599p.m33328c(sb.toString());
                        str4 = "l";
                    }
                }
                bundle.putString("ia_var", str4);
            } else {
                bundle.putString("ad_tag", str3);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzmG)).booleanValue() || zzbflVar == null) {
            return;
        }
        C3321a2 c3321a2 = zzbflVar.zzf;
        if (c3321a2 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", c3321a2.f13910a);
            bundle2.putBoolean("clickToExpandRequested", c3321a2.f13912c);
            bundle2.putBoolean("customControlsRequested", c3321a2.f13911b);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbflVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbflVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcuuVar.zzb);
    }
}
