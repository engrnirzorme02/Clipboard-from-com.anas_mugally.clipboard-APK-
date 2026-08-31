package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccf implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcbd zzcbdVar = (zzcbd) obj;
        zzcfq zzcfqVarZzh = zzcbdVar.zzh();
        if (zzcfqVarZzh == null) {
            try {
                zzcfq zzcfqVar = new zzcfq(zzcbdVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbdVar.zzw(zzcfqVar);
                zzcfqVarZzh = zzcfqVar;
            } catch (NullPointerException e7) {
                e = e7;
                Throwable th = e;
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unable to parse videoMeta message.", th);
                C7351t.m32354l().zzg(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e8) {
                e = e8;
                Throwable th2 = e;
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unable to parse videoMeta message.", th2);
                C7351t.m32354l().zzg(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f7 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f8 = Float.parseFloat((String) map.get("currentTime"));
        int i9 = Integer.parseInt((String) map.get("playbackState"));
        if (i9 < 0 || i9 > 3) {
            i9 = 0;
        }
        String str = (String) map.get("aspectRatio");
        float f9 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (AbstractC7599p.m33335j(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(f8).length() + 45 + String.valueOf(f7).length() + 13 + String.valueOf(zEquals).length() + 19 + String.valueOf(i9).length() + 17 + String.valueOf(str).length());
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(f8);
            sb.append(" , duration : ");
            sb.append(f7);
            sb.append(" , isMuted : ");
            sb.append(zEquals);
            sb.append(" , playbackState : ");
            sb.append(i9);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            AbstractC7599p.m33326a(sb.toString());
        }
        zzcfqVarZzh.zzs(f8, f7, i9, zEquals, f9);
    }
}
