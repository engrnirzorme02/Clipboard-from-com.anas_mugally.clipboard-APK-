package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzccp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzccq zze;

    zzccp(zzccq zzccqVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        Objects.requireNonNull(zzccqVar);
        this.zze = zzccqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b7;
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.zza);
        String str = this.zzb;
        if (!TextUtils.isEmpty(str)) {
            map.put("cachedSrc", str);
        }
        String str2 = this.zzc;
        switch (str2) {
            case "interrupted":
                b7 = 3;
                break;
            case "badUrl":
                b7 = 8;
                break;
            case "inProgress":
                b7 = 2;
                break;
            case "downloadTimeout":
                b7 = 9;
                break;
            case "contentLengthMissing":
                b7 = 0;
                break;
            case "playerFailed":
                b7 = 5;
                break;
            case "sizeExceeded":
                b7 = 11;
                break;
            case "externalAbort":
                b7 = 10;
                break;
            case "noop":
                b7 = 4;
                break;
            case "error":
                b7 = 1;
                break;
            case "expireFailed":
                b7 = 6;
                break;
            case "noCacheDir":
                b7 = 7;
                break;
            default:
                b7 = -1;
                break;
        }
        String str3 = "internal";
        switch (b7) {
            case 6:
            case 7:
                str3 = "io";
                break;
            case 8:
            case 9:
                str3 = "network";
                break;
            case 10:
            case 11:
                str3 = "policy";
                break;
        }
        map.put("type", str3);
        map.put("reason", str2);
        String str4 = this.zzd;
        if (!TextUtils.isEmpty(str4)) {
            map.put("message", str4);
        }
        this.zze.zzw("onPrecacheEvent", map);
    }
}
