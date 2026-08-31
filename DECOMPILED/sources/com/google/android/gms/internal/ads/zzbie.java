package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Map;
import java.util.regex.Pattern;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbie implements zzbjl {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final Pattern zzb = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("No label given for CSI tick.");
                return;
            }
            zzbbz zzbbzVar = zzbci.zzcn;
            if (((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() && !zza.matcher(str2).matches()) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                int i9 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jMo18161c = C7351t.m32357o().mo18161c() + (Long.parseLong(str4) - C7351t.m32357o().mo18159a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                if (!((Boolean) C3250D.m17200c().zzd(zzbbzVar)).booleanValue() || zza.matcher(str3).matches()) {
                    zzcekVar.zzq().zzb(str2, str3, jMo18161c);
                    return;
                } else {
                    int i10 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            } catch (NumberFormatException e7) {
                int i11 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Malformed timestamp for CSI tick.", e7);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                int i12 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("No value given for CSI experiment.");
                return;
            }
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcn)).booleanValue() || zzb.matcher(str5).matches()) {
                zzcekVar.zzq().zzc().zzd("e", str5);
                return;
            } else {
                int i13 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                int i14 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                int i15 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("No name given for CSI extra.");
                return;
            }
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzcn)).booleanValue() || zza.matcher(str6).matches()) {
                zzcekVar.zzq().zzc().zzd(str6, str7);
            } else {
                int i16 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33326a("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        }
    }
}
