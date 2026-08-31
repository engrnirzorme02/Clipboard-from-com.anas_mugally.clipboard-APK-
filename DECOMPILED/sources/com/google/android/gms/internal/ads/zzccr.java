package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccr implements zzbjl {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            String string = sb.toString();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f(string);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccq zzcctVar;
        int i7;
        zzcbd zzcbdVar = (zzcbd) obj;
        if (AbstractC7599p.m33335j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            AbstractC7599p.m33326a("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccj<zzcci> zzccjVarM32344b = C7351t.m32344b();
        if (map.containsKey("abort")) {
            if (zzccjVarM32344b.zza(zzcbdVar)) {
                return;
            }
            AbstractC7599p.m33331f("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbc zzcbcVar = new zzcbc((String) map.get("flags"));
        boolean z7 = zzcbcVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcci zzcciVarZzb = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i7 = 0;
                    for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                        try {
                            strArr2[i8] = jSONArray.getString(i8);
                        } catch (JSONException unused) {
                            AbstractC7599p.m33331f("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i7 = 0;
                }
            } else {
                i7 = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i7] = str;
            }
            if (z7) {
                for (zzcci zzcciVar : zzccjVarM32344b) {
                    if (zzcciVar.zza == zzcbdVar && str.equals(zzcciVar.zzd())) {
                        zzcciVarZzb = zzcciVar;
                        break;
                    }
                }
            } else {
                zzcciVarZzb = zzccjVarM32344b.zzb(zzcbdVar);
            }
            if (zzcciVarZzb != null) {
                AbstractC7599p.m33331f("Precache task is already running.");
                return;
            }
            if (zzcbdVar.zzk() == null) {
                AbstractC7599p.m33331f("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = Integer.valueOf(i7);
            }
            if (numZzb != null) {
                zzcbdVar.zzo(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcbdVar.zzA(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcbdVar.zzB(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcca zzccaVar = zzcbdVar.zzk().f29186b;
            if (iIntValue > 0) {
                int i9 = zzcbcVar.zzg;
                int iZzQ = zzcau.zzQ();
                if (iZzQ < i9) {
                    zzcctVar = new zzccz(zzcbdVar, zzcbcVar);
                } else {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzp)).booleanValue()) {
                        iZzQ = zzccw.zzr();
                    }
                    zzcctVar = iZzQ < zzcbcVar.zzb ? new zzccw(zzcbdVar, zzcbcVar) : new zzccu(zzcbdVar);
                }
            } else {
                zzcctVar = new zzcct(zzcbdVar);
            }
            new zzcci(zzcbdVar, zzcctVar, str, strArr).zzb();
        } else {
            zzcci zzcciVarZzb2 = zzccjVarM32344b.zzb(zzcbdVar);
            if (zzcciVarZzb2 == null) {
                AbstractC7599p.m33331f("Precache must specify a source.");
                return;
            }
            zzcctVar = zzcciVarZzb2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcctVar.zzi(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcctVar.zzh(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcctVar.zzj(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcctVar.zzk(numZzb8.intValue());
        }
    }
}
