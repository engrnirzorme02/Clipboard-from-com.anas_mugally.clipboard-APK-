package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbc {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcbc(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbci.zzab);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbci.zzk);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbci.zzu);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbci.zzg);
        zzbbz zzbbzVar = zzbci.zzf;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbci.zzh);
        this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbci.zzi);
        this.zzg = zzb(jSONObject, "player_precache_limit", zzbci.zzj);
        this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbci.zzl);
        this.zzi = zza(jSONObject, "use_cache_data_source", zzbci.zzeM);
        zzb(jSONObject, "min_retry_count", zzbci.zzm);
        this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbci.zzo);
        this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbci.zzce);
        this.zzl = zza(jSONObject, "use_range_http_data_source", zzbci.zzcg);
        this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbci.zzch);
        this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbci.zzci);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbbz zzbbzVar) {
        boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbbz zzbbzVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) C3250D.m17200c().zzd(zzbbzVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbbz zzbbzVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) C3250D.m17200c().zzd(zzbbzVar)).longValue();
    }
}
