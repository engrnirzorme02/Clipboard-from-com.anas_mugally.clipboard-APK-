package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import p157U3.InterfaceFutureC1673e;
import p227d3.C5228d;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzetc implements zzeup {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzetc(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        String strValueOf;
        String installingPackageName;
        String initiatingPackageName;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str3 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzfro zzfroVar = C3431F0.f14180l;
            strValueOf = String.valueOf(C5228d.m24155a(context).m24150d(str));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zznC)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                AbstractC3490o0.m17545k("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(initiatingPackageName)) {
                                    AbstractC3490o0.m17545k("No initiating package name found");
                                    initiatingPackageName = str2;
                                }
                            } catch (PackageManager.NameNotFoundException e7) {
                                e = e7;
                                str2 = initiatingPackageName;
                                C7351t.m32354l().zzg(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (PackageManager.NameNotFoundException e8) {
                            e = e8;
                        }
                    } else {
                        installingPackageName = null;
                        initiatingPackageName = null;
                    }
                } catch (PackageManager.NameNotFoundException e9) {
                    e = e9;
                    installingPackageName = null;
                }
            } else {
                installingPackageName = null;
                initiatingPackageName = null;
            }
        } else {
            installingPackageName = null;
            initiatingPackageName = null;
        }
        return zzgot.zza(new zzetd(str, numValueOf, str3, strValueOf, installingPackageName, initiatingPackageName));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 29;
    }
}
