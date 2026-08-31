package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.AbstractC3754i;
import com.google.android.gms.common.util.AbstractC3760o;
import java.util.Locale;
import p227d3.C5228d;
import p380w2.C7351t;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbuy {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Code duplicated, block: B:12:0x0062  */
    public zzbuy(Context context) {
        ActivityInfo activityInfo;
        String string;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        zzbci.zza(context);
        zzb(context);
        zzc(context);
        zzd(context);
        Locale locale = Locale.getDefault();
        this.zzq = zze(packageManager, "geo:0,0?q=donuts") != null;
        this.zzr = zze(packageManager, "http://www.google.com") != null;
        this.zzs = locale.getCountry();
        C7351t.m32349g();
        C3244B.m17190a();
        this.zzt = C7590g.m33291z();
        this.zzu = AbstractC3754i.m18174c(context);
        this.zzv = AbstractC3754i.m18175d(context);
        this.zzw = locale.getLanguage();
        ResolveInfo resolveInfoZze = zze(packageManager, "market://details?id=com.google.android.gms.ads");
        String string2 = null;
        if (resolveInfoZze == null || (activityInfo = resolveInfoZze.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfoM24152f = C5228d.m24155a(context).m24152f(activityInfo.packageName, 0);
                if (packageInfoM24152f != null) {
                    int i7 = packageInfoM24152f.versionCode;
                    String str = activityInfo.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(str).length());
                    sb.append(i7);
                    sb.append(".");
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.zzx = string;
        try {
            PackageInfo packageInfoM24152f2 = C5228d.m24155a(context).m24152f("com.android.vending", 128);
            if (packageInfoM24152f2 != null) {
                int i8 = packageInfoM24152f2.versionCode;
                String str2 = packageInfoM24152f2.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i8).length() + 1 + String.valueOf(str2).length());
                sb2.append(i8);
                sb2.append(".");
                sb2.append(str2);
                string2 = sb2.toString();
            }
        } catch (Exception unused2) {
        }
        this.zzB = string2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.zzy = displayMetrics.density;
        this.zzz = displayMetrics.widthPixels;
        this.zzA = displayMetrics.heightPixels;
    }

    private final void zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C7351t.m32354l().zzg(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0031  */
    private final void zzc(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.zzg = telephonyManager.getNetworkOperator();
        if (AbstractC3760o.m18202j()) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjs)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.zzi = networkType;
        this.zzj = telephonyManager.getPhoneType();
        this.zzh = -2;
        this.zzk = false;
        this.zzl = -1;
        C7351t.m32349g();
        if (C3431F0.m17408e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.zzh = activeNetworkInfo.getType();
                this.zzl = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.zzh = -1;
            }
            this.zzk = connectivityManager.isActiveNetworkMetered();
        }
    }

    private final void zzd(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlO)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.zzm = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.zzn = intExtra == 2 || intExtra == 5;
        }
    }

    private static ResolveInfo zze(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C7351t.m32354l().zzg(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final zzbuz zza() {
        return new zzbuz(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzbuy(Context context, zzbuz zzbuzVar) {
        zzbci.zza(context);
        zzb(context);
        zzc(context);
        zzd(context);
        this.zzo = Build.FINGERPRINT;
        this.zzp = Build.DEVICE;
        this.zzC = zzbdj.zza(context);
        this.zzq = zzbuzVar.zza;
        this.zzr = zzbuzVar.zzb;
        this.zzs = zzbuzVar.zzc;
        this.zzt = zzbuzVar.zzd;
        this.zzu = zzbuzVar.zze;
        this.zzv = zzbuzVar.zzf;
        this.zzw = zzbuzVar.zzg;
        this.zzx = zzbuzVar.zzh;
        this.zzB = zzbuzVar.zzi;
        this.zzy = zzbuzVar.zzl;
        this.zzz = zzbuzVar.zzm;
        this.zzA = zzbuzVar.zzn;
    }
}
