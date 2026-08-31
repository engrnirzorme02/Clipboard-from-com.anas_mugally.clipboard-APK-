package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3463b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnb implements zzbnw {
    private final Context zza;
    private final zzayf zzb;
    private final PowerManager zzc;

    public zzcnb(Context context, zzayf zzayfVar) {
        this.zza = context;
        this.zzb = zzayfVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcne zzcneVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayh zzayhVar = zzcneVar.zzf;
        if (zzayhVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzayf zzayfVar = this.zzb;
            if (zzayfVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z7 = zzayhVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", zzayfVar.zzb()).put("activeViewJSON", zzayfVar.zzc()).put("timestamp", zzcneVar.zzd).put("adFormat", zzayfVar.zza()).put("hashCode", zzayfVar.zzd()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcneVar.zzb).put("isNative", zzayfVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", C7351t.m32355m().m17516d()).put("appVolume", C7351t.m32355m().m17514b());
            Context context = this.zza;
            jSONObjectPut.put("deviceVolume", C3463b.m17510e(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject jSONObjectPut2 = jSONObject3.put("windowVisibility", zzayhVar.zzb).put("isAttachedToWindow", z7);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzayhVar.zzc;
            JSONObject jSONObjectPut3 = jSONObjectPut2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzayhVar.zzd;
            JSONObject jSONObjectPut4 = jSONObjectPut3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzayhVar.zze;
            JSONObject jSONObjectPut5 = jSONObjectPut4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzayhVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzayhVar.zzg;
            JSONObject jSONObjectPut6 = jSONObjectPut5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzayhVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzayhVar.zzi;
            jSONObjectPut6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", zzcneVar.zza);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbD)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzayhVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcneVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
