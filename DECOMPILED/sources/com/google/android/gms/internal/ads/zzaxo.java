package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.p203pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxo {
    public static String zza(Context context, String str, List list, Executor executor) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzgpm zzgpmVarZze = zzgpm.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaxn
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzgpm zzgpmVar = zzgpmVarZze;
                if (list2 == null) {
                    zzgpmVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ApkChecksum apkChecksumM18314a = AbstractC3850b.m18314a(list2.get(i7));
                        if (apkChecksumM18314a.getType() == 8) {
                            zzgpmVar.zza(zzawa.zza(apkChecksumM18314a.getValue()));
                            return;
                        }
                    }
                    zzgpmVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzgpmVar.zza((Object) null);
                }
            }
        });
        return (String) zzgpmVarZze.get();
    }
}
