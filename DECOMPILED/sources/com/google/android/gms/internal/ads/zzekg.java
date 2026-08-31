package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzekg extends zzbqy {
    private final String zza;
    private final zzbqw zzb;
    private final zzbzm zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzekg(String str, zzbqw zzbqwVar, zzbzm zzbzmVar, long j7) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzbzmVar;
        this.zza = str;
        this.zzb = zzbqwVar;
        this.zze = j7;
        try {
            jSONObject.put("adapter_version", zzbqwVar.zzf().toString());
            jSONObject.put("sdk_version", zzbqwVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzd(String str, zzbzm zzbzmVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbN)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzbzmVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzh(String str, int i7) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                JSONObject jSONObject = this.zzd;
                jSONObject.put("signal_error", str);
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbO)).booleanValue()) {
                    jSONObject.put("latency", C7351t.m32357o().mo18161c() - this.zze);
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbN)).booleanValue()) {
                    jSONObject.put("signal_error_code", i7);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbN)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final synchronized void zze(String str) {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbO)).booleanValue()) {
                jSONObject.put("latency", C7351t.m32357o().mo18161c() - this.zze);
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzbN)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final synchronized void zzf(String str) {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqz
    public final synchronized void zzg(C3324b1 c3324b1) {
        zzh(c3324b1.f13919b, 2);
    }
}
