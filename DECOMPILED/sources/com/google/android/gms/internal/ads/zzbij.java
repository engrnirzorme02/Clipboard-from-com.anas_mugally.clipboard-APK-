package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbij implements zzbjl {
    zzbij() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            AbstractC3490o0.m17545k("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzgfl zzgflVarZzl = zzgfm.zzl();
        zzgflVarZzl.zzb((String) map.get("appId"));
        zzgflVarZzl.zzg(zzcekVar.getWidth());
        zzgflVarZzl.zza(zzcekVar.zzE().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzgflVarZzl.zzc(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzgflVarZzl.zzc(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzgflVarZzl.zzd(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzgflVarZzl.zzd(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzgflVarZzl.zzh((String) map.get("enifd"));
        }
        try {
            C7351t.m32366x().m33143c(zzcekVar, zzgflVarZzl.zzi());
        } catch (NullPointerException e7) {
            C7351t.m32354l().zzg(e7, "DefaultGmsgHandlers.ShowLMDOverlay");
            AbstractC3490o0.m17545k("Missing parameters for LMD Overlay show request");
        }
    }
}
