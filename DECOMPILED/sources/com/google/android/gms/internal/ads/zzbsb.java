package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public class zzbsb {
    private final zzcek zza;
    private final String zzb;

    public zzbsb(zzcek zzcekVar, String str) {
        this.zza = zzcekVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.zzb);
            zzcek zzcekVar = this.zza;
            if (zzcekVar != null) {
                zzcekVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while dispatching error event.", e7);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while dispatching ready Event.", e7);
        }
    }

    public final void zzi(int i7, int i8, int i9, int i10) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e7) {
            int i11 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while dispatching size change.", e7);
        }
    }

    public final void zzj(int i7, int i8, int i9, int i10) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i7).put("y", i8).put("width", i9).put("height", i10));
        } catch (JSONException e7) {
            int i11 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while dispatching default position.", e7);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while dispatching state change.", e7);
        }
    }

    public final void zzl(int i7, int i8, int i9, int i10, float f7, int i11) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i7).put("height", i8).put("maxSizeWidth", i9).put("maxSizeHeight", i10).put("density", f7).put("rotation", i11));
        } catch (JSONException e7) {
            int i12 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error occurred while obtaining screen information.", e7);
        }
    }
}
