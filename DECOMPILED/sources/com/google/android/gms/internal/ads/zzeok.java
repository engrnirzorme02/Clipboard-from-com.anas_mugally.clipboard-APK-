package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.C3250D;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeok implements zzeun {
    private final Integer zza;

    private zzeok(Integer num) {
        this.zza = num;
    }

    static /* synthetic */ zzeok zzc(C7584a c7584a) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzkQ)).booleanValue()) {
            return new zzeok(null);
        }
        C7351t.m32349g();
        int extensionVersion = 0;
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkT)).booleanValue()) {
                    if (c7584a.f30228c >= ((Integer) C3250D.m17200c().zzd(zzbci.zzkS)).intValue() && i7 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e7) {
            C7351t.m32354l().zzg(e7, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzeok(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (num != null) {
            zzcuuVar.zza.putInt("aos", num.intValue());
        }
    }
}
