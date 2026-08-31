package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3484l0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcce implements zzbjl {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i7) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                C3244B.m17190a();
                i7 = C7590g.m33276c(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                String string = sb.toString();
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f(string);
            }
        }
        if (AbstractC3490o0.m17547m()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length + 30 + String.valueOf(str2).length() + 6 + String.valueOf(i7).length() + 1);
            sb2.append("Parse pixels for ");
            sb2.append(str);
            sb2.append(", got string ");
            sb2.append(str2);
            sb2.append(", int ");
            sb2.append(i7);
            sb2.append(".");
            AbstractC3490o0.m17545k(sb2.toString());
        }
        return i7;
    }

    private static void zzc(zzcar zzcarVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcarVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String str6 = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2);
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f(str6);
                return;
            }
        }
        if (str2 != null) {
            zzcarVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcarVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcarVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcarVar.zzB(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        Integer numValueOf;
        int i7;
        zzcbd zzcbdVar = (zzcbd) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZza = zzcbdVar.zzdr() != null ? zzcbdVar.zzdr().zza() : null;
        if (numValueOf2 != null && numZza != null && !numValueOf2.equals(numZza) && !str.equals("load")) {
            String str2 = String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZza);
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e(str2);
            return;
        }
        if (AbstractC7599p.m33335j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            AbstractC7599p.m33326a(sb.toString());
        }
        if (str.equals("background")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                AbstractC7599p.m33331f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbdVar.setBackgroundColor(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused) {
                AbstractC7599p.m33331f("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str4 = (String) map.get("color");
            if (TextUtils.isEmpty(str4)) {
                AbstractC7599p.m33331f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbdVar.zzv(Color.parseColor(str4));
                return;
            } catch (IllegalArgumentException unused2) {
                AbstractC7599p.m33331f("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i10 = 0;
        if (str.equals("decoderProps")) {
            String str5 = (String) map.get("mimeTypes");
            if (str5 == null) {
                AbstractC7599p.m33331f("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcbdVar.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str5.split(",");
            int length = strArrSplit.length;
            while (i10 < length) {
                String str6 = strArrSplit[i10];
                map3.put(str6, AbstractC3484l0.m17534a(str6.trim()));
                i10++;
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzcbdVar.zze("onVideoEvent", map4);
            return;
        }
        zzcas zzcasVarZzdr = zzcbdVar.zzdr();
        if (zzcasVarZzdr == null) {
            AbstractC7599p.m33331f("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzcbdVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbbz zzbbzVar = zzbci.zzeo;
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcbdVar.zzy() : Math.min(iZzb3, zzcbdVar.zzy());
            } else {
                if (AbstractC3490o0.m17547m()) {
                    int iZzy = zzcbdVar.zzy();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb3).length() + 72 + String.valueOf(iZzy).length() + 4 + String.valueOf(iZzb).length() + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iZzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iZzy);
                    sb2.append(", x ");
                    sb2.append(iZzb);
                    sb2.append(".");
                    AbstractC3490o0.m17545k(sb2.toString());
                }
                iMin = Math.min(iZzb3, zzcbdVar.zzy() - iZzb);
            }
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcbdVar.zzx() : Math.min(iZzb4, zzcbdVar.zzx());
            } else {
                if (AbstractC3490o0.m17547m()) {
                    int iZzx = zzcbdVar.zzx();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb4).length() + 75 + String.valueOf(iZzx).length() + 4 + String.valueOf(iZzb2).length() + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iZzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iZzx);
                    sb3.append(", y ");
                    sb3.append(iZzb2);
                    sb3.append(".");
                    AbstractC3490o0.m17545k(sb3.toString());
                }
                iMin2 = Math.min(iZzb4, zzcbdVar.zzx() - iZzb2);
            }
            int i11 = iMin2;
            try {
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i12 = i10;
            boolean z7 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcasVarZzdr.zzd() != null) {
                zzcasVarZzdr.zzb(iZzb, iZzb2, iMin, i11);
                return;
            }
            zzcasVarZzdr.zzc(iZzb, iZzb2, iMin, i11, i12, z7, new zzcbc((String) map.get("flags")));
            zzcar zzcarVarZzd = zzcasVarZzdr.zzd();
            if (zzcarVarZzd != null) {
                zzc(zzcarVarZzd, map);
                return;
            }
            return;
        }
        zzcfq zzcfqVarZzh = zzcbdVar.zzh();
        if (zzcfqVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str7 = (String) map.get("currentTime");
                if (str7 == null) {
                    AbstractC7599p.m33331f("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcfqVarZzh.zzd(Float.parseFloat(str7));
                    return;
                } catch (NumberFormatException unused4) {
                    AbstractC7599p.m33331f("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcfqVarZzh.zzr();
                return;
            }
        }
        zzcar zzcarVarZzd2 = zzcasVarZzdr.zzd();
        if (zzcarVarZzd2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzcbdVar.zze("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcbdVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcarVarZzd2.zzC(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str8 = (String) map.get("time");
            if (str8 == null) {
                AbstractC7599p.m33331f("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcarVarZzd2.zzt((int) (Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                AbstractC7599p.m33331f("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcarVarZzd2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcarVarZzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcarVarZzd2.zzq(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcarVarZzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcarVarZzd2.zzu();
                return;
            } else {
                zzcarVarZzd2.zzv();
                return;
            }
        }
        if (str.equals("pause")) {
            zzcarVarZzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzcarVarZzd2.zzs();
            return;
        }
        if (str.equals("show")) {
            zzcarVarZzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzcbdVar.getContext();
                zzcarVarZzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcbdVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzcarVarZzd2.zzD();
                    return;
                } else {
                    AbstractC7599p.m33331f("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                AbstractC7599p.m33331f("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzcarVarZzd2.zzw(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                AbstractC7599p.m33331f("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        String str10 = (String) map.get("src");
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzco)).booleanValue() && TextUtils.isEmpty(str10)) {
            AbstractC7599p.m33331f("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i7 = 1;
            } catch (NumberFormatException unused7) {
                AbstractC7599p.m33331f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                i7 = 1;
                numValueOf = null;
            }
        } else {
            i7 = 1;
            numValueOf = null;
        }
        String[] strArr = new String[i7];
        strArr[0] = str10;
        String str11 = (String) map.get("demuxed");
        if (str11 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str11);
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < jSONArray.length(); i13++) {
                    String string2 = jSONArray.getString(i13);
                    if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzco)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzco)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str11.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str11);
                    AbstractC7599p.m33331f(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                AbstractC7599p.m33331f("Malformed demuxed URL list for playback: ".concat(str11));
                strArr = new String[]{str10};
            }
        }
        if (numValueOf != null) {
            zzcbdVar.zzo(numValueOf.intValue());
        }
        zzcarVarZzd2.zzo(str10, strArr);
    }
}
