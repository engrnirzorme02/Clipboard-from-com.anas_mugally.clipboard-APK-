package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.util.C3420A;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfee {
    public static C3324b1 zza(Throwable th) {
        if (th instanceof zzeed) {
            zzeed zzeedVar = (zzeed) th;
            return zzc(zzeedVar.zza(), zzeedVar.zzb());
        }
        if (th instanceof zzdwz) {
            return th.getMessage() == null ? zzd(((zzdwz) th).zza(), null, null) : zzd(((zzdwz) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof C3420A)) {
            return zzd(1, null, null);
        }
        C3420A c3420a = (C3420A) th;
        return new C3324b1(c3420a.m17377a(), zzghs.zza(c3420a.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static C3324b1 zzb(Throwable th, zzeee zzeeeVar) {
        C3324b1 c3324b1;
        C3324b1 c3324b1Zza = zza(th);
        int i7 = c3324b1Zza.f13918a;
        if ((i7 == 3 || i7 == 0) && (c3324b1 = c3324b1Zza.f13921d) != null && !c3324b1.f13920c.equals("com.google.android.gms.ads")) {
            c3324b1Zza.f13921d = null;
        }
        if (zzeeeVar != null) {
            c3324b1Zza.f13922e = zzeeeVar.zzf();
        }
        return c3324b1Zza;
    }

    public static C3324b1 zzc(int i7, C3324b1 c3324b1) {
        if (i7 == 0) {
            throw null;
        }
        if (i7 == 8) {
            if (((Integer) C3250D.m17200c().zzd(zzbci.zziZ)).intValue() > 0) {
                return c3324b1;
            }
            i7 = 8;
        }
        return zzd(i7, null, c3324b1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public static C3324b1 zzd(int i7, String str, C3324b1 c3324b1) {
        String str2;
        int i8 = i7 - 1;
        if (str == null) {
            if (i7 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i8) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) C3250D.m17200c().zzd(zzbci.zzjc)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i7 == 0) {
            throw null;
        }
        int i9 = 0;
        int i10 = 2;
        switch (i8) {
            case 0:
            case 11:
            case 15:
                i10 = i9;
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i10 = 1;
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 2:
            case 10:
            case 18:
                i10 = 3;
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 3:
                i9 = 8;
                i10 = i9;
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 4:
            case 8:
            case 17:
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 7:
                i9 = 4;
                i10 = i9;
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 12:
                if (((Integer) C3250D.m17200c().zzd(zzbci.zzjc)).intValue() <= 0) {
                    i9 = 9;
                    i10 = i9;
                } else {
                    i10 = 3;
                }
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 13:
                i9 = 10;
                i10 = i9;
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            case 14:
                i9 = 11;
                i10 = i9;
                return new C3324b1(i10, str3, "com.google.android.gms.ads", c3324b1, null);
            default:
                switch (i7) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
