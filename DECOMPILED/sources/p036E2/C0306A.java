package p036E2;

import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbyi;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: E2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0306A {

    /* JADX INFO: renamed from: a */
    private final String f1285a;

    /* JADX INFO: renamed from: b */
    private final String f1286b;

    /* JADX INFO: renamed from: c */
    private final zzbyi f1287c;

    /* synthetic */ C0306A(C0378z c0378z, byte[] bArr) {
        this.f1285a = c0378z.m1610d();
        this.f1286b = c0378z.m1611e();
        this.f1287c = c0378z.m1612f();
    }

    /* JADX INFO: renamed from: a */
    public final Set m1475a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f1285a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public final String m1476b() {
        return this.f1285a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX INFO: renamed from: c */
    public final zzbbn.zza.EnumC7681zza m1477c() {
        byte b7;
        switch (this.f1285a) {
            case "NATIVE":
                b7 = 2;
                break;
            case "INTERSTITIAL":
                b7 = 1;
                break;
            case "REWARDED":
                b7 = 3;
                break;
            case "BANNER":
                b7 = 0;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0) {
            return zzbbn.zza.EnumC7681zza.BANNER;
        }
        if (b7 == 1) {
            return zzbbn.zza.EnumC7681zza.INTERSTITIAL;
        }
        if (b7 != 2) {
            return b7 != 3 ? zzbbn.zza.EnumC7681zza.AD_INITIATER_UNSPECIFIED : zzbbn.zza.EnumC7681zza.REWARD_BASED_VIDEO_AD;
        }
        return zzbbn.zza.EnumC7681zza.AD_LOADER;
    }

    /* JADX INFO: renamed from: d */
    final String m1478d() {
        return this.f1286b;
    }

    /* JADX INFO: renamed from: e */
    final zzbyi m1479e() {
        return this.f1287c;
    }
}
