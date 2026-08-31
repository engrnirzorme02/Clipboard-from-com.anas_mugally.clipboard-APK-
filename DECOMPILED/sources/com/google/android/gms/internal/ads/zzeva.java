package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3421A0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.AbstractC3754i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p227d3.C5228d;
import p380w2.C7351t;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
final class zzeva implements zzeup {
    private final zzgpd zza;
    private final Context zzb;
    private final zzdwx zzc;

    zzeva(zzgpd zzgpdVar, Context context, zzdwx zzdwxVar) {
        this.zza = zzgpdVar;
        this.zzb = context;
        this.zzc = zzdwxVar;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0107  */
    /* JADX WARN: Code duplicated, block: B:32:0x011a  */
    /* JADX WARN: Code duplicated, block: B:34:0x012c  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x018c A[EDGE_INSN: B:49:0x018c->B:50:0x018f BREAK  A[LOOP:1: B:43:0x015e->B:48:0x0187], PHI: r2
      0x018c: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v8 java.lang.String), (r2v10 java.lang.String) binds: [B:40:0x0159, B:41:0x015b, B:88:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0202  */
    /* JADX WARN: Code duplicated, block: B:70:0x0205  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ zzeuy zzc() {
        ActivityInfo activityInfo;
        boolean z7;
        String string;
        String str;
        String string2;
        boolean zEquals;
        String language;
        String str2;
        String strM17378a;
        Context context;
        List<ResolveInfo> listQueryIntentActivities;
        String str3;
        boolean z8;
        Bundle bundle;
        boolean z9;
        boolean z10;
        Context context2 = this.zzb;
        PackageManager packageManager = context2.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        C7351t.m32349g();
        C3244B.m17190a();
        boolean zM33291z = C7590g.m33291z();
        boolean zM18174c = AbstractC3754i.m18174c(context2);
        boolean zM18175d = AbstractC3754i.m18175d(context2);
        String language2 = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i7 = 0; i7 < localeList.size(); i7++) {
            arrayList.add(localeList.get(i7).getLanguage());
        }
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        String string3 = null;
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            string = null;
            z7 = true;
        } else {
            try {
                z7 = true;
                try {
                    PackageInfo packageInfoM24152f = C5228d.m24155a(context2).m24152f(activityInfo.packageName, 0);
                    if (packageInfoM24152f != null) {
                        int i8 = packageInfoM24152f.versionCode;
                        String str4 = activityInfo.packageName;
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(str4).length());
                        sb.append(i8);
                        sb.append(".");
                        sb.append(str4);
                        string = sb.toString();
                    } else {
                        string = null;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                z7 = true;
            }
        }
        try {
            PackageInfo packageInfoM24152f2 = C5228d.m24155a(this.zzb).m24152f("com.android.vending", 128);
            if (packageInfoM24152f2 != null) {
                int i9 = packageInfoM24152f2.versionCode;
                String str5 = packageInfoM24152f2.packageName;
                str = string;
                try {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i9).length() + 1 + String.valueOf(str5).length());
                    sb2.append(i9);
                    sb2.append(".");
                    sb2.append(str5);
                    string2 = sb2.toString();
                } catch (Exception unused3) {
                    string2 = null;
                }
                zEquals = false;
                String str6 = Build.FINGERPRINT;
                language = Locale.getDefault().getLanguage();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoh)).booleanValue()) {
                    C3421A0 c3421a0M17399W = C3431F0.m17399W(this.zzb);
                    String strM17379b = c3421a0M17399W.m17379b();
                    strM17378a = c3421a0M17399W.m17378a();
                    str2 = strM17379b;
                } else {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzog)).booleanValue()) {
                        language = C3431F0.m17399W(this.zzb).m17379b();
                    }
                    str2 = language;
                    strM17378a = null;
                }
                context = this.zzb;
                if (packageManager == null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                    ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
                    listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                    if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                        str3 = string2;
                        zEquals = false;
                        break;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= listQueryIntentActivities.size()) {
                            str3 = string2;
                            zEquals = false;
                            break;
                        }
                        str3 = string2;
                        if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzhqn.zza(context));
                            break;
                        }
                        i10++;
                        string2 = str3;
                    }
                } else {
                    str3 = string2;
                }
                C7351t.m32349g();
                long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmg)).booleanValue()) {
                    C7351t.m32349g();
                    if (C3431F0.m17410f(context)) {
                        z8 = z7;
                    } else {
                        z8 = false;
                    }
                } else {
                    z8 = false;
                }
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmk)).booleanValue()) {
                    try {
                        bundle = C5228d.m24155a(context).m24149c(context.getPackageName(), 128).metaData;
                        if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                            string3 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                    }
                } else {
                    string3 = "";
                }
                String str7 = string3;
                if (resolveInfoZzd2 != null) {
                    z9 = z7;
                } else {
                    z9 = false;
                }
                if (resolveInfoZzd != null) {
                    z10 = z7;
                } else {
                    z10 = false;
                }
                return new zzeuy(z10, z9, country, zM33291z, zM18174c, zM18175d, language2, arrayList, str, str3, str6, zEquals, Build.MODEL, availableBytes, z8, str7, Build.VERSION.SDK_INT, str2, strM17378a, this.zzc.zza());
            }
            str = string;
        } catch (Exception unused5) {
        }
        string2 = null;
        zEquals = false;
        String str8 = Build.FINGERPRINT;
        language = Locale.getDefault().getLanguage();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoh)).booleanValue()) {
            C3421A0 c3421a0M17399W2 = C3431F0.m17399W(this.zzb);
            String strM17379b2 = c3421a0M17399W2.m17379b();
            strM17378a = c3421a0M17399W2.m17378a();
            str2 = strM17379b2;
        } else {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzog)).booleanValue()) {
                language = C3431F0.m17399W(this.zzb).m17379b();
            }
            str2 = language;
            strM17378a = null;
        }
        context = this.zzb;
        if (packageManager == null) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(intent2, 0);
            listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
            if (listQueryIntentActivities == null) {
                str3 = string2;
                zEquals = false;
                break;
            }
            str3 = string2;
            zEquals = false;
            break;
        }
        str3 = string2;
        C7351t.m32349g();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmg)).booleanValue()) {
            C7351t.m32349g();
            if (C3431F0.m17410f(context)) {
                z8 = z7;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmk)).booleanValue()) {
            bundle = C5228d.m24155a(context).m24149c(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                string3 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } else {
            string3 = "";
        }
        String str9 = string3;
        if (resolveInfoZzd2 != null) {
            z9 = z7;
        } else {
            z9 = false;
        }
        if (resolveInfoZzd != null) {
            z10 = z7;
        } else {
            z10 = false;
        }
        return new zzeuy(z10, z9, country, zM33291z, zM18174c, zM18175d, language2, arrayList, str, str3, str8, zEquals, Build.MODEL, availableBytes2, z8, str9, Build.VERSION.SDK_INT, str2, strM17378a, this.zzc.zza());
    }
}
